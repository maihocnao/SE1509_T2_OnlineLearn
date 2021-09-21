package dao.itf;


import bean.Answer;
import java.sql.SQLException;
import java.util.ArrayList;
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
public interface AnswerDAOitf {


    void closeConnection() throws SQLException, JMSException ;
    public ArrayList<Answer> getAllAnswer() throws SQLException, JMSException ;
               
    public ArrayList<Answer> getAllCorrectAnswer() throws SQLException {
        ArrayList<Answer> correctList = new ArrayList<>();
        String sql = "select answerID, answer.questionID, result, answer.content from answer where result =1;";
        return correctList;
    }
               
    public List<Answer> getAnswerByQuestionID(int questionID) throws SQLException {
        List<Answer> list = new ArrayList<>();
        String sql = "select * from answer where questionID = ?;";               
        try {
            DBConnection db = new DBConnection();
            con = db.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(AnswerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, questionID);
                rs = ps.executeQuery();

                while (rs.next()) {
                    
                }
            }
        return null;
    }    
   
   public boolean deleteAnswer(int answerID) throws SQLException{
        return false;
        
    }
               
               
    
}
