/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import byui.cit260.flood.model.Character;

/**
 *
 * @author wyatt
 */

public class Game implements Serializable {

//------------------------------Game Attributes------------------------------//
    private int amountSaved;
    private ArrayList<Item> namesOfSaved = new ArrayList<>();
    private Item[] items;
    private ArrayList<String> listOfSurvivors;
    private ArrayList<Item> inventory;

//------------------------------Associations------------------------------//
    //this is the association between the Game class and the Player class
    private Player player;
    //Player class getter and setter

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    //this is the association between Game class and the Character class
    private Character character;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    //this is the association between the Game class and the Item class
    //Item class getter and setter
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    //association between Game and Map class       
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

//------------------------------Public Functions------------------------------//
    //this is the constructor
    public Game() {
    }

//amount saved getter
    public int getAmountSaved() {
        return amountSaved;
    }

    //amount saved setter
    public void setAmountSaved(int amountSaved) {
        this.amountSaved = amountSaved;
    }

    public ArrayList<Item> getNamesOfSaved() {
        return namesOfSaved;
    }

    public void setNamesOfSaved(ArrayList<Item> namesOfSaved) {
        this.namesOfSaved = namesOfSaved;
    }


    public ArrayList<String> getListOfSurvivors() {
        return listOfSurvivors;
    }

    public void setListOfSurvivors(ArrayList<String> listOfSurvivors) {
        this.listOfSurvivors = listOfSurvivors;
    }
  
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

//------------------------------Overrides------------------------------//
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.amountSaved) ^ (Double.doubleToLongBits(this.amountSaved) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "amountSaved=" + amountSaved + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.amountSaved) != Double.doubleToLongBits(other.amountSaved)) {
            return false;
        }
        return true;
    }

}
