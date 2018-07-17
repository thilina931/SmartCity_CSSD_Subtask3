/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Uthpala Jayawardena
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Classes.Sensor.SensorSuite.class, Classes.Serialization.SerializationSuite.class, Classes.User.UserSuite.class})
public class ClassesSuite {
    
}
