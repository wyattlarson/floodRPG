/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;

import java.io.Serializable;

/**
 *
 * @author wyatt
 */
public class Location implements Serializable{
    
//------------------------------Location Attributes------------------------------//
    private int locationNumber;
    private boolean visited;
    private int amountRemaining;
    
//------------------------------Associations------------------------------//
    //this is the association between the Location class and the Character class
    private Character character;
                public Character getCharacter() {
                    return character;
                }
                public void setCharacter(Character character) {
                    this.character = character;
                }
          
      //this is the association between Location and BuildingScene
                
    //Constructor
    public Location() {
    }

//------------------------------Public Functions------------------------------//
    public int getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }
    
//------------------------------Overrides------------------------------//
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.locationNumber;
        hash = 19 * hash + (this.visited ? 1 : 0);
        hash = 19 * hash + this.amountRemaining;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "locationNumber=" + locationNumber + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.locationNumber != other.locationNumber) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return true;
    }

    public void locationNumber(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void amountVisited(String _have_been_visited) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void amountRemaining(String _locations_remain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
