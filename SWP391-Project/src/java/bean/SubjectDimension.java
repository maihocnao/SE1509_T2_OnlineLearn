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
