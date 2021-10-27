/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-20    1.0        Quan           First Version<br>
 */
package controller;

import bean.PricePackage;
import dao.impl.EditPricePackage;
import dao.impl.GetPPByID;
import dao.impl.GetPricePackageDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class EditPricePackageController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String subid;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String subjectid = request.getParameter("subjectid");  // get parameter subjectid
        subid = subjectid;
        int pricepackageid = Integer.parseInt(request.getParameter("pricepackageid"));    // get parameter pricepackageid
        GetPPByID gppbi = new GetPPByID();
        try {
            PricePackage pp = gppbi.getPPbyId(pricepackageid);
            request.setAttribute("pp", pp);
        } catch (Exception ex) {
            Logger.getLogger(EditPricePackageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("editpricepackage.jsp").forward(request, response);   // send price package to editpricepackage.jsp
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        int pricepackageid = Integer.parseInt(request.getParameter("pricepackageid"));   // get pricepackageid
        String name = request.getParameter("name");   // get name
        if (name.trim().isEmpty() || name.trim().length() > 20) {    // check length
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        String Sad = request.getParameter("accessduration");   // get access duration
        int accessduration = 0;
        try {
            accessduration = Integer.parseInt(Sad);    // check if access duration is number
        } catch (Exception e) {
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        if (accessduration <= 0 || accessduration > 10000) {    // check if access duration is positive
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        String status = request.getParameter("status");
        String slp = request.getParameter("listprice");
        float listprice = 0;
        try {
            listprice = Float.parseFloat(slp);   // check if listprice is number

        } catch (Exception e) {
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        if (listprice <= 0 || listprice > 1000) {     // check if list price is positive
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        String ssp = request.getParameter("saleprice");
        float saleprice = 0;
        try {
            saleprice = Float.parseFloat(ssp);

        } catch (Exception e) {
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        if (saleprice < 0 || saleprice > 1000) {
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        String description = request.getParameter("description");
        if (description.trim().isEmpty() || description.trim().length() > 200) {
            response.sendRedirect("EditPricePackageController?subjectid=" + subid + "&pricepackageid=" + pricepackageid);
        }
        String subjectid = subid;
        EditPricePackage epp = new EditPricePackage();
        epp.editPricePackage(pricepackageid, name, accessduration, status, listprice, saleprice, description, subjectid);
        response.sendRedirect("PricePackageController?subjectid=" + subid);
    }
}
