/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author liemn
 */
public class UserDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public User login(String userId, String password) {
        try {
            String query = "SELECT [UserId]\n"
                    + "      ,[name]\n"
                    + "      ,[address]\n"
                    + "      ,[email]\n"
                    + "      ,[role_id]\n"
                    + "      ,[create_date]\n"
                    + "      ,[active_code]\n"
                    + "      ,[phone]\n"
                    + "      ,[password]\n"
                    + "      ,[status]\n"
                    + "  FROM [dbo].[Users]\n"
                    + "  where UserId = ? and password = ?";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userId);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10));
                return u;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int create(User u) {
        try {
            String query = "INSERT INTO [dbo].[Users]\n"
                    + "           ([UserId]\n"
                    + "           ,[name]\n"
                    + "           ,[email]\n"
                    + "           ,[phone]\n"
                    + "           ,[password]\n"
                    + "		   ,[active_code])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, u.getUserId());
            ps.setString(2, u.getName());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPhone());
            ps.setString(5, u.getPassword());
            ps.setString(6, u.getActive_code());
            return ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }

    public User getUserById(String userId) {
        try {
            String query = "SELECT [UserId]\n"
                    + "      ,[name]\n"
                    + "      ,[address]\n"
                    + "      ,[email]\n"
                    + "      ,[role_id]\n"
                    + "      ,[create_date]\n"
                    + "      ,[active_code]\n"
                    + "      ,[phone]\n"
                    + "      ,[password]\n"
                    + "      ,[status]\n"
                    + "  FROM [dbo].[Users]\n"
                    + "  where UserId = ?";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userId);

            rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10));
                return u;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void updateStatus(String userId, int status) {
        try {
            String query = "UPDATE [dbo].[Users]\n"
                    + "   SET \n"
                    + "      [status] = ?\n"
                    + " WHERE UserId = ? ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, status);
            ps.setString(2, userId);

            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public User getUserByEmail(String email) {
        try {
            String query = "select * from Users where email = ?";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);

            rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10));
                return u;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int updateUser(User u) {
        try {
            String query = "UPDATE [dbo].[Users]\n"
                    + "   SET\n"
                    + "      ,[address] = ?\n"
                    + "      ,[email] = ?\n"
                    + "      ,[phone] = ?\n"
                    + "      ,[password] = ?\n"
                    + " WHERE UserId = ?";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, u.getAddress());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPhone());
            ps.setString(4, u.getPassword());
            ps.setString(5, u.getUserId());

            return ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }
    
    public int getNumUser() {
        try {
            String query = "select count(UserId) from Users";

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
}
