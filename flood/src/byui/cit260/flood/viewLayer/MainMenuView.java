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
import byui.cit260.flood.viewLayer.DockMenuView;

/**
 *
 * @author Ryan Call
 */
public class MainMenuView extends View {

    public String[] getInputs() {
        String[] inputs = new String[4];
        System.out.println("========="+"Main Menu" +"=========="
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
    }

    private void startNewGame() {
        // creates new game with player 
        GameControl.createNewGame(Flood.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create a new game.");
        }
        GameMenuView gameMenuView = new GameMenuView() {
        };
        gameMenuView.display();

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



