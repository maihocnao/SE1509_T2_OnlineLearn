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

import dao.impl.AddPricePackage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class AddPricePackageController extends HttpServlet {

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
        String subjectid = request.getParameter("subjectid");
        subid = subjectid;
        request.getRequestDispatcher("addpricepackage.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String name = request.getParameter("name");
        if(name.trim().isEmpty()||name.trim().length()>20){
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        String sad = request.getParameter("accessduration");
        int accessduration = 0;
        try {
            accessduration = Integer.parseInt(sad);
        } catch (Exception e) {
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        if(accessduration<0||accessduration>10000){
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        String status = request.getParameter("status");
        String slp = request.getParameter("listprice");
        float listprice = 0;
        try {
            listprice = Float.parseFloat(slp);
        } catch (Exception e) {
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        if(listprice<0||listprice>1000){
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        String ssp = request.getParameter("saleprice");
        float saleprice = 0;
        try {
            saleprice = Float.parseFloat(ssp);
        } catch (Exception e) {
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        if(saleprice<0||saleprice>1000){
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        String description = request.getParameter("description");
        if(description.trim().isEmpty()||description.trim().length()>200){
            response.sendRedirect("AddPricePackageController?subjectid="+subid);
        }
        String subjectid = subid;
        AddPricePackage app = new AddPricePackage();
        app.addPricePackage(name, accessduration, status, listprice, saleprice, description, subjectid);
        response.sendRedirect("PricePackageController?subjectid="+subid);
    }
}
