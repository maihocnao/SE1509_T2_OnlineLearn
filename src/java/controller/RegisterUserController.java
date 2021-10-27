/*
 *Copyright(C) 2005,  <Name of Organization/Individual own the application>.
 * <ProjectCode/Short Name of Application> :
 *  <Full name of project code/Name or application>
 *
 * Record of change:
 * DATE                Version     AUTHOR                       DESCRIPTION
 * <yyyy-MM-dd>      10/3/2021      cuong                      userprofile
 */
package controller;

import bean.User;
import dao.UserDAO;
import dao.impl.UserDAOImpl;
import java.io.IOException;
import java.util.ArrayList;
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
 * @author Phong
 */
@WebServlet(name = "MyRegistrationServlet", urlPatterns = {"/user/register"})
/**														
 * The class contains method find update, delete, insert staff information from														
 * Staff table in database. In the update or insert method, all data will be normalized (trim space) before update/insert into database														
 * The method wil throw an object  of <code>java.lang.Exception</code> class if there is any error occurring when finding, inserting, or updating data														
 * <p>Bugs: Still have some issues related to search staff by address														
 *														
 * @author Nguyen Duc Cuong														
 */															
public class RegisterUserController extends HttpServlet {

    /**
 * Process:<br>
 * - insert register of user and checkexits
 * <br>
 *
 * Exception:<br>
 * - If content fails, it will return to error page.
 *
 * @author cuong
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
 */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            StringValidation stringValidation = new StringValidation();
        String email = request.getParameter("email");//get email 
        String fullName = request.getParameter("name");//get name
        String phoneNumber = request.getParameter("phonenumber");//get phone number 
        String address = request.getParameter("address");//get address
        String gender = request.getParameter("gender");//gender
        String password = request.getParameter("password");//get pasword 
        String repassword = request.getParameter("re-password");
        //first access to servlet
        if (stringValidation.isNullOrEmpty(email) || stringValidation.isNullOrEmpty(fullName)//if email and full name null or emty start 
                || stringValidation.isNullOrEmpty(gender) || stringValidation.isNullOrEmpty(password)) {//if gender  and pasword name null or emty start 
            try{
                //request servlet -> regiss
            request.getRequestDispatcher("RegistUser.jsp").forward(request, response);
            return;}
            catch(IOException | ServletException e){
                Logger.getLogger(RegisterUserController.class.getName()).log(Level.SEVERE, null, e);
            request.setAttribute("errorMessage", e.toString());
            request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
        User user = new User(1, "1", email, password, gender, fullName, phoneNumber,"Active","image" );
        UserDAO userDao;
        userDao = new UserDAOImpl();
        int existedUser = userDao.countExistedUser(user);
        List<String> listError = new ArrayList<>();
        //email already in use
        if (existedUser != 0) {
            addAttributeWithExceptParam(request.getParameterMap(), "email", request);
            listError.add("Email inputted already in use. Please try another !");
            //password not map
        } else if (!password.equals(repassword)) {
            listError.add("Password not map to each other, Please try again!");
        } else {
            int created = userDao.createUser(user);
            //insert fail 
            //case -1 represent for something causes exception
            //case 0 represent for data not inserted into database
            //other means data inserted into database
            //sắp xếp check list  // hien thu tren jsp //sắp xếp lại 
            if (created == -1 || created == 0) {
                request.setAttribute("CREATE_USER_STATUS", false);

            } else {
                request.setAttribute("CREATE_USER_STATUS", true);
               

            }
        }
        request.setAttribute("ERRORS", listError);
        response.sendRedirect("Login.jsp");
        request.getRequestDispatcher("RegistUser.jsp").forward(request, response);
        }
        catch (Exception  e) {
            Logger.getLogger(RegisterUserController.class.getName()).log(Level.SEVERE, null, e);
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
}
