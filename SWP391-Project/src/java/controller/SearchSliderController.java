/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Slider;
import dao.SliderDAO;
import dao.impl.SliderListDAOIpml;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phong
 */
@WebServlet(name = "SearchSliderController", urlPatterns = {"/searchslidercontroller"})
public class SearchSliderController extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            SliderDAO sliderDAO = new SliderListDAOIpml();
            // get info search 
            String nameTitle = request.getParameter("txtNameSearch");
            int statusType = Integer.valueOf(request.getParameter("txtStatus"));

            if (nameTitle.equals("") && statusType == 0) {
                response.sendRedirect("sliderlistcontroller");
            } else {
                int pageSize = 4;
                int pageIndex = 1;
                try {
                    pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
                    System.out.println("pageIndex: " + pageIndex);
                } catch (NumberFormatException e) {
                }
                System.out.println("totalRow Start");
                int totalRow = sliderDAO.countTotalSliderSearch(nameTitle, statusType); // lấy tổng số row có trong database   (10 row)
                System.out.println("totalRow END:" + totalRow);
                // Tìm xem có bao nhiêu trang  : 10 / 4  = 2 +1 = 3
                int maxPage = totalRow / pageSize + (totalRow % pageSize > 0 ? 1 : 0);
                // nextpage : 
                int nextPage = pageIndex + 1;
                int backPage = pageIndex - 1;
                // get list theo pageIndex
                List<Slider> listSearch = sliderDAO.search(nameTitle, statusType, pageIndex, pageSize);
                if (listSearch.isEmpty()) {
                    request.setAttribute("notify", "Không tìm thấy kết quả nào.");
                }

                request.setAttribute("maxPage", maxPage);
                request.setAttribute("backPage", backPage);
                request.setAttribute("nextPage", nextPage);
                request.setAttribute("pageIndex", pageIndex);

                request.setAttribute("isSearch", 1);
                request.setAttribute("listSlider", listSearch);
                request.setAttribute("nameSearch", nameTitle);
                request.setAttribute("statusTypeId", statusType);
                request.getRequestDispatcher("21-Slider-List.jsp").forward(request, response);
            }

        } catch (Exception e) {
            request.setAttribute("errorMessage", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
