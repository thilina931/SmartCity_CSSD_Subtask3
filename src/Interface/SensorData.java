/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;



import Class.Sensor.BinSensor;
import Class.Sensor.FloodSensor;
import Class.Sensor.MotherShip;
import Class.Sensor.SensorDetails;
import Class.Sensor.TrafficSensor;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Class.Serialization.Serialization;
import Class.Station.SetOfStation;
import Class.Station.Station;





/**
 *
 * @author Spartan Lakmal
 */
public class SensorData extends javax.swing.JFrame {
    
    String username, userLevel;
    public static final String FILE_NAME_Sensors = "DataFiles/Sensors.txt";
    public static final String Flood = "Flood Sensor";
    public static final String Bin = "Bin Sensor";
    public static final String Traffic = "Traffic Sensor";
    public static final String FILE_NAME_stations = "DataFiles/station.txt";

    /**
     * Creates new form AdminPanel
     */
    public static SetOfStation thestation = new SetOfStation();
    public static MotherShip theSensors = new MotherShip();
    public static MotherShip searchSensors = new MotherShip();
    public SensorData() {
        initComponents();
    }
    
    
    public SensorData(String username, String userLevel, String email) {
        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        logedUser.setText(email);

//        try {
//            for (Station station : Serialization.deserializeStation()) {
//                thestation.addStation(station);
//                station.print();
//            }
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        }

//        try {
//            for (SensorDetails sensorDetails : Serialization.deserializeSensors()) {
//                theSensors.addSensorDetails(sensorDetails);
//                sensorDetails.print();
//            }
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        }
//
//        String values = "";

//       for (Station station : thestation) {
//            if (!values.contains(station.getlocation())) {
//                values = values + " " + station.getlocation();
//            }
//        }
//        String[] splited = values.split("\\s+");
//        for (int i = 0; i < splited.length; i++) {
//            System.out.println(splited[i]);
//        }
//        loadCombo(jComboBox1, splited);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        comboSTID = new javax.swing.JComboBox<>();
        logedUser = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("Admin Panel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Sensor Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("Admin Panel");

        jButton3.setText("Sensor Station");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Emergency");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton10.setText("Log Out");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Sensor Data");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton9.setText("Save");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setText("Rain Fall (mm) :");

        jLabel3.setText("Bin Capacity (%) : ");

        jLabel4.setText("Traffic Status (%) : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Station No :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        comboSTID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "1", "2", "3", "4", "5" }));
        comboSTID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboSTIDMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboSTIDMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(comboSTID, 0, 137, Short.MAX_VALUE)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                                .addGap(76, 76, 76)))
                                        .addComponent(jButton9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(24, 24, 24)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addComponent(logedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        AdminPanelManageSensor spms = new AdminPanelManageSensor();
        spms.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        SensorDetails sd = new SensorDetails();
        sd.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        SensorStation ss = new SensorStation();
        ss.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Emergency em = new Emergency();
        em.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // call traffic sensor and give response
        // if a sensor go off go to emergency page
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        Login li = new Login();
        li.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        SensorData sda = new SensorData();
        sda.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton11ActionPerformed

    //Get Station ID s in to Station No dropdown
    private void comboSTIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboSTIDMouseClicked
        // TODO add your handling code here:
//         String values = "\na\n";
//
//        for (Station station : thestation) {
//
//            if (station.getlocation().equals(jComboBox1.getSelectedItem().toString()) && !values.contains("" + station.getstationNumber())) {
//                values = values + "\n" + station.getstationNumber();
//            }
//        }
//        String[] splited = values.split("\\n+");
//        for (int i = 0; i < splited.length; i++) {
//            System.out.println(splited[i]);
//        }
//        loadCombo(comboSTID, splited);
    }//GEN-LAST:event_comboSTIDMouseClicked

    
    //Add sensor details and save in sensor data file
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        
        if (comboSTID.getSelectedItem().toString().equals("Select an option")||  jTextField1.getText().trim().isEmpty()
                || jTextField2.getText().trim().isEmpty() || jTextField3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Provide all the necessary Details", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

//            for (SensorDetails sensor : theSensors) {
//                if (sensor.getstationNumber().equals(comboSTID.getSelectedItem().toString())) {
//                    searchSensors.addSensorDetails(sensor);
//                    sensor.print();
//                }
//
//            } 
                getDetails();
        }     
    }//GEN-LAST:event_jButton9MouseClicked

    
    
    private void comboSTIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboSTIDMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboSTIDMouseReleased

    
    //Get filled details in fields
     public void getDetails() {
        double Flood, Bin, Traffic;
        String stationNumber = comboSTID.getSelectedItem().toString();
        Flood = Double.parseDouble(jTextField1.getText().trim());
        Bin = Double.parseDouble(jTextField2.getText().trim());
        Traffic = Double.parseDouble(jTextField3.getText().trim());
        String status = addDetails(stationNumber, Flood, Bin, Traffic);
        if (status == "success") {
            clear();
        }
    }
    
     
  //Method to clear all fields   
    public void clear() {
       
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        comboSTID.setSelectedItem("Select an option");
       // jComboBox1.setSelectedItem("Select an option");

        theSensors.removeAll(theSensors);

        try {
            for (SensorDetails sensorDetails : Serialization.deserializeSensors()) {
                theSensors.addSensorDetails(sensorDetails);
                sensorDetails.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    //Load Station Numbers
    public void loadCombo(JComboBox combobox, String[] values) {
        combobox.removeAllItems();
        combobox.addItem("Select an option");
        for (int i = 2; i < values.length; i++) {
            combobox.addItem(values[i]);
        }
    }
    
    
    
     public String addDetails(String stationNumber, double Flood, double Bin, double Traffic) {
        String status = "";

        SensorDetails s1 = new SensorDetails();
        SensorDetails s2 = new SensorDetails();
        SensorDetails s3 = new SensorDetails();


        s1.setBehaviour(new FloodSensor());
        s2.setBehaviour(new BinSensor());
        s3.setBehaviour(new TrafficSensor());


        String FloodSol = s1.checkSolution(Flood);
        String BinSol = s2.checkSolution(Bin);
        String TrafficSol = s3.checkSolution(Traffic);

        String dateTime = Calendar.getInstance().getTime().toString();

        theSensors.addSensorDetails(new SensorDetails(dateTime, stationNumber, Flood, Bin, Traffic));
        try {
            Serialization.Serialize(theSensors, FILE_NAME_Sensors);
            JOptionPane.showMessageDialog(this, "Please take the below steps : \n \u2022" + FloodSol + "\n \u2022" + BinSol + "\n \u2022"
                    + TrafficSol + "\n Above Solutions may decrease the risk " ,
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            status = "success";
        } catch (IOException | HeadlessException ex) {
            status = "fail";
            System.out.println(ex.getMessage());
        }
        return status;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SensorData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SensorData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SensorData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SensorData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SensorData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboSTID;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel logedUser;
    // End of variables declaration//GEN-END:variables
}
