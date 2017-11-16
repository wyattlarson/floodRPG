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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Map createMap(int i, int i0, Item[] items) {
        
    }

    


}
