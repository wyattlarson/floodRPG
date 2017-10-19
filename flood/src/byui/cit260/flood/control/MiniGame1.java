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
    
public static int miniGame1(double base1, double base2, double height, double guess) {
	
        if (guess < 0 ) {
		return -1;
        }
        
	if (guess > 1000) {
		return -1;
        }
        
	double area = (base1 + base2 / 2) * height;
        
	if (guess == area) {
		return 1;
        }
	else {
		return -1;
        }
        
}
}
