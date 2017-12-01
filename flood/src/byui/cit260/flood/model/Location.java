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
    private int row;
    private int column;
    private boolean visited;
    private int amountRemaining;
    private String description;
    private String locationSymbol;

    public String getLocationSymbol() {
        return locationSymbol;
    }

    public void setLocationSymbol(String locationSymbol) {
        this.locationSymbol = locationSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
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
                private BuildingScene buildingScene;
                public BuildingScene getBuildingScene() {
                    return buildingScene;
                }
                public void setBuildingScene(BuildingScene buildingScene) {
                    this.buildingScene = buildingScene;
                }
    //Constructor
    public Location() {
    }

//------------------------------Public Functions------------------------------//
    public int getRow(){
    return row;
}
    public void setRow(int row){
        this.row = row;
    }
    public int getColumn(){
        return column;
    }
    public void setColumn(int column){
        this.column = column;
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
        hash = 19 * hash + (this.visited ? 1 : 0);
        hash = 19 * hash + this.amountRemaining;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + " visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
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
