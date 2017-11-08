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
 * @author wyatt
 */
public abstract class View implements ViewInterface {

    public View() {
    }

    @Override
    public void display() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = this.doAction(inputs);

        } while (endView != true);
    }

    @Override
    public String getInput(String promptMessage) {
        boolean valid = false;
        while (valid == false) {
            System.out.println(promptMessage);
            Scanner inFile;
            inFile = new Scanner(System.in);
            String value = inFile.nextLine();
            value = trim(value);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
            if (value.length() < 1) {
                System.out.println("You must enter a valid value.");
                continue;
            }
            return value;
        }
        return null;
    }
}
