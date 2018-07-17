/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Serialization;

import Class.Serialization.Serialization;
import java.io.FileNotFoundException;
import java.io.IOException;
import junit.framework.AssertionFailedError;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Uthpala Jayawardena
 */
public class SerializationTest {
    
    public SerializationTest() {
    }
    
    
    //Test of Serialize method, of class Serialization.
    @Test
    public void testSerialize() throws Exception {
        try {
            System.out.println("Serialize");
            Object object = null;
            String filename = "";
            Serialization.Serialize(object, filename);
            fail(" The test case testSerialize fail.");
        } catch (Throwable expected) {
            assertEquals(FileNotFoundException.class, expected.getClass());
        }
    }
    
    // Test of deserializeUsers method, of class Serialization.
    @Test
    public void testDeserializeUsers() throws Exception {
        try {
            System.out.println("deserializeUsers");
            int expResult = 0;
            int result = Serialization.deserializeUsers().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }
    
    
     // Test of deserializeSensor method, of class Serialization.
    @Test
    public void testDeserializeSensors() throws Exception {
        try {
            System.out.println("deserializeSensors");
            int expResult = 0;
            int result = Serialization.deserializeSensors().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }
    
    
     // Test of deserializeStation method, of class Serialization.
    @Test
    public void testDeserializeStation() throws Exception {
        try {
            System.out.println("deserializeStation");
            int expResult = 0;
            int result = Serialization.deserializeStation().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }
}
