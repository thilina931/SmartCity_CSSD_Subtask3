/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.user;

import java.io.Serializable;
import java.util.Vector;
/**
 *
 * @author Thilina
 */
public class SetOfUsers extends  Vector<User> implements Serializable {
    private static final long serialVersionUID = 2428035439452881234L;

    SetOfUsers userList;
    
    public SetOfUsers() {
        super();
    }
      
    //add user
    public void addUser(User aUser) {
        super.add(aUser);
    }
    
    //remove user
    public boolean removeUser(User user) {
        return super.remove(user);
    }
    
    /**
     * 
     * @param user
     * @param firstName
     * @param lastName
     * @param city
     * @param email
     * @param mobile
     * @param password
     * @param userLevels
     * @return status
     */
    //update user details
    public String updatedetails(User user, String firstName, String lastName, 
            String city, String email, String mobile, String password, 
            String userLevels) {
        String status = "";
        try {
            this.elementAt(this.indexOf(user)).setName(firstName);
            this.elementAt(this.indexOf(user)).setLastName(lastName);
            this.elementAt(this.indexOf(user)).setCity(city);
            this.elementAt(this.indexOf(user)).setUsername(email);
            this.elementAt(this.indexOf(user)).setMobile(mobile);
            this.elementAt(this.indexOf(user)).setPassword(password);
            this.elementAt(this.indexOf(user)).setUserLevel(userLevels);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }

    //validate login     
    /**
     * 
     * @param username
     * @param Password
     * @return userLevel
     */
     //user authentication
    public String userAuthontication(String username, String Password) {
        userList = new SetOfUsers();
        String userLevel = "";

        for (User user : this) {

            if(user.getUsername().toLowerCase().equals(username.toLowerCase())){
                if (user.getPassword().toLowerCase().equals
                                        (Password.toLowerCase())) {
                    userLevel = user.getUserLevel() + " " + 
                            user.getMemberNumber() + " " + user.getUsername();
                    break;
                } else {
                    userLevel = "PasswordIncorrect 0 no";
                }
            } else {
                userLevel = "UsernameIncorrect 0 no";
            }
        }

        return userLevel;
    }

    /**
     *
     * @param name
     * @return
     */
    
    /**
     * 
     * @param name
     * @return 
     */
    //get member by name
    public SetOfUsers getMemberFromName(String name) {
        userList = new SetOfUsers();

        for (User user : this) {
            if (user.getName().toLowerCase().contains(name.toLowerCase())) {
                userList.addUser(user);

            }
        }
        return userList;
    }

    /**
     *
     * @param number
     * @return
     */
    //get member by number
    public SetOfUsers getMemberFromNumber(int number) {
        userList = new SetOfUsers();
        for (User user : this) {
            if (user.getMemberNumber() == number) {
                userList.addUser(user);

            }
        }

        return userList;
    }

    /**
     *
     * @param email
     * @return
     */
    //get member from email
    public SetOfUsers getMemberFromEmail(String email) {
        userList = new SetOfUsers();
        for (User user : this) {
            if (user.getUsername() == email) {
                userList.addUser(user);

            }
        }

        return userList;
    }
       
}
