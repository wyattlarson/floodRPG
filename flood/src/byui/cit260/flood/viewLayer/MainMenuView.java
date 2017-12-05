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
import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.exceptions.MapControlException;
import flood.Flood;
import byui.cit260.flood.viewLayer.GameMenuView;
import byui.cit260.flood.viewLayer.DockMenuView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan Call
 */
public class MainMenuView extends View {

    public String[] getInputs() {
        String[] inputs = new String[4];
        this.console.println("========="+"Main Menu" +"=========="
                + "\n N - Start New Game" 
                + "\n R - Start Existing Game"
                + "\n H - Help Menu"
                + "\n E - Exit");
        String menuItem = this.getInput("Enter a menu item:");
        inputs[0] = menuItem;

            inputs[0] = menuItem;
        return inputs;
    }

    public boolean doAction(String[] inputs) {

        try {
            String menuItem = inputs[0];
            menuItem = menuItem.toUpperCase();
            switch (menuItem) {
                case "N":
                    startNewGame();
                    break;
                case "R":
                    restartGame();
                    break;
                case "H":
                    getHelp();
                    break;
                case "E":
                    return true;
                default:
                    System.out.println("Invalid Menu Command.");
                    break;
            }
            return false;
        } catch (GameControlException ex) {
            System.out.println("Invalid Menu Command.");
        }
        return false;
    }

    private void startNewGame() throws GameControlException {
        // creates new game with player 
        GameMenuView gameMenuView = new GameMenuView() {
        };
        gameMenuView.display();
        int returnValue = 0;
        try {
            returnValue = GameControl.createNewGame(Flood.getPlayer());
        } catch (MapControlException e) {
            System.out.println(e.getMessage());
           
        }
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create a new game.");
        }
         DockMenuView dockMenuView = new DockMenuView();
        dockMenuView.display();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }

    private void getHelp() {
         HelpMenuView helpMenuView = new HelpMenuView();
         helpMenuView.display();
         
    }

    }



