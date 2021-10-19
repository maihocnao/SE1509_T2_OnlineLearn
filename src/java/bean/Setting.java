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
public class Setting {
    int SettingID;
    int order;
    String type;
    float value; 
    String status;
    String Description;

    public Setting() {
    }

    public Setting(int SettingID, int order, String type, float value, String status, String Description) {
        this.SettingID = SettingID;
        this.order = order;
        this.type = type;
        this.value = value;
        this.status = status;
        this.Description = Description;
    }

    public int getSettingID() {
        return SettingID;
    }

    public void setSettingID(int SettingID) {
        this.SettingID = SettingID;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Setting{" + "SettingID=" + SettingID + ", order=" + order + ", type=" + type + ", value=" + value + ", status=" + status + ", Description=" + Description + '}';
    }

    
    
    
}
