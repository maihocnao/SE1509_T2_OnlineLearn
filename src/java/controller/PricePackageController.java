/*
 *Copyright(C) 2005,  <Name of Organization/Individual own the application>.
 * <ProjectCode/Short Name of Application> :
 *  <Full name of project code/Name or application>
 *
 * Record of change:
 * DATE                Version     AUTHOR                       DESCRIPTION
 * <yyyy-MM-dd>      10/20/2021      cuong                       pricepackage 
 */

package controller;

import bean.PricePackage;
import dao.PricePackageDAO;
import dao.impl.PricePackageDaoImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.NumberProccessing;
/**
 * Process:<br>
 * - Get edit   price  of pricepackage  and find userlist
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author cuong
 */		
public class PricePackageController extends HttpServlet {

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
        int id = 1;
        try {
            //cast price package ID to integer
            id = NumberProccessing.paramToInteger(request, "id");
        } catch (NumberFormatException e) {
        }
        PricePackageDAO dao = new PricePackageDaoImpl();//new oj
        PricePackage data = dao.getOneById(id);//get id 
        //send vw 
        request.setAttribute("data", data);
        request.getRequestDispatcher("PricePackage.jsp").forward(request, response);
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
