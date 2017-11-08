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
public class MainMenuView extends View{
    

    public String[] getInputs() {
        String[] inputs = new String[4];
        System.out.println("Main Menu" + 
                                            "\n N - Start New Game" + 
                                            "\n R - Restart Exsisting Game" +
                                            "\n H - Help Menu" +
                                            "\n D - Dock Menu" + 
                                            "\n E - Exit");
        String menuItem = this.getInput("Enter a menu item:");
            inputs[0] = menuItem;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "N": startNewGame();
            break;
            case "R": restartGame();
            break;
            case "H": getHelp();
            break;
            case "D": dockMenuView();
            break;
            case "T" : displayBuildingView();
            break;
            case "E": return true;
            default: System.out.println("Invalid Menu Command.");
            break;
        }
        return false;
    }        

    private void startNewGame() {
       // creates new game with player 
       GameControl.createNewGame(Flood.getPlayer());
        GameMenuView gameMenuView = new GameMenuView() {};
       gameMenuView.display();
       
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
         HelpMenuView helpMenuView = new HelpMenuView();
         helpMenuView.displayHelpMenuView();
         
    }

    private void dockMenuView() {
        DockMenuView dockMenuView = new DockMenuView();
        dockMenuView.display();
    }
    private void displayBuildingView() {
        BuildingView buildingView = new BuildingView();
        buildingView.displayBuildingView();
    }

}
