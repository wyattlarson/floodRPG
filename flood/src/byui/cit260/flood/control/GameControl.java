/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.viewLayer.StartProgramView;
import flood.Flood;
import java.util.ArrayList;
import byui.cit260.flood.model.Character;
import byui.cit260.flood.model.ItemType;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import byui.cit260.flood.model.BuildingScene;
import byui.cit260.flood.model.Equation;
import byui.cit260.flood.model.Inventory;

/**
 *
 * @author wyatt
 */
public class GameControl {
    public static Player savePlayer(String name) {
        if(name == null || name.length() < 1){
            return null;
        }
        Player player = new Player();
        Flood.setPlayer(player);
        return player;
        
    }
    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        Flood.setCurrentGame(game);
        

       player.setCharacter(Character.Bob);
       
       Item[] items = GameControl.createItems();
       game.setItems(items);
       
       Map map = GameControl.createMap(5, 5, items); 
         if (map == null) {
             return -1;
         }
         game.setMap(map);
   
        return 1;
    }

        public static Item[] createItems() {
        System.out.println("create items called");
        Item[] items = new Item[8];

        Item engine = new Item();
        engine.setName("Engine Parts");
        engine.setDescription("Parts for an engine");
        engine.setItemId(1);
        items[ItemType.engine.ordinal()] = engine;
        
         Item wood = new Item();
         wood.setName("Wood");
         wood.setDescription("Planks and driftwood that can be used to upgrade your boat.");
         wood.setItemId(2);
         items[ItemType.wood.ordinal()] = wood;
         
         Item survivor = new Item();
         survivor.setName("Survivors");
         survivor.setDescription("A stranded survivor of the flood. Get them to safety.");
         survivor.setItemId(3);
         items[ItemType.survivor.ordinal()] = survivor;
        return items;
    }
        public static Inventory createInventory(Item[] items) {
            System.out.println("Create Inventory Called");
            
            if (items == null){
                return null;
            }
        
           
            /*            Item[] inventory = new Item[8];
            for (int i = 0; i < items.length; i++){
            inventory = items.setName(i);
            }    */
        return null;
            
    }

    public static Map createMap(int noOfRows, int noOfColumns, Item[] items) {
                System.out.println("create map called");
                if (noOfRows < 0 || noOfColumns < 0) {
                    return null;
                }
                if (items == null ||  items.length < 1) {
                    return null;
                }
                Map map = new Map();
                map.setRowCount(noOfRows);
                map.setColumnCount(noOfColumns);
                
                Location[][] locations = MapControl.createLocations(noOfRows, noOfColumns);
                map.setLocations(locations);
                
                BuildingScene[] scenes = MapControl.createScenes();
                Equation[] questions = MapControl.createQuestions();
                
                MapControl.assignQuestionsToScenes(questions, scenes);
                MapControl.assignItemsToScenes(items, scenes);
                MapControl.assignSceneToLocations(map, scenes);
                
                return map;
    }

}
