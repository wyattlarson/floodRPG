/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brandon
 */
public class Item implements Serializable {

//------------------------------Item class Attributes------------------------------//
    private String name;
    private String description;
    private int itemId;

//------------------------------Associations------------------------------//
    //this is the association between the Item and Game class
    private Game game;
    //getter and setter for Game class and Item class association

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    //this is the association between Item and Inventory
    private Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

//------------------------------Public Functions------------------------------//
    //this is the Item class constructor
    public Item() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //------------------------------Overrides------------------------------//
    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + ", itemId=" + itemId + ", game=" + game + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.itemId;
        hash = 83 * hash + Objects.hashCode(this.game);
        return hash;
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
        final Item other = (Item) obj;
        if (this.itemId != other.itemId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }

}
