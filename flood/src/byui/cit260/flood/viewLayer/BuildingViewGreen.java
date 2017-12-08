/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.ItemType;
import flood.Flood;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wyatt
 */
public class BuildingViewGreen extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("You have entered the GREEN flooded building. Type H for a list of commands.");
        String command = this.getInput("Enter a command:");
        inputs[0] = command;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "LOOK":
                look();
                break;
            case "H":
                help();
                break;
            case "PICKUP HAMMER":
                pickup("Hammer");
                break;
                case "PICKUP ROPE":
                pickup("Rope");
                break;
            case "OPEN DOOR":
                openDoor();
                break;
            case "E":
                exitBuilding();
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Menu Command.");
              return true;             
        }
        return false;
    }

    private void look() {
        this.console.println("You see a hammer and some rope on a table, and a door on the far side of the room.");
    }

    private void help() {
        this.console.println("Building Menu Commands"
                + "\n Look - Look around you."
                + "\n H - List of available commands."
                + "\n E - Exit building."
                +"\n Pickup Hammer - Pick up the hammer."
                +"\n Pickup Rope - Pick up the rope."
                + "\n Open Door - Try to open the door.");
    }

    private void exitBuilding() {
        MoveCharacterView moveCharacterView = new MoveCharacterView();
        moveCharacterView.display();
    }
    
    public void pickup(String itemName){
        try {
            GameControl.addItemToInventory(itemName);
        } catch (GameControlException ex) {
            ErrorView.display("BuildingViewGreen", ex.getMessage());
        }
    }

    private void openDoor() {
        DoorView doorView = new DoorView();
        doorView.display();
    }

}
