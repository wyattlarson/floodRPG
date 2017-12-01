/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.BuildingControl;
import byui.cit260.flood.exceptions.BuildingControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wyatt
 */
public class DoorView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("There is a password on the door.");
        String sideA = this.getInput("Enter your answer for side a:");
        inputs[0] = sideA;
        String sideB = this.getInput("Enter your answer for side b:");
        inputs[1] = sideB;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
       
        String a = inputs[0];
        String b = inputs[1];
        String c = "5";
        try{
            double doubledA = Double.parseDouble(a);
            double doubledB = Double.parseDouble(b);
            double doubledC = Double.parseDouble(c);
        try {
            double result = BuildingControl.puzzle1(doubledA, doubledB, doubledC);
            System.out.println("Your answer equates to:" + result +".  " + "You got the answer right! The door opens.");       
        } catch (BuildingControlException e) {
            System.out.println(e.getMessage());
            return false;
        }
        } catch(NumberFormatException e){
            System.out.println(e.getMessage());
            return false;
        }
       
        return true;
    }
}
