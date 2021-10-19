/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.PricePackage;
import dao.PricePackageDAO;
import dao.impl.PricePackageDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.NumberProccessing;

/**
 *
 * @author cyv2098
 */
public class SavePricePackageServlet extends HttpServlet {

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
        int id = NumberProccessing.paramToInteger(request, "id");
        String name = request.getParameter("name");
        int duration = NumberProccessing.paramToInteger(request, "duration");
        String status = request.getParameter("status");
        System.out.println(request.getParameter("listPrice"));
        float listPrice = NumberProccessing.paramToFloat(request, "listPrice");
        float salePrice = NumberProccessing.paramToFloat(request, "salePrice");
        String description = request.getParameter("description");
        PricePackage p = new PricePackage();
        p.setPricePackageID(id);
        p.setPPname(name);
        p.setAccessDuration(duration);
        p.setStatus(status);
        p.setListPrice(listPrice);
        p.setSalePrice(salePrice);
        p.setDescription(description);
        PricePackageDAO dao = new PricePackageDaoImpl();
        dao.insert(p);
        response.sendRedirect("../price-package");
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
