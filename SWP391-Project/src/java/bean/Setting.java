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
    float value; 
    byte status;
    String type;
    String Description;

    public Setting() {
    }

    public Setting(int SettingID, int order, float value, byte status, String type, String Description) {
        this.SettingID = SettingID;
        this.order = order;
        this.value = value;
        this.status = status;
        this.type = type;
        this.Description = Description;
    }

    public int getSettingID() {
        return SettingID;
    }

    public int getOrder() {
        return order;
    }

    public float getValue() {
        return value;
    }

    public byte getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return Description;
    }

    public void setSettingID(int SettingID) {
        this.SettingID = SettingID;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Setting{" + "SettingID=" + SettingID + ", order=" + order + ", value=" + value + ", status=" + status + ", type=" + type + ", Description=" + Description + '}';
    }
    
    
}
