/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.viewLayer.DockMenuView;

/**
 *
 * @author Ryan Call
 */
public abstract class GameMenuView extends View{
       public String[] getInputs() {
        String[] inputs = new String[4];
        System.out.println("Welcome to your new game" );
        String name = this.getInput("Enter your  player name: ");
            inputs[0] = name;

        return inputs;
    }
           public boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        if (player == null) {
            System.out.println("Could not create player. " + "Enter a different name.");
            return false;
        }
        System.out.println("================================================="
                + "\n\tWelcome to the game " + playersName + "."
                + "\n\tGood Luck!"
                + "\n=================================================");
       DockMenuView dockMenuView = new DockMenuView();
        dockMenuView.display();
        return false;
    }       

}

