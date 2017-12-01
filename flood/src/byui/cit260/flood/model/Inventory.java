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
public class Inventory implements Serializable {

//------------------------------Inventory Attributes------------------------------//
    private int itemQuantity;
    private ArrayList<Item> inventory;

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    //------------------------------Associations------------------------------//
//association between Inventory and Character
    private Character character;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    //association between Inventory and Item
    private ArrayList<Item> items = new ArrayList<Item>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

//------------------------------Public Functions------------------------------//
    //contsructor function
    public Inventory() {
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
//------------------------------Overrides------------------------------//

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.itemQuantity;
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemQuantity=" + itemQuantity + '}';
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
        final Inventory other = (Inventory) obj;
        if (this.itemQuantity != other.itemQuantity) {
            return false;
        }
        return true;
    }

}
