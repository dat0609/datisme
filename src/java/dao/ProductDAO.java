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
            String query = " SELECT product_id,product_name,price,description,image FROM product "
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
}
