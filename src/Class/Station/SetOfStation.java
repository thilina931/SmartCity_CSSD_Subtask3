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
         
         public void addStation(Station aStation) {
         super.add(aStation);
    }
         
          public boolean removeStation(Station rstation) {
        return super.remove(rstation);
    }
        public String updatedetails(Station station, String station_type, String station_name, String location, String longitude, String latitude, byte[] image) {
        String status = "";
        try {
            this.elementAt(this.indexOf(station)).setstationtype(station_type);
            this.elementAt(this.indexOf(station)).setstation_name(station_name);
            this.elementAt(this.indexOf(station)).setlocation(location);
            this.elementAt(this.indexOf(station)).setimage(image);
            this.elementAt(this.indexOf(station)).setlongitude(longitude);
            this.elementAt(this.indexOf(station)).setlatitude(latitude);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }  
        //rturn Station name
         public SetOfStation getstationFromStationName(String StationName) {
        StationList = new SetOfStation();

        for (Station station : this) {
            if (station.getstation_name().toLowerCase().contains(StationName.toLowerCase())) {
                StationList.addStation(station);

            }
        }
        return StationList;
        
    }
         
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
