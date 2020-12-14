/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author liemn
 */
public class User {
    private String userId;
    private String name;
    private String address;
    private String email ;
    private int roleId;
    private Date create_date;
    private String active_code ;
    private String phone ;
    private String password ;
    private int status;

    public User() {
    }
    
    public User(String userId,String name,String email,String active_code){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.active_code = active_code;
    }
    
    public User(String userId, String name, String address, String email, int roleId, Date create_date, String active_code, String phone, String password,int status) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.roleId = roleId;
        this.create_date = create_date;
        this.active_code = active_code;
        this.phone = phone;
        this.password = password;
        this.status = status;
    }

    public User(String userId,String password,String name,int roleId,int status){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.roleId = roleId;
        this.status = status;
    }

   

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getActive_code() {
        return active_code;
    }

    public void setActive_code(String active_code) {
        this.active_code = active_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", name=" + name + ", address=" + address + ", email=" + email + ", roleId=" + roleId + ", create_date=" + create_date + ", active_code=" + active_code + ", phone=" + phone + ", password=" + password + '}';
    }
            
}
