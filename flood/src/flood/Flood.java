/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.viewLayer.StartProgramView;

/**
 *
 * @author wyatt
 */
public class Flood {

    private static Game currentGame = null;
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        } catch(Throwable te){
            System.out.println("Something went wrong. Game error.");
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        }
        
        
    }
    public static Game getCurrentGame() {
            return currentGame;
        }
        public static void setCurrentGame(Game currentGame) {
            Flood.currentGame = currentGame;
        }
        public static Player getPlayer(){
            return player;
        } 
        public static void setPlayer(Player player){
            Flood.player = player;
        }
}
