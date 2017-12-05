/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import flood.Flood;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author wyatt
 */
public abstract class View implements ViewInterface {

    protected final BufferedReader keyboard = Flood.getInFile();
    protected final PrintWriter console = Flood.getOutFile();

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
        String selection = null;
        try {
            while (valid == false) {
                System.out.println(promptMessage);

                selection = keyboard.readLine();
                selection = selection.trim();
                //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
                if (selection.length() < 1) {
                    System.out.println("You must enter a valid value.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return selection;
    }
}
