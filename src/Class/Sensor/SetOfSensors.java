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
public class SetOfSensors  extends Vector<SensorDetails> implements Serializable {
     private static final long serialVersionUID = 2428035439452881234L;

    SetOfSensors sensorList;
    
    public SetOfSensors() {
        super();
    }
    
    
    public void addSensorDetails(SensorDetails csensorDetails) {
        super.add(csensorDetails);
    }
    
    
    public SetOfSensors getSensorDetailsFromStationID(int stationNumber) {
        sensorList = new SetOfSensors();
        for (SensorDetails csensorDetails : this) {
            if (Integer.parseInt(csensorDetails.getstationNumber()) == stationNumber) {
                sensorList.addSensorDetails(csensorDetails);
            }
        }

        return sensorList;
    }
}
