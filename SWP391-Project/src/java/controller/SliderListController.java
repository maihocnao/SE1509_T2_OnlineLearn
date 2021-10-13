/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Slider;
import dao.SliderDAO;
import dao.impl.GetSliderToHP;
import dao.impl.SliderListDAOIpml;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SliderListController", urlPatterns = {"/sliderlistcontroller"})
public class SliderListController extends HttpServlet {

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
            int pageIndex = 1;
            try {
                pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
            } catch (Exception e) {
            }
            
            int pageSize = 4;
            int totalPage = 0;
            SliderDAO sliderDAO = new SliderListDAOIpml();
            int totalRow = sliderDAO.getCountTotalSlider();
            System.out.println(totalRow);
            if (totalRow == 0) {
                request.setAttribute("message", "Hiện tại chưa có slider !");
            } else {
                int maxPage = totalRow / pageSize + (totalRow % pageSize > 0 ? 1 : 0);
                int nextPage = pageIndex + 1;
                int backPage = pageIndex - 1;
                ArrayList<Slider> listSlider = sliderDAO.getAll(pageIndex, pageSize);
                request.setAttribute("listSlider", listSlider);
                request.setAttribute("maxPage", maxPage);
                request.setAttribute("nextPage", nextPage);
                request.setAttribute("backPage", backPage);
                request.setAttribute("pageIndex", pageIndex);
            }
            dispath(request, response, "/21-Slider-List.jsp");
        } catch (Exception ex) {
            Logger.getLogger(RegistrationDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dispath(HttpServletRequest request, HttpServletResponse response, String URL) {
        try {
            RequestDispatcher dis = request.getRequestDispatcher(URL);
            // url: link to view file start with /
            dis.forward(request, response);
        } catch (Exception e) {

        }

    }
//            int totalRow = SliderDAO.getCountTotalProduct() ;

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
