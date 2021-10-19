/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DBContext {
    Connection con=null;
    public DBContext(String URL,String userName,String pass){
        try {
            //call driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //get connection
            con=DriverManager.getConnection(URL,userName, pass);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public DBContext() {
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
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
         public Connection getConnection() throws SQLException,ClassNotFoundException {
        try {
            Connection con = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; databaseName=SWP;";
            con = DriverManager.getConnection(url,"sa", "sa");
            return con;
        } catch (ClassNotFoundException ex) {
        }
        return null;
    
         }
//    
//    public Connection getConnection() throws ClassNotFoundException, SQLException {
//
//        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        return DriverManager.getConnection(url, username, password);
//    }

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param ps it is a object of <code>java.sql.PreparedStatement</code>
     * @throws Exception
     */
    public void closePreparedStatement(PreparedStatement ps) throws Exception {
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
    }

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param con it is a object of <code>java.sql.Connection</code>
     * @throws Exception
     */
    public void closeConnection(Connection con) throws Exception {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param rs it is a object of <code>java.sql.ResultSet</code>
     * @throws Exception
     */
    public void closeResultSet(ResultSet rs) throws Exception {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
    }
    
    
}
