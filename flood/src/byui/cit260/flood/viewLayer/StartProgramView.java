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
public class StartProgramView {
   public boolean display() {
       boolean endView=false;
       do{ 
           String inputs[] = getInputs();
           if (inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
               return endView = doAction(inputs);
           } 
       }
       while (endView != true);
       return false;
   
   }

    private String[] getInputs() {
        System.out.println("****called getInputs()****");
        String[] inputs = new String[1];
        inputs[0] = "testInput";
        return inputs;
    }

    private boolean doAction(String[] inputs) {
                System.out.println("****called doAction****");
                System.out.println("\tinputs = " + inputs[0]);
                
                return true;

    }
}