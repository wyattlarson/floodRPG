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
 * @author wyatt
 */
import java.util.ArrayList;
public class Game implements Serializable{

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

    private double amountSaved;
    private String savedFile;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    public Game() {
    }

    public double getAmountSaved() {
        return amountSaved;
    }

    public void setAmountSaved(double amountSaved) {
        this.amountSaved = amountSaved;
    }

    public String getSavedFile() {
        return savedFile;
    }

    public void setSavedFile(String savedFile) {
        this.savedFile = savedFile;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    
    
}
