package dao.itf;


import bean.Answer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jms.JMSException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public interface AnswerDAO {


    void closeConnection() throws SQLException, JMSException ;
    public ArrayList<Answer> getAllAnswer() throws SQLException, JMSException ;
               
    void getAllCorrectAnswer() throws SQLException ;
               
    public List<Answer> getAnswerByQuestionID(int questionID) throws SQLException ;
   
   public boolean deleteAnswer(int answerID) throws SQLException;
               
               
    
}
