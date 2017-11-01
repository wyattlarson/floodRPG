/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;
import byui.cit260.flood.control.BuildingControl;

/**
 *
 * @author wyatt
 */
public class DoorView {

    public void displayDoorView() {
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
        String[] inputs = new String[2];
        System.out.println("There is a password on the door.");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter your answer for side a:");
            Scanner a;
            a = new Scanner(System.in);
            String firstAnswer = a.nextLine();
            String trimmedFirstAnswer = trim(firstAnswer);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
            if (trimmedFirstAnswer.length() < 1) {
                System.out.println("You must enter a valid command.");
                continue;
            }
            valid = true;
            inputs[0] = trimmedFirstAnswer;
        }
            valid=false;
            while (valid == false){
            System.out.println("Enter your answer for side b:");
            Scanner b;
            b = new Scanner(System.in);
            String secondAnswer = b.nextLine();
            String trimmedSecondAnswer = trim(secondAnswer);
            if (trimmedSecondAnswer.length() < 1) {
                System.out.println("You must enter a valid command.");
                continue;
            }
            inputs[1] = trimmedSecondAnswer;
            valid = true;
        }
            
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
       /* String a = inputs[0];
        switch (a) {
            case "3":
                System.out.println("Side a is correct.");
                break;
            case "E":
                return true;
            default:
                System.out.println("Wrong answer, type 'e' tp give up.");
                break;
        }
        String b = inputs[1];
        switch (b) {
            case "4":
                System.out.println("Side b is correct.");
                return true;
            case "E":
                return true;
            default:
                System.out.println("Wrong answer, type 'e' tp give up.");
                break;
        } */
        String a = inputs[0];
        String b = inputs[1];
        String c = "5";
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
        System.out.println("You got the answer right! The door opens.");
        }
        return true;
    }
}
    






