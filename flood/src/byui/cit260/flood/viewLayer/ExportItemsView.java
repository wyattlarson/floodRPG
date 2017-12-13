/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.model.Item;
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
public class ExportItemsView extends View{
    
    public String[] getInputs(){
        String[] inputs = new String[1];
        this.console.println("\n\nEnter the filepath for the inventory to be saved to.");
        String filePath = this. getInput("-->");
        inputs[0] = filePath;
        return inputs;
    }
    @Override
    public boolean doAction
       (String[] inputs) {
        String filepath = inputs[0];
        Item[] items = Flood.getCurrentGame().getItems();
        try (PrintWriter out = new PrintWriter(filepath)) {
            out.println("\n\n=======Items In The Game=======");
            out.printf("%n%-20s%10s", "Name","Description");
            out.printf("%n%-20s%10s", "-----------","------------");
            
            for (Item item : items) {
                out.printf("%n%-20s%7s", item.getName()
                                                                        , item.getDescription());
            }
            this.console.println("=======Items export was successfull=======");
        }catch (IOException e){
            try {
                throw new GameControlException(e.getMessage());
            } catch (GameControlException ex) {
            }
        }
        return true;
    }
    
}
