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
public class Minigame3View extends View {
    
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println(""
                + " \n what are its lenght and height?");
        String length = this.getInput("Length guess:");
        inputs[0] = length;
        String height = this.getInput("Height guess:");
        inputs[1] = height;
        return inputs;
    }

    public boolean doAction(String[] inputs) {

                        String lenGuess = inputs[0];
                        String HeiGuess = inputs[1];
                        try{
                        double doubLen = Double.parseDouble(lenGuess);
                        double doubHei = Double.parseDouble(HeiGuess);
                        try {
                            double answer = MiniGameControl.miniGame3(doubLen, doubHei);
                            System.out.println("You are correct!");
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

  
        }