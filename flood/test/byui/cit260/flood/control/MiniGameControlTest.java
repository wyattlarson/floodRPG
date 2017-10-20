/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan Call
 */
public class MiniGameControlTest {
    
    public MiniGameControlTest() {
    }

    /**
     * Test of miniGame1 method, of class MiniGameControl.
     */
    @Test
    public void testMiniGame1() {
        System.out.println("miniGame1");
        double base1 = 0.0;
        double base2 = 0.0;
        double height = 0.0;
        double guess = 0.0;
        String expResult = "";
        String result = MiniGameControl.miniGame1(base1, base2, height, guess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of miniGame2 method, of class MiniGameControl.
     */
    @Test
    public void testMiniGame2() {
        System.out.println("miniGame2");
        double length = 10.0;
        double width = 20.0;
        double expResult = 60.0;
        double result = MiniGameControl.miniGame2(length, width);
    
   
    }

    /**
     * Test of miniGame3 method, of class MiniGameControl.
     */
    @Test
    public void testMiniGame3() {
        System.out.println("miniGame3");
        double length = 0.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = MiniGameControl.miniGame3(length, height);
       
 
    }
    
}
