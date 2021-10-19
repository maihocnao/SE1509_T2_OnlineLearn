/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public abstract class BaseDao {

    public Connection getConnection() {
        Connection connection = null;
        try {
            //Change the username password and url to connect your own database
            String username = "sa";
            String password = "sa";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=SWP";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public void closeConnection(Connection conn) throws SQLException{
        conn.close();
    }
    public void closeResultSet(ResultSet rs) throws SQLException{
        rs.close();
    }
    public void closeStatement(PreparedStatement stm) throws SQLException{
        stm.close();
    }
}
