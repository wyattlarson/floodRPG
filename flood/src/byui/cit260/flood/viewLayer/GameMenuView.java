/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.model.Player;

/**
 *
 * @author Ryan Call
 */
public abstract class GameMenuView extends View {

    public String[] getInputs() {
        String[] inputs = new String[4];
        this.console.println("Welcome to your new game");
        String name = this.getInput("Enter your player name: ");
        inputs[0] = name;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        Player player;
        try {
            player = GameControl.savePlayer(playersName);
        } catch (GameControlException e) {
            this.console.println(e.getMessage());
            return false;
        }
        this.console.println("================================================="
                + "\n\tWelcome to the game " + playersName + "."
                + "\n\tGood Luck!"
                + "\n=================================================");

        return true;
    }

}
