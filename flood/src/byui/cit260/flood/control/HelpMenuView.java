/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author Ryan Call
 */
public class HelpMenuView {
    public void displayHelpMenuView(){
        boolean endView = false;
        do {
            String[] inputs = getInputs(); 
           endView = doAction(inputs);
         displayResults();
        } while (endView != true);
        
        System.out.println("*** displayHelpMenu () called **");
    }
        private String[] getInputs() {
        String[] inputs = new String[8];
        System.out.println("Help Menu" +  
                        "\n 1 - Universal Command Help" + 
                        "\n 2 - Dock Menu Help" +
                        "\n 3 - Boat Menu Help" + 
                        "\n 4 - Explore Map Help" +
                        "\n 5 - Building Help" +
                        "\n E - Exit Help Menu");
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
            case "1": universalHelpMenu();
            break;
            case "2": dockHelpMenu();
            break;
            case "3": boatMenuHelp();
            break;
            case "4": exploreMapHelp();
            break;       
            case "5": buildingHelp();
            break;
            case "E": return true;
            default: System.out.println("Invalid Menu Command.");
            break;
        }
        return false;    }

    private void displayResults() {
    System.out.println();
    }

    private void universalHelpMenu() {
System.out.println("Universal Commands Help" +
        "\n Q - Quit, lets user promptly quit game." +
        "\n H - Help, lets you access this menu at anytime." + 
        "\n I - Inventory, opens your inventory.");
    }

    private void dockHelpMenu() {
System.out.println("Dock Menu Commands" +
        "\n S - Save, save game." + 
        "\n D - Drop, drops off passengers at the dock." +
        "\n B - Boat, access boat menu to upgrade boat." + 
        "\n E - Explore, Leave dock to explore map." +
        "\n Info - List some game information" +
        "\n M - Minigame, access minigame.");        
    }

    private void boatMenuHelp() {
System.out.println("Boat Menu Help"+
        "\n U - Upgrade, Upgrade boat."+
        "\n G - Gas, refuel.");
    }

    private void exploreMapHelp() {
System.out.println("Explore Map Help"+
        "\n M - Movement help, you can move any compass direction."+
        "\n L - Look, see a description of your surroundings."+
        "\n R - Return, return to dock and opens dock menu.");
    }

    private void buildingHelp() {
System.out.println("Building Help"+
        "\n L - Look, see a short description of your surroundings."+
        "\n P - Pickup, pickup item or survivors."+
        "\n E - Exit, exit building to your boat.");
    }



        
    }
