/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.MapControl;
import byui.cit260.flood.exceptions.MapControlException;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.model.Character;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import flood.Flood;

/**
 *
 * @author wyatt
 */
public class MoveCharacterView extends View {

    public String[] getInputs() {
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
                Location location = locations[j][i];
                if (location.isVisited() == true) {
                    this.console.print(location.getLocationSymbol());
                } else {
                    this.console.print("??");
                }
            }
            this.console.println("|");
        }
        
        
        String[] inputs = new String[2];

        this.console.println("Enter your y then x coordinate to move character.");

        String input1 = this.getInput("Enter an x value:");
        inputs[0] = input1;

        String input2 = this.getInput("Enter a y value:");
        inputs[1] = input2;

        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String row = inputs[0];
        String column = inputs[1];
        int intRow;
        int intColumn;
        try {
            intRow = Integer.parseInt(row) - 1;
            intColumn = Integer.parseInt(column) - 1;
        } catch (NumberFormatException e) {
            this.console.println("The row and column must be a number.");
            return false;
        }
        Player player = Flood.getPlayer();
        Character character = player.getCharacter();
        Location newLocation;
        try {
            newLocation = MapControl.moveCharacter(character, intRow, intColumn);
        } catch (MapControlException e) {
            this.console.println(e.getMessage());
            return false;
        }
        this.console.println(newLocation.getBuildingScene().getDescription());
        newLocation.setVisited(true);
        
        
        
        if (newLocation.getRow()+1==2 && newLocation.getColumn()+1==2){
            BuildingView buildingView = new BuildingView();
            buildingView.display();
        }
        else if (newLocation.getRow()+1==1 && newLocation.getColumn()+1==1){
            DockMenuView dockMenuView = new DockMenuView();
            dockMenuView.display();
        }
        else if (newLocation.getRow()+1==2 && newLocation.getColumn()+1==1){
        WaterView waterView = new WaterView();
        waterView.display();
        }
        else if (newLocation.getRow()+1==3 && newLocation.getColumn()+1==1){
        WaterView waterView = new WaterView();
        waterView.display();
        }
        else if (newLocation.getRow()+1==4 && newLocation.getColumn()+1==1){
        WaterView waterView = new WaterView();
        waterView.display();
        }
        else if (newLocation.getRow()+1==5 && newLocation.getColumn()+1==1){
        WaterView waterView = new WaterView();
        waterView.display();
        }
        else if (newLocation.getRow()+1==1 && newLocation.getColumn()+1==2){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==3 && newLocation.getColumn()+1==2){
            BuildingViewBlue buildingViewBlue = new BuildingViewBlue();
            buildingViewBlue.display();
        }
        else if (newLocation.getRow()+1==4 && newLocation.getColumn()+1==2){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==5 && newLocation.getColumn()+1==2){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==1 && newLocation.getColumn()+1==3){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==2 && newLocation.getColumn()+1==3){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==3 && newLocation.getColumn()+1==3){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==4 && newLocation.getColumn()+1==3){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==5 && newLocation.getColumn()+1==3){
           BuildingViewPurple buildingViewPurple = new BuildingViewPurple();
           buildingViewPurple.display();
        }
        else if (newLocation.getRow()+1==1 && newLocation.getColumn()+1==4){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==2 && newLocation.getColumn()+1==4){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==3 && newLocation.getColumn()+1==4){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==4 && newLocation.getColumn()+1==4){
            BuildingViewGreen buildingViewGreen = new BuildingViewGreen();
            buildingViewGreen.display();
        }
        else if (newLocation.getRow()+1==5 && newLocation.getColumn()+1==4){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==1 && newLocation.getColumn()+1==5){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==2 && newLocation.getColumn()+1==5){
            BuildingViewOrange buildingViewOrange = new BuildingViewOrange();
            buildingViewOrange.display();
        }
        else if (newLocation.getRow()+1==3 && newLocation.getColumn()+1==5){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        else if (newLocation.getRow()+1==4 && newLocation.getColumn()+1==5){
            //display new building view
        }
        else if (newLocation.getRow()+1==5 && newLocation.getColumn()+1==5){
            WaterView waterView = new WaterView();
            waterView.display();
        }
        return true;
    }
}
