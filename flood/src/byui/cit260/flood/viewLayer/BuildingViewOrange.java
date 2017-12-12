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

/**
 *
 * @author wyatt
 */
public class BuildingViewOrange extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("You have entered the ORANGE flooded building. Type H for a list of commands.");
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
            case "PICKUP GASOLINE":
                pickup("Gasoline");
                break;
            case "OPEN DOOR":
                openDoor();
                break;
            case "E":
                exitBuilding();
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Menu Command.");
                break;
        }
        return false;
    }

    private void look() {
        this.console.println("You see a can of gasoline under the table, and a door on the far side of the room.");
    }

    private void help() {
        this.console.println("Building Menu Commands"
                + "\n Look - Look around you."
                + "\n H - List of available commands."
                + "\n E - Exit building."
                +"\n Pickup Gasoline - Pick up the gasoline."
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
            ErrorView.display("BuildingViewOrange", ex.getMessage());
        }
    }
    

    private void openDoor() {
         this.console.println("The door has a digital lock, to know what letters to plug in solve the following puzzle?"
                + "\n Guess the next three letters in the series GTNTL");
         // The answer is ITS Its the first letter of every word in the sentence.
        String command = this.getInput("Enter a answer:");
        command = command.toUpperCase();
        if ("ITS".equals(command)) {
            this.console.println("You were able to open door, you found Jackson! You put him on your boat.");
            try {
                GameControl.addItemToInventory("Jackson");

                return;
            } catch (GameControlException ex) {
                ErrorView.display("BuildingViewOrange", ex.getMessage());
            }
        }
        this.console.println("Wrong answer, try again.");

    }

}
