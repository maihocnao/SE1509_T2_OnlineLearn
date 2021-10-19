/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DBConnect {
    public Connection con=null;
    public DBConnect(String URL,String userName,String pass){
        try {
            //call driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //get connection
            con=DriverManager.getConnection(URL,userName, pass);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public DBConnect() {
        this("jdbc:sqlserver://localhost:1433;databaseName=SWP",
                "sa","123456");
    }
    public ResultSet getData(String sql){
        ResultSet rs=null;
        try {
            Statement state = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static void main(String[] args) {
        new DBConnect();
    }
    
    
}
