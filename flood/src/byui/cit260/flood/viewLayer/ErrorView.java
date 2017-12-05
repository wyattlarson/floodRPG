/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.viewLayer;

import flood.Flood;
import java.io.PrintWriter;

/**
 *
 * @author wyatt
 */
public class ErrorView {
    private static final PrintWriter errorFile = Flood.getOutFile();
    private static final PrintWriter logFile = Flood.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
        "--------------------------------------------------"
                + "\n-ERROR - " + errorMessage
                +"\n--------------------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}
