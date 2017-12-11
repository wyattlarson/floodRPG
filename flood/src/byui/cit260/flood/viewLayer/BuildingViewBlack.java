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
public class BuildingViewBlack extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("You have entered the BLACK flooded building. Type H for a list of commands.");
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
        this.console.println("All you see in this room is a big black door on the far side. It looks ominous.");
    }

    private void help() {
        this.console.println("Building Menu Commands"
                + "\n Look - Look around you."
                + "\n H - List of available commands."
                + "\n E - Exit building."
                + "\n Open Door - Try to open the door.");
    }

    private void exitBuilding() {
        MoveCharacterView moveCharacterView = new MoveCharacterView();
        moveCharacterView.display();
    }

    private void openDoor() {
         this.console.println("There are series of wires, and you must cut the correct wire to open the door. There is a blue, green and red wire. Which do you cut?");
        String command = this.getInput("Enter a command:");
        command = command.toUpperCase();
        switch(command){
            case "GREEN": this.console.println("wrong wire!");
                break;
            case "RED": doorView();
                break;
            case "BLUE": this.console.println("wrong wire, try again.");
                break;
        }
    }
        
     private void doorView(){
        this.console.println("You cut the right wire! You open the door and find Susan and Brian. You put them on your boat.");
        try{
            GameControl.addItemToInventory("Susan");
            GameControl.addItemToInventory("Brian");
        } catch (GameControlException ex) {
              ErrorView.display("BuildingViewBlack", ex.getMessage());
        }
    }

}
