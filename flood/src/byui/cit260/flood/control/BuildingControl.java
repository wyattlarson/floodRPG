
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;
import byui.cit260.flood.exceptions.BuildingControlException;
/**
 *
 * @author wyatt
 */
public class BuildingControl {
    
    public static double puzzle1 (double a, double b, double c)
         throws BuildingControlException {
       if (a <= 0 || a > 25) {
           throw new  BuildingControlException ("invalid response.");
       }
       if (b <= 0 || b > 25) {
            throw new  BuildingControlException ("invalid second response.");
       }
       if (c <= 0 || c > 36) {
           throw new  BuildingControlException ("invalid third response.");
       }
       
      double cSquared = Math.round(c*c);
      double check = (a*a) + (b*b);
           if (cSquared == check) {
               return cSquared;
           }
           else return 0;
        
}
}
