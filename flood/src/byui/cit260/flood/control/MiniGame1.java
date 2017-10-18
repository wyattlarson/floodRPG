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
    
public static String miniGame1(double base1, double base2, double height, double guess) {
    
        String message;
	
        if (guess < 0 ) {
		message = "Guess can't be negative";
        }
        
	if (guess > 1000) {
		message = "Guess can't be greater than 1,000";
        }
        
	double area = (base1 + base2 / 2) * height;
        
	if (guess == area) {
		message = "Correct!";
        }
	else {
		message = "Incorrect, Try again";
        }
        
        return message;    
        
}
}
