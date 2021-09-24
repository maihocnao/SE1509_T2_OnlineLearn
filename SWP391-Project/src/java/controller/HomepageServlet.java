/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.*;
import bean.*;
import dao.impl.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phong
 */
@WebServlet(name = "HomepageServlet", urlPatterns = {"/homepageservlet"})
public class HomepageServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            DBConnect dbConn = new DBConnect();
            PreparedStatement ps= null;
            String service = request.getParameter("service");
            getSliderToHP getSlider = new getSliderToHP(dbConn);
            getBlogHP getBlog = new getBlogHP(dbConn);
            get6SubjectHP getSubject = new get6SubjectHP(dbConn);
            //display homepage in public view
            if (service ==null) {
                service="displayCommonHP";
            }
            //homepage public view
            if (service.equals("displayCommonHP")){
                //User Dao file to slider with arraylist type
                ArrayList<Slider> arrSlider = getSlider.getSliderHP();
                //User Dao file to blog post with arraylist type
                ArrayList<Blog> arr2Blog = getBlog.get2Post();
                //User Dao file to subject with arraylist type
                ArrayList<Subject> arrSubject = getSubject.get6ToHp();
                System.out.println(arrSlider);
               
                //send data-->view
                
                request.setAttribute("listSlider", arrSlider);
                request.setAttribute("list2Post", arr2Blog);
                request.setAttribute("listSubject", arrSubject);
                
                //call view (Select)
                 RequestDispatcher dis=
                        request.getRequestDispatcher("/PublicHomePage.jsp");
                //forward to jsp
                dis.forward(request, response);
            }
        }
    }
    //method for forward
     private void dispath(HttpServletRequest request, HttpServletResponse response, String URL) {
        try {
            RequestDispatcher dis = request.getRequestDispatcher(URL);
            // url: link to view file start with /
            dis.forward(request, response);
        } catch (ServletException | IOException ex) {
            
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
