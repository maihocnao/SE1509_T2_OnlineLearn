/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Answer;
import dao.AnswerDAO;
import dao.BaseDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public class AnswerDaoImpl extends BaseDao implements AnswerDAO {

    @Override
    public void closeConnection() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Answer> getAllAnswer() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllCorrectAnswer() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Answer> getAnswerByQuestionID(int questionID) throws SQLException {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "SELECT * FROM [dbo].[Answer]\n"
                + "WHERE questionID = ?";
        Connection conn = getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, questionID);
        ResultSet rs = stm.executeQuery();
        List<Answer> result = new ArrayList<>();
        while (rs.next()) {
            Answer a = new Answer();
            a.setAnswerID(rs.getInt("answerID"));
            a.setQuestionID(questionID);
            a.setResult(rs.getInt("result"));
            a.setContent(rs.getString("content"));
            result.add(a);
        }
        super.closeConnection(conn);
        closeResultSet(rs);
        closeStatement(stm);
        return result;
    }

    @Override
    public boolean deleteAnswer(int answerID) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertMany(List<Answer> data) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        String sql = "INSERT INTO [dbo].[Answer](questionID, result, content) VALUES(?,?,?)";
        PreparedStatement stm = null;
        Connection con = null;

        con = getConnection();

        try {
            stm = con.prepareStatement(sql);
            for (Answer x : data) {
                stm.setInt(1, x.getQuestionID());
                stm.setByte(2, (byte) x.getResult());
                stm.setString(3, x.getContent());
                stm.addBatch();
            }
            stm.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(AnswerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closeConnection(con);
                closeStatement(stm);
            } catch (SQLException ex) {
                Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
