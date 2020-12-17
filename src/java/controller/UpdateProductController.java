/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import dto.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author liemn
 */
public class UpdateProductController extends HttpServlet {

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

//            String name = request.getParameter("name");
//            double price = Double.parseDouble(request.getParameter("price"));
//            String description = request.getParameter("description");
//            int quantity = Integer.parseInt(request.getParameter("quantity"));
//            int status = Integer.parseInt(request.getParameter("status"));
//            
//            
//            product.setProduct_name(name);
//            product.setPrice(price);
//            product.setDescription(description);
//            product.setQuantity(quantity);
//            product.setStatus(status);
//            
//            
//            boolean check = new ProductDAO().UpdateProduct(product);
//            System.out.println(check);
//            if (check == true) {
//                request.setAttribute("product", product);
//                response.sendRedirect("admin");
//            }
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

        request.getRequestDispatcher("updateProduct.jsp").forward(request, response);
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
//        int productId = Integer.parseInt(request.getParameter("productId"));
//            Product product = new ProductDAO().getProductById(productId);
//
//            request.setAttribute("product", product);
        int productId = Integer.parseInt(request.getParameter("productId"));
        Product product = new ProductDAO().getProductById(productId);
        
        System.out.println(product);
        request.getSession().setAttribute("product", product);

        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int status = Integer.parseInt(request.getParameter("status"));
//
        ProductDAO dao = new ProductDAO();
        

        System.out.println(product);
        product.setProduct_name(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setQuantity(quantity);
        product.setStatus(status);
        System.out.println(product);
        boolean check = dao.UpdateProduct(product);
        if (check) {
            response.sendRedirect("admin");
        } else {
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
