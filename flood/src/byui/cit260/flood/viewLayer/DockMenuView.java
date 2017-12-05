/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.exceptions.MapControlException;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import flood.Flood;
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
                + "\n G or Gas - fill up gas tank"
                + "\n X or Explore - Leave dock to explore map. Access Explore menu."
                + "\n P - Print a list of people who need to be saved."
                + "\n Info - list boat level, passenger list, passengers saved, and current gas level"
                + "\n M - Enter the Minigames menu"
                + "\n I - Inventory");

        String menuItem = this.getInput("Enter a menu item:");
        inputs[0] = menuItem;

        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "S":
                saveGameMenu();
                break;
            case "U":
                upgradeBoatMenu();
                break;
            case "G":
                gasFillUp();
                break;
            case "Info":
                infoPage();
                break;
            case "I":
                printInventory();
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
            case "Z":
                testDoor();
            case "P":
                printSaved();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid Menu Command.");
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

    private void MiniGameView() {
        MiniGameView miniGameView = new MiniGameView();
        miniGameView.displayMiniGameView();
    }

    public void explore() 
            throws MapControlException {
        Game game = Flood.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        this.console.println("\tMAP OF FLOODED CITY.");
        this.console.println(" |" + " 1" + "|" + " 2" + "|" + " 3" + "|" + " 4" + "|" + " 5" + "|");
        this.console.println("-------------------------------------");
        for (int i = 0; i < map.getRowCount(); i++) {
            this.console.print(i + 1);
            for (int j = 0; j < map.getColumnCount(); j++) {
                this.console.print("|");
                Location location = locations[i][j];
                if (location.isVisited() == true) {
                    this.console.print(location.getLocationSymbol());
                } else {
                    this.console.print("??");
                }
            }
            this.console.println("|");
        }
        MoveCharacterView moveCharacterView = new MoveCharacterView();
        moveCharacterView.display();

    }

    private void saveGameMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void printSaved() {
        Game game = Flood.getCurrentGame();
        this.console.println(game.getListOfSurvivors());
    }

    private void testDoor() {
        BuildingView buildingView = new BuildingView();
        buildingView.display();
    }
    public void printInventory() {
        Game game = Flood.getCurrentGame();
        this.console.println(game.getInventory());
    }
}
