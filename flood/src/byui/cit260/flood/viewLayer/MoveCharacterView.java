/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import byui.cit260.flood.control.MapControl;
import byui.cit260.flood.exceptions.MapControlException;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.model.Character;
import byui.cit260.flood.model.Location;
import flood.Flood;

/**
 *
 * @author wyatt
 */
public class MoveCharacterView extends View {
    public String[] getInputs() {
        String[] inputs = new String[2];
        
        System.out.println("Enter your x then y coordinate to move character.");
        
        String input1 = this.getInput("Enter an x value:");
        inputs[0] = input1;
        
        String input2 = this.getInput("Enter a y value:");
        inputs[1] = input2;
        
        return inputs;
    }
    public boolean doAction(String [] inputs) {
        String row = inputs[0];
        String column = inputs[1];
        
        try{
            int intRow = Integer.parseInt(row);
            int intColumn = Integer.parseInt(column);
        } catch (NumberFormatException e ) {
            System.out.println("The row and column must be a number.");
            return false;
        }
        Player player = Flood.getPlayer();
        Character character = player.getCharacter();
        
        /*try{
        Location newLocation = MapControl.moveCharacter(character, intRow, intColumn);
        } catch (MapControlException e){
        System.out.println(e.getMessage());
        return false;
        }*/
        return true;
    }
}
