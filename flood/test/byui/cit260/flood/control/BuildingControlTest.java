/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import byui.cit260.flood.exceptions.BuildingControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wyatt
 */
public class BuildingControlTest {
    
    public BuildingControlTest() {
    }

    /**
     * Test of puzzle1 method, of class BuildingControl.
     */
    @Test
    public void testPuzzle1() throws BuildingControlException {
        System.out.println("puzzle Test: 1");
        double a = 1;
        double b = 1;
        double c = 1;
        double expResult = 0;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testPuzzle2() throws BuildingControlException {
        System.out.println("puzzle Test: 2");
        double a = 10;
        double b = 0;
        double c = 50;
        double expResult = -1;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testPuzzle3() throws BuildingControlException {
        System.out.println("puzzle Test: 3");
        double a = 25;
        double b = 25;
        double c = 0;
        double expResult = -1;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testPuzzle4() throws BuildingControlException {
        System.out.println("puzzle Test: 4");
        double a = 2;
        double b = 1;
        double c = 2;
        double expResult = 0;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testPuzzle5() throws BuildingControlException {
        System.out.println("puzzle Test: 5");
        double a = 3;
        double b = 4;
        double c = 5;
        double expResult = 25;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
            @Test
    public void testPuzzle6() throws BuildingControlException {
        System.out.println("puzzle Test: 6");
        double a = 0;
        double b = 10;
        double c = 20;
        double expResult = -1;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
            @Test
    public void testPuzzle7() throws BuildingControlException {
        System.out.println("puzzle Test: 7");
        double a = 5;
        double b = 5;
        double c = 7.071;
        double expResult = 50;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
            @Test
    public void testPuzzle8() throws BuildingControlException {
        System.out.println("puzzle Test: 8");
        double a = 25;
        double b = 25;
        double c = 35.36;
        double expResult = 1250;
        double result = BuildingControl.puzzle1(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
    
}
