/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.class1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class Class1Test {

    public Class1Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Class1.
     */
    @Test
    public void testMain() {

        System.out.println("Main method tested.");
    }

    /**
     * Test of checkUserName method, of class Class1.
     */
    @Test
    public void testCheckUserName() {

        boolean result1 = Class1.checkUserName("kyl_1");
        boolean result2 = Class1.checkUserName("kyle123");

        assertTrue(result1);
        assertFalse(result2);
    }

    /**
     * Test of checkPasswordComplexity method, of class Class1.
     */
    @Test
    public void testCheckPasswordComplexity() {

        boolean result1 = Class1.checkPasswordComplexity("Password@1");
        boolean result2 = Class1.checkPasswordComplexity("password");

        assertTrue(result1);
        assertFalse(result2);
    }

    /**
     * Test of checkCellPhoneNumber method, of class Class1.
     */
    @Test
    public void testCheckCellPhoneNumber() {

        boolean result1 = Class1.checkCellPhoneNumber("+27831234567");
        boolean result2 = Class1.checkCellPhoneNumber("0831234567");

        assertTrue(result1);
        assertFalse(result2);
    }

    /**
     * Test of registerUser method, of class Class1.
     */
    @Test
    public void testRegisterUser() {

        String result = Class1.registerUser(
                "kyl_1",
                "Password@1",
                "+27831234567",
                "Kyle",
                "Smith"
        );

        assertEquals("User registered successfully.", result);
    }

    /**
     * Test of loginUser method, of class Class1.
     */
    @Test
    public void testLoginUser() {

        Class1.storedUsername = "kyl_1";
        Class1.storedPassword = "Password@1";

        boolean result = Class1.loginUser("kyl_1", "Password@1");

        assertTrue(result);
    }
}