/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.User;
import dao.impl.CourseRegister;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class CourseRegisterController extends HttpServlet {
    String sid;
    int ppid;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String subjectid = request.getParameter("subjectid");
        int pricepackageid = Integer.parseInt(request.getParameter("pricepackageid"));
        sid = subjectid;
        ppid = pricepackageid;
        User u = (User) request.getSession().getAttribute("user");
        int userid = u.getUserID();
        String useremail = u.getEmail();
        CourseRegister cr = new CourseRegister();
        cr.addRegistration(userid, useremail, sid, ppid);
        response.sendRedirect("MyRegistrationsController");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        
    }
}
