/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parseweather;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vikpatha
 */
public class SendDataTest {
    static SendData sd;
    @BeforeClass
    public static void setUpClass() {
        sd=new SendData();
    }
    
    @AfterClass
    public static void tearDownClass() {
        sd=null;
    }
    
       /**
     * Test of addData method, of class SendData.
     */
    @Test
    public void testAddData() throws Exception {
        System.out.println("addData");
        
        sd.addData();
    }

    /**
     * Test of consumeData method, of class SendData.
     */
    @Test
    public void testConsumeData() throws Exception {
        System.out.println("consumeData");
        SendData instance = new SendData();
        instance.consumeData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendEmail method, of class SendData.
     */
    @Test
    public void testSendEmail() {
        System.out.println("sendEmail");
        String msg = "";
        SendData instance = new SendData();
        instance.sendEmail(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SendData.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] arg = null;
        SendData.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
