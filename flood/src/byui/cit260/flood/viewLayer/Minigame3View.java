/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;
import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.control.MiniGameControl;
import byui.cit260.flood.exceptions.MiniGameControlException;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import flood.Flood;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class Minigame3View extends View {
    
    public String[] getInputs() {
        String[] inputs = new String[2];
        this.console.println("Using the Quadratic equation,"
                + " \n Solve for x if a = 1, b = 3, c = -4?");
        String length = this.getInput("x:");
        inputs[0] = length;
        return inputs;
    }

    public boolean doAction(String[] inputs) {

                        String xGuess = inputs[0];
                        try{
                        double xDoub = Double.parseDouble(xGuess);
                        try {
                            double answer = MiniGameControl.miniGame3(xDoub);
                            this.console.println("You are correct! You have received a Golden Key");
                            pickUpKey();
                        } catch (MiniGameControlException e) {
                            this.console.println(e.getMessage());
                            return false;
                        }
                        }
                        catch(NumberFormatException e){
                            ErrorView.display(this.getClass().getName(),"Invalid inputs, use number.");
                        }
                       return true;
                    } 

    private void pickUpKey() {
        Game game = Flood.getCurrentGame();
        Item[] items = game.getItems();
        ArrayList<String> inventory = new ArrayList<>();
        for (Item item : items) {
            if (item.getName() == "GoldKey") {
                inventory.add(item.getName());
                item.setInInventory(true);
                this.console.println("Golden key was added to your inventory.\n");
            }
        }
        game.setInventory(inventory);
    }
    }

  
        