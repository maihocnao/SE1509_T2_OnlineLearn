/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Category;
import bean.Registration;
import bean.User;
import dao.CategoryDAO;
import dao.impl.GetDimensionById;
import dao.impl.MyRegistration;
import dao.impl.SubjectDimension;
import dao.impl.UpdateDimension;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class UpdateDimensionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int catid;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        User u = (User) request.getSession().getAttribute("user");
        if(u.getRoleID().equals("4")||u.getRoleID().equals("5")){
            int categoryID = Integer.parseInt(request.getParameter("id"));
            catid = categoryID;
            GetDimensionById gdbi = new GetDimensionById();
            Category c = gdbi.getCategoryById(catid);
            request.setAttribute("category", c);
            request.getRequestDispatcher("26-Subject-Dimensions.jsp").forward(request, response);
        }
        else{
            pr.println("<script type=\"text/javascript\">");
            pr.println("alert('Access Denied!');");
            pr.println("location='7-Homepage.html';");
            pr.println("</script>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        int categoryid = Integer.parseInt(request.getParameter("categoryid"));
        String type = request.getParameter("type");
        String categoryname = request.getParameter("categoryname");
        if(type.trim().isEmpty()||categoryname.trim().isEmpty()){
            pr.println("Please Fill All the Informations!");
            request.getRequestDispatcher("25-Subject-Dimensions.jsp");
        }else{
            UpdateDimension ud = new UpdateDimension();
            ud.updateCategory(type, categoryname, categoryid);
            pr.println("<script type=\"text/javascript\">");
            pr.println("alert('Updated Successfully!');");
            pr.println("location='7-Homepage.html';");
            pr.println("</script>");
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

}
