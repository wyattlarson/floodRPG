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
        System.out.println("miniGame1 Test 1");
        double base1 = 10;
        double base2 = 10;
        double height = 10;
        double expResult = 150;
        double result = MiniGame1.miniGame1(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("miniGame1 Test 2");
        base1 = -1;
        base2 = 10;
        height = 10;
        expResult = -1;
        result = MiniGame1.miniGame1(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("miniGame1 Test 3");
        base1 = 10;
        base2 = -1;
        height = 10;
        expResult = -1;
        result = MiniGame1.miniGame1(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("miniGame1 Test 4");
        base1 = 10;
        base2 = 10;
        height = -1;
        expResult = -1;
        result = MiniGame1.miniGame1(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("miniGame1 Test 5");
        base1 = 1;
        base2 = 50;
        height = 10;
        expResult = 260;
        result = MiniGame1.miniGame1(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("miniGame1 Test 6");
        base1 = 50;
        base2 = 10;
        height = 1;
        expResult = 55;
        result = MiniGame1.miniGame1(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("miniGame1 Test 7");
        base1 = 10;
        base2 = 1;
        height = 50;
        expResult = 525;
        result = MiniGame1.miniGame1(base1, base2, height);
        assertEquals(expResult, result, 0.0);
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
