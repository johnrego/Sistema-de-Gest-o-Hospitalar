/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.model.interfaces;

import br.edu.ufersa.controlConsult.model.jpaDAO.exceptions.NonexistentEntityException;
import br.edu.ufersa.controlConsult.model.jpaDAO.exceptions.PreexistingEntityException;
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
public class ICRUDNGTest {
    
    public ICRUDNGTest() {
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
     * Test of create method, of class ICRUD.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        ICRUD instance = new ICRUDImpl();
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class ICRUD.
     */
    @Test
    public void testRead() throws Exception {
        System.out.println("read");
        ICRUD instance = new ICRUDImpl();
        instance.read();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ICRUD.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        ICRUD instance = new ICRUDImpl();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ICRUD.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        ICRUD instance = new ICRUDImpl();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICRUDImpl implements ICRUD {

        public void create() throws PreexistingEntityException, Exception {
        }

        public void read() throws NonexistentEntityException, Exception {
        }

        public void update() throws NonexistentEntityException, Exception {
        }

        public void delete() throws NonexistentEntityException, Exception {
        }
    }
    
}
