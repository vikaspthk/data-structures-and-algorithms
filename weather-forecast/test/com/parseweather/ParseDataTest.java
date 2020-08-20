/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parseweather;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vikpatha
 */
public class ParseDataTest {

    static ParseData pd;

    @BeforeClass
    public static void setUpClass() {
        pd = new ParseData();
    }

    @AfterClass
    public static void tearDownClass() {
        pd = null;

    }
    /**
     * Test of getXML method, of class ParseData.
     */
    String city = "agra";

    @Before
    public void testGetXML() throws Exception {
        System.out.println("getXML");

        //
        String result = pd.getXML(city);
        assertNotNull(result);
    }

    /**
     * Test of getLocationName method, of class ParseData.
     */
    @Test
    public void testGetLocationName() {
        System.out.println("getLocationName");
        //
        //
        String result = pd.getLocationName();
        assertNotNull(result);
    }

    /**
     * Test of getDate method, of class ParseData.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        String result = pd.getDate();
        assertNotNull(result);
    }

    /**
     * Test of getOverView method, of class ParseData.
     */
    @Test
    public void testGetOverView() {
        System.out.println("getOverView");
        String result = pd.getOverView();
        assertNotNull(result);
    }

    /**
     * Test of getWindDirection method, of class ParseData.
     */
    @Test
    public void testGetWindDirection() {
        System.out.println("getWindDirection");
        String result = pd.getWindDirection();
        assertNotNull(result);
    }

    /**
     * Test of getWindSpeed method, of class ParseData.
     */
    @Test
    public void testGetWindSpeed() {
        System.out.println("getWindSpeed");
        String result = pd.getWindSpeed();
        assertNotNull(result);
    }

    /**
     * Test of getWindDescription method, of class ParseData.
     */
    @Test
    public void testGetWindDescription() {
        System.out.println("getWindDescription");
        String result = pd.getWindDescription();
        assertNotNull(result);
    }

    /**
     * Test of getDayTemprature method, of class ParseData.
     */
    @Test
    public void testGetDayTemprature() {
        System.out.println("getDayTemprature");

        String result = pd.getDayTemprature();
        assertNotNull(result);

    }

    /**
     * Test of getEveTemprature method, of class ParseData.
     */
    @Test
    public void testGetEveTemprature() {
        System.out.println("getEveTemprature");

        String result = pd.getEveTemprature();
        assertNotNull(result);

    }

    /**
     * Test of getMaxTemprature method, of class ParseData.
     */
    @Test
    public void testGetMaxTemprature() {
        System.out.println("getMaxTemprature");

        String result = pd.getMaxTemprature();
        assertNotNull(result);

    }

    /**
     * Test of getMinTemprature method, of class ParseData.
     */
    @Test
    public void testGetMinTemprature() {
        System.out.println("getMinTemprature");

        String result = pd.getMinTemprature();
        assertNotNull(result);

    }

    /**
     * Test of getPressure method, of class ParseData.
     */
    @Test
    public void testGetPressure() {
        System.out.println("getPressure");

        String result = pd.getPressure();
        assertNotNull(result);

    }

    /**
     * Test of getHumidity method, of class ParseData.
     */
    @Test
    public void testGetHumidity() {
        System.out.println("getHumidity");

        String result = pd.getHumidity();
        assertNotNull(result);

    }

    /**
     * Test of getMessage method, of class ParseData.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");

        String result = pd.getMessage();
        assertNotNull(result);

    }

}
