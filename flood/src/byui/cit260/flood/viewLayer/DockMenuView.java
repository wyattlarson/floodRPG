/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.model.Player;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;
import byui.cit260.flood.viewLayer.UpgradeBoatMenuView;
/**
 *
 * @author Ryan Call
 */
public class DockMenuView {
    public void displayDockMenuView() {
        boolean endView = false;
        do{
          String[] inputs = getInputs(); 
            if (inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;  
        }
            boolean endview = doAction(inputs);
      }    while (endView != true);
     
}
  
       private String[] getInputs() {
        String[] inputs = new String[8];
        System.out.println("Dock Menu" +  
                        "\n U or Upgrade - go to boat upgrade menu" + 
                        "\n G or Gas - fill up gas tank" +
                        "\n Info - list boat level, passenger list, passengers saved, and current gas level");
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
            case "U": upgradeBoatMenu();
            break;
            case "G": gasFillUp();
            break;
            case "Info": infoPage();
            break;
            case "E": return true;
            default: System.out.println("Invalid Menu Command.");
            break;
        }
        return false;  
    }

    private void upgradeBoatMenu() {
        UpgradeBoatMenuView upgradeBoatMenuView = new UpgradeBoatMenuView();
        upgradeBoatMenuView.displayUpgradeBoatMenuView();
         
    }

    private void gasFillUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void infoPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    

}