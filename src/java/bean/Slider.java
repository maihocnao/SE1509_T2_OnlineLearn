/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Phong
 */
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
