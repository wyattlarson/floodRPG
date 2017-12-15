/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.control.MapControl;
import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.model.BuildingScene;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import flood.Flood;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wyattlarson
 */
public class FindMaxView extends View{
    
    public String[] getInputs(){
        String[] inputs = new String[1];
        String answer = this. getInput("\nFind the item with the highest ID?" +
                                       "\nY - yes" +
                                       "\nN - no");
        inputs[0] = answer;
        return inputs;
    }
    @Override
    public boolean doAction
       (String[] inputs) {
        String answer = inputs[0];
        answer = answer.toUpperCase();
         switch (answer){
                 case "Y":
                     MaxId();
                     break;
                 case "N":
                     return true;
                 default:
                     this.console.print("Invalid Command");
                     return false;
        }
        return true;
    }

    public void MaxId() {
        Item[] items = Flood.getCurrentGame().getItems();
        String maxId = GameControl.FindMaxId();
        
        this.console.print("The item with the highest Id is:" 
                           + "\n" + maxId + "\n");
        
    }
    
}
