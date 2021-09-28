/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.Slider;
import dao.*;
import dao.itf.SliderDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viettech88.vn
 */
public class getSliderToHP  implements SliderDAO{
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public getSliderToHP(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }

    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Slider> getSliderHP() {
         ArrayList<Slider> arr = new ArrayList<>();
        ResultSet rs = dbConn.getData("select * from Slider");
     //   Slider(int sliderID, String title, String backlink, String image)
        try {
            while(rs.next()) {
                 int sliderID=rs.getInt("sliderID");//rs.getString(1)
                String  title=rs.getString(2);//rs.getString("pname");
                String backlink=rs.getString(3);//rs.getInt("quantity")
               
                String image=rs.getString(4);
                Slider slider = new Slider(sliderID, title, backlink, image);
                
                arr.add(slider);
            }
        } catch (SQLException ex) {
            
        }
       // System.out.println(arr);
        return arr;
    }
    
//    public static void main(String[] args) {
//        DBConnect dbconn = new DBConnect();
//        getSliderToHP a = new getSliderToHP(dbconn);
//        a.getSliderHP();
//    }
    
}
