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
 * @author Uthpala Jayawardena
 */
public class SetOfRandomCode extends Vector<randomCode> implements Serializable{
    
    private static final long serialVersionUID = 2428035439452881234L;

    SetOfRandomCode codeList;
    
    
    
    public SetOfRandomCode() {
        super();
    }
    
    //add code
    public void addCode(randomCode aCode) {
        super.add(aCode);
    }
    
    //remove code
    public boolean removeCode(randomCode aCode) {
        return super.remove(aCode);
    }
    
    /**
     * 
     * @param email
     * @param code
     * @return status
     */
    //verify random code
    public String verifyRandomCode(String email, String code) {
        codeList = new SetOfRandomCode();
        String status = "";

        for (randomCode RandomCode : this) {

            if (RandomCode.getEmail().equals(email)) {
                if (RandomCode.getRandomCode().equals(code)) {
                    status = "success";
                    break;
                } else {
                    status = "Random Code Invalied";
                }
            } else {
                status = "Email incorrect";
            }
        }

        return status;
    }
}



