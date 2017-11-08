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

    public void displayUpgradeBoatMenuView() {
        boolean endView = false;
        do{
            String[] inputs = getInputs();
            if(inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView !=true);
    }
    
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("Upgrade your boat, what is the length and width of your boat?");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the length of your boat:");
            Scanner a;
            a = new Scanner(System.in);
            String firstAnswer = a.nextLine();
            String trimmedFirstAnswer = trim(firstAnswer);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
            if (trimmedFirstAnswer.length() < 1) {
                System.out.println("You must enter a valid number.");
                continue;
            }
            valid = true;
            inputs[0] = trimmedFirstAnswer;
        }
            valid=false;
            while (valid == false){
            System.out.println("Enter the width of your boat:");
            Scanner b;
            b = new Scanner(System.in);
            String secondAnswer = b.nextLine();
            String trimmedSecondAnswer = trim(secondAnswer);
            if (trimmedSecondAnswer.length() < 1) {
                System.out.println("You must enter a valid number.");
                continue;
            }
            inputs[1] = trimmedSecondAnswer;
            valid = true;
        }
            
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
