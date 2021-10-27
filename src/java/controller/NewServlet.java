/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserDto;
import static controller.UserListController.log;
import dao.RoleDAO;
import dao.UserDAO;
import dao.impl.RoleDaoImpl;
import dao.impl.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.StringValidation;

/**
 *
 * @author Viettech88.vn
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/list-user"})
public class NewServlet extends HttpServlet {
private static final int PAGE_SIZE = 10;
    static final Logger log = Logger.getLogger(UserListController.class.getName());
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
        try {
            StringValidation vld = new StringValidation();
        String userRoleRaw = request.getParameter("role");
        String genderRaw = request.getParameter("gender");
        String statusRaw = request.getParameter("status");
        String pageIndexRaw = request.getParameter("pageIndex");
        log.info("------------- Parameter from client -------------");
        log.log(Level.INFO, "User role from client: {0}", userRoleRaw);
        log.log(Level.INFO, "User gender from client: {0}", genderRaw);
        log.log(Level.INFO, "User status from client: {0}", statusRaw);
        log.log(Level.INFO, "User page index from client: {0}", pageIndexRaw);
        log.info("");
        Map<String, Object> attributeList = new HashMap<>();
        UserDAO userDAO = new UserDAOImpl();
        RoleDAO roleDAO;
        roleDAO = new RoleDaoImpl();
        attributeList.put("roles", roleDAO.getRoleDesList());
        String roleId = (vld.isNullOrEmpty(userRoleRaw) || userRoleRaw.equals("All")) ? null : userRoleRaw.equals("All") ? null : userRoleRaw;
        String gender = (vld.isNullOrEmpty(genderRaw) || genderRaw.equals("All")) ? null : genderRaw.equals("All") ? null : genderRaw;
        String status = (vld.isNullOrEmpty(statusRaw) || statusRaw.equals("All")) ? null : statusRaw.equals("All") ? null : statusRaw.equals("Active") ? "true" : "false";
        int pageIndex = 1;
        try {
            pageIndex = Integer.parseInt(pageIndexRaw);
        } catch (NumberFormatException e) {
            log.info(e.getMessage());
        }
        List<UserDto> users = userDAO.getUserByCondition(roleId, gender, status, PAGE_SIZE, pageIndex);
        int dataSize;
        dataSize = userDAO.countUserWithCondition(roleId, gender, status);
            System.out.println(users);
        List<String> paging = extractPaging(PAGE_SIZE, dataSize);
        attributeList.put("dataUser", users);
        attributeList.put("pageList", paging);
        attributeList.put("pageIndex", pageIndex);
       
        try {
             log.log(Level.INFO, "Number of user: {0}", dataSize);
        addAttributeWithExceptParam(request.getParameterMap(), "", request);
        addAttribute(attributeList, request);
            
            request.getRequestDispatcher("newjsp1.jsp").forward(request, response);}
        catch(Exception e){
             Logger.getLogger(UserListController.class.getName()).log(Level.SEVERE, null, e);
            request.setAttribute("errorMessage", e.toString());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        }catch(Exception e){
             Logger.getLogger(UserListController.class.getName()).log(Level.SEVERE, null, e);
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

    private void addAttributeWithExceptParam(Map<String, String[]> params, String except, HttpServletRequest request) {
        //add attribute to display again, except specified
        for (String x : params.keySet()) {
            if (!x.equals(except)) {
                request.setAttribute(x, params.get(x)[0]);
            }
        }
    }
    
    private void addAttribute(Map<String, Object> data, HttpServletRequest request) {
        for (Iterator<String> it = data.keySet().iterator(); it.hasNext();) {
            String item = it.next();
            request.setAttribute(item, data.get(item));
        }
    }
    
    private List<String> extractPaging(int pageSize, int dataSize) {
        List<String> paging = new ArrayList<>();
        paging.add("1");
        int count = 1;
        while ((dataSize / pageSize) >= 1) {
            paging.add(++count + "");
            dataSize = dataSize - pageSize;
        }
        return paging;
    }
}
