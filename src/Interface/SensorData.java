/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;



import Class.Sensor.BinSensor;
import Class.Sensor.Data;
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
    public static Data data = new Data();
    
    
    
    public SensorData() {
        initComponents();
    }
    
    /**
     * 
     * @param username
     * @param userLevel
     * @param email 
     */
    //sensor data
    public SensorData(String username, String userLevel, String email) {
        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        logedUser.setText(email);

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
        jLabel6 = new javax.swing.JLabel();

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
        setMinimumSize(new java.awt.Dimension(1019, 559));
        setSize(new java.awt.Dimension(250, 300));
        getContentPane().setLayout(null);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Admin Panel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(400, 111, 145, 31);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Sensor Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(563, 111, 161, 31);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel2.setText("Admin Panel");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(373, 11, 249, 43);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Sensor Station");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(68, 111, 163, 31);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Emergency");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(249, 111, 133, 31);

        jButton10.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton10.setText("Log Out");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(893, 11, 97, 31);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Sensor Data");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(742, 111, 143, 31);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        getContentPane().add(jButton9);
        jButton9.setBounds(717, 312, 75, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Rain Fall (mm) :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(237, 278, 144, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Bin Capacity (%) : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(237, 338, 171, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Traffic Status (%) : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(237, 393, 181, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(436, 278, 178, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Station No :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(237, 223, 106, 22);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(432, 335, 182, 28);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(436, 393, 178, 28);

        comboSTID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboSTID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "1", "2", "3", "4", "5" }));
        comboSTID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboSTIDMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboSTIDMouseReleased(evt);
            }
        });
        getContentPane().add(comboSTID);
        comboSTID.setBounds(436, 223, 178, 28);
        getContentPane().add(logedUser);
        logedUser.setBounds(10, 11, 183, 26);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-main.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 1040, 570);

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
    }//GEN-LAST:event_comboSTIDMouseClicked

    
    //Add sensor details and save in sensor data file
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        
        if (comboSTID.getSelectedItem().toString().equals("Select an option")||  jTextField1.getText().trim().isEmpty()
                || jTextField2.getText().trim().isEmpty() || jTextField3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Provide all the necessary Details", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

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
    
    /**
     * 
     * @param stationNumber
     * @param Flood
     * @param Bin
     * @param Traffic
     * @return status
     */
    //add data
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
        data.addData(new Data(FloodSol,BinSol,TrafficSol));
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel logedUser;
    // End of variables declaration//GEN-END:variables
}
