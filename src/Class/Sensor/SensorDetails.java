/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Sensor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author Uthpala Jayawardena
 */
public class SensorDetails implements Serializable{
     private ISensor behaviour;
     
     
    private static final long serialVersionUID = -47594027994670654L;
    public int sensorNumber;
    public double Flood, Bin, Traffic;
    private String dateTime, stationNumber;
    
    
    
    public SensorDetails() {

    }
     
    
    public void print() {
        System.out.println(Integer.toString(sensorNumber) + " Name " + dateTime + ",username " + stationNumber);
    }
    
    
    public SensorDetails(String dateTime, String stationNumber, double Flood, double Bin, double Traffic) {
        this.dateTime = dateTime;
        this.stationNumber = stationNumber;
        this.Flood = Flood;
        this.Bin = Bin;
        this.Traffic = Traffic;

    }
    
    
    public String getDate() {
        return dateTime;
    }
    
    
    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }
     
     
    public String getstationNumber() {
        return stationNumber;
    }
      
      
    public void setfieldID(String fieldID) {
        this.stationNumber = stationNumber;
    }
       
       
    public void setBehaviour(ISensor behaviour) {
        this.behaviour = behaviour;
    }
    
    public ISensor getBehaviour() {
        return behaviour;
    }
    
    
     @Override
    public String toString() {
        return Integer.toString(sensorNumber);
    }


}
