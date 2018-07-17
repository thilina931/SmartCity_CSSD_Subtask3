/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Station;

import java.io.Serializable;
import java.util.Vector;
/**
 *
 * @author Spartan Lakmal
 */
public class SetOfStation extends Vector <Station> implements Serializable {
    
       private static final long serialVersionUID = 2428035439452881234L;
       
        SetOfStation StationList;
    
        
        
 public SetOfStation() {
        super();
 }
 
//add station
public void addStation(Station aStation) {
        super.add(aStation);
 }
 
//remove station
public boolean removeStation(Station rstation) {
        return super.remove(rstation);
}

/**
 * 
 * @param station
 * @param sensor_type
 * @param station_name
 * @param location
 * @param longitude
 * @param latitude
 * @return 
 */
//update station details
public String updatedetails(Station station, String sensor_type, String station_name, String location, String longitude, String latitude) {
        String status = "";
        try {
            this.elementAt(this.indexOf(station)).setsensortype(sensor_type);
            this.elementAt(this.indexOf(station)).setstation_name(station_name);
            this.elementAt(this.indexOf(station)).setlocation(location);
            this.elementAt(this.indexOf(station)).setlongitude(longitude);
            this.elementAt(this.indexOf(station)).setlatitude(latitude);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }  

/**
 * 
 * @param StationName
 * @return 
 */       
//return Station name
public SetOfStation getstationFromStationName(String StationName) {
        StationList = new SetOfStation();

        for (Station station : this) {
            if (station.getstation_name().toLowerCase().contains(StationName.toLowerCase())) {
                StationList.addStation(station);

            }
        }
        return StationList;
        
    }

/**
 * 
 * @param number
 * @return 
 */
//return number
public SetOfStation getstationFromNumber(int number) {
        StationList = new SetOfStation();
        for (Station station : this) {
            if (station.getstationNumber() == number) {
                StationList.addStation(station);

            }
        }

        return StationList;
    }
         
         
}
