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
