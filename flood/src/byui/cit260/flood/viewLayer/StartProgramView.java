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
        System.out.println("=============================================================="+
                                        "\nWelcome to Save Flood Victims!" + 
                                        "\nThank you for your choice to come help save the flood victims."+
                                        "\n==============================================================");
        String command = this.getInput("S to start, E to exit.");
        inputs[0] = command;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String command = inputs[0];
        command = command.toUpperCase();
        switch (command) {
            case "S": mainMenu();
            break;
            case "E": return true;
            default: System.out.println("Invalid command.");
            break;
        }

 
        return false;
    }

    private void mainMenu() {
       System.out.println("================================================="
                + "\n\tWelcome to the game."
                + "\n\tWe hope you have a lot of fun!"
                + "\n=================================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

}
