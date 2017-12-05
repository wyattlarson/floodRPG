/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author Ryan Call
 */
public class HelpMenuView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[8];
        this.console.println("==========" + "\bHELP MENU"
                + "=========="
                + "\n 1 - Universal Command Help"
                + "\n 2 - Dock Menu Help"
                + "\n 3 - Boat Menu Help"
                + "\n 4 - Explore Map Help"
                + "\n 5 - Building Help"
                + "\n E - Exit Help Menu");

        boolean valid = false;
        while (valid == false) {
            String menuCommand = this.getInput("Enter a Command: ");
            String trimmedCommand = trim(menuCommand);
            if (trimmedCommand.length() < 1) {
                ErrorView.display(this.getClass().getName(),"You must enter a valid value.");
                continue;
            }
            inputs[0] = trimmedCommand;
            valid = true;
        }
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "1":
                universalHelpMenu();
                break;
            case "2":
                dockHelpMenu();
                break;
            case "3":
                boatMenuHelp();
                break;
            case "4":
                exploreMapHelp();
                break;
            case "5":
                buildingHelp();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid Menu Command.");
                break;
        }
        return false;
    }

    private void universalHelpMenu() {
        this.console.println("Universal Commands Help"
                + "\n Q - Quit, lets user promptly quit game."
                + "\n H - Help, lets you access this menu at anytime."
                + "\n I - Inventory, opens your inventory.");
    }

    private void dockHelpMenu() {
        this.console.println("Dock Menu Commands"
                + "\n S - Save, save game."
                + "\n D - Drop, drops off passengers at the dock."
                + "\n B - Boat, access boat menu to upgrade boat."
                + "\n E - Explore, Leave dock to explore map."
                + "\n Info - List some game information"
                + "\n M - Minigame, access minigame.");
    }

    private void boatMenuHelp() {
        this.console.println("Boat Menu Help"
                + "\n U - Upgrade, Upgrade boat."
                + "\n G - Gas, refuel.");
    }

    private void exploreMapHelp() {
        this.console.println("Explore Map Help"
                + "\n M - Movement help, you can move any compass direction."
                + "\n L - Look, see a description of your surroundings."
                + "\n R - Return, return to dock and opens dock menu.");
    }

    private void buildingHelp() {
        this.console.println("Building Help"
                + "\n L - Look, see a short description of your surroundings."
                + "\n P - Pickup, pickup item or survivors."
                + "\n E - Exit, exit building to your boat.");
    }

}
