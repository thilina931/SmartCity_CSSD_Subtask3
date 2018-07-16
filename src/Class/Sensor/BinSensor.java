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
public class BinSensor implements ISensor{
     @Override
    public String alt(double sensorValue){
    
        String status = "";
        if (sensorValue < 50) {
            status = "Garbage Level is Low ...";

        } else if (sensorValue >= 50 && sensorValue < 90) {
            status = "Garbage Level is Moderate ...";
        } else {
            status = "Garbage Level is Moderate ...";
        }

        return status;
    }
}
