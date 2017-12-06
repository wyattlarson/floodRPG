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
public class SeeInventoryView extends View{

        public String[] getInputs() {
        String[] inputs = new String[8];
        this.console.println("Inventory" +  
                        "\n 1 Flashlight" + 
                        "\n 1 Hammer" +
                        "\n 2 Floaties" + 
                        "\n Inventory is 4/10 full" +
                        "\n E - Exit Inventory");
        String name = this.getInput("Enter a command:");
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "E": return true;
            default: this.console.println("Invalid Menu Command.");
            
            break;
        }
        return false;  
    }

    private void displayResults() {
    this.console.println();
    }

        
    }
