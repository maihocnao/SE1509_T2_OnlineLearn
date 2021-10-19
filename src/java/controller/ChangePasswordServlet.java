/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.impl.ChangePword;
/**
 *
 * @author Phong
 */
@WebServlet(name = "ChangePasswordServlet", urlPatterns = {"/changepasswordservlet"})
public class ChangePasswordServlet extends HttpServlet {

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
            ChangePword changePass = new ChangePword();
            String oldpass = request.getParameter("oldpass");
            String newpass1 = request.getParameter("newpass1");
            String newpass2 = request.getParameter("newpass2");
            User u = (User) request.getSession().getAttribute("currentUser");
            if(!oldpass.equals(u.getPassword())){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Incorrect old password!');");
                out.println("location='6change-password.html';");
                out.println("</script>");
            }else if(!newpass1.equals(newpass2)){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Re-password mismatch!');");
                out.println("location='6change-password.html';");
                out.println("</script>");
            }else{
                changePass.changePassword(u.getEmail(), newpass1);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Password changed successfully!');");
                out.println("location='7-Homepage.html';");
                out.println("</script>");
            }
        }
    }

}
