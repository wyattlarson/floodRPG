/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import byui.cit260.flood.model.Location;

/**
 *
 * @author wyatt
 */
public class MapControl {
    private static Location[] [] createLocations(int rows, int columns){
         System.out.println("createLocations called");
         if (rows < 1 || columns < 1){
             return null;
         }
         Location[] [] locations = new Location [rows] [columns];
           
         for (int i = 0; i < locations.length; i++){
             for (int j = 0; j < locations[0].length; j++){
                 Location[][] location = new Location[0][0];
                 location.setRow(i);
                 location.setColumn(j);
                 location.setVisited(false);
                 rows =i;
                 columns = j;
                 locations += locations[rows][columns];
             }
         }
         return locations;
    }
    
    private static Scene[] createScenes(){
        System.out.println("createScenes called");
        return null;
    }
    
    private static Question[] createQuestions() {
     System.out.println("createQuestions called");
      return null;
}
    
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
         System.out.println("assignQuestionsToScenes called");
    }
    
    private static void assignItemsToScenes(Item[] items, Scene[] scenes){
         System.out.println("assignItemsToScene called");
    }
    
    private static void assignSceneToLocations(Scene[] scenes, Location [] [] location){
         System.out.println("assignSceneToLoctions called");
    }
    
}
