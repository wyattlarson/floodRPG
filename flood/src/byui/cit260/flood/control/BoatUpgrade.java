/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

/**
 *
 * @author wyatt
 */
public class BoatUpgrade {
    
 public static double calcBoatNumofPeople(double length, double width) {
    
if (length < 2 || length > 50) {
return -1;
 }
if (width < 2 || width > 50) {
return -1;
 }
int numberOfPeople = (int) Math.floor((length * width)/15);

return numberOfPeople;
        }

    
}
