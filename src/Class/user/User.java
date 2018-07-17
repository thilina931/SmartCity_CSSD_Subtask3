/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.user;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Thilina
 */
public class User implements Serializable{
    private static final long serialVersionUID = -47594027994670654L;

    private static volatile User instance;

    private int memberNumber;
    private String name, lastName, city, username, mobile, password, userLevel;

    private static int memberCount = 0;

    private void build(SingletonBuilder builder) {
        this.name = builder.name;
        this.city = builder.city;
        this.lastName = builder.lastName;
        this.mobile = builder.mobile;
        this.username = builder.username;
        this.password = builder.password;
        this.userLevel = builder.userLevel;
        memberNumber = ++memberCount;
    }
    
    
    public static User getInstance() {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new User();
                }
            }
        }
        return instance;
    }
    

    public void print() {
        System.out.println(Integer.toString(memberNumber) + " Name " + name + ",username " + username + ",password " + password + ",userLevel " + userLevel);
    }
      

    public static class SingletonBuilder {

        private final String name;
        private final String username;
        private final String lastName;
        private final String userLevel;
        private final String mobile;
        private final String password;

        private String city = "";

        private SingletonBuilder() {
            name = null;
            username = null;
            password = null;
            lastName = null;
         
            mobile = null;
            userLevel = null;
        }
        
        /**
         * 
         * @param firstName
         * @param lastName
         * @param userLevel
         * @param email
         * @param mobile
         * @param password 
         */
        public SingletonBuilder(String firstName, String lastName, String userLevel, String email, String mobile, String password) {
            this.name = firstName;
            this.lastName = lastName;
            this.mobile = mobile;
            this.userLevel = userLevel;
            this.username = email;
            this.password = password;

        }
       
       
        public SingletonBuilder city(String city) {
            this.city = city;
            return this;
        }

 
        public void build() {
            User.getInstance().build(this);
        }
       
       
       }
        private User() {

        }
        
        
         //get user name
        public String getUsername() {
        return username;
        }
        
        /**
         * 
         * @param username 
         */
        //set user name
        public void setUsername(String username) {
        this.username = username;
        }
        
        //get password
        public String getPassword() {
        return password;
        }
        
        /**
         * 
         * @param password 
         */
        //set password
        public void setPassword(String password) {
        this.password = password;
        }
     
        //get user level
        public String getUserLevel() {
        return userLevel;
        }
        
        /**
         * 
         * @param userLevel 
         */
        //set user level  
        public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
        }
        
        //get member number
        public int getMemberNumber() {
        return memberNumber;
        }
        
        /**
         * 
         * @param memberNumber 
         */
        //set member number
        public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
        }
        
        
        //get name
        public String getName() {
        return name;
        }
        
        /**
         * 
         * @param name 
         */
        //set name
        public void setName(String name) {
        this.name = name;
        }
        
        
        //get last name
        public String getLastName() {
        return lastName;
        }
        
        /**
         * 
         * @param lastName 
         */
        //set last name
        public void setLastName(String lastName) {
        this.lastName = lastName;
        }
           
        //get city
        public String getCity() {
        return city;
        }
        
        /**
         * 
         * @param city 
         */
        //set city
        public void setCity(String city) {
        this.city = city;
        }   
        
        
        //get mobile
        public String getMobile() {
        return mobile;
        }
        
        /**
         * 
         * @param mobile 
         */
        //set mobile            
        public void setMobile(String mobile) {
        this.mobile = mobile;
        }


        @Override
        public String toString() {
        return Integer.toString(memberNumber) + " " + name;
        }
   
        
        
        private void writeObject(ObjectOutputStream oos)
        throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(memberCount);

    }
    
    
     private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        memberCount = (Integer) ois.readObject();

    }
               
}
