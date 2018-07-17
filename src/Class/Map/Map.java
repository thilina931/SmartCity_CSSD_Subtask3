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

//map class
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
    /**
     * 
     * @param title
     * @return 
     */
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



