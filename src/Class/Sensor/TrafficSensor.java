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
public class TrafficSensor implements ISensor{
     @Override
    public String alt (double sensorValue){
    String status = "";
     if (sensorValue < 50) {
            status = "Low Traffic ...";        
            } else if (sensorValue >= 50 && sensorValue < 75) {
            status = "Moderate Traffic ...";
        } else {
            status = "Heavy Traffic ...";
        }

        return status;
    }
        
}
