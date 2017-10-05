/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;
import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author wyatt
 */

public class Game implements Serializable{

//------------------------------Game Attributes------------------------------//

    private double amountSaved;
    private String savedFile;
    
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
    
    //this is the association between the Game class and the Item class
     private ArrayList<Item> items = new ArrayList<Item>();
     
            //Item class getter and setter
            public ArrayList<Item> getItems() {
                return items;
            }
            public void setItems(ArrayList<Item> items) {
                this.items = items;
            }
            
//------------------------------Public Functions------------------------------//

   //this is the constructor
    public Game() {
    }
    
    
   
//amount saved getter
    public double getAmountSaved() {
        return amountSaved;
    }

   //amount saved setter
    public void setAmountSaved(double amountSaved) {
        this.amountSaved = amountSaved;
    }

    //savedFile getter
    public String getSavedFile() {
        return savedFile;
    }
    //savedFile setter
    public void setSavedFile(String savedFile) {
        this.savedFile = savedFile;
    }

//------------------------------Overrides------------------------------//

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.amountSaved) ^ (Double.doubleToLongBits(this.amountSaved) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.savedFile);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "amountSaved=" + amountSaved + ", savedFile=" + savedFile + '}';
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
        if (!Objects.equals(this.savedFile, other.savedFile)) {
            return false;
        }
        return true;
    }
    
}
