/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

/**
 *
 * @author wyatt
 */
public class MapControl {
    private static Location[] [] createLocations(int rows, int columns){
         System.out.println("createLocations called");
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
