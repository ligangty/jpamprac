/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ligangty.jpamprac;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.ligangty.jpamprac.PamAuthenticator;
import com.github.ligangty.jpamprac.PamConfiguration;

import static org.junit.Assert.*;

/**
 *
 * @author gli
 */
public class JpamTest {

    public JpamTest() {
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

    @Test
    public void test() {
        try {
            Configuration conf = new PropertiesConfiguration();
            conf.setProperty("pam.serviceName", "system-auth");
            PamConfiguration pamConf = new PamConfiguration(conf);
            PamAuthenticator auth = new PamAuthenticator(pamConf);
            assertTrue(auth.authenticate("username", "correct password"));
            assertFalse(auth.authenticate("username", "wrong password"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        } catch( Error er){
            er.printStackTrace();
            fail();
        }
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
