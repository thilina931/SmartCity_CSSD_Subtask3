/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Sensor;

import Class.Sensor.FloodSensor;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Uthpala Jayawardena
 */
public class FloodSensorTest {
    
     public FloodSensorTest() {
    }
     
     //Test of Alt method, of class FloodSensor.
    @Test
    public void testFloodAlert() {
        System.out.println("Alert_FloodSensor");
        double sensorValue = 100.0;
        FloodSensor instance = new FloodSensor();
        String expResult = "Be aware of any signs of heavy rain..... ";
        String result = instance.alt(sensorValue);
        assertFalse(expResult.equals(result));
        System.out.println(result);

    }
}
