package controller;

import dao.impl.MyRegistration;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import bean.Registration;
import bean.User;
import dao.impl.MyRegistration;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyRegistrationServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        MyRegistration mr = new MyRegistration();
        User u = (User) request.getSession().getAttribute("user");
        List<Registration> myreg = mr.getRegisByEmail(u.getEmail());
        request.setAttribute("myreg", myreg);
        request.getRequestDispatcher("").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        
    }
}

