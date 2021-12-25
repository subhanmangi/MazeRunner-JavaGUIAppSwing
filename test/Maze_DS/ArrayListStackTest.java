/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author subhanmangi
 */
public class ArrayListStackTest {
    
    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        ArrayListStack instance = new ArrayListStack();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop()  {
        System.out.println("pop");
        ArrayListStack instance = new ArrayListStack();
        Object expResult = null;
        Object result = null;
        try {
            result = instance.pop();
        } catch (EmptyCollectionException ex) {
            Logger.getLogger(ArrayListStackTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek()  {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        Object expResult = null;
        Object result = null;
        try {
            result = instance.peek();
        } catch (EmptyCollectionException ex) {
            Logger.getLogger(ArrayListStackTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of toString method, of class ArrayListStack.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        ArrayListStack instance = new ArrayListStack();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
