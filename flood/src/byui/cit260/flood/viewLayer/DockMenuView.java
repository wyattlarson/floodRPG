/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.exceptions.MapControlException;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import flood.Flood;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan Call
 */
public class DockMenuView extends View {

    public String[] getInputs() {
        String[] inputs = new String[8];
        this.console.println("==========" + "Dock Menu" + "=========="
                + "\n S or Save - Save game"
                + "\n D or Drop - Drop off passengers"
                + "\n U or Upgrade - go to boat upgrade menu"
                + "\n D or Drop Off Survivors - takes surivors out of inventory and places them in the arms of paramedics and loved ones."
                + "\n X or Explore - Leave dock to explore map. Access Explore menu."
                + "\n P - Print a list of people who need to be saved."
                + "\n Info - list boat level, passenger list, passengers saved, and current gas level"
                + "\n M - Enter the Minigames menu"
                + "\n I - Inventory"
                + "\n Export Items - Export a list of the games items"
                + "\n Export Survivors - list of survivors");

        String menuItem = this.getInput("Enter a menu item:");
        inputs[0] = menuItem;

        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "S":
                saveGame();
                break;
            case "U":
                upgradeBoatMenu();
                break;
            case "D":
                dropOffSurvivors();
                break;
            case "Info":
                infoPage();
                break;
            case "I":
                printInventory();
                break;
            case "EXPORT ITEMS":
                exportItems();
                break;
            case "EXPORT SURVIVORS":
                exportSurvivors();
                break;
                case "EXPORT VIEW":
                exportBuildingScene();
                break; 
            case "EXPORT BUILDINGS":
                exportBuildings();
                break;
            case "M":
                MiniGameView();
                break;
            case "X":
        {
            try {
                explore();
            } catch (MapControlException ex) {
                Logger.getLogger(DockMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "P":
                printSaved();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid Menu Command.");
        }
        return false;
    }

    private void upgradeBoatMenu() {
        UpgradeBoatMenuView upgradeBoatMenuView = new UpgradeBoatMenuView();
        upgradeBoatMenuView.display();

    }

    private void infoPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void MiniGameView() {
        MiniGameView miniGameView = new MiniGameView();
        miniGameView.displayMiniGameView();
    }

    public void explore() 
        throws MapControlException {
        MoveCharacterView moveCharacterView = new MoveCharacterView();
        moveCharacterView.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the filepath for file where the game is to be saved.");
        String filePath = this.getInput("-->");
        
        try{
            GameControl.saveGame(Flood.getCurrentGame(), filePath);
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    public void printSaved() {
        Game game = Flood.getCurrentGame();
        this.console.println(game.getListOfSurvivors());
    }

    public void printInventory() {
      ArrayList <Item> inventory = Flood.getCurrentGame().getInventory();   
        for (Item item : inventory) {
            this.console.println(item.getName());
        }
    }
    
    public void exportItems() {
        ExportItemsView eix = new ExportItemsView();
        eix.display();
    }
        private void dropOffSurvivors() {
        DropOffView dropOffView = new DropOffView();
        dropOffView.display();
    }


    private void exportSurvivors() {
        ExportSurvivorsView eix = new ExportSurvivorsView();
        eix.display();
    }

    private void exportBuildingScene() {
ExportBuildingDescriptionView eix = new ExportBuildingDescriptionView();
eix.display();    
    }
    private void exportBuildings() {
        ExportBuildingView ebv = new ExportBuildingView();
        ebv.display();

    }
}
