/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;
import byui.cit260.flood.viewLayer.MoveCharacterView;

/**
 *
 * @author wyatt
 */
public class WaterView extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String [1];
        inputs[0] = "Nothing.";
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
    MoveCharacterView moveCharacterView = new MoveCharacterView();
    moveCharacterView.display();
    return true;
    }
}
