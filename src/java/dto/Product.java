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
public class Product {

    private String product_id, product_name;
    private double price;
    private int quantity;
    private String description;
    private Date create_date;
    private int status;
    private String image;

    public Product() {
    }

    public Product(String product_id, String product_name, double price, int quantity, String description, Date create_date, int status, String image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.create_date = create_date;
        this.status = status;
        this.image = image;
    }

    public Product(String product_id, String product_name, double price, String description, String image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

   

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + ", quantity=" + quantity + ", description=" + description + ", create_date=" + create_date + ", status=" + status + ", image=" + image + '}';
    }

}
