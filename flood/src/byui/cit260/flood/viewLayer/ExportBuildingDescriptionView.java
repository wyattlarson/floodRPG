/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.model.BuildingScene;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import flood.Flood;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ryan Call
 */
public class ExportBuildingDescriptionView extends View {

    private Location[][] locations;
        
    public String[] getInputs(){
        String[] inputs = new String[1];
        this.console.println("\n\nEnter the filepath for the building description to be saved to.");
        String filePath = this. getInput("-->");
        inputs[0] = filePath;
        return inputs;
    }
    @Override
    public boolean doAction
       (String[] inputs) {
        String filepath = inputs[0];
      Location [][] scenes = Flood.getCurrentGame().getMap().getLocations();
      Map map = Flood.getCurrentGame().getMap();
  
      try (PrintWriter out = new PrintWriter(filepath)) {
            out.println("\n\n=======Building Descriptions In The Game=======");
            out.printf("%n%-20s%10s", "Name","Description","Status");
            out.printf("%n%-20s%10s", "-----------","------------","------------");
         for (int i = 0; i < map.getRowCount(); i++) {
            this.console.print(i + 1);
            for (int j = 0; j < map.getColumnCount(); j++) {
                Location location = locations[i][j]; 
                  if (location.isVisited() == true){
                      
                out.printf("%n%-20d%-20d%-20s",location.getBuildingScene()
                                                                        , location.getBuildingScene().getDescription()
                                                                                                        ,location.getBuildingScene().getStatus());
                                                                                                                }
            
            this.console.println("=======Items export was successfull=======");
        } 
         }
        }catch (IOException e){
            try {
                throw new GameControlException(e.getMessage());
            } catch (GameControlException ex) {
            }
        }
        return true;
    }
    
}