/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Map;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserType;
import com.teamdev.jxbrowser.chromium.JSObject;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.events.ScriptContextAdapter;
import com.teamdev.jxbrowser.chromium.events.ScriptContextEvent;
import com.teamdev.jxbrowser.chromium.events.StatusEvent;
import com.teamdev.jxbrowser.chromium.events.StatusListener;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseEvent;
import java.awt.peer.MouseInfoPeer;
import java.io.ObjectInputStream;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author udy
 */
public class Map  {

    public static JInternalFrame createInternalFrame(String title, String url) {
        Browser browser = new Browser(BrowserType.LIGHTWEIGHT);
        BrowserView view = new BrowserView(browser);
        browser.loadURL(url);
 
        JInternalFrame internalFrame = new JInternalFrame(title, true);
        internalFrame.setContentPane(view);
        internalFrame.setClosable(true);
        internalFrame.setLocation(0, 0);
        internalFrame.setSize(1366, 550);
        internalFrame.setVisible(true);
       
        
       // internalFrame.addInputMethodListener((InputMethodListener) internalFrame.add(createButton("Set MArker")));
        return internalFrame;
     
}
        public static JButton createButton(String title){
        
            JButton setMarkerButton = new JButton("Set Marker");
            setMarkerButton.addActionListener(new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
                //To change body of generated methods, choose Tools | Templates.
                
            }
      });
        return setMarkerButton;
}
     
    
         }
//    internalFrame.MouseInfo.getPointerInfo().getLocation();
    
//public void Map(){
//
//        Browser jInternalFrame1 = new Browser();
//        BrowserView browserView = new BrowserView(jInternalFrame1);
//
//        JButton setMarkerButton = new JButton("Set Marker");
//        setMarkerButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//              
////                jInternalFrame1.executeJavaScriptAndReturnValue(
////                        "map.addListener('click', function(e) {\n"
////                        + "placeMarker(e.latLng, map);\n"
////                        + "});\n"
////                        + "\n"
////                        + "function placeMarker(position, map) {\n"
////                        + "        var marker = new google.maps.Marker({\n"
////                        + "        position: position,\n"
////                        + "        map: map,\n"
////                        + "        title:'test point',\n "
////                        + "    });\n"
////                        + "    map.panTo(position);\n"
////                        + "    window.java.onMarkerAdded(position);"
////                        + "}");
////                jInternalFrame1.addScriptContextListener(new ScriptContextAdapter() {
////                    @Override
////                    public void onScriptContextCreated(ScriptContextEvent event) {
////                        jInternalFrame1.executeJavaScriptAndReturnValue("window").asObject().setProperty("java", new JavaCallback());
////                    }
////                });
//                
//            }
//        });
//
//        JPanel toolBar = new JPanel();
//        toolBar.add(setMarkerButton);
//
//       
//        jInternalFrame1.addStatusListener(new StatusListener() {
//                    public void onStatusChange(StatusEvent event) {
//                        System.out.println("Text = " + event.toString());
//                    }
//                });
//
////        int index = jInternalFrame1.getCurrentNavigationEntryIndex();
////        System.out.println(index);
//    }
//    
//    public static class JavaCallback {
//
//        public void onMarkerAdded(JSObject position) {
//            double lat = position.getProperty("lat").asFunction().invoke(position).asNumber().getDouble();
//            double lng = position.getProperty("lng").asFunction().invoke(position).asNumber().getDouble();
//            System.out.println("lat = " + lat + ", lng = " + lng);
//        }
//    }



