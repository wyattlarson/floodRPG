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
public class Minigame2View extends View {
    
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("For the second minigame you must find the length and width of the perimeter of a triangle."
                + " \nIf the perimeter is 60, what are its lenght and width?");
        String length = this.getInput("Length guess:");
        inputs[0] = length;
        String width = this.getInput("Width guess:");
        inputs[1] = width;
        return inputs;
    }

    public boolean doAction(String[] inputs) {

                        String lenGuess = inputs[0];
                        String widGuess = inputs[1];
                        try{
                        double doubLen = Double.parseDouble(lenGuess);
                        double doubWid = Double.parseDouble(widGuess);
                        try {
                            double answer = MiniGameControl.miniGame2(doubLen, doubWid);
                            System.out.println("You are correct!");
                            startMinigame3();
                        } catch (MiniGameControlException e) {
                            System.out.println(e.getMessage());
                            return false;
                        }
                        }
                        catch(NumberFormatException e){
                            System.out.println("Invalid inputs, use number.");
                        }
                       return true;
                    } 

   private void startMinigame3() {
       Minigame3View startMinigame3View = new Minigame3View();
       startMinigame3View.display();
    }
        }