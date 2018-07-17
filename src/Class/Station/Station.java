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
    private byte[] image;
    private double minTemp, maxTemp, saturationVapourPressure;//eddit

    private static int Station_Count = 0;

    private void build(SingletonBuilder builder) {
        this. cmb_stationtype = builder. cmb_stationtype;
        this.txt_station_name = builder.txt_station_name;
        this.txt_location = builder.txt_location;
        this.txt_longitude = builder.txt_longitude;
        this.txt_latitude = builder.txt_latitude;
        this.image = builder.image;
        this.minTemp = builder.minTemp;
        this.maxTemp = builder.maxTemp;
        this.saturationVapourPressure = builder.saturationVapourPressure;
        stationNumber = ++Station_Count;
    
    
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
        System.out.println(Integer.toString(stationNumber) + " Station Type " + cmb_stationtype + " Station Name " + txt_station_name + ",Location " + txt_location + ",Longitude " + txt_longitude + ",Latitude " + txt_latitude + ", Image " + image+", Pressure"+saturationVapourPressure);
    }
     
      public static class SingletonBuilder {

        private final String cmb_stationtype; // Mandatory
        private final String txt_station_name;
        private final String txt_location;
        private final String txt_longitude;
        private final String txt_latitude;
        private final double minTemp;
        private final double maxTemp;
        private final double saturationVapourPressure;

        private byte[] image;

        private SingletonBuilder() {
            cmb_stationtype = null;
            txt_station_name = null;
            txt_location = null;
            txt_longitude = null;
            txt_latitude = null;
            minTemp = 0.0;
            maxTemp = 0.0;
            saturationVapourPressure = 0.0;

        }
      public SingletonBuilder(String station_type, String station_name, String location, String longitude, String latitude) {
            this.cmb_stationtype = station_type;
            this.txt_station_name = station_name;
            this.txt_location = location;
            this.txt_longitude = longitude;
            this.txt_latitude = latitude;
            minTemp = 0.0;
            maxTemp = 0.0;
            saturationVapourPressure = 0.0;
        }

          public Station.SingletonBuilder image(byte[] image) {
            this.image = image;
            return this;
        }
         public void build() {
          Station.getInstance().build(this);
        }
      
      
      }
      
       Station() {

    }
       ///////////////////////////////////////////////////////
       //return sensor type
      public String getsensortype() {
        return cmb_stationtype;
    }

      //setting Station type
    public void setsensortype(String station_type) {
        this.cmb_stationtype = station_type;
    }

     //return Station name
    public String getstation_name() {
        return txt_station_name;
    }

     //setting  Station name
    public void setstation_name(String station_name) {
        this.txt_station_name = station_name;
    }

    //setting and getting  station Number
   
    public int getstationNumber() {
        return stationNumber;
    }

    
    public void setstationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    
    public byte[] getimage() {
        return image;
    }

    
    public void setimage(byte[] image) {
        this.image = image;
    }

    //setting getting location
    /**
     *
     * @return
     */
    public String getlocation() {
        return txt_location;
    }

    
    public void setlocation(String location) {
        this.txt_location = location;
    }

    //setting getting firsstname
   
    public String getlongitude() {
        return txt_longitude;
    }

    
    public void setlongitude(String longitude) {
        this.txt_longitude = longitude;
    }

    //setting getting latitude
   
    public String getlatitude() {
        return txt_latitude;
    }
    
   
    public double getSaturationVapourPressure()
    {
        return saturationVapourPressure;
    }
    
   
    public void setSaturationVapourPressure(double saturationVapourPressure)
    {
        this.saturationVapourPressure=saturationVapourPressure;
    }

   
    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

   
    public double getMinTemp() {
        return minTemp;
    }

    
    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    
    public double getMaxTemp() {
        return maxTemp;
    }

  
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