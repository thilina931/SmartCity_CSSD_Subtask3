/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Station;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Spartan Lakmal
 */
public class Station implements Serializable {
    private static final long serialVersionUID = -47594027994670654L;
     private static volatile Station instance;
       private int stationNumber;
    private String cmb_stationtype, txt_station_name, txt_fieldid, txt_location, txt_longitude, txt_latitude;
    

    private static int Station_Count = 0;

    private void build(SingletonBuilder builder) {
        this. cmb_stationtype = builder. cmb_stationtype;
        this.txt_station_name = builder.txt_station_name;
        this.txt_location = builder.txt_location;
        this.txt_longitude = builder.txt_longitude;
        this.txt_latitude = builder.txt_latitude;
       
    
    
}
    //get instance
    public static Station getInstance() {
        if (instance == null) {
            synchronized (Station.class) {
                if (instance == null) {
                    instance = new Station();
                }
            }
        }
        return instance;
    }
     
    public void print() {
        System.out.println(Integer.toString(stationNumber) + " Station Type " + cmb_stationtype + " Station Name " + txt_station_name + ",Location " + txt_location + ",Longitude " + txt_longitude + ",Latitude " + txt_latitude );
    }
     
    public static class SingletonBuilder {

        private final String cmb_stationtype; // Mandatory
        private final String txt_station_name;
        private final String txt_location;
        private final String txt_longitude;
        private final String txt_latitude;
        

        private byte[] image;

        private SingletonBuilder() {
            cmb_stationtype = null;
            txt_station_name = null;
            txt_location = null;
            txt_longitude = null;
            txt_latitude = null;
           

        }
        
    /**
     * 
     * @param station_type
     * @param station_name
     * @param location
     * @param longitude
     * @param latitude 
     */
    public SingletonBuilder(String station_type, String station_name, String location, String longitude, String latitude) {
            this.cmb_stationtype = station_type;
            this.txt_station_name = station_name;
            this.txt_location = location;
            this.txt_longitude = longitude;
            this.txt_latitude = latitude;
            
        }

    public void build() {
          Station.getInstance().build(this);
        } 
      
      }
      
     Station() {

    }
    
    //return sensor type
    public String getsensortype() {
        return cmb_stationtype;
    }
    /**
     * 
     * @param station_type 
     */
    //set Station type
    public void setsensortype(String station_type) {
        this.cmb_stationtype = station_type;
    }

    //return Station name
    public String getstation_name() {
        return txt_station_name;
    }

    /**
     * 
     * @param station_name 
     */
    //set sttion name
    public void setstation_name(String station_name) {
        this.txt_station_name = station_name;
    }

    //get station number
    public int getstationNumber() {
        return stationNumber;
    }

    /**
     * 
     * @param stationNumber 
     */
    //set station number
    public void setstationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    //get location
    public String getlocation() {
        return txt_location;
    }

    //set location
    public void setlocation(String location) {
        this.txt_location = location;
    }

    //get longitude
    public String getlongitude() {
        return txt_longitude;
    }

    /**
     * 
     * @param longitude 
     */
    //set longitude
    public void setlongitude(String longitude) {
        this.txt_longitude = longitude;
    }

    //get latitude
    public String getlatitude() {
        return txt_latitude;
    }
    
    /**
     * 
     * @param latitude 
     */
    //set latitude
    public void setlatitude(String latitude) {
        this.txt_latitude = latitude;
    }

    @Override
    public String toString() {
        return Integer.toString(stationNumber);
    }

    //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(Station_Count);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        Station_Count = (Integer) ois.readObject();

    }
      
      
      
}