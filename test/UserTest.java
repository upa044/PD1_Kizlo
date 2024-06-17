/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    @Test
    public void testUserlogin() throws Exception {
        System.out.println("userlogin");
        String username = "admin";
        String password = "admin";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.userlogin(username, password);
        assertEquals(expResult, result);
        
    }

    
}
