/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import dto.Order;
import dto.Shipping;
import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author liemn
 */
public class OrderDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int addOrder(Order o) {
        try {
            String query = "	INSERT INTO [dbo].[Orders]\n"
                    + "			   ([userId]\n"
                    + "			   ,[totalPrice]\n"
                    + "			   ,[status]\n"
                    + "			   ,[shipping_id])\n"
                    + "		 VALUES\n"
                    + "			   (?,?,?,?)";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, o.getCustomer());
            ps.setDouble(2, o.getTotalPrice());
            ps.setInt(3, o.getStatus());
            ps.setInt(4, o.getShippingId());
            if (ps.executeUpdate() > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                rs.next();
                return rs.getInt(1);
            }

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }
    
    public double getTotalMoney() {
        try {
            String query = "select sum(totalPrice) from orders";

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
    public List<Order> getTopUser(){
        String query = " select userId,totalPrice,date from Orders order by totalPrice ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            List<Order> list = new ArrayList<>();
            while(rs.next()){
                list.add(new Order(rs.getString(1), rs.getDouble(2), rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
        }return null;
    }
}
