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
public class Ejercicio6gradosTest {
    
    public Ejercicio6gradosTest() {
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
     * Test of farenheittocelsius method, of class Ejercicio6grados.
     */
    @Test
    public void testFarenheittocelsius() {
        System.out.println("farenheittocelsius");
        double faren = 0.0;
        double expResult = 0.0;
        double result = Ejercicio6grados.farenheittocelsius(faren);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of celsiustufarenheit method, of class Ejercicio6grados.
     */
    @Test
    public void testCelsiustufarenheit() {
        System.out.println("celsiustufarenheit");
        double celsius = 0.0;
        double expResult = 0.0;
        double result = Ejercicio6grados.celsiustufarenheit(celsius);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Ejercicio6grados.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ejercicio6grados.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
