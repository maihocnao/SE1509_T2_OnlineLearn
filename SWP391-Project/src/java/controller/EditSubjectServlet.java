/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-14    1.0        Quan           First Version<br>
 */
package controller;

import bean.Subject;
import dao.impl.GetSubjectById;
import dao.impl.UpdateSubject;
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
 * @author asus
 */
public class EditSubjectServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String subjectid = request.getParameter("subjectid");
        GetSubjectById gsbi = new GetSubjectById();
        try {
            Subject s = gsbi.subjectBySubjectID(subjectid);
            request.setAttribute("subject", s);
            request.getRequestDispatcher("editsubject.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(EditSubjectServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String subjectid = request.getParameter("subjectid");  // subject id
        int categoryid = Integer.parseInt(request.getParameter("categoryid"));   // lay category id
        String thumbnail = request.getParameter("inputFile");   // lay thumbnail
        GetSubjectById gsbi = new GetSubjectById();
        Subject s = new Subject();
        try {
            s = gsbi.subjectBySubjectID(subjectid);
        } catch (Exception ex) {
            Logger.getLogger(EditSubjectServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(thumbnail.isEmpty()){
            thumbnail = s.getThumbnail();   // neu thumbnail null thi thumbnail khong thay doi
        }
        String name = request.getParameter("name");    // lay name
        String description = request.getParameter("description");    // lay mo ta
        String status = request.getParameter("status");   // lay status
        String[] featuredList = request.getParameterValues("featured");  
        String featured;
        if(featuredList.length==0){
            featured = "No";  // neu featured ko duoc danh dau
        }else{
            featured = "Yes";  // neu featured duoc danh dau
        } 
        UpdateSubject us = new UpdateSubject();
        us.editSubject(subjectid, categoryid, thumbnail, name, description, status, featured);  // tien hanh edit subject
        pr.println("Subject updated successfully!");
        response.sendRedirect("SubjectListController");
        
    }

}
