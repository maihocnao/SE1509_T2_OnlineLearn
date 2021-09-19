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
public class SubjectDimension {
    int dimensionID; 
    String type;
    String name;
    String description;

    public SubjectDimension() {
    }

    public SubjectDimension(int dimensionID, String type, String name, String description) {
        this.dimensionID = dimensionID;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public int getDimensionID() {
        return dimensionID;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDimensionID(int dimensionID) {
        this.dimensionID = dimensionID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SubjectDimension{" + "dimensionID=" + dimensionID + ", type=" + type + ", name=" + name + ", description=" + description + '}';
    }
    
    
}
