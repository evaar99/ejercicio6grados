/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio6grados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evaren
 */
public class NumerosTest {
    
    public NumerosTest() {
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
     * Test of roman2dec method, of class Numeros.
     */
    @Test
    public void testRoman2dec() {
        System.out.println("roman2dec");
        int num = 0;
        Numeros instance = null;
        String expResult = "";
        String result = instance.roman2dec(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dec2roman method, of class Numeros.
     */
    @Test
    public void testDec2roman() {
        System.out.println("dec2roman");
        int num = 0;
        Numeros instance = null;
        int expResult = 0;
        int result = instance.dec2roman(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
