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
import byui.cit260.flood.exceptions.MiniGameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class StartMinigameView extends View {

    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("For the first minigame you must find the area of a trapezoid."
                + " Base 1 = 20, Base 2 = 15, and Height = 10. What is the area?");
        String name = this.getInput("Enter your guess:");
        inputs[0] = name;
        return inputs;
    }

    public boolean doAction(String[] inputs) {

                        String playersGuess = inputs[0];
                        try{
                      double base1 = 20;
                        double base2 = 15;
                        double height = 10;
                        double doubledGuess = Double.parseDouble(playersGuess);
                        try {
                            double answer = MiniGameControl.miniGame1(base1, base2, height, doubledGuess);
                            this.console.println("You are correct!");
                            startMinigame2();
                        } catch (MiniGameControlException e) {
                            this.console.println(e.getMessage());
                            return false;
                        }
                        }
                        catch(NumberFormatException e){
                            this.console.println("Invalid inputs, use number.");
                        }
                       return true;
                    }

    private void startMinigame2() {
        Minigame2View miniGame2View = new Minigame2View();
        miniGame2View.display();
    }

        }
