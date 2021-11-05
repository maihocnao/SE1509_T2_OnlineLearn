/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Question;
import dao.AnswerDAO;
import dao.BaseDao;
import dao.QuestionDAO;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.QuizLevelConstant;

/**
 *
 * @author cyv2098
 */
public class QuestionDaoImpl extends BaseDao implements QuestionDAO {

    @Override
    public void addQuestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Question getQuestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editQuestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteQuestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Question getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Question> getBySubject(Map<String, Integer> ratio, String subjectId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Map<String, List<Integer>> questionIdByLevel = randomQuestionIDInLevel(ratio, subjectId);
        List<Question> result = new ArrayList<>();
        for (String key : questionIdByLevel.keySet()) {
            List<Question> data = getByLevelAndSubject(subjectId, key, questionIdByLevel.get(key));
            result.addAll(data);
        }
        return result;
    }

    @Override
    public int countQuestionByLevel(String level, String subjectID) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "SELECT COUNT(*) as total FROM [dbo].[Question] q"
                + "\tWHERE q.level = ? AND q.subjectID = ?";
        Connection conn = getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        int total = 0;
        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1, level);
            stm.setString(2, subjectID);
            rs = stm.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closeConnection(conn);
                closeResultSet(rs);
                closeStatement(stm);
            } catch (SQLException ex) {
                Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return total;
    }

    private Map<String, List<Integer>> randomQuestionIDInLevel(Map<String, Integer> ratio, String subjectId) {
        Map<String, List<Integer>> result = new HashMap<>();
        Random random = new Random();
        //lăp để random question theo level
        for (String key : ratio.keySet()) {
            int numberOfQuestion = ratio.get(key);
            List<Integer> data = new ArrayList<>();
            //khi số lượng câu hỏi theo level = 0 thì chỉ cần add list trống
            if (numberOfQuestion == 0) {
                result.put(key, data);
                continue;
            }
            int range = countQuestionByLevel(key, subjectId);
            //lấy số question ID 
            //ví dụ cần lấy 10 question có level = eay thì lặp 10 lần rồi random ID
            for (int i = 0; i < numberOfQuestion; i++) {
                //lặp để random ra question 
                while (true) {
                    int number = random.nextInt(range) + 1;
                    //chưa tồn tại question thì add vào rồi random tiếp 
                    if (!data.contains(number)) {
                        data.add(number);
                        break;
                    }
                }
            }
            result.put(key, data);
        }
        return result;
    }

    @Override
    public List<Question> getByLevelAndSubject(String subjectId, String level, List<Integer> listId) {
        String sql = "SELECT * FROM (\n"
                + "SELECT  ROW_NUMBER() OVER (ORDER BY Q.questionID) AS RowNum  ,* FROM [dbo].[Question] Q\n"
                + "WHERE Q.subjectID = ? AND Q.level = ?) part\n"
                + "WHERE part.RowNum IN #ID_LIST#";
        Connection conn = getConnection();

        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Question> result = new ArrayList<>();
        try {
            StringBuilder cond = new StringBuilder("(");
            listId.forEach(x -> {
                cond.append(x);
                cond.append(",");
            });
            cond.append("-1");
            cond.append(")");
            sql = sql.replaceAll("#ID_LIST#", cond.toString());
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, subjectId);
            stm.setString(++index, level);
            rs = stm.executeQuery();
            AnswerDAO answerDao = new AnswerDaoImpl();
            while (rs.next()) {
                Question q = new Question();
                q.setQuestionID(rs.getInt("questionID"));
                q.setSubjectID(subjectId);
                q.setContent(rs.getString("content"));
                q.setLevel(level);
                q.setAnswer(answerDao.getAnswerByQuestionID(q.getQuestionID()));
                result.add(q);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closeConnection(conn);
                closeStatement(stm);
                closeResultSet(rs);
            } catch (SQLException ex) {
                Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        QuestionDAO dao = new QuestionDaoImpl();
        Map<String, Integer> ratio = new HashMap<>();
        ratio.put(QuizLevelConstant.EASY, 3);
        ratio.put(QuizLevelConstant.MEDIUM, 2);
        ratio.put(QuizLevelConstant.HARD, 2);
        List<Question> dat = dao.getBySubject(ratio, "ASSL");
        Collections.sort(dat, (Question o1, Question o2) -> o1.compareTo(o2));
        dat.forEach(x -> {
            System.out.println(x.getQuestionID() + " " + x.getContent() + " " + x.getLevel());
        });
    }

    @Override
    public void insertMany(List<Question> data) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertOne(Question data) {
        PreparedStatement stm = null;
        Connection con = null;
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "INSERT INTO [dbo].[Question](subjectID,content,level) VALUES(?,?,?)";

            con = getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, data.getSubjectID());
            stm.setString(2, data.getContent());
            stm.setString(3, data.getLevel());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closeConnection(con);
                closeStatement(stm);
            } catch (SQLException ex) {
                Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public int getQuestionId(String subjectId, String content, String level) {
        PreparedStatement stm = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "SELECT * FROM [dbo].[Question]"
                    + "WHERE subjectID = ? AND content = ? AND level = ?";

            con = getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, subjectId);
            stm.setString(2, content);
            stm.setString(3, level);
            rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("questionID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closeConnection(con);
                closeResultSet(rs);
                closeStatement(stm);
            } catch (SQLException ex) {
                Logger.getLogger(QuestionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }
}
