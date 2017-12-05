/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.model.Player;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;
import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.control.GameControl;
import flood.Flood;
import byui.cit260.flood.viewLayer.GameMenuView;
import byui.cit260.flood.viewLayer.SeeInventoryView;
import byui.cit260.flood.viewLayer.UseItemView;
/**
 *
 * @author Ryan Call
 */
public class InventoryMenuView extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String[4];
        this.console.println("Inventory Menu" + 
                "\n S- See items in your inventory " + 
                "\n D - Drop items" + 
                "\n U - Use an item" + 
                "\n E - Exit");
        String name = this.getInput("Enter a command:");
        inputs[0] = name; 
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "S": seeInventory();
            break;
            case "D": dropItem();
            break;
            case "U": useItem();
            break;
            case "E": return true;
            default: ErrorView.display(this.getClass().getName(), "Invalid Menu Command.");
            break;
        }
        return false;
    }

    private void useItem() {
        UseItemView useItemView = new UseItemView();
        useItemView.display();
    }

    private void seeInventory() {
        SeeInventoryView seeInventoryView = new SeeInventoryView();
        seeInventoryView.display();
    }

    private void dropItem() {
        DropItemView dropItemView = new DropItemView();
         dropItemView.display();
    }

}
