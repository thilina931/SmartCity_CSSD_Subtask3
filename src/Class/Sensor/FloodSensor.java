/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Sensor;

/**
 *
 * @author Uthpala Jayawardena
 */
public class FloodSensor implements ISensor{
    
    @Override
    public String alt (double sensorValue){
    
        String status = "";
        if (sensorValue < 1000) {
            status = "No Flooding Issue...";

        } else {
            status = "Be aware of any signs of heavy rain..... ";
        }

        return status;
    
    }
}