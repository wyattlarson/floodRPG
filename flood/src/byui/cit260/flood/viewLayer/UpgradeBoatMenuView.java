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
import byui.cit260.flood.exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import byui.cit260.flood.exceptions.BoatUpgradeException;

/**
 *
 * @author Ryan Call
 */
public class UpgradeBoatMenuView extends View {

    public String[] getInputs() {
        String[] inputs = new String[2];
        this.console.println("Upgrade your boat, what is the length and width of your boat?");
        String trimmedFirstAnswer = this.getInput("Enter the length of your boat:");
        inputs[0] = trimmedFirstAnswer;

        String trimmedSecondAnswer = this.getInput("Enter the width of your boat:");
        inputs[1] = trimmedSecondAnswer;

        return inputs;
    }

    public boolean doAction(String[] inputs) {

        String length = inputs[0];
        String width = inputs[1];
        try {
            double doubledLength = Double.parseDouble(length);
            double doubledWidth = Double.parseDouble(width);
            double result = 0;
            try {
                result = BoatUpgrade.calcBoatNumofPeople(doubledLength, doubledWidth);
                System.out.println("================================================="
                        + "\n\tYou have a new boat! "
                        + "\n\tIt can now hold "
                        + result
                        + " people."
                        + "\n=================================================");

            } catch (BoatUpgradeException e) {
                ErrorView.display(this.getClass().getName(), e.getMessage());
                return false;
            }
        } catch (NumberFormatException e) {
             ErrorView.display(this.getClass().getName(),"invalid Inputs, use numbers.");
        }
        return true;
    }
}
