/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.User;
import dao.impl.Login;
import dao.itf.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Phong
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/loginservlet"})
public class LoginServlet extends HttpServlet {

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
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            User user = new Login().checkLogin(email, password);
            System.out.println(user);
        if (user!=null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            if (user.getRoleID().equals("1"))
                dispath(request, response, "/CustomerHomepage.jsp");
            if ("2".equals(user.getRoleID()))
                response.sendRedirect("SaleHomepage.jsp");
            if ("3".equals(user.getRoleID()))
                response.sendRedirect("MarketingDashB-Homepage.jsp");
            if ("4".equals(user.getRoleID()))
                response.sendRedirect("ExpertHomepage.jsp");
            if ("5".equals(user.getRoleID()))
                response.sendRedirect("AdminHomepage.jsp");
        }else{
            response.sendRedirect("1-Login.jsp");
        }
        }

        }
    
    private void dispath(HttpServletRequest request, HttpServletResponse response, String URL) {
        try {
            RequestDispatcher dis = request.getRequestDispatcher(URL);
            // url: link to view file start with /
            dis.forward(request, response);
        } catch (Exception e) {
            
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
