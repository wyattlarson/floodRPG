/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brandon
 */
public class MiniGame1Test {
    
    public MiniGame1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of miniGame1 method, of class MiniGame1.
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
    
}
