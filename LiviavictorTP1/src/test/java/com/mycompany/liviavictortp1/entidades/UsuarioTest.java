/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.liviavictortp1.entidades;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getIdUsuario method, of class Usuario.
     */
    @org.junit.Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Usuario instance = new Usuario();
        BigDecimal expResult = null;
        BigDecimal result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class Usuario.
     */
    @org.junit.Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        BigDecimal idUsuario = null;
        Usuario instance = new Usuario();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Usuario.
     */
    @org.junit.Test
    public void testGetNome() {
        System.out.println("getNome");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @org.junit.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Usuario instance = new Usuario();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Usuario.
     */
    @org.junit.Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Usuario.
     */
    @org.junit.Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Usuario instance = new Usuario();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Usuario.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
