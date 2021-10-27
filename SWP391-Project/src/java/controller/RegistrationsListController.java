package controller;

import dao.impl.RegistrationsList;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import bean.Registration;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationsListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        RegistrationsList rl = new RegistrationsList();
        List<Registration> rlist = rl.getAllRegis();
        request.setAttribute("rlist", rlist);
        request.getRequestDispatcher("35-Registrations-List.jsp").forward(request, response);
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        
    }
}
