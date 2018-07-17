/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Serialization;

import Class.Sensor.MotherShip;
import Class.user.SetOfRandomCode;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Class.user.SetOfUsers;
import Class.Station.SetOfStation;
import java.util.ArrayList;
import Class.Station.sensorStation;
import java.io.Serializable;


/**
 *
 * @author Uthpala Jayawardena
 */

//Serialization class
public class Serialization implements Serializable{
     
        public static void Serialize(Object object, String filename) throws IOException {

        try (FileOutputStream out = new FileOutputStream(filename)) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(object);
            oos.flush();
        }
        System.out.println(filename + " Serialized !");
    }
    
        //deserialization users
        public static SetOfUsers deserializeUsers() throws IOException, ClassNotFoundException {

        SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/Users.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (SetOfUsers) ois
                    .readObject();
        }

        return users;
    }
         
         
       //deserialization randomcode
       public static SetOfRandomCode deserializeRandomCode() throws IOException, ClassNotFoundException {

        SetOfRandomCode codes;
        try (FileInputStream in = new FileInputStream("DataFiles/RandomCodes.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            codes = (SetOfRandomCode) ois
                    .readObject();
        }

        return codes;
    }
       
       //deserialization station
       public static SetOfStation deserializeStation() throws IOException, ClassNotFoundException {

        SetOfStation Station;
        try (FileInputStream in = new FileInputStream("DataFiles/Station.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            Station = (SetOfStation) ois
                    .readObject();
        }

        return Station;
    } 
       
       //deserialization sensors
       public static MotherShip deserializeSensors() throws IOException, ClassNotFoundException {

        MotherShip sensors;
        try (FileInputStream in = new FileInputStream("DataFiles/Sensors.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            sensors = (MotherShip) ois
                    .readObject();
        }

        return sensors;
    }
       
        public static boolean write(String filename, Object obj){
            
        try {
            FileOutputStream fil=new FileOutputStream(filename);
            ObjectOutputStream oo=new ObjectOutputStream(fil);
            oo.writeObject(obj);
           
            fil.flush();
            oo.close();
            fil.close();
           return true;
        } catch (Exception e) {
            System.out.println("write "+ e);
        }
    return false;
    }
       
       
       
       
       public static ArrayList<sensorStation> getAllSensorStations(){
          try {
            FileInputStream fil=new FileInputStream("DataFiles/sensorstation.txt");
                     
                if(fil.available()>0){
                    ObjectInputStream oo=new ObjectInputStream(fil);
                 ArrayList<sensorStation> sr = (ArrayList<sensorStation>) oo.readObject();
                 oo.close();
                 fil.close();
                 return sr;
                }
                else{
                     ArrayList<sensorStation>sr  = new ArrayList<>();

                     fil.close();
                     return sr;
                }
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

            
        return null;
      }
}
