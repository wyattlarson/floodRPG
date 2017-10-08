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
    //this is where we put a list of set characters to choose from
    Bob("Bob", "A short fat man.", new Point(1,1));

//------------------------------Character Attributes------------------------------//

    private final Point locationId;
    private final String name;
    private final String description; 
    
    Character(String name, String description, Point locationId) {
        this.locationId = locationId;
        this.name = name;
        this.description = description;
    }

//------------------------------Public Funtions------------------------------//

    //There are only getters because there is a set amount of characters to choose.
    public Point getLocationId() {
        return locationId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //------------------------------Overrides------------------------------//

    @Override
    public String toString() {
        return "Character{" + "locationId=" + locationId + ", name=" + name + ", description=" + description + '}';
    }
    
}
