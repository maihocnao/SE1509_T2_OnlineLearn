/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-28    1.0        Cuong             QuizHandle
 */
package controller;

import bean.Question;
import bean.Quiz;
import dao.QuestionDAO;
import dao.impl.QuestionDaoImpl;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.QuizLevelConstant;

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
public class QuizHandleController extends HttpServlet {
    
    private static final String TYPE_SUBMIT = "submit";
    private static final String TYPE_NEXT = "next";
    private static final String TYPE_PREVIOUS = "previous";
    private static final String TYPE_TIME_UP = "timeup";

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
        if (quiz == null) {
            quiz = new Quiz();
            //@ToDo replace this with logged in userID
            quiz.setUserId(1);
            quiz.setQuizID(getQuizID());
            //ti le qua mon
            quiz.setPassRate(5);
            //replace this
            quiz.setLessonID("ASSL");
            QuestionDAO dao = new QuestionDaoImpl();
            //tao ti le cau hoi- de,trung binh,kho
            Map<String, Integer> ratio = creatRatio(3, 2, 2);
            List<Question> questions = dao.getBySubject(ratio, "ASSL");
            //sap xep cau hoi
            Collections.sort(questions, (Question o1, Question o2) -> o1.compareTo(o2));
            quiz.setQuestions(questions);
            quiz.setDuration(calculateDuration(quiz));
            //set quiz vao session (tao quiz moi)
            request.getSession().setAttribute("quiz", quiz);
            quiz.setSubmitDuration(calculateDuration(quiz));
        }
        request.setAttribute("durationText", durationText(quiz.getSubmitDuration()));
        request.setAttribute("duration", quiz.getDuration());
        request.setAttribute("index", 0);
        request.setAttribute("question", quiz.getQuestions().get(0));
        request.getRequestDispatcher("do.jsp").forward(request, response);
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
        Quiz quiz = (Quiz) request.getSession().getAttribute("quiz");
        //khong ton tai quiz 
        if (quiz == null) {
            response.sendRedirect("../AdminHomepage.jsp");
            return;
        }
        String actionType = request.getParameter("actionType");
        //get current question index from request
        int index = getIntValFromRequest("index", 0, request);
        System.out.println("index = " + index);
        //get user answer from request
        int answer = getIntValFromRequest("answer", - 1, request);

        //luu cau tra loi cua user
        quiz.getQuestions().get(index).setUserAnswer(answer);
        int duration = getIntValFromRequest("duration", quiz.getDuration(), request);
        quiz.setSubmitDuration(duration);
        request.getSession().setAttribute("quiz", quiz);
        //khi user an submit hoac het thoi gian lam bai
        if (actionType.equals(TYPE_SUBMIT) || actionType.equals(TYPE_TIME_UP)) {
            //redirect den trang finish
            response.sendRedirect("finish");
            return;
        }
        request.getSession().setAttribute("quiz", quiz);
        //khi user click vao button [NEXT] hoac [PREVIOUS] thi lay cau hoi tuong ung
        int cursor = getQuestionIndex(index, actionType, quiz.getQuestions().size());
        request.setAttribute("index", cursor);
        request.setAttribute("durationText", durationText(duration));
        request.setAttribute("question", quiz.getQuestions().get(cursor));
        request.getRequestDispatcher("do.jsp").forward(request, response);
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

    private String durationText(int duration) {
        int hour = duration / 3600;
        int min = (duration - (hour * 3600)) / 60;
        int sec = duration - hour * 3600 - min * 60;
        return hour + "h" + min + "m" + sec + "s";
    }
    
    private int calculateDuration(Quiz quiz) {
        int duration = 0;
        for (Question x : quiz.getQuestions()) {
            switch (x.getLevel()) {
                case QuizLevelConstant.EASY:
                    duration += QuizLevelConstant.TIME_PER_QUESTION_EASY;
                    break;
                case QuizLevelConstant.MEDIUM:
                    duration += QuizLevelConstant.TIME_PER_QUESTION_MEDIUM;
                    break;
                default:
                    duration += QuizLevelConstant.TIME_PER_QUESTION_MEDIUM;
                    break;
            }
        }
        return duration;
    }
    
    private Map<String, Integer> creatRatio(int easy, int medium, int hard) {
        Map<String, Integer> ratio = new HashMap<>();
        ratio.put(QuizLevelConstant.EASY, easy);
        ratio.put(QuizLevelConstant.MEDIUM, medium);
        ratio.put(QuizLevelConstant.HARD, hard);
        return ratio;
    }
    
    private int getQuestionIndex(int currentIndex, String actionType, int totalQuestion) {
        int cursor = currentIndex;
        if (actionType.equals(TYPE_NEXT)) {
            if (currentIndex + 1 >= totalQuestion) {
                cursor = 0;
            } else {
                cursor = currentIndex + 1;
            }
        } else if (actionType.equals(TYPE_PREVIOUS)) {
            if (currentIndex - 1 < 0) {
                cursor = totalQuestion - 1;
            } else {
                cursor = currentIndex - 1;
            }
        }
        return cursor;
    }
    
    private int getIntValFromRequest(String paramName, int defaultVal, HttpServletRequest req) {
        int intVal = defaultVal;
        try {
            intVal = Integer.parseInt(req.getParameter(paramName));
        } catch (NumberFormatException e) {
            
        }
        return intVal;
    }
    
    private String getQuizID() {
        return System.currentTimeMillis() + "";
    }
}
