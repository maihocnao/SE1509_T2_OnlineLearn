/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-15    1.0        Cuong               AddSubject
 */
package controller;

import bean.Subject;
import dao.CategoryDAO;
import dao.SubjectDAO;
import dao.impl.CategoryDaoImpl;
import dao.impl.SubjectDaoImpl;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;
import utils.StringValidation;

import java.util.Map;

/**
 * Process:<br>
 * - Get List of Lesson and AddSubject
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author cuong
 */
@MultipartConfig(location = "")
public class AddNewSubjectController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException if a servlet-specific error occurs
     * @throws java.io.IOException if an I/O error occurs
     */
    private static final String FRONT_END_PAGE = "AddNewSubject.jsp";//
    private final String PARAM_SUBJECT_CODE = "subjectCode";
    private final String PARAM_SUBJECT_NAME = "subjectName";
    private final String PARAM_CATEGORY = "category";
    private final String PARAM_FEATURED_FLAG = "featuredFlg";
    private final String PARAM_OWNER = "owner";
    private final String PARAM_STATUS = "status";
    private final String PARAM_DESCRIPTION = "description";

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
        CategoryDAO cateDao = new CategoryDaoImpl();
        request.setAttribute("categories", cateDao.getAll());//set categories
        StringValidation validation = new StringValidation();//new  vailidation
        String subjectCode = request.getParameter(PARAM_SUBJECT_CODE);//get PARAM_SUBJECT_CODE
        String subjectName = request.getParameter(PARAM_SUBJECT_NAME);//get PARAM_SUBJECT_NAME
        String category = request.getParameter(PARAM_CATEGORY);//get PARAM_CATEGORY
        String featuredFlg = request.getParameter(PARAM_FEATURED_FLAG);//PARAM_FEATURED_FLAG
        String owner = request.getParameter(PARAM_OWNER);//get PARAM_OWNER
        String status = request.getParameter(PARAM_STATUS);//get PARAM_STATUS
        String description = request.getParameter(PARAM_DESCRIPTION);
        String folder = request.getServletContext().getRealPath("images");
        folder = folder.replace("\\build", "");
        //validation  = null or empty getRequestDispatcher(FRONT_END_PAGE)  
        if (validation.isNullOrEmpty(subjectCode)) {
            request.getRequestDispatcher(FRONT_END_PAGE).forward(request, response);
            return;
        }
        //new subjectDAoimpl
        SubjectDAO dao = new SubjectDaoImpl();
        if (dao.checkExist(subjectCode)) {
            addAttributeWithExceptParam(request.getParameterMap(), "", request);//addAttribute
            //send to view
            System.out.println("ERROR");
            request.setAttribute("ERROR", "1");
            request.getRequestDispatcher(FRONT_END_PAGE).forward(request, response);
            return;
        }
        Subject subject = new Subject();//new subject 
        subject.setSubjectID(subjectCode);//new subjectCode
        subject.setName(subjectName);//new subjectName
        subject.setFeatured(featuredFlg);//new featuredFlg
        subject.setCategoryID(Integer.parseInt(category));
        subject.setOwner(owner);
        try {
            subject.setCategoryID(Integer.parseInt(category));
        } catch (NumberFormatException e) {

        }
        InputStream is;
        //read image 
        for (Part part : request.getParts()) {
            if (part.getSubmittedFileName() != null) {//if null
                String fileName = getTimeStamp() + getFileExtension(part.getSubmittedFileName());
                System.out.println(part.getSubmittedFileName());
                String saveTo = folder + File.separator + getTimeStamp() + fileName;
                System.out.println(saveTo);
                is = part.getInputStream();
                try (FileOutputStream fos = new FileOutputStream(saveTo)) {
                    int i;
                    while ((i = is.read()) != -1) {
                        fos.write(i);
                    }
                }
                subject.setThumbnail(fileName);
                subject.setStatus(status);
                subject.setDescription(description);
            }
        }
        int count = dao.insertOne(subject);
        //send to view
        if (count >= 1) {
            request.setAttribute("ERROR", "0");
        } else {
            request.setAttribute("ERROR", "-1");
        }
        request.getRequestDispatcher(FRONT_END_PAGE).forward(request, response);
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
        CategoryDAO dao = new CategoryDaoImpl();
        request.setAttribute("categories", dao.getAll());
        request.getRequestDispatcher(FRONT_END_PAGE).forward(request, response);
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

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException if a servlet-specific error occurs
     * @throws java.io.IOException if an I/O error occurs
     */
    //open file
    private String getFileExtension(String fileName) {
        if (fileName == null) {
            return null;
        }
        int start = fileName.lastIndexOf(".");
        return fileName.substring(start, fileName.length());
    }

    private String getTimeStamp() {
        return System.currentTimeMillis() + "";
    }

    private void addAttributeWithExceptParam(Map<String, String[]> params, String except, HttpServletRequest request) {
        //add attribute to display again, except specified
        for (String x : params.keySet()) {
            if (!x.equals(except)) {
                request.setAttribute(x, params.get(x)[0]);
            }
        }
    }
}
