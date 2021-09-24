/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.MailSenderBean;
import dao.DBConnect;
import dao.impl.resetPword;
import dao.itf.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ResetPasswordServlet", urlPatterns = {"/resetpasswordservlet"})
public class ResetPasswordServlet extends HttpServlet {
   MailSenderBean mailSender = new MailSenderBean();
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
            resetPword resetPass = new resetPword();
            String toEmail = request.getParameter("email");
            HttpSession session = request.getSession();
            session.setAttribute("email", toEmail);
            String fromEmail = "";
            String username = "";
            String password = "";
            if (resetPass.checkAccountExist(toEmail)) {
                mailSender.sendEmail(fromEmail, username, password, toEmail);
                resetPass.resetPassword(toEmail);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Email sent! Check your inbox');");
                 out.println("location='Homepage';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Sorry you have not registered!');");
                 out.println("location='Homepage';");
                out.println("</script>");
            }
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
