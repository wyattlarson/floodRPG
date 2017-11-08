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

/**
 *
 * @author Ryan
 */
public class StartProgramView extends View {

    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("Welcome to Save Flood Victims! Thank you for your choice to come help save the flood victims.");
        String name = this.getInput("Enter the player's name:");
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
                + "\n\tWe hope you have a lot of fun!"
                + "\n=================================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;
    }

}
