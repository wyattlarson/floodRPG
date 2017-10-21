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
public class MiniGameControl {
    
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
/**
 * 
 *@author Ryan
 */

public static double miniGame2( double length, double width) {
    
    if (length<1||length>30 ){
        return -1;
    }
    if(width<1||width>30){
        return -1;
    }
   int perimeter=(int) ((int) 2*(length+width));
    
    return perimeter;
}
    
public static double miniGame3( double length, double height) {
    if (length<1 || length>30){
        return -1;
    }
    if (height<1 || height>30){
        return -2;
    }
    int area=(int) ((int) Math.pow(length,2)+(2*length)* Math.sqrt((Math.pow(length,2)/4)+Math.pow(height,2)));
    
    return area;
}
}