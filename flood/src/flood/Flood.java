/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Inventory;
import byui.cit260.flood.model.ItemScene;
import byui.cit260.flood.model.Character;
import byui.cit260.flood.model.Map;
import java.awt.Point;
/**
 *
 * @author wyatt
 */
public class Flood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        Item flashlight = new Item();
        Inventory inventoryOne = new Inventory();
           
        playerOne.setName("Wyatt");
        playerOne.getBestScore();
        playerOne.setLastDatePlayed("10/2/2017");
        
        flashlight.setName("flashlight");
        flashlight.setDescription("Allows you to see in the dark");
        flashlight.setItemId(1);
      
        
        inventoryOne.setItemQuantity(0);
        
        Game currentGame = new Game();
        currentGame.setSavedFile("tutorial.java");

        currentGame.setAmountSaved(currentGame.getAmountSaved()+99);
        
        int newBestScore = currentGame.getAmountSaved();
        
        playerOne.setBestScore(newBestScore);
        
        ItemScene itemScene = new ItemScene();
        itemScene.setItemPickup(flashlight.getName());
        Point p1 = new Point(2, 3);
        itemScene.setLocation(p1);
    
        Character character = Character.Bob;
        
        Map map = new Map();
        map.setColumnCount(10);
        map.setRowCount(10);
        map.setCurrentColumn(2);
        map.setCurrentRow(2);
        map.setDescription("This is a locked house.");
        map.getGames();
        

        System.out.println(playerOne.toString());
        System.out.println(currentGame.toString());
        System.out.println(flashlight.toString());
        System.out.println(inventoryOne.toString());
        System.out.println(itemScene.toString());
        System.out.println(character.toString());
        System.out.println(map.toString());
    }
    
}
