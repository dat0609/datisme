/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import dto.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author liemn
 */
public class ProductDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int countPage(int pageSize) {
        try {
            String query = "select Count(*) from product";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            int numOfPage = count / pageSize;
            if (count % pageSize != 0) {
                numOfPage++;
            }
            return numOfPage;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }

    public List<Product> getAllPagging(int pageIndex, int pageSize) {
        try {
            String query = " SELECT product_id,product_name,price,description,image FROM product where status =1 "
                    + "ORDER BY product_id OFFSET (?*?-?) ROWS FETCH NEXT ? ROWS ONLY ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();

            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product P = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5));

                list.add(P);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<Product> getAllPaggingAdmin(int pageIndex, int pageSize) {
        try {
            String query = " SELECT product_id,product_name,price,quantity,description,create_date,status,image FROM product ORDER BY \n"
                    + "product_id OFFSET (?*?-?) ROWS FETCH NEXT ? ROWS ONLY  ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();

            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product P = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getInt(7),
                        rs.getString(8));

                list.add(P);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public Product getProductById(int productID) {
        try {
            String query = "SELECT [product_id]\n"
                    + "      ,[product_name]\n"
                    + "      ,[price]\n"
                    + "      ,[quantity]\n"
                    + "      ,[description]\n"
                    + "      ,[create_date]\n"
                    + "      ,[status]\n"
                    + "      ,[image]\n"
                    + "  FROM [dbo].[product] where product_id = ?";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productID);
            rs = ps.executeQuery();

            if (rs.next()) {
                Product P = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getInt(7),
                        rs.getString(8));

                return P;
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean UpdateProduct(Product p) {
        boolean check = false;
        try {
            String query = "UPDATE [dbo].[product]\n"
                    + "   SET [product_name] = ?\n"
                    + "      ,[price] = ?\n"
                    + "      ,[quantity] = ? \n"
                    + "      ,[status] = ?\n"
                    + "      ,[image] = ?\n"
                    + " WHERE product_id = ? ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, p.getProduct_name());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getQuantity());
            ps.setInt(4, p.getStatus());
            ps.setString(5, p.getImage());
            ps.setString(6, p.getProduct_id());
            check = ps.executeUpdate() != 0 ? true : false;
        } catch (Exception e) {
        }
        return check;
    }

    public int countProduct() {
        try {
            String query = "SELECT count(product_id) FROM product";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {

        }
        return 0;
    }

    public int addProduct(Product p) {

        try {
            String query = "INSERT INTO [dbo].[product]\n"
                    + "           ([product_name]\n"
                    + "           ,[price]\n"
                    + "           ,[quantity]\n"
                    + "           ,[description]\n"
                    + "           ,[status]\n"
                    + "           ,[image])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, p.getProduct_name());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getQuantity());
            ps.setString(4, p.getDescription());
            ps.setInt(5, p.getStatus());
            ps.setString(6, p.getImage());

            return ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }

    public void DeleteProduct(String productId) {

        try {
            String query = "DELETE FROM [dbo].[product]\n"
                    + "      WHERE product_id = ?";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productId);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public List<Product> searchProducts(String keyword) {
        String query = "SELECT product_id,product_name,price,description,image FROM product"
                + " where status =1 and product_name like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + keyword + "%");
            
            rs = ps.executeQuery();
            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                //Food f = new Food(rs.getString(1), rs.getDouble(2), rs.getInt(3), rs.getString(4), rs.getDate(5));
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5)));

            }
            return list;
        } catch (Exception e) {
        }
        return null;

    }
}
