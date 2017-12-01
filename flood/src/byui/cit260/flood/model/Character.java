/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;

import byui.cit260.flood.model.Location;
import java.awt.Point;

/**
 *
 * @author wyatt
 */
public enum Character {
    //this is where we put a list of set characters to choose from
    Bob("Bob", "A short fat man.", new Point(1, 1)),
    Jackson("Jackson", "What he lacks in strength, he makes up for it with his brain.", new Point(1, 1)),
    Mark("Mark", "Short, but extremely strong.", new Point(1, 1)),
    Emily("Emily", "Kind and has the spirit of a champion.", new Point(1, 1));

//------------------------------Character Attributes------------------------------//
    private final String name;
    private final String description;
    private final Point location;

    Character(String name, String description, Point location) {
        this.location = location;
        this.name = name;
        this.description = description;
    }

//------------------------------Public Funtions------------------------------//
    //There are only getters because there is a set amount of characters to choose.
    public Point getLocation() {
        return location;
    }

    public void setRow(int row) {
        this.location.x = row;
    }

    public void setColumn(int column) {
        this.location.y = column;
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
        return "Character{" + "locationId=" + location + ", name=" + name + ", description=" + description + '}';
    }

}
