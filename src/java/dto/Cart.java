/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author liemn
 */
public class Cart {
    private int productId;
    private String productName;
    private String productImg;
    private double productPrice;
    private int productQuantity;
    private int quantity;
    private double totalPrice;

    public Cart() {
    }

    public Cart(int productId, String productName, String productImg, double productPrice, int productQuantity, int quantity, double totalPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productImg = productImg;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" + "productId=" + productId + ", productName=" + productName + ", productImg=" + productImg + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", quantity=" + quantity + ", totalPrice=" + totalPrice + '}';
    }

    
    
}
