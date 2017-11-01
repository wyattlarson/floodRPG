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
public class StartMinigameView {

    public void displayStartMinigameView() {
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
        System.out.println("For the first minigame you must find the area of a trapezoid."
                + " Base 1 = 20, Base 2 = 15, and Height = 10. What is the area?");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter your guess: ");
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
        String playersGuess = inputs[0];
        if (playersGuess == null){
            System.out.println("Please enter your guess");
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
