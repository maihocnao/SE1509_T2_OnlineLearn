/*
 *Copyright(C) 2005,  <Name of Organization/Individual own the application>.
 * <ProjectCode/Short Name of Application> :
 *  <Full name of project code/Name or application>
 *
 * Record of change:
 * DATE                Version     AUTHOR                       DESCRIPTION
 * <yyyy-MM-dd>      10/3/2021      cuong                       userlist
 */

package controller;

import bean.UserDto;
import dao.RoleDAO;
import dao.UserDAO;
import dao.impl.RoleDaoImpl;
import dao.impl.UserDAOImpl;
import java.io.IOException;
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
 * @author cyv2098
 */
@WebServlet(name = "UserListServlet", urlPatterns = {"/admin/list-user"})
/**
 * Process:<br>
 * - Get display userlist  of user  and find userlist
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author cuong
 */											
public class UserListController extends HttpServlet {
    
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
        String userRoleRaw = request.getParameter("role");//get role
        String genderRaw = request.getParameter("gender");//get gender
        String statusRaw = request.getParameter("status");//get status 
        String pageIndexRaw = request.getParameter("pageIndex");//get parameter
        log.info("------------- Parameter from client -------------");
        log.log(Level.INFO, "User role from client: {0}", userRoleRaw);
        log.log(Level.INFO, "User gender from client: {0}", genderRaw);
        log.log(Level.INFO, "User status from client: {0}", statusRaw);
        log.log(Level.INFO, "User page index from client: {0}", pageIndexRaw);
        log.info("");
        Map<String, Object> attributeList = new HashMap<>(); //new hash map 
        UserDAO userDAO = new UserDAOImpl();//new userdao
        RoleDAO roleDAO;
        roleDAO = new RoleDaoImpl(); //new roleumpl
        attributeList.put("roles", roleDAO.getRoleDesList());//get roles 
        String roleId = (vld.isNullOrEmpty(userRoleRaw) || userRoleRaw.equals("All")) ? null : userRoleRaw.equals("All") ? null : userRoleRaw;//check vrole  null or emty 
        String gender = (vld.isNullOrEmpty(genderRaw) || genderRaw.equals("All")) ? null : genderRaw.equals("All") ? null : genderRaw;//check fender null or emty
        String status = (vld.isNullOrEmpty(statusRaw) || statusRaw.equals("All")) ? null : statusRaw.equals("All") ? null : statusRaw.equals("Active") ? "true" : "false";//check status 
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
        List<String> paging = extractPaging(PAGE_SIZE, dataSize);//size 3 
        attributeList.put("dataUser", users);
        attributeList.put("pageList", paging);
        attributeList.put("pageIndex", pageIndex);
       
             log.log(Level.INFO, "Number of user: {0}", dataSize);
        addAttributeWithExceptParam(request.getParameterMap(), "", request);
        addAttribute(attributeList, request);
            
            request.getRequestDispatcher("UserList.jsp").forward(request, response);
       
        
        }catch(Exception e){
            try {
                throw e;
            } catch (Exception ex) {
                 //request.setAttribute("errorMessage", e.toString());
           // request.getRequestDispatcher("error.jsp").forward(request, response);
                Logger.getLogger(UserListController.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        List<String> paging = new ArrayList<>();//new lisst 
        paging.add("1");
        int count = 1;//cout size 1 
        while ((dataSize / pageSize) >= 1) {//while data siza page size  >= 1
            paging.add(++count + "");//index ++
            dataSize = dataSize - pageSize;//dsize - psize
        }
        return paging;
    }
}
