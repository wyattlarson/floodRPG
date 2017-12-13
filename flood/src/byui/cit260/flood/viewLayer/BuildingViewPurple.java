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
import static java.lang.Compiler.command;
import java.util.ArrayList;

/**
 *
 * @author wyatt
 */
public class BuildingViewPurple extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("You have entered the PURPLE flooded building. Type H for a list of commands.");
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
            case "PICKUP ENGINE PARTS":
                pickup("Engine Parts");
                break;
            case "PICKUP WOOD":
                pickup("Wood");
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
        this.console.println("You see a pieces of wood as well as engine parts on a table, and a door on the far side of the room.");
    }

    private void help() {
        this.console.println("Building Menu Commands"
                + "\n Look - Look around you."
                + "\n H - List of available commands."
                + "\n E - Exit building."
                + "\n Pickup Engine Parts - Pick up the engine parts."
                + "\n Pickup Wood - Pick up the wood."
                + "\n Open Door - Try to open the door.");
    }

    private void exitBuilding() {
        MoveCharacterView moveCharacterView = new MoveCharacterView();
        moveCharacterView.display();
    }

    public void pickup(String itemName) {
        try {
            GameControl.addItemToInventory(itemName);
        } catch (GameControlException ex) {
            ErrorView.display("BuildingViewPurple", ex.getMessage());
        }
    }

    private void openDoor() {
        this.console.println("The door is unlocked, behind it you find Brandon trying to help Ryan who is pinned underneath a steel beam."
                + "\nBrandon needs your help to lift the steel beam off of Ryan. "
                + "\nHelp Brandon lift the beam with the command: lift, or command: abandon, to run away and only take Brandon and leave Ryan to DIE.");
        String command = this.getInput("Enter a command:");
        command = command.toUpperCase();
        if ("LIFT".equals(command)) {
            this.console.println("You succesfully lift the steel beam and pull Ryan out from underneith it, his leg is broken and needs a splint. "
                    + "\nUse the wood in the first room to help him by the command: wood.");

            command = this.getInput("Enter a command:");
            command = command.toUpperCase();
            if ("WOOD".equals(command)) {
                Item[] items = Flood.getCurrentGame().getItems();
                Game game = Flood.getCurrentGame();
                for (Item item : items) {
                    if (item.getName().toUpperCase().equals("WOOD") && item.isInInventory() == true) {
                        this.console.println("You were able to put a splint on Ryan's leg and Brandon helps you carry him to the boat. You have saved Ryan and Brandon! They are now in your boat.");
                        try {
                            GameControl.addItemToInventory("Ryan");
                            GameControl.addItemToInventory("Brandon");
                            return;
                        } catch (GameControlException ex) {
                            ErrorView.display("BuildingViewPurple", ex.getMessage());
                        }
                    }
                }
                this.console.println("You don't have wood in your inventory! It's in the room!");
            }
        } else if ("ABANDON".equals(command)) {
            this.console.println("You decided to leave Ryan behind and have saved only Brandon.");
            try {
                GameControl.addItemToInventory("Brandon");
                return;
            } catch (GameControlException ex) {
                ErrorView.display("BuildingViewPurple", ex.getMessage());
            }
        }else 
                            this.console.println("incorrect command");


    }
    

}
