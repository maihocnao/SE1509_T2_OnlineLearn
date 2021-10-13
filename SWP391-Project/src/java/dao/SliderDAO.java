/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
 */
package dao;

import java.util.ArrayList;
import bean.*;


public interface SliderDAO {
    void update();
    /**
     * Get a User according to email
     *
     * @param no param
     * @return an arraylist of slider
     * @throws Exception
     */
    ArrayList<Slider> getSliderHP() throws Exception;
}
