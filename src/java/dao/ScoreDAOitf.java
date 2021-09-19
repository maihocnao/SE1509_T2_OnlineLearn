/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DBConnection;
/**
 *
 * @author Viettech88.vn
 */
public interface ScoreDAOitf {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public ScoreDAO() {
    }

    private void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
    }

    public boolean insertHighScore(String phone, int quizID) throws SQLException {
        
    }

    public String updateHighScore(String phone, int quizID, String score) throws SQLException {
        
    }

    public String getHighScore(String phone, int quizID) throws SQLException {
        
    }
}
