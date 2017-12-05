/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.viewLayer.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wyatt
 */
public class Flood {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Flood.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            Flood.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt.";
            Flood.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println("Exception: " + te.toString() + 
                                                "\nCause: " + te.getCause() + 
                                                "\nMessage: " + te.getMessage());
            te.printStackTrace();;
        }
        finally {
            try {
                if (Flood.inFile != null)
                Flood.inFile.close();
                
                if (Flood.outFile != null)
                Flood.outFile.close();
                
                if (Flood.logFile != null)
                    Flood.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing Files");
                return;
            }
            
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Flood.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Flood.player = player;
    }

    public static PrintWriter getOutFIle() {
        return outFile;
    }

    public static void setOutFIle(PrintWriter outFIle) {
        Flood.outFile = outFIle;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Flood.inFile = inFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Flood.outFile = outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Flood.logFile = logFile;
    }
    
}
