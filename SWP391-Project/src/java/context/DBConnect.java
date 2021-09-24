/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import config.IDBConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author phuon
 */
public class MSSQLConnection {
    public static Connection getConnection() {
        Connection con = null; // create connection
        String connectionUrl = "jdbc:sqlserver://" + IDBConfig.HOSTNAME + ":" + IDBConfig.PORT + ";"
                + "databaseName=" + IDBConfig.DATABASENAME + ";integratedSecurity=" + IDBConfig.INTEGRATEDSECURITY + ";";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // đăng kí một cái driver
        } catch (ClassNotFoundException e) {
            System.err.println("Where is your MSSQL JDBC Driver?");
            return con;
        }
        System.out.println("MSSQL JDBC Driver Registered!");
        try {
            con = DriverManager.getConnection(connectionUrl, IDBConfig.USERNAME, IDBConfig.PASSWORD); // mở một kết nối đến driver
        } catch (SQLException ex) {
            System.err.println("Connection Failed! Check output console");
            return con;
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = MSSQLConnection.getConnection();
        if (con != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

    public static void closeConnection(Connection con) { // đóng kết nối
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    /**
     *Close PrepareStatement to MSSQL Sever
     * @param ps
     */
    public static void closePreparedStatement(PreparedStatement ps) { // đóng biên dịch sql
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                System.err.println("Close PreparedStatement Fail!");
            }
        }
    }
    
    /**
     *Close ResultSet to MSSQL Sever
     * @param rs
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Close PreparedStatement Fail!");
            }
        }
    }
}
