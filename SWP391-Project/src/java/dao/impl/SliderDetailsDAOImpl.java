/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao.impl;

import bean.Slider;
import dao.MyDAO;
import dao.SliderDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**This class contains methods to help us manipulate SlideDetails objects in the database
 *
 * @author Hoang Anh
 */
public class SliderDetailsDAOImpl extends MyDAO implements SliderDAO {
 /**
     * Get SlideID of Slide object according in the database
     *
     * @param id it is an integer
     * @return a integer <code>SliderID</code> attribute
     * @throws Exception
     */
    
    public Slider getSliderbyID(int id) {
          Slider slider = new Slider();
        String sql = "select sliderID, slider.title, slider.image, slider.backlink from slider where sliderID=?";
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    slider.setSliderID(rs.getInt("sliderID"));
                    slider.setTitle(rs.getString("title"));
                    slider.setImage(rs.getString("image"));
                    slider.setBacklink(rs.getString("backlink"));
                }
            }
        } catch (SQLException ex) {
        } 
        return slider;
    }
    
    public static void main(String[] args) {
        SliderDetailsDAOImpl slide = new SliderDetailsDAOImpl();
        System.out.println(slide.getSliderbyID(2));
    }
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Slider> getSliderHP() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
