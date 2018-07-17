/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;


import Validations.validations;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Uthpala Jayawardena
 */
public class ValidationTest {
    
    
    
    //Test of validateNumber method, of class validations.
    @Test
    public void testValidateNumber() {
        try {
            System.out.println("validateNumber");
            JTextField textField = null;
            KeyEvent evt = null;
            validations.validateNumber(textField, evt);

            fail(" The test case testValidateNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }
    
    
    
    //Test of isEmail method, of class validations.
    @Test
    public void testIsEmail() {
        try {
            System.out.println("isEmail");
            String email = "";
            boolean expResult = false;
            boolean result = validations.isEmail(email);
            assertEquals(expResult, result);

            fail(" The test case testIsEmail fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }
}
