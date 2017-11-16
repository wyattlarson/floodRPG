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
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;

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

    private static Item[] createItems() {
        System.out.println("create items called");
        Item[] items = new Item[2];
        
        Item engine = new Item();
        engine.setName("Engine Parts");
        engine.setDescription("Parts for an engine");
        engine.setItemId(1);
        return items;
    }

    private static Map createMap(int noOfRows, int noOfColumns, Item[] items) {
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
                
                Location location = createLocations (noOfRows, noOfColumns);
                
                Scenes scenes = MapControl.createScenes();
                Questions questions = MapControl.createQuestions();
                
                MapControl.assignQuestionsToScenes();
                MapControl.assignItemsToScenes();
                
                return null;
    }

    private static Location createLocations(int noOfRows, int noOfColumns) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


}
