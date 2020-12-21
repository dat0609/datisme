/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import dto.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author liemn
 */
public class OrderDetailDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int add(List<Cart> listCart, int orderId) {

        String query = "INSERT INTO [dbo].[order_detail]\n"
                + "           ([order_id]\n"
                + "           ,[product_id]\n"
                + "           ,[price]\n"
                + "           ,[quantity]\n"
                + "           ,[product_name])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);

            int arr[] = {};
            for (Cart cart : listCart) {
                ps.setInt(1, orderId);
                ps.setInt(2, cart.getProductId());
                ps.setDouble(3, cart.getTotalPrice());
                ps.setInt(4, cart.getQuantity());
                ps.setString(5, cart.getProductName());
                ps.addBatch();
            }
            arr = ps.executeBatch();

            ps.setString(1, query);
            return arr.length;

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }

    public void updateQuantity(List<Cart> listCart, int orderId) {

        String query = "UPDATE [dbo].[product]\n"
                + "   SET \n"
                + "      [quantity] = (select quantity from product where product_id = ?) "
                + "- (select quantity from order_detail where order_id = ? and  product_id = ?) \n"
                + "\n"
                + " WHERE product_id = ?";
        try {

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(query);
            for (Cart cart : listCart) {
                
                ps.setInt(1, cart.getProductId());
                ps.setInt(2, orderId);
                ps.setInt(3, cart.getProductId());
                ps.setInt(4, cart.getProductId());
                ps.executeUpdate();
            }
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
