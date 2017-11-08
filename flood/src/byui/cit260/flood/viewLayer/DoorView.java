/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.BuildingControl;

/**
 *
 * @author wyatt
 */
public class DoorView extends View{


    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("There is a password on the door.");
        String sideA = this.getInput("Enter your answer for side a:");
        inputs[0] = sideA;
        String sideB = this.getInput("Enter your answer for side b:");
        inputs[1] = sideB;
       
            
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String a = inputs[0];
        String b = inputs[1];
        String c = "20";
        double doubledA = Double.parseDouble(a);
        double doubledB = Double.parseDouble(b);
        double doubledC = Double.parseDouble(c);
        double result = BuildingControl.puzzle1(doubledA, doubledB, doubledC);
        if (result == -1){
            System.out.println("Inputs not within parameters.");
        }
        else if (result == 0) {
             System.out.println("Your answers are WRONG!");
        }
        else{
        System.out.println("Your answer equates to:" +result +"You got the answer right! The door opens.");
        }
        return true;
    }
}
    






