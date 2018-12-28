/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatask;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

/**
 *
 * @author user-pc
 */
public class JavaTaskTest {
    
    JavaTask javaTask;
    
    public JavaTaskTest() {
    }
    
    @Before
    public void setUp() {
        javaTask = new JavaTask();
    }
    
    @After
    public void tearDown() {
        javaTask = null;
    }

    /**
     * Test of main method, of class JavaTask.
     */
    @Test
    public void testMain() {
        
    }

    /**
     * Test of PrintResult method, of class JavaTask.
     */
    @Test
    public void testPrintResult() {
                
        System.out.println("PrintResult function should return");
        int expResult = 8581146;
        int result = javaTask.PrintResult();
        assertTrue(expResult == result);
    }
    
}
