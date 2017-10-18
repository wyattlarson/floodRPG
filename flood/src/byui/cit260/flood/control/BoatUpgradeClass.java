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
public class BoatUpgradeClass {
    
 public static double calcBoatVolume(double length, double width, double depth) {
    
if (length < 0 || length > 100) {
return -1;
 }
if (width < 0 || width > 100) {
return -1;
 }
if (depth < 0 || depth > 100) {
return -1;
        }
double volume = length * width * depth;
return volume;
        }

    
}
