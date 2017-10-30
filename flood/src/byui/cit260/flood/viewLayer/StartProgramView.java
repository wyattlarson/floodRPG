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
 * @author Ryan Call
 */
public class StartProgramView {

    public void displayStartProgramView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs(); 
            if (inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
             endView = doAction(inputs);
         
        } while (endView != true);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("Welcome to Save Flood Victims! Thank you for your choice to come help save the flood victims.");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter players name: ");
            Scanner inFile; 
            inFile = new Scanner(System.in);
            String name= inFile.nextLine();
            String trimmedName = trim(name);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
                if (trimmedName.length() <1) {
                System.out.println("You must enter a value.");
                continue;
            }
            inputs[0] = name;
           valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        if (player == null){
            System.out.println("Could not create player. " + "Enter a different name.");
            return false;
        }
        System.out.println("================================================="
        + "\n\tWelcome to the game " + playersName + "."
        + "\n\tWe hope you have a lot of fun!"
        + "\n=================================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();

        return true;
    }
    
    
}
