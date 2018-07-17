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

//Sensor detail class
public class SensorDetails implements Serializable{
     private ISensor behaviour;
     
     
    private static final long serialVersionUID = -47594027994670654L;
    //public int sensorNumber;
    public double Flood, Bin, Traffic;
    private String dateTime, stationNumber,stationLocation;
    
    
    
    public SensorDetails() {

    }

    /**
     * 
     * @param dateTime
     * @param stationLocation
     * @param stationNumber
     * @param Flood
     * @param Bin
     * @param Traffic 
     */
    //sensor details
    public SensorDetails(String dateTime, String stationLocation, String stationNumber, double Flood, double Bin, double Traffic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    public void print() {
        System.out.println(stationLocation + " Name " + dateTime + ",username " + stationNumber);
    }
    
    
    /**
     * 
     * @param stationNumber
     * @param stationLocation
     * @param Flood
     * @param Bin
     * @param Traffic 
     */
    public SensorDetails( String stationNumber, String stationLocation, double Flood, double Bin, double Traffic) {
        
        this.stationLocation=stationLocation;
        this.stationNumber = stationNumber;
        this.Flood = Flood;
        this.Bin = Bin;
        this.Traffic = Traffic;

    }
    
    //get date
    public String getDate() {
        return dateTime;
    }
    
    /**
     * 
     * @param dateTime 
     */
    //set date
    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }

    //get station number
    public String getstationNumber() {
        return stationNumber;
    }
      
    /**
     * 
     * @param stationNumber 
     */
    //set station number
    public void setstationNumber(String stationNumber) {
        this.stationNumber = stationNumber;
    }
    
    //get behaviour
    public ISensor getBehaviour() {
        return behaviour;
    }
    
    /**
     * 
     * @param behaviour 
     */
    //set behaviour
    public void setBehaviour(ISensor behaviour) {
        this.behaviour = behaviour;
    }
    
    
    //get station location
    public String getstationLocation() {
        return stationLocation;
    }
      
    /**
     * 
     * @param stationLocation 
     */
    //set station location
    public void setstationLocation(String stationLocation) {
        this.stationNumber = stationLocation;
    }
    
    /**
     * 
     * @param b 
     */   
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     * @param behaviour
     */

    /**
     * 
     * @param sensorValue
     * @return 
     */
    //check solution method
    public String checkSolution(double sensorValue) {
        String alert = behaviour.alt(sensorValue);
        return alert;
    }


}
