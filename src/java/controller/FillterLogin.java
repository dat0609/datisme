/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import dto.User;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author liemn
 */

public class FillterLogin implements Filter {
    
    private static final boolean debug = true;

    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured. 
    private FilterConfig filterConfig = null;
    
    public FillterLogin() {
    }    
    
    
    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        //check login
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        if (user != null) chain.doFilter(request, response);
        if (user == null){//check cookie
            String username = null;
            String password = null;
            
            Cookie cookies[] = req.getCookies();
            for (Cookie cooky : cookies) {
                if(cooky.getName().equals("username")) username = cooky.getValue();
                if(cooky.getName().equals("password")) password = cooky.getValue();
                if(username != null && password != null) break;;
            }
            
            if(username != null && password != null){//check login in database
                User accountCookie = new UserDAO().login(username, password);
                if(accountCookie != null){
                    req.setAttribute("user", accountCookie);
                    chain.doFilter(request, response); //thoa man database
                }
                if(accountCookie == null) res.sendRedirect("login");
            }else res.sendRedirect("login");
        }    
        
                    
    }

    @Override
    public void destroy() {

    }

    /**
     * Init method for this filter
     *
     * @param filterConfig
     */
    @Override
    public void init(FilterConfig filterConfig) {

    }
}
