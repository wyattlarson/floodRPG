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
public class BuildingViewBlue extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("You have entered the BLUE flooded building. Type H for a list of commands.");
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
            case "PICKUP NAILS":
                pickup("Nails");
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
        this.console.println("You see some nails on the floor, and a door on the far side of the room.");
    }

    private void help() {
        this.console.println("Building Menu Commands"
                + "\n Look - Look around you."
                + "\n H - List of available commands."
                + "\n E - Exit building."
                + "\n Pickup Nails - Pick up the nails."
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
            ErrorView.display("BuildingViewBlue", ex.getMessage());
        }
    }

    private void openDoor() {
        Item[] items = Flood.getCurrentGame().getItems();
        Game game = Flood.getCurrentGame();
        for (Item item : items) {
            if (item.getName().toUpperCase().equals("GOLDKEY") && item.isInInventory() == true) {
                this.console.println("You were able to open door, you found Wyatt and Emma! You put them on your boat.");
                try {
                    GameControl.addItemToInventory("Wyatt");
                    GameControl.addItemToInventory("Emma");
                    return;
                } catch (GameControlException ex) {
                    ErrorView.display("BuildingViewBlue", ex.getMessage());
                }
            }
        }
        this.console.println("You don't have the right key in your inventory! Go find the Golden Key in the MiniGames!");
    }

}
