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
import context.DBContext;
import dao.SliderDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetSliderToHP extends DBContext implements SliderDAO{
   
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Slider> getSliderHP() throws Exception{
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        ArrayList<Slider> arr = new ArrayList<>();
        String sql="select * from Slider";
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try { 
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            //statement.setString(1, sID);
            rs = statement.executeQuery();
            while(rs.next()) {
               
                int sliderID=rs.getInt("sliderID");//rs.getString(1)
                String  title=rs.getString(2);//rs.getString("pname");
                String backlink=rs.getString(3);//rs.getInt("quantity")
               
                String image=rs.getString(4);
                Slider slider = new Slider(sliderID, title, backlink, image);
                //System.out.println(slider.getImage());
                arr.add(slider);
                
               
             }
            
           System.out.println(arr);
         return arr;
        } catch (ClassNotFoundException | SQLException ex) {
           throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        
    }
        
    
    public static void main(String[] args) {
       
        GetSliderToHP a = new GetSliderToHP();
        try {
            a.getSliderHP();
        } catch (Exception ex) {
            Logger.getLogger(GetSliderToHP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
