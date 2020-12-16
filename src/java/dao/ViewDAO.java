/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author liemn
 */
public class ViewDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int getView() {
        try {
            String query = "SELECT * FROM [view]";

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

    public void viewCount() {
        try {
            String query = "update [view] set hitcount = hitcount + 1";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }

    }
}
