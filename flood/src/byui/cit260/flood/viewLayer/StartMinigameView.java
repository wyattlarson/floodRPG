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
import byui.cit260.flood.control.MiniGameControl;

/**
 *
 * @author Ryan
 */
public class StartMinigameView extends View{

    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("For the first minigame you must find the area of a trapezoid."
                + " Base 1 = 20, Base 2 = 15, and Height = 10. What is the area?");
        String name = this.getInput("Enter your guess:");
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String playersGuess = inputs[0];
        double base1 = 20;
        double base2 = 15;
        double height = 10;
        double doubledGuess = Double.parseDouble(playersGuess);
        double answer = MiniGameControl.miniGame1(base1, base2, height, doubledGuess);
        if (answer == -1){
            System.out.println("Guess is outside of parameters. Try again.");
            return false;
        }
        else if (doubledGuess == answer){
            System.out.println("You are correct!");
            return true;
        }
        else {
            System.out.println("You are wrong. Try again");
            return false;
        }
    }
    
    
}
