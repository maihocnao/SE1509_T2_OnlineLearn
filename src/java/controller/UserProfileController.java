/*
 *Copyright(C) 2005,  <Name of Organization/Individual own the application>.
 * <ProjectCode/Short Name of Application> :
 *  <Full name of project code/Name or application>
 *
 * Record of change:
 * DATE                Version     AUTHOR                       DESCRIPTION
 * <yyyy-MM-dd>      10/3/2021      cuong                      userprofile
 */
package controller;

import bean.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UserProfileServlet", urlPatterns = {"/user/profile"})
/**
 * Process:<br>
 * - Get display userprofile  of user  and find userlist
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author cuong
 */																
public class UserProfileController extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       User loggedin = (User) request.getSession().getAttribute("user");
  //      UserDAOImpl userDao = new UserDAOImpl();
   //     User loggedin = userDao.getUser("abc@gmail.com", "123");
        request.setAttribute("data", loggedin);
        System.out.println(loggedin.getFullname());
        request.getRequestDispatcher("Profile.jsp").forward(request, response);
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
