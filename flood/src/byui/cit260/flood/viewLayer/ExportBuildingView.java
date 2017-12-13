/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.MapControl;
import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.model.BuildingScene;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import flood.Flood;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wyattlarson
 */
public class ExportBuildingView extends View{
    
    public String[] getInputs(){
        String[] inputs = new String[1];
        this.console.println("\n\nEnter the filepath for the buildings to be saved to.");
        String filePath = this. getInput("-->");
        inputs[0] = filePath;
        return inputs;
    }
    @Override
    public boolean doAction
       (String[] inputs) {
        String filepath = inputs[0];
        Location[][] locations = Flood.getCurrentGame().getMap().getLocations();
        Map map = Flood.getCurrentGame().getMap();
        try (PrintWriter out = new PrintWriter(filepath)) {
            out.println("\n\n=======Buildings=======");
            out.printf("%n%-20s%10s%20s", "Row","Column", "Description");
            out.printf("%n%-20s%10s%20s", "-----------","------------", "------------");
            
        for (int i = 0; i < map.getRowCount(); i++) {
            for (int j = 0; j < map.getColumnCount(); j++) {
                Location location = locations[j][i];
                out.printf("%n%-20d%-20d%-20s", location.getRow(),
                                          location.getColumn(),
                                          location.getBuildingScene().getDescription());
            }
        }
            this.console.println("=======Building export successful=======");
        }catch (IOException e){
            try {
                throw new GameControlException(e.getMessage());
            } catch (GameControlException ex) {
            }
        }
        return true;
    }
    
}
