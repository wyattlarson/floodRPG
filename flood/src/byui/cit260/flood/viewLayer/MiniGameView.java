/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;
import byui.cit260.flood.exceptions.MiniGameControlException;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author Brandon
 */
public class MiniGameView extends View{
    public void displayMiniGameView(){
        boolean endView = false;
        do {
            String[] inputs = getInputs(); 
           endView = doAction(inputs);
         displayResults();
        } while (endView != true);
    }
        public String[] getInputs() {
        String[] inputs = new String[4];
        this.console.println("Welcome to the Minigames! there are 3 levels that get progressively harder."
                + " You will receive a reward for each level you successfully complete." +  
                        "\n S - Start" + 
                        "\n E - Exit Minigames");
        boolean valid = false;
        while (valid == false) {
            this.console.println("Enter a Command: ");
            Scanner inFile; 
            inFile = new Scanner(System.in);
            String name= inFile.nextLine();
            String trimmedName = trim(name);
            //*** changed trimmedName.length < 2 to < 1 for accurate test matrix***//
                if (trimmedName.length() <1) {
                this.console.println("You must enter a valid value.");
                continue;
            }
            inputs[0] = name;
           valid = true;
        }
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "S": startMinigame();
            break;
            case "E": return true;
            default: this.console.println("Invalid Menu Command.");
            break;
        }
        return false;  
    }

    private void displayResults() {
    this.console.println();
    }

    private void startMinigame() {
        StartMinigameView startMinigameView = new StartMinigameView();
        startMinigameView.display();
    }
        
    }

