/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author Ryan Call
 */
public class SeeInventoryView {
    public void displaySeeInventoryView(){
        boolean endView = false;
        do {
            String[] inputs = getInputs(); 
           endView = doAction(inputs);
         displayResults();
        } while (endView != true);
    }
        private String[] getInputs() {
        String[] inputs = new String[8];
        System.out.println("Inventory" +  
                        "\n 1 Flashlight" + 
                        "\n 1 Hammer" +
                        "\n 2 Floaties" + 
                        "\n Inventory is 4/10 full" +
                        "\n E - Exit Inventory");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter a Command: ");
            Scanner inFile; 
            inFile = new Scanner(System.in);
            String name= inFile.nextLine();
            String trimmedName = trim(name);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
                if (trimmedName.length() <1) {
                System.out.println("You must enter a valid value.");
                continue;
            }
            inputs[0] = name;
           valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "E": return true;
            default: System.out.println("Invalid Menu Command.");
            break;
        }
        return false;  
    }

    private void displayResults() {
    System.out.println();
    }






        
    }
