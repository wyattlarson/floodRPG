/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

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
        
        playerOne.setName("Bob");
        playerOne.setBestScore(0);
        playerOne.setLastDatePlayed(null);
        System.out.println(playerOne.toString());
        
    }
    
}
