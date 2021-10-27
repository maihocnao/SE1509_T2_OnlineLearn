/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package controller;

import bean.Slider;
import dao.impl.SliderDetailsDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class SlideDetailsController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request Slideid from servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            int sliderID = Integer.parseInt(request.getParameter("sliderID"));
            SliderDetailsDAOImpl sliderDAO = new SliderDetailsDAOImpl();
            Slider slider = sliderDAO.getSliderbyID(1);
            request.setAttribute("slider", slider);
            request.getRequestDispatcher("SliderDetails.jsp").forward(request, response);
        }catch (Exception ex) {
                Logger.getLogger(SubjectListController.class.getName()).log(Level.SEVERE, null, ex);

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
//        int sliderID = Integer.parseInt(request.getParameter("sliderID"));
//            SliderDetailsDAOImpl sliderDAO = new SliderDetailsDAOImpl();
//            Slider slider = sliderDAO.getSliderbyID(sliderID);
//            request.setAttribute("slider", slider);
//            System.out.println(slider);
//            request.getRequestDispatcher("slider-detail.jsp").forward(request, response);
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
