/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Serialization;

import Class.user.SetOfRandomCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import Class.user.SetOfUsers;
import Class.user.User;
import Class.Station.SetOfStation;
import Class.Station.Station;

/**
 *
 * @author Uthpala Jayawardena
 */
public class Serialization {
     
    public static void Serialize(Object object, String filename) throws IOException {

        try (FileOutputStream out = new FileOutputStream(filename)) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(object);
            oos.flush();
        }
        System.out.println(filename + " Serialized !");
    }
    

         public static SetOfUsers deserializeUsers() throws IOException, ClassNotFoundException {

        SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/Users.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (SetOfUsers) ois
                    .readObject();
        }

        return users;
    }
         
         
         
       public static SetOfRandomCode deserializeRandomCode() throws IOException, ClassNotFoundException {

        SetOfRandomCode codes;
        try (FileInputStream in = new FileInputStream("DataFiles/RandomCodes.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            codes = (SetOfRandomCode) ois
                    .readObject();
        }

        return codes;
    }
       
       public static SetOfStation deserializeFarm() throws IOException, ClassNotFoundException {

        SetOfStation farm;
        try (FileInputStream in = new FileInputStream("DataFiles/station.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            farm = (SetOfStation) ois
                    .readObject();
        }

        return farm;
    } 
       
}
