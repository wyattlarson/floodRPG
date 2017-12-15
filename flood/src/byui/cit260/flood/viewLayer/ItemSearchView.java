/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.model.Item;
import flood.Flood;
import java.util.ArrayList;

/**
 *
 * @author Ryan Call
 */
public class ItemSearchView extends View{
        
    public String[] getInputs(){
        String[] inputs = new String[1];
        this.console.println("\n\nEnter Item to Search for within the inventory");
        String input = this.getInput("enter item to search:");
        inputs[0] = input;
        return inputs;
    }
    
        @Override
    public boolean doAction (String[] inputs) {
        String searchItem = inputs[0];
        searchItem = searchItem.toUpperCase();
      boolean found = GameControl.itemSearch(searchItem);
      if(found== true){
          this.console.print("This item is in your inventory");
      }else if(found== false) {
            this.console.print("item not found in inventory"); 
      }
        return false;
       
}

}