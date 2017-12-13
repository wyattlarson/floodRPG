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
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author wyattlarson
 */
public class ExportInventoryView extends View{
    
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
        ArrayList<Item> inventory = Flood.getCurrentGame().getInventory();
        String[] list = new String[10];
        list[0] = "Names of items";
        list[1]= "\t Item Description";
        int count = 2;
        for (Item item : inventory) {
            list[count]=("\n"+item.getName()+"\t");
            count++;
            list[count]=(item.getDescription()+"\n\n");
            count++;
        }
        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(list);
        }catch (Exception e) {
            ErrorView.display("Error exporting inventory",e.getMessage());
        }
        return true;
    }
    
}
