/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.ItemType;
import flood.Flood;

/**
 *
 * @author wyatt
 */
public class BuildingView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("You have entered the red flooded building. Type H for a list of commands.");
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
            case "READ PAPER":
                readPaper();
                break;
            case "PICKUP PAPER":
                pickupPaper();
                break;
            case "OPEN DOOR":
                openDoor();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Menu Command.");
                break;
        }
        return false;
    }

    private void look() {
        this.console.println("You see a piece of paper on a table, and a door on the far side of the room.");
    }

    private void help() {
        this.console.println("Building Menu Commands"
                + "\n Look - Look around you."
                + "\n H - List of available commands."
                + "\n B - Boat, access boat menu to upgrade boat."
                + "\n E - Exit building."
                + "\n Read Paper - Read the piece of paper"
                + "\n Open Door - Try to open the door.");
    }

    private boolean exitBuilding() {
        return true;
    }

    private void readPaper() {
        this.console.println("You read the piece of paper. It says: Find the other side lengths of a triangle with a hypotneus of 25. Remember a^2 + b^2 = c^2. You are finding a and b.");
    }
    
    public void pickupPaper(){
        Game game = Flood.getCurrentGame();
        Item[] items = game.getItems();
        
        
    }

    private void openDoor() {
        DoorView doorView = new DoorView();
        doorView.display();
    }

}
