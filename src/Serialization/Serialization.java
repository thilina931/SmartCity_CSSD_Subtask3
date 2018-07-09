/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
/**
 *
 * @author Uthpala Jayawardena
 */
public class Serialization {
     
    public static void serialize(Vector input, String title) throws IOException{
    
    
        FileOutputStream fos = new FileOutputStream(new File(title));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
        oos.flush();
        oos.close();
        
    
    
    }
    
     public  static Vector  deSerialize(String title)throws IOException, ClassNotFoundException{
    
        FileInputStream fis = new FileInputStream(new File(title));
        ObjectInputStream ois = new ObjectInputStream(fis);
        Vector vecc = (Vector)ois.readObject();
        ois.close();
        return  vecc;
    
    }
}
