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
 * @author wyatt
 */
public class BoatUpgradeTest {
    
    public BoatUpgradeTest() {
    }

    /**
     * Test of calcBoatNumofPeople method, of class BoatUpgrade.
     */
    @Test
    public void testCalcBoatNumofPeople() {
        System.out.println("calcBoatNumofPeople: Test 1");
        double length = 10;
        double width = 10;
        double expResult = 6;
        double result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    
    }
    @Test
    public void testCalcBoatNumofPeople2() {
        System.out.println("calcBoatNumofPeople: Test 2");
       double length = -1;
        double width = 10;
       double expResult = -1;
       double result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    }
         @Test
    public void testCalcBoatNumofPeople3() {   
        System.out.println("calcBoatNumofPeople: Test 3");
       double length = 10;
       double width = -1;
       double expResult = -1;
       double result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testCalcBoatNumofPeople4() {
        System.out.println("calcBoatNumofPeople: Test 4");
       double length = 2;
       double width = 10;
       double expResult = 1;
        double result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testCalcBoatNumofPeople5() {
        System.out.println("calcBoatNumofPeople: Test 5");
        double length = 10;
       double width = 2;
       double expResult = 1;
        double result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testCalcBoatNumofPeople6() {
        System.out.println("calcBoatNumofPeople: Test 6");
       double length = 50;
       double width = 10;
       double expResult = 33;
       double result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testCalcBoatNumofPeople7() {
        System.out.println("calcBoatNumofPeople: Test 7");
       double length = 10;
       double width = 50;
       double expResult = 33;
       double result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    
    }
}

