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
            throw new MiniGameControlException("Base 1 must be between 1 and 50");
        }
        if (base2 < 1 || base1 > 50) {
            throw new MiniGameControlException("Base 2 must be between 1 and 50");
        }
        if (height < 1 || height > 50) {
            throw new MiniGameControlException("Height must be between 1 and 50");
        }
        if (doubledGuess < 1 || doubledGuess > 200) {
            throw new MiniGameControlException("Your guess must be between 1 and 200");
        }

        double area = ((base1 + base2) / 2) * height;
        if (doubledGuess == area) {
            return doubledGuess;
        } else {
            throw new MiniGameControlException("Your guess is wrong.");
        }

    }

public static double miniGame2( double doubLen, double doubWid) 
        throws MiniGameControlException{
    if (doubLen < 1||doubLen > 30 ){
        throw new MiniGameControlException("Length must be between 1 and 30.");
    }
    if(doubWid < 1|| doubWid > 30){
        throw new MiniGameControlException("Width must be between 1 and 30.");
    }
   double perimAns = 2*(doubLen + doubWid);
   if (perimAns == 60){
       return perimAns;
   } else throw new MiniGameControlException("Your guess is wrong");
    
}
    
public static double miniGame3( double xDoub)
        throws MiniGameControlException{
    if (xDoub < -30 || xDoub > 30){
        throw new MiniGameControlException("x must be between -30 and 30.");
    }
       double d = 3 * 3 - 4 * 1 * -4;
       double root1 = ( - 3 + Math.sqrt(d))/(2*1);
       double root2 = (-3 - Math.sqrt(d))/(2*1);
       
       if (xDoub == root1 || xDoub == root2){
           return xDoub;
       } else throw new MiniGameControlException("Your guess is wrong.");
}
}
