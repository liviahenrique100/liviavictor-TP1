/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.liviavictortp1;

import com.mycompany.liviavictortp1.entidades.EntidadesSuite;
import com.mycompany.liviavictortp1.servlets.ServletsSuite;
import com.mycompany.liviavictortp1.ultilidades.UltilidadesSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author aluno
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({ServletsSuite.class, EntidadesSuite.class, UltilidadesSuite.class})
public class Liviavictortp1Suite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
}
