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
    @Test
        public void testMiniGame2a() {
        System.out.println("miniGame2");
        double length = -1.0;
        double width = 20.0;
        double expResult = -1;
        double result = MiniGameControl.miniGame2(length, width);
    
   
    }
        @Test
        public void testMiniGame2b() {
        System.out.println("miniGame2");
        double length = 10.0;
        double width = -1.0;
        double expResult = -1.0;
        double result = MiniGameControl.miniGame2(length, width);
    
   
    }
        @Test
        public void testMiniGame2c() {
        System.out.println("miniGame2");
        double length = 1.0;
        double width = 30.0;
        double expResult = 62.0;
        double result = MiniGameControl.miniGame2(length, width);
    
   
    }
        @Test
        public void testMiniGame2d() {
        System.out.println("miniGame2");
        double length = 30.0;
        double width = 1.0;
        double expResult = 62.0;
        double result = MiniGameControl.miniGame2(length, width);
    
   
    }
        @Test
        public void testMiniGame2e() {
        System.out.println("miniGame2");
        double length = 30.0;
        double width = 30.0;
        double expResult = 120.0;
        double result = MiniGameControl.miniGame2(length, width);
    
   
    }

    /**
     * Test of miniGame3 method, of class MiniGameControl.
     */
    @Test
    public void testMiniGame3() {
        System.out.println("miniGame3");
        double length = 10.0;
        double height = 15.0;
        double expResult = 416.0;
        double result = MiniGameControl.miniGame3(length, height);
       
 
    }
        @Test
    public void testMiniGame3a() {
        System.out.println("miniGame3");
        double length = -1.0;
        double height = 15.0;
        double expResult = -1.0;
        double result = MiniGameControl.miniGame3(length, height);
       
 
    }
        @Test
    public void testMiniGame3b() {
        System.out.println("miniGame3");
        double length = 10.0;
        double height = -1.0;
        double expResult = -1.0;
        double result = MiniGameControl.miniGame3(length, height);
    }   
        @Test
    public void testMiniGame3c() {
        System.out.println("miniGame3");
        double length = 1.0;
        double height = 30.0;
        double expResult = 61.0;
        double result = MiniGameControl.miniGame3(length, height);
       
 
    }
        @Test
    public void testMiniGame3d() {
        System.out.println("miniGame3");
        double length = 30.0;
        double height = 1.0;
        double expResult = 1802.0;
        double result = MiniGameControl.miniGame3(length, height);
       
 
    }
         @Test
    public void testMiniGame3e() {
        System.out.println("miniGame3");
        double length = 30.0;
        double height = 30.0;
        double expResult = 2912.0;
        double result = MiniGameControl.miniGame3(length, height);
       
 
    }
}
