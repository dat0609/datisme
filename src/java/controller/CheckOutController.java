/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDAO;
import dao.OrderDetailDAO;
import dao.ProductDAO;
import dao.SendMail;
import dao.ShippingDAO;
import dto.Cart;
import dto.Order;
import dto.OrderDetail;
import dto.Product;
import dto.Shipping;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author liemn
 */
public class CheckOutController extends HttpServlet {

    String user = "datisme731@gmail.com";
    String pass = "Lequocdat10";
    String SUB = "Thank for choosing The Collector ";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            List<Cart> listCart = (List<Cart>) request.getSession().getAttribute("listCart");
            request.setAttribute("listCart", listCart);
            double totalPrice = 0;
            for (Cart c : listCart) {
                totalPrice += c.getProductPrice() * c.getQuantity();
            }
            request.setAttribute("totalPrice", totalPrice);
            request.getRequestDispatcher("checkout.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String note = request.getParameter("note");

        User user = (User) request.getSession().getAttribute("user");
        String username = user.getUserId();
        
        Shipping shipping = new Shipping();
        shipping.setName(name);
        shipping.setPhone(phone);
        shipping.setAddress(address);
        //luu vao bang shipping trong database
        int shippingId = new ShippingDAO().addShipping(shipping);
        if (shippingId > 0) {//luu thanh cong
            List<Cart> listCart = (List<Cart>) request.getSession().getAttribute("listCart");
            
            double totalPrice = 0;
            for (Cart c : listCart) {                
                totalPrice += c.getProductPrice() * c.getQuantity();
            }
            
            Order order = new Order();
            
            order.setCustomer(username);
            order.setShippingId(shippingId);
            order.setTotalPrice(totalPrice);
            order.setStatus(1);
            //luu vao bang order
            int orderId = new OrderDAO().addOrder(order);

            if (orderId > 0) {//luu thanh cong
                //them listCart vao order_detail
                OrderDetailDAO detailDAO = new OrderDetailDAO();
                int count = detailDAO.add(listCart, orderId);

                if (count > 0) {//luu list cart thanh cong
                    String msg = "<!DOCTYPE html>\n"
                                + "<html lang=\"en\">\n"
                                + "\n"
                                + "<head>\n"
                                + "</head>\n"
                                + "\n"
                                + "<body>\n"
                                + "    <h3 style=\"color: blue;\">Your order has been processing.</h3>\n"
                                + "    <div>Full Name : "+name+"</div>\n"
                                + "    <div>Phone : "+phone+"</div>\n"
                                + "    <div>Address : "+address+"</div>\n"                              
                                + "    <h3 style=\"color: blue;\">Thank you very much!</h3>\n"
                                + "\n"
                                + "</body>\n"
                                + "\n"
                                + "</html>";
                    SendMail.send(user.getEmail(), SUB, msg, this.user, pass);
                    detailDAO.updateQuantity(listCart,orderId);
                    request.getSession().removeAttribute("listCart");
                    response.sendRedirect("thank");

                } else {//them list cart that bai
                    //remove order
                    //remove shipping
                    response.sendRedirect("");//show loi

                }

            } else {
                //remove shipping
                response.sendRedirect(""); // show loi
            }
        } else {
            response.sendRedirect("");//show loi
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
