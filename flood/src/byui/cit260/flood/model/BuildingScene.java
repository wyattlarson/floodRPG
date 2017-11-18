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
public class BuildingScene implements Serializable{
    
//------------------------------BuildingScene Attributes------------------------------//
private String description;
private String status;

//------------------------------Associations------------------------------//

//Association between BuildingScene class and Location class
private Location location;
                public Location getLocation() {
                    return location;
                }
                public void setLocation(Location location) {
                    this.location = location;
                }

//Association between BuildingScene class and QuestionScene class

//Association between BuildingScene class and ItemScene class
private ItemScene itemScene;
                public ItemScene getItemScene(){
                    return itemScene;
                }
                public void setItemScene(ItemScene itemScene){
                    this.itemScene = itemScene;
                }

//------------------------------Public Functions------------------------------//

    //constructor
    public BuildingScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//------------------------------Overrides------------------------------//

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public String toString() {
        return "BuildingScene{" + "description=" + description + ", status=" + status + '}';
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
        final BuildingScene other = (BuildingScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    

}
