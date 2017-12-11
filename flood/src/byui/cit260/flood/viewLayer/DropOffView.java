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
public class DropOffView extends View {

    Game game = Flood.getCurrentGame();
    ArrayList<Item> inventory = game.getInventory();

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("You are about to drop off survivors. You have saved "+game.getAmountSaved()+" people so far!");
        String command = this.getInput("Enter the name of the passanger you want to drop off or E to exit:");
        inputs[0] = command;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "FRED":
                dropOff("Fred");
                break;
            case "H":
                help();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Menu Command.");
                break;
        }
        if (game.getAmountSaved()>=10){
            EndView endView = new EndView();
            endView.display();
        }
        return false;
    }

    private void dropOff(String name) {
        try {
            GameControl.dropOff(name);
        } catch (GameControlException ex) {
            ErrorView.display("DropOffView",ex.getMessage());
        }
    }

    private void help() {
        this.console.println("Building Menu Commands"
                + "\n Look - Look around you."
                + "\n H - List of available commands."
                + "\n B - Boat, access boat menu to upgrade boat."
                + "\n E - Exit building."
                + "\n Pickup Paper - Pick up the piece of paper."
                + "\n Read Paper - Read the piece of paper"
                + "\n Open Door - Try to open the door.");
    }

}
