/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class RevendedoraTest {
    
    public RevendedoraTest() {
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
     * Test of getSaldo method, of class Revendedora.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Revendedora instance = new Revendedora();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class Revendedora.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        Revendedora instance = new Revendedora();
        Object expResult = null;
        Object result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositarDinero method, of class Revendedora.
     */
    @Test
    public void testDepositarDinero() {
        System.out.println("depositarDinero");
        double monto = 0.0;
        Revendedora instance = new Revendedora();
        instance.depositarDinero(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirarDinero method, of class Revendedora.
     */
    @Test
    public void testRetirarDinero() throws Exception {
        System.out.println("retirarDinero");
        double monto = 0.0;
        Revendedora instance = new Revendedora();
        double expResult = 0.0;
        double result = instance.retirarDinero(monto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transferirDinero method, of class Revendedora.
     */
    @Test
    public void testTransferirDinero() throws Exception {
        System.out.println("transferirDinero");
        Revendedora destino = null;
        double monto = 0.0;
        Revendedora instance = new Revendedora();
        instance.transferirDinero(destino, monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirMoneda method, of class Revendedora.
     */
    @Test
    public void testConvertirMoneda() {
        System.out.println("convertirMoneda");
        String cotizacion = "";
        Revendedora instance = new Revendedora();
        double expResult = 0.0;
        double result = instance.convertirMoneda(cotizacion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PagoDemorado method, of class Revendedora.
     */
    @Test
    public void testPagoDemorado() throws Exception {
        System.out.println("PagoDemorado");
        int time = 0;
        Revendedora instance = new Revendedora();
        instance.PagoDemorado(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
