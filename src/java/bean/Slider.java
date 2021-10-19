/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package bean;


public class Slider {
    int sliderID;
    String title;
    String backlink;
    String image;

    public Slider() {
    }

    public Slider(int sliderID, String title, String backlink, String image) {
        this.sliderID = sliderID;
        this.title = title;
        this.backlink = backlink;
        this.image = image;
    }

    public int getSliderID() {
        return sliderID;
    }

    public String getTitle() {
        return title;
    }

    public String getBacklink() {
        return backlink;
    }

    public String getImage() {
        return image;
    }

    public void setSliderID(int sliderID) {
        this.sliderID = sliderID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBacklink(String backlink) {
        this.backlink = backlink;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Slider{" + "sliderID=" + sliderID + ", title=" + title + ", backlink=" + backlink + ", image=" + image + '}';
    }
    
    
}
