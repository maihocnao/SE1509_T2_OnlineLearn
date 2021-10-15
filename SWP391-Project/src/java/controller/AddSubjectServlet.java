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
import dao.impl.AddSubject;
import dao.impl.SubjectList;
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
public class AddSubjectServlet extends HttpServlet {

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
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String subjectid = request.getParameter("subjectid");   // lay subject id
        SubjectList sl = new SubjectList();
        ArrayList<Subject> slist;
        try {
            slist = sl.listAllSubject();
            for(Subject s: slist){
                if(subjectid.equalsIgnoreCase(s.getSubjectID())){
                    pr.println("Subject ID already existed!");   // kiem tra xem subjectid da ton tai chua
                    request.getRequestDispatcher("addsubject.jsp").include(request, response);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(AddSubjectServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String name = request.getParameter("name");   // lay ten
        String thumbnail = request.getParameter("inputFile");   // lay anh thumbnail
        int categoryid = Integer.parseInt(request.getParameter("categoryid"));    // lay dimension 
        String description = request.getParameter("description");   // lay mo ta
        String status = request.getParameter("status");   // lay status
        String[] featuredList = request.getParameterValues("featured");    
        String featured;
        if(featuredList.length==0){
            featured = "No";    // neu featured ko duoc danh dau
        }else{
            featured = "Yes";   // neu featured duoc danh dau
        }
        AddSubject as = new AddSubject();
        as.addSubject(subjectid, categoryid, thumbnail, name, description, status, featured);   // add subject
        pr.println("Subject Added Successfully!");
        response.sendRedirect("SubjectListController");
    }
}
