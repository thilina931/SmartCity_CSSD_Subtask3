/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.User;

import Class.user.User;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Uthpala Jayawardena
 */
public class UserTest {
    
    public UserTest() {
    }
    
    
    //Test of getInstance method, of class User.
    @Test
    public void testGetInstance() {
        try {
            System.out.println("getInstance");
            User expResult = null;
            User result = User.getInstance();
            assertTrue(expResult.equals(result));

            fail(" The test case testGetInstance fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }
    
    
    
    //Test of print method, of class User.
    @Test
    public void testPrint() {
        try {
            System.out.println("print");
            User instance = null;
            instance.print();

            fail(" The test case testPrint fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }
    
    
    //Test of getUserLevel method, of class User.
     @Test
    public void testGetUserLevel() {
        try {
            System.out.println("getUserLevel");
            User instance = null;
            String expResult = "";
            String result = instance.getUserLevel();
            assertEquals(expResult, result);

            fail(" The test case testGetUserLevel fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }
    
    
    //Test of getMemberNumber method, of class User.
    @Test
    public void testGetMemberNumber() {
        try {
            System.out.println("getMemberNumber");
            User instance = null;
            String expResult = null;
            int result = instance.getMemberNumber();
            assertEquals(expResult, result);

            fail(" The test case testGetMemberNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }
    
    
    
    //Test of setMemberNumber method, of class User
    @Test
    public void testSetMemberNumber() {
        try {
            System.out.println("setMemberNumber");
            int memberNumber = 0;
            User instance = null;
            instance.setMemberNumber(memberNumber);

            fail(" The test case testSetMemberNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }
    
}
