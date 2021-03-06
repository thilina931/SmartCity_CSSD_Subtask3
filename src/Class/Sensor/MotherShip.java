/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Sensor;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Uthpala Jayawardena
 */
//MotherShip class including setof Sensors
public class MotherShip  extends Vector<SensorDetails> implements Serializable {
     private static final long serialVersionUID = 2428035439452881234L;

    MotherShip sensorList;
    
    public MotherShip() {
        super();
    }
    
    //Add sensor details
    public void addSensorDetails(SensorDetails csensorDetails) {
        super.add(csensorDetails);
    }
    
    /**
     * 
     * @param stationNumber
     * @return 
     */
    //get sensor details from sensorID
    public MotherShip getSensorDetailsFromStationID(int stationNumber) {
        sensorList = new MotherShip();
        for (SensorDetails csensorDetails : this) {
            if (Integer.parseInt(csensorDetails.getstationNumber()) 
                    == stationNumber) {
                sensorList.addSensorDetails(csensorDetails);
            }
        }

        return sensorList;
    }
}
