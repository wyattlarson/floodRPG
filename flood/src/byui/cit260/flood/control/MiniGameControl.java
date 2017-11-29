/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import byui.cit260.flood.exceptions.MiniGameControlException;

/**
 *
 * @author Brandon
 */
public class MiniGameControl {
    
public static double miniGame1(double base1, double base2, double height, double doubledGuess) 
    throws MiniGameControlException {
	
        if (base1 < 1 || base2 > 50) {
            throw new MiniGameControlException ("First response error");
 }
        if (base2 < 1 || base1 > 50) {
            throw new MiniGameControlException ("Second response error");
 }
        if (height < 1 || height > 50) {
            throw new MiniGameControlException ("Third response error");
 }
        if (doubledGuess < 1 || doubledGuess > 200) {
            throw new MiniGameControlException ("Answer incorrect");
 }
        
	double area = ((base1 + base2) / 2) * height;
        
	return area;
        
}

/**
 * 
 *@author Ryan
 */

public static double miniGame2( double length, double width) 
        throws MiniGameControlException{
    if (length<1||length>30 ){
        throw new MiniGameControlException("Length must be between 1 and 30.");
    }
    if(width<1||width>30){
        throw new MiniGameControlException("Width must be between 1 and 30.");
    }
   int perimeter=(int) ((int) 2*(length+width));
    
    return perimeter;
}
    
public static double miniGame3( double length, double height)
        throws MiniGameControlException{
    if (length<1 || length>30){
        throw new MiniGameControlException("Length must be between 1 and 30.");
    }
    if (height<1 || height>30){
        throw new MiniGameControlException("Height must be between 1 and 30.");
    }
    int area=(int) ((int) Math.pow(length,2)+(2*length)* Math.sqrt((Math.pow(length,2)/4)+Math.pow(height,2)));
    
    return area;
}
}