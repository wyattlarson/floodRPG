/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

/**
 *
 * @author Ryan Call
 */
public class DropItemView extends View {

    public String[] getInputs() {
        String[] inputs = new String[4];
        System.out.println(
                "\n 1 - Flashlight"
                + "\n 2 - Hammer"
                + "\n 3 - Floaties"
                + "\n E - Exit Inventory");
        String name = this.getInput("Which item would you like to drop?");
        inputs[0] = name;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "E":
                return true;
            default:
                System.out.println("Invalid Menu Command.");
                break;
        }
        return false;
    }

    private void displayResults() {
        System.out.println();
    }

}
