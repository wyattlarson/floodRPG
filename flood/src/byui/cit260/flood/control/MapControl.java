/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import byui.cit260.flood.model.BuildingScene;
import byui.cit260.flood.model.Equation;
import byui.cit260.flood.model.EquationType;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.ItemScene;
import byui.cit260.flood.model.ItemType;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import byui.cit260.flood.model.QuestionScene;
import byui.cit260.flood.model.SceneType;

/**
 *
 * @author wyatt
 */
public class MapControl {
    public static Location[] [] createLocations(int rows, int columns){
         System.out.println("createLocations called");
         if (rows < 1 || columns < 1){
             return null;
         }
         Location[] [] locations = new Location [rows] [columns];
           
         for (int i = 0; i < locations.length; i++){
             for (int j = 0; j < locations[0].length; j++){
                 Location location = new Location();
                 location.setRow(i);
                 location.setColumn(j);
                 location.setVisited(false);
                 rows =i;
                 columns = j;
                 location=locations[rows][columns];
             }
         }
         return locations;
    }
    
    public static BuildingScene[] createScenes(){
        BuildingScene[] scenes = new BuildingScene[5];
         
        BuildingScene water = scenes[SceneType.water.ordinal()];
        water.setDescription("An empty flooded area.");
        
        BuildingScene building = scenes[SceneType.building.ordinal()];
        building.setDescription("A flooded building.");
        
        BuildingScene dock = scenes[SceneType.dock.ordinal()];
        dock.setDescription("The base of operations.");
        
        BuildingScene minigame = scenes[SceneType.minigame.ordinal()];
        minigame.setDescription("A mini game to find upgrades.");
        
        return scenes;
    }
    
    public static Equation[] createQuestions() {
        System.out.println("createQuestions called");
        Equation[] questions = new Equation[5];
        
        Equation trapArea = questions[EquationType.trapArea.ordinal()];
        trapArea.setQuestion("For the first minigame you must find the area of a trapezoid. Base 1 = 20, Base 2 = 15, and Height = 10. WHat is the area?");
        trapArea.setAnswer("175");
        
        return questions;
}
    
         private static void assignQuestionsToScenes(Equation[] questions, BuildingScene[] scenes){
         System.out.println("assignQuestionsToScenes called");
         QuestionScene miniGame = (QuestionScene) scenes[SceneType.minigame.ordinal()];
         Equation[] miniGameQuestions = new Equation[3];
         miniGameQuestions[0] = questions[EquationType.trapArea.ordinal()];
         miniGame.setEquation(miniGameQuestions);
         
         QuestionScene pythag = (QuestionScene) scenes[SceneType.building.ordinal()];
         Equation[] pythagQuestion = new Equation[1];
         pythagQuestion[0] = questions[EquationType.trapArea.ordinal()];
         pythag.setEquation(miniGameQuestions);
    }
    
         private static void assignItemsToScenes(Item[] items, BuildingScene[] scenes){
         System.out.println("assignItemsToScene called");
         ItemScene building = (ItemScene) scenes[SceneType.building.ordinal()];
         Item[] buildingItems = new Item[3];
         buildingItems[0] = items[ItemType.hammer.ordinal()];
         building.setItems(buildingItems);
    }
    
         private static void assignSceneToLocations(Map[] map, BuildingScene [] [] scenes){
         System.out.println("assignSceneToLoctions called");
        // Location[][] locations = map.getLocations();
    }

    
}
