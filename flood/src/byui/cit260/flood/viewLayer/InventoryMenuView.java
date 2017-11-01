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
/**
 *
 * @author Ryan Call
 */
public class InventoryMenuView {
    public void displayInventoryMenuView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs(); 
            if (inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
             endView = doAction(inputs);
         
        } while (endView != true);
        
        System.out.println("*** displayInventoryMenuView() called **");
    }

    private String[] getInputs() {
        String[] inputs = new String[4];
        System.out.println("Inventory Menu" + 
                "\n S- See items in your inventory " + 
                "\n D - Drop items" + 
                "\n U - Use an item" + 
                "\n E - Exit");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter a Command: ");
            Scanner inFile; 
            inFile = new Scanner(System.in);
            String name= inFile.nextLine();
            String trimmedName = trim(name);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
                if (trimmedName.length() <1) {
                System.out.println("You must enter a valid value.");
                continue;
            }
            inputs[0] = name;
           valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
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
            default: System.out.println("Invalid Menu Command.");
            break;
        }
        return false;
    }        

    private void startNewGame() {
       // creates new game with player 
       GameControl.createNewGame(Flood.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
       gameMenuView.displayGameMenuView();
       
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
         HelpMenuView helpMenuView = new HelpMenuView();
         helpMenuView.displayHelpMenuView();
         
    }

    private void useItem() {
        System.out.println("Which item would you like to use?");
    }

    private void seeInventory() {
        SeeInventoryView seeInventoryView = new SeeInventoryView();
        seeInventoryView.displaySeeInventoryView();
    }

    private void dropItem() {
        System.out.println("Which item would you like to drop?");
    }

}
