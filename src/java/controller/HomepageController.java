/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
 */
package controller;

import dao.*;
import bean.*;
import dao.impl.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Process:<br>
 * - Get Get User Role to display correct homepage<br>
 * - Get information<br>
 * - Get <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author Mai
 */
@WebServlet(name = "HomepageServlet", urlPatterns = {"/homepageservlet"})
public class HomepageController extends HttpServlet {

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
        try  {
            
            SubjectDAO subjectDAO = new Get6SubjectHP();
           
            GetUserWithEmail getU = new GetUserWithEmail();
            //start session
             HttpSession session = request.getSession();
             //get slider
             SliderDAO getSlider = new GetSliderToHP();
             //get 2 blog to homepage          
            BlogDAO getBlog = new GetBlogHP();
            //get subject
            //Get6SubjectHP getSubject = new Get6SubjectHP(dbConn);
            //arraylist contain slider
             ArrayList<Slider> arrSlider = getSlider.getSliderHP();
             System.out.println(arrSlider);
               //arraylist contain blog
                ArrayList<Blog> arr2Blog = getBlog.get2Post();
                //arratlist contain subject
                ArrayList<Subject> arrSubject = subjectDAO.get6ToHp();
               
               
                //send data-->view
                
                request.setAttribute("listSlider", arrSlider);
                request.setAttribute("list2Post", arr2Blog);
                request.setAttribute("listSubject", arrSubject);
             //if email exist in session   
             try {
                 String email = (String) session.getAttribute("email");
                //get user object
                 User user = getU.getUserByEmail(email);
                 //when user'role is customer
            if (user.getRoleID().equals("1")){
                request.setAttribute("avatar", user.getImage());
                dispath(request, response, "CustomerHomepage.jsp");}
             //when user'role is sale
            if ("2".equals(user.getRoleID()))
                response.sendRedirect("SaleHomepage.jsp");
             //when user'role is marketing
            if ("3".equals(user.getRoleID()))
                response.sendRedirect("MarketingDashB-Homepage.jsp");
             //when user'role is expert
            if ("4".equals(user.getRoleID()))
                response.sendRedirect("ExpertHomepage.jsp");
             //when user'role is admin
            if ("5".equals(user.getRoleID()))
                response.sendRedirect("HomepageAdmin.jsp");
            //when there is no login, signup -> no email input
             }catch(Exception e){
                 // get into pages
                  RequestDispatcher dis=
                        request.getRequestDispatcher("PublicHomePage.jsp");
                 
                dis.forward(request, response);
             }
            
           
        } catch(Exception e){
             Logger.getLogger(HomepageController.class.getName()).log(Level.SEVERE, null, e);
           request.setAttribute("errorMessage", e.toString());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
     private void dispath(HttpServletRequest request, HttpServletResponse response, String URL) {
        try {
            RequestDispatcher dis = request.getRequestDispatcher(URL);
            // url: link to view file start with /
            dis.forward(request, response);
        } catch (IOException | ServletException e) {
            
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
