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
public class Item implements Serializable{
    
//------------------------------Item class Attributes------------------------------//

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

 //------------------------------Overrides------------------------------//

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + this.itemId;
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", itemId=" + itemId + '}';
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
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
       
}
