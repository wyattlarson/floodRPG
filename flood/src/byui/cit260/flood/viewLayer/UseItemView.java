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
public class UseItemView extends View {

        public String[] getInputs() {
        String[] inputs = new String[4];
        System.out.println("Which item would you like to use?" +  
                        "\n 1 - Flashlight" + 
                        "\n 2 - Hammer" +
                        "\n 3 - Floaties" + 
                        "\n E - Exit Inventory");

            String name = this.getInput("Enter a Command: ");
            inputs[0] = name;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
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
    System.out.println("it works");
    }
        
    }
