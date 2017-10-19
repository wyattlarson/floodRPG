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
public class BuildingControl {
    
    public static double puzzle1 (double a, double b, double c) {
       if (a <= 0 || a > 25) {
           return -1;
       }
       if (b <= 0 || b > 25) {
           return -1;
       }
       if (c <= 0 || c > 36) {
           return -1;
       }
       
      double cSquared = Math.round(c*c);
      double check = (a*a) + (b*b);
           if (cSquared == check) {
               return cSquared;
           }
           else return -1;
        
}
}
