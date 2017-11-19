/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
import byui.cit260.flood.model.Item;
import java.util.ArrayList;

/**
 *
 * @author Brandon
 */
public class ItemScene extends BuildingScene implements Serializable {
    
    //-------------Item Scene Attributes-------------//
    
    private Point location;
    private String itemPickup;
    private ArrayList<Item> items = new ArrayList();
    
    //-----------------Associations--------------------//

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    
    
    //---------------Functions---------------//

    
    /*    public Point getLocation() {
    return location;
    }
    
    public void setLocation(Point location) {
    this.location = location;
    }*/

    public String getItemPickup() {
        return itemPickup;
    }

    public void setItemPickup(String itemPickup) {
        this.itemPickup = itemPickup;
    }

    //--------------toString and Hashcode---------------//


    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.location);
        hash = 97 * hash + Objects.hashCode(this.itemPickup);
        hash = 97 * hash + Objects.hashCode(this.items);
        return hash;
    }

        @Override
    public String toString() {
        return "ItemScene{" + "location=" + location + ", itemPickup=" + itemPickup + "items=" + items + '}';
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
        final ItemScene other = (ItemScene) obj;
        if (!Objects.equals(this.itemPickup, other.itemPickup)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }
    
    
    
}
