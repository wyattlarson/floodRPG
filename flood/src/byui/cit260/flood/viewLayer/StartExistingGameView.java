/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

/**
 *
 * @author Ryan Call
 */
public class StartExistingGameView extends View{

 
       public String[] getInputs() {
        String[] inputs = new String[8];
        this.console.println("=========="+"Saved Games"+ "==========" + 
                        "\n File 1 - Saved Game");
        
          String menuItem = this.getInput("Load Saved Game:");
            inputs[0] = menuItem;

        return inputs;
    }

     public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
       menuItem = menuItem.toUpperCase();
        switch(menuItem) {
            case "1": loadGame();
            break;
            case "E": return true;
            default:  ErrorView.display(this.getClass().getName(), "Invalid Menu Command.");
            break;
        }
        return false;  
    }

    private void loadGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}