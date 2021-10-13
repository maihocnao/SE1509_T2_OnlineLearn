/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-13    1.0        Mai           First Version<br>
 */
package controller;

import dao.LessonDAO;
import bean.Lesson;
import dao.impl.GetLessonsDAOImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Process:<br>
 * - Get List of Lesson to display in LessonView<br>
 * - Get youtube link of a Lesson and send to Lesson View<br>
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author Mai
 */
public class LessonViewController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException if a servlet-specific error occurs
     * @throws java.io.IOException  if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try  {
            LessonDAO lessonDAO = new GetLessonsDAOImpl();
            //start session
            HttpSession session  = request.getSession();
            
            //getParameter subjectID from MyRegistration page
            String subjectID; //subjectID of the lessonList
            subjectID = request.getParameter("subjectID");  
            // if subjectID is empty, get from session
            if(subjectID==null || subjectID.equals("")){
                 subjectID =session.getAttribute("subjectID").toString();
            }
            //if session subjectID is not empty, give it to session
            else {
               session.setAttribute("subjectID", subjectID);
            }
            
            int lessonID;//id of lesson
            
            String lsID; //lesson ID in string
            lsID= request.getParameter("lessonID");//when user click a link in Course Content, get lessonID param
            Lesson ls ;//a lesson
            String ytLink;//youtube link of Lesson
            //check parameter lessonID if emtpty, present with first lesson
            if (lsID==null || "".equals(lsID)){
                ls = lessonDAO.getFirstLesson(subjectID);
            //param lessonID is not empty, prensent with youtube link in that lesson
            }else {
                 lessonID = Integer.parseInt(lsID);
                ls = lessonDAO.getALessonByID(lessonID);
            }
            
            ytLink = ls.getYoutubeLink();//get value of youtube link in object ls
            
            //get List Lesson of that subject 
            ArrayList<Lesson> arr = lessonDAO.getAllLessonBySID(subjectID);
            
            //send to view
            request.setAttribute("lessonList", arr);
            request.setAttribute("yt", ytLink);
            request.getRequestDispatcher("LessonView.jsp").forward(request, response);
            
        }catch(Exception e){
             Logger.getLogger(CourseDetailsController.class.getName()).log(Level.SEVERE, null, e);
            request.setAttribute("errorMessage", e.toString());
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
