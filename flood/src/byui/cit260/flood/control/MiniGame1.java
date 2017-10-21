/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

/**
 *
 * @author Brandon
 */
public class MiniGame1 {
    
public static double miniGame1(double base1, double base2, double height) {
	
        if (base1 < 1 || base2 > 50) {
            return -1;
 }
        if (base2 < 1 || base1 > 50) {
            return -1;
 }
        if (height < 1 || height > 50) {
            return -1;
 }
        
	double area = (base1 + base2 / 2) * height;
        
	return area;
        
}
}
