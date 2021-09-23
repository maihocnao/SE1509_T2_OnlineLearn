/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.User;
import dao.impl.UserDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.StringValidation;

/**
 *
 * @author Phong
 */
@WebServlet(name = "MyRegistrationServlet", urlPatterns = {"/user/register"})
public class MyRegistrationServlet extends HttpServlet {

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
        StringValidation stringValidation = new StringValidation();
        String email = request.getParameter("email");
        String fullName = request.getParameter("name");
        String phoneNumber = request.getParameter("phonenumber");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");
        //first access to servlet
        if (stringValidation.isNullOrEmpty(email) || stringValidation.isNullOrEmpty(fullName)
                || stringValidation.isNullOrEmpty(gender) || stringValidation.isNullOrEmpty(password)) {
            request.getRequestDispatcher("RegistUser.jsp").forward(request, response);
            return;
        }
        User user = new User(1, "02", email, password, gender, fullName, phoneNumber, address, true);
        UserDaoImpl userDao = new UserDaoImpl();
        int existedUser = userDao.countExistedUser(user);
        if (existedUser != 0) {
            request.setAttribute("IS_EXISTED", true);
        } else {
            int created = userDao.createUser(user);
            //insert fail 
            //case -1 represent for something causes exception
            //case 0 represent for data not inserted into database
            //other means data inserted into database
            if (created == -1 || created == 0) {
                request.setAttribute("CREATE_USER_STATUS", false);
            } else {
                request.setAttribute("CREATE_USER_STATUS", true);
            }
        }
        request.getRequestDispatcher("RegistUser.jsp").forward(request, response);
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
