/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Player;

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
        Game currentGame = new Game();
        
        playerOne.setName("Wyatt");
        
   
        currentGame.setAmountSaved(+1);
        
        int newBestScore = currentGame.getAmountSaved();
        playerOne.setBestScore(newBestScore);
    
        playerOne.getBestScore();
        playerOne.setLastDatePlayed("10/5/2017 @ 6:11pm");
        System.out.println(playerOne.toString());
        System.out.println(currentGame.toString());
    }
    
}
