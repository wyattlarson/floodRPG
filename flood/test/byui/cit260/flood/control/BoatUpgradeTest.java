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
    
    

        System.out.println("calcBoatNumofPeople: Test 2");
        length = -1;
        width = 10;
        expResult = -1;
        result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcBoatNumofPeople: Test 3");
        length = 10;
        width = -1;
        expResult = -1;
        result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcBoatNumofPeople: Test 4");
        length = 2;
        width = 10;
        expResult = 1;
        result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcBoatNumofPeople: Test 5");
        length = 10;
        width = 2;
        expResult = 1;
        result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcBoatNumofPeople: Test 6");
        length = 50;
        width = 10;
        expResult = 33;
        result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcBoatNumofPeople: Test 7");
        length = 10;
        width = 50;
        expResult = 33;
        result = BoatUpgrade.calcBoatNumofPeople(length, width);
        assertEquals(expResult, result, 0.0);
    }
}

