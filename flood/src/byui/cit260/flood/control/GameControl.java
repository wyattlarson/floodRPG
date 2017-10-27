/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import byui.cit260.flood.model.Player;
import byui.cit260.flood.viewLayer.StartProgramView;
import flood.Flood;

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
}
