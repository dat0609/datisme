/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import dto.Shipping;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author liemn
 */
public class ShippingDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int addShipping(Shipping shipping) { //return id increase
        try {
            String query = "INSERT INTO [dbo].[shipping]\n"
                    + "           ([name]\n"
                    + "           ,[phone]\n"
                    + "           ,[address])\n"
                    + "     VALUES\n"
                    + "           (?,?,?)";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, shipping.getName());
            ps.setString(2, shipping.getPhone());
            ps.setString(3, shipping.getAddress());
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
}
