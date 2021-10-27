package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.Answer;
import bean.Question;
import bean.Quiz;
import dao.QuizDAO;
import dao.impl.QuizDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cyv2098
 */
public class QuizFinishController extends HttpServlet {

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
        Quiz quiz = (Quiz) request.getSession().getAttribute("quiz");
        if(quiz == null){
            response.sendRedirect("../AdminHomepage.jsp");
            return;
        }
        double score = calculateScore(quiz);
        quiz.setScore((float) score);
        QuizDAO dao = new QuizDaoImpl();
        dao.insert(quiz);
        request.getSession().removeAttribute("quiz");
        request.setAttribute("quiz", quiz);
        request.setAttribute("score",score);
        request.getRequestDispatcher("finish.jsp").forward(request, response);
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

    private double calculateScore(Quiz quiz) {
        int trueAnsw = 0;
        for (Question x : quiz.getQuestions()) {
            System.out.println(x.getUserAnswer());
            if (x.getUserAnswer() == getCorrectAnswerId(x.getAnswer())) {
                trueAnsw++;
            }
        }
        int totalQuestion = quiz.getQuestions().size();
        double score = 0;
        //khong co cau hoi nao trong quiz
        //bat exception divide by zero
        if (totalQuestion == 0) {
            return score;
        }
        score = ((double)trueAnsw / (double)totalQuestion) * 10;
        // lam tron len 2 chu so
        return (Math.floor(score * 100) / 100);
    }

    private int getCorrectAnswerId(List<Answer> ans) {
        int id = -1;
        for (Answer x : ans) {
            if (x.getResult() == 1) {
                id = x.getAnswerID();
                break;
            }
        }
        return id;
    }
}
