/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.util.debug;

import br.edu.ufersa.controlConsult.model.Usuario;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author juan
 */
public class DEBUG_USUARIONGTest {
    
    public DEBUG_USUARIONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getUsuarioAleatorio method, of class DEBUG_USUARIO.
     */
    @Test
    public void testGetUsuarioAleatorio() {
        System.out.println("getUsuarioAleatorio");
        Usuario expResult = null;
        Usuario result = DEBUG_USUARIO.getUsuarioAleatorio();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarAdminUser method, of class DEBUG_USUARIO.
     */
    @Test
    public void testCadastrarAdminUser() {
        System.out.println("cadastrarAdminUser");
        Usuario expResult = null;
        Usuario result = DEBUG_USUARIO.cadastrarAdminUser();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DEBUG_USUARIO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DEBUG_USUARIO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
