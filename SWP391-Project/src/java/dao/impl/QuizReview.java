/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao.impl;

import bean.Answer;
import bean.Question;
import dao.MyDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QuizReview extends MyDAO {

    /**
     * Get Question of object according in the database
     *
     * @param id it is an integer
     * @return a integer <code>SliderID</code> attribute
     * @throws java.sql.SQLException
     */
    public ArrayList<Question> getQuestionbyQuizID(int id) throws SQLException {
        ArrayList<Question> questionList = new ArrayList<>();
        String sql = "select question.questionID, question.quizID, question.content from question inner join quiz on question.quizID=quiz.quizID where quiz.quizID=?";
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int qid = rs.getInt("questionID");
                    int qid2 = rs.getInt("quizID");
                    String content = rs.getString("content");
                    String level = rs.getString("level");
                    Question question = new Question(qid, qid2, content, level);
                    questionList.add(question);
                }
            }
        } catch (SQLException ex) {
        }
        return questionList;
    }

    public static void main(String[] args) throws SQLException {
        QuizReview qr = new QuizReview();
//    
        System.out.println(qr.getQuestionbyQuizID(0));
    }

    /**
     * Get All Answer of object according in the database
     *
     * @return answerList
     */
    public ArrayList<Answer> getAllAnswer() {
        ArrayList<Answer> answerList = new ArrayList<>();
        String sql = "select answerID, answer.questionID, result, answer.content from answer";
        try {

            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int aid = rs.getInt("answerID");
                    int qid = rs.getInt("questionID");
                    int result = rs.getInt("result");
                    String content = rs.getString("content");
                    Answer answer = new Answer(aid, qid, result, content);
                    answerList.add(answer);
                }
            }
        } catch (SQLException ex) {
        }

        return answerList;
    }

    /**
     * Get All correct Answer of object according in the database
     *
     * @return answerList
     */
    public ArrayList<Answer> getAllCorrectAnswer() {
        ArrayList<Answer> correctList = new ArrayList<>();
        String sql = "select answerID, answer.questionID, result, answer.content from answer where result =1;";
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int aid = rs.getInt("answerID");
                    int qid = rs.getInt("questionID");
                    int result = rs.getInt("result");
                    String content = rs.getString("content");
                    Answer answer = new Answer(aid, qid, result, content);
                    correctList.add(answer);
                }
            }
        } catch (SQLException ex) {

        }
        return correctList;
    }

}
