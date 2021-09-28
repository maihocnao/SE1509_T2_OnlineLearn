package controller;

import bean.User;
import dao.impl.changePword;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ChangePasswordServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        response.sendRedirect("6change-password.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String oldpass = request.getParameter("oldpass");
        String newpass1 = request.getParameter("newpass1");
        String newpass2 = request.getParameter("newpass2");
        User u = (User) request.getSession().getAttribute("user");
        String currentpass = u.getPassword();
        if(!oldpass.equals(currentpass)){
            pr.println("<script type=\"text/javascript\">");
            pr.println("alert('Incorrect old password!');");
            pr.println("location='6change-password.html';");
            pr.println("</script>");
        }else if(!newpass1.equals(newpass2)){
            pr.println("<script type=\"text/javascript\">");
            pr.println("alert('Password mismatch!');");
            pr.println("location='6change-password.html';");
            pr.println("</script>");
        }else{
            changePword cp = new changePword();
            cp.changePassword(u.getEmail(), newpass1);
            pr.println("<script type=\"text/javascript\">");
            pr.println("alert('Password changed successfully!');");
            pr.println("location='7-Homepage.html';");
            pr.println("</script>");
        }
    }
}
