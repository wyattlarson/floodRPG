/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.ItemType;
import flood.Flood;
import java.util.ArrayList;

/**
 *
 * @author wyatt
 */
public class EndView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("============================================="
                + "\n\tYOU SAVED ALL 10 SURVIVORS!!!!!"
                + "\n\tYou will be forever remembered as the hero of the people!"
                + "\n=============================================");
        String command = this.getInput("Press S to start a new or existing game!");
        inputs[0] = command;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case"S":startGameOver();
            break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Menu Command.");
                break;
        }
        return false;
    }

    private void startGameOver() {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }

}
