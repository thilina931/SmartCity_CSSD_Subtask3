/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Station;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author Thilina
 */

public class sensorStation implements Serializable,Observer{
      private static final long serialVersionUID = 4515658257338350132L;

    private String sensorStation_ID;
    private  String Station_Type;
    private  String Station_Name;
    private String Location;
    private  String Longitude;
    private  String Latitude ;

    public sensorStation(String sensorStation_ID, String Station_Type, String Station_Name, String Location, String Longitude, String Latitude) {
        this.sensorStation_ID = sensorStation_ID;
        this.Station_Type = Station_Type;
        this.Station_Name = Station_Name;
        this.Location = Location;
        this.Longitude = Longitude;
        this.Latitude = Latitude;
    }

    //get station ID
    public String getSensorStation_ID() {
        return sensorStation_ID;
    }

    //set station ID
    public void setSensorStation_ID(String sensorStation_ID) {
        this.sensorStation_ID = sensorStation_ID;
    }

    //get station type
    public String getStation_Type() {
        return Station_Type;
    }

    //set station type
    public void setStation_Type(String Station_Type) {
        this.Station_Type = Station_Type;
    }

    //get station name
    public String getStation_Name() {
        return Station_Name;
    }

    //set station name
    public void setStation_Name(String Station_Name) {
        this.Station_Name = Station_Name;
    }

    //get location
    public String getLocation() {
        return Location;
    }

    //set location
    public void setLocation(String Location) {
        this.Location = Location;
    }

    //get longitude
    public String getLongitude() {
        return Longitude;
    }

    //set longitude
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    //get latitude
    public String getLatitude() {
        return Latitude;
    }

    //set latitude
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
    
     
}
