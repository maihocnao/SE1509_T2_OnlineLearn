/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-15    1.0        Cuong               blogdetail
 */
package controller;

import bean.Blog;
import dao.BlogDAO;
import dao.impl.BlogDaoImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cyv2098
 */
@WebServlet(name = "BlogDetailServlet", urlPatterns = {"/blog/detail"})
public class BlogDetailController extends HttpServlet {

    /**
 * Process:<br>
 * - Get List blog detail
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author cuong
 */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String blogId = request.getParameter("id"); //get id 
        BlogDAO dao = new BlogDaoImpl();//new blog
        Blog blog = dao.findById("2");  //find id 
        //send to view
        request.setAttribute("data", blog);//
        System.out.println(blog.getBlogID());
       request.getRequestDispatcher("BlogDetail.jsp").forward(request, response);
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
        processRequest(request, response);
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
