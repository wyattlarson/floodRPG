/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.control.MapControl;
import byui.cit260.flood.exceptions.MapControlException;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import byui.cit260.flood.model.Player;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;
import byui.cit260.flood.viewLayer.UpgradeBoatMenuView;
import flood.Flood;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.audio.AudioPlayer.player;
/**
 *
 * @author Ryan Call
 */
public class DockMenuView  extends View {

 
       public String[] getInputs() {
        String[] inputs = new String[8];
        System.out.println("=========="+"Dock Menu"+ "==========" + 
                        "\n S or Save - Save game" +
                        "\n D or Drop - Drop off passengers" +
                        "\n U or Upgrade - go to boat upgrade menu" + 
                        "\n G or Gas - fill up gas tank" +
                        "\n X or Explore - Leave dock to explore map. Access Explore menu." +
                        "\n P - Print a list of people who need to be saved." +
                        "\n Info - list boat level, passenger list, passengers saved, and current gas level"+
                        "\n M - Enter the Minigames menu"+
                        "\n I - Inventory");
        
          String menuItem = this.getInput("Enter a menu item:");
            inputs[0] = menuItem;

        return inputs;
    }

     public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "S": saveGameMenu();
            break;
            case "U": upgradeBoatMenu();
            break;
            case "G": gasFillUp();
            break;
            case "Info": infoPage();
            break;
            case "I": InventoryMenuView();
            break;
            case "M": MiniGameView();
            break;
            case"X": {
            try {
                explore();
            } catch (MapControlException ex) {
                Logger.getLogger(DockMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
            case"Z": testDoor();
            case"P":printSaved();
            break;
            case "E": return true;
            default: System.out.println("Invalid Menu Command.");
            break;
        }
        return false;  
    }

    private void upgradeBoatMenu() {
        UpgradeBoatMenuView upgradeBoatMenuView = new UpgradeBoatMenuView();
        upgradeBoatMenuView.display();
         
    }

    private void gasFillUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void infoPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void InventoryMenuView() {
        InventoryMenuView InventoryMenuView = new InventoryMenuView();
        InventoryMenuView.display();
    }

    private void MiniGameView() {
        MiniGameView miniGameView = new MiniGameView();
        miniGameView.displayMiniGameView();
    }

    public void explore() 
            throws MapControlException {
        Game game = Flood.getCurrentGame();
        Map map = game.getMap();
        String[] inputs = new String[2];
        int intRow= 1;
        int intColumn = 1;
                Player player = Flood.getPlayer();
        byui.cit260.flood.model.Character character = player.getCharacter();
//        MoveCharacterView.getInputs();
//        MoveCharacterView.doAction(inputs);
        MapControl.moveCharacter(character, intRow, intColumn);
        System.out.println("\tMAP OF FLOODED CITY.");
        System.out.println(" |" +" 1"+ "|" +" 2"+ "|"+" 3"+ "|" +" 4"+ "|" +" 5"+"|");
        System.out.println("-------------------------------------");
        for (int i =0; i < map.getRowCount(); i++){
            System.out.print(i+1);           
            for (int j = 0; j < map.getColumnCount(); j++){
                System.out.print("|");
                //Location[][] location = new Location[i][j];
               System.out.print("??");
            }
            System.out.println("|");
        }             
        BuildingView buildingView = new BuildingView();
        buildingView.display();
    }

    private void saveGameMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void printSaved() {
        Game game = Flood.getCurrentGame();
        System.out.println(game.getListOfSurvivors());
    }    

    private void testDoor() {
        BuildingView buildingView = new BuildingView();
        buildingView.display();
    }
}
