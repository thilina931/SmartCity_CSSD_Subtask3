/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Sensor;

import Interface.Emergency;
import Interface.SensorData;
import java.io.Serializable;


/**
 *
 * @author Uthpala Jayawardena
 */

public class Data implements Serializable{
    private static final long serialVersionUID = -47594027994670654L;
    private String FloodSol, BinSol,TrafficSol;
    

    public Data() {
        
   
    }

    public Data(String FloodSol, String BinSol, String TrafficSol) {
        this.FloodSol= FloodSol;
        this.BinSol =BinSol;
        this.TrafficSol= TrafficSol;
        System.out.println(FloodSol);
        System.out.println(BinSol);
        System.out.println(TrafficSol);
       
        
    }

    public String getFloodSol() {
        return FloodSol;
    }

    public void setFloodSol(String FloodSol) {
        this.FloodSol = FloodSol;
    }

    public String getBinSol() {
        return BinSol;
    }

    public void setBinSol(String BinSol) {
        this.BinSol = BinSol;
    }

    public String getTrafficSol() {
        return TrafficSol;
    }

    public void setTrafficSol(String TrafficSol) {
        this.TrafficSol = TrafficSol;
    }
    
    public void  checkAlarts() {
        
        String Alart = "";
        if (this.FloodSol == "Be aware of any signs of heavy rain..... " ||this.BinSol== "Garbage Level is High ..."||this.TrafficSol == "Heavy Traffic ...") {
            //getFloodSol().equalsIgnoreCase("");
            System.out.println("Class.Sensor.Data.checkAlarts()");
            
            Emergency em = new Emergency(FloodSol,BinSol,TrafficSol);
            em.setVisible(true);
                    
        } else {

            Alart = "Be aware of any signs of heavy rain..... ";
        }
    }
     


    public void addData(String FloodSol,String BinSol,String TrafficSol) {
        this.FloodSol= FloodSol;
        System.out.println(FloodSol);
        


//To change body of generated methods, choose Tools | Templates.
    }

    public void addData(Data data) {
       //To change body of generated methods, choose Tools | Templates.
    }
   
   
    
}
