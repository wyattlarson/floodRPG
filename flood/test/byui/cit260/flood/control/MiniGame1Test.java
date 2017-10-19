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
        double guess = 150;
        int expResult = 150;
        int result = MiniGame1.miniGame1(base1, base2, height, guess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
