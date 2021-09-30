/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        Mai           First Version<br>
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

public class GetSliderToHP  implements SliderDAO{
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;

    public GetSliderToHP(DBConnect dbconn) {
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
                System.out.println(slider.getImage());
                arr.add(slider);
            }
        } catch (SQLException ex) {
            
        }
       System.out.println(arr);
        return arr;
    }
    
    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        GetSliderToHP a = new GetSliderToHP(dbconn);
        a.getSliderHP();
    }
    
}
