/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;
import java.awt.Point;

/**
 *
 * @author wyatt
 */
public enum Character {
    
    Bob("Bob", "Something", new Point(1,1));

    
    private Point locationId;
    private String name;
    private String description; 
    
    Character(String name, String description, Point locationId) {
        this.locationId = locationId;
        this.name = name;
        this.description = description;
    }

    public Point getLocationId() {
        return locationId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Character{" + "locationId=" + locationId + ", name=" + name + ", description=" + description + '}';
    }
    
}
