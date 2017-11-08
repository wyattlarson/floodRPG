/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.BuildingControl;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;
import byui.cit260.flood.control.BoatUpgrade;
/**
 *
 * @author Ryan Call
 */
public class UpgradeBoatMenuView extends View {

    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("Upgrade your boat, what is the length and width of your boat?");
            String trimmedFirstAnswer = this.getInput("Enter the length of your boat:");
            inputs[0] = trimmedFirstAnswer;
        
         
            String trimmedSecondAnswer = this.getInput("Enter the width of your boat:");
            inputs[1] = trimmedSecondAnswer;
           
        return inputs;
    }
        public boolean doAction(String[] inputs) {
        String length = inputs[0];
        String width = inputs[1];
        double doubledLength = Double.parseDouble(length);
        double doubledWidth = Double.parseDouble(width);
        double result = BoatUpgrade.calcBoatNumofPeople(doubledLength, doubledWidth);
        if (result == -1){
            System.out.println("Inputs not within parameters.");
        }
        else if (result == 0) {
             System.out.println("Your answers are WRONG!");
        }
        else{
        System.out.println("You have a new boat! it can hold " + result + " people.");
        }
        return true;
    }
}
