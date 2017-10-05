/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wyatt
 */
public class Map implements Serializable{
    
//------------------------------Location Attributes------------------------------//
private String description;
private int rowCount;
private int columnCount;
private int currentRow;
private int currentColumn;
//------------------------------Associations-----------------------------//

//Association between Map Class and Game Class
private  ArrayList<Game> games = new ArrayList<Game>();
                public ArrayList<Game> getGames() {
                    return games;
                }
                public void setGames(ArrayList<Game> games) {
                    this.games = games;
                }
  
//Association between Map Class and Location Class


//------------------------------Public Functions-----------------------------//

//costructor
    public Map() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    

}
