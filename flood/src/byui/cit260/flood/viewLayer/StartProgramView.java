/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import java.util.Scanner;

/**
 *
 * @author Ryan Call
 */
public class StartProgramView {

    public void displayStartProgramView() {
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
        System.out.println("****Welcome****");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter players name: ");
            Scanner inFile; 
            inFile = new Scanner(System.in);
            String name= inFile.nextLine();
            if (name.length() < 2) {
                System.out.println("You must enter a value.");
                continue;
            }
            inputs[0] = name;
           valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("****called doAction****");
        System.out.println("\tinputs = " + inputs[0]);

        return true;

    }
    
    
}
