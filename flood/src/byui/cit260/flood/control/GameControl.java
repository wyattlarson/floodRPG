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
        
       ArrayList<Character>characters = createCharacters();
       game.setCharacter(characters);
       player.setCharacter(Character.Bob);
       
       ArrayList<Item>items = createItems();
       game.setItems(items);
       
        
    }

    private static ArrayList<Character>createCharacters() {
        System.out.println("Create Characters called.");
    }

    private static ArrayList<Item> createItems() {
        System.out.println("Create Items called.");
    }


}
