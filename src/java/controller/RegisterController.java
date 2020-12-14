/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SendMail;
import dao.UserDAO;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author liemn
 */
public class RegisterController extends HttpServlet {

    String user = "datisme731@gmail.com";
    String pass = "Lequocdat10";
    String SUB = "Here is your active code";

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        request.getRequestDispatcher("register.jsp").forward(request, response);
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
        String userId = request.getParameter("username");
        String password = request.getParameter("pass");
        String email = request.getParameter("email");
        String fullname = request.getParameter("fullname");
        String phone = request.getParameter("phone");

        User u = new User();
        u.setUserId(userId);
        u.setPassword(password);
        u.setEmail(email);
        u.setName(fullname);
        u.setPhone(phone);

        Random rd = new Random();
        String root = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        String capcha = "";
        for (int i = 0; i < 5; i++) {
            int index = rd.nextInt(root.length() - 1);
            capcha = capcha + root.charAt(index);
        }
        u.setActive_code(capcha);
        int count = 0;
        if (!u.getEmail().equals(email)) {
            count = new UserDAO().create(u);
            System.out.println(u);
            if (count > 0) {
                System.out.println(u);
                SendMail.send(u.getEmail(), SUB, u.getActive_code(), user, pass);
                request.getSession().setAttribute("user", u);
                request.getRequestDispatcher("activeCode.jsp").forward(request, response);
            }
            if (u.getUserId().equals(userId)) {
                request.setAttribute("err", "Id already exist");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("err", "Email already exist");
            request.getRequestDispatcher("register.jsp").forward(request, response);

        }

        //  new UserDAO().create(u);
        
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
