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
public class BuildingView {
        public void displayBuildingView() {
        boolean endView = false;
         System.out.println("You have entered the red flooded building. Type H for a list of commands.");
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
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter a command: ");
            Scanner inFile; 
            inFile = new Scanner(System.in);
            String command= inFile.nextLine();
            String trimmedCommand = trim(command);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
                if (trimmedCommand.length() <1) {
                System.out.println("You must enter a valid command.");
                continue;
            }
            inputs[0] = command;
           valid = true;
        }
        return inputs;
    }
     private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "LOOK": look();
            break;
            case "H": help();
            break;
            case "READ PAPER": readPaper();
            break;       
            case "OPEN DOOR": openDoor();
            break;
            case "E": return true;
            default: System.out.println("Invalid Menu Command.");
            break;
        }
        return false;  
    }

    private void look() {
        System.out.println("You see a piece of paper on a table, and a door on the far side of the room.");
    }

    private void help() {
System.out.println("Building Menu Commands" +
        "\n Look - Look around you." + 
        "\n H - List of available commands." +
        "\n B - Boat, access boat menu to upgrade boat." + 
        "\n E - Exit building." +
        "\n Read Paper - Read the piece of paper" +
        "\n Open Door - Try to open the door.");      }

    private boolean exitBuilding() {
       return true;
    }

    private void readPaper() {
        System.out.println("You read the piece of paper. It says: Find the other side lengths of a triangle with a hypotneus of 25. Remember a^2 + b^2 = c^2. You are finding a and b.");
    }

    private void openDoor() {
          DoorView doorView = new DoorView();
         doorView.displayDoorView();
    }
    
}
