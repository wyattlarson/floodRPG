/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;
import byui.cit260.flood.control.GameControl;
import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.exceptions.BoatUpgradeException;

/**
 *
 * @author wyatt
 */
public class BoatUpgrade {
    
 public static double calcBoatNumofPeople(double length, double width)
    throws BoatUpgradeException {
if (length < 2 || length > 50) {
    throw new BoatUpgradeException ("length or width is outside parameters.");
                                         }
if (width < 2 || width > 50) {
    throw new BoatUpgradeException ("secondary input is wrong.");
                                       }
int numberOfPeople = (int) Math.floor((length * width)/15);

return numberOfPeople;
                                            }

    public static double calcBoatNumofPeople(double doubledWidth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                                    }   
    
