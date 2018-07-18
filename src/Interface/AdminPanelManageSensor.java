/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Class.Serialization.Serialization;
import Class.Station.SetOfStation;
import Class.Station.Station;
import Class.Station.sensorStation;
import Class.user.User;
import static Interface.AdminPanelManageUser.theUsers;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Uthpala Jayawardena
 */
public class AdminPanelManageSensor extends javax.swing.JFrame {
    
    String username, userLevel;
    
    public static SetOfStation thestation = new SetOfStation();
    public static SetOfStation searchstation = new SetOfStation();
    public static final String FILE_NAME_station = "DataFiles/Station.txt";
    JFileChooser chooser;
    FileNameExtensionFilter filter;
    FileInputStream fis;
    /**
     * Creates new form AdminPanelManageSensor
     */
    
    String workingDir = System.getProperty("user.dir");
    
    
    public AdminPanelManageSensor() {
        initComponents();
    
           
    }
    
    /**
     * 
     * @param username
     * @param userLevel
     * @param email 
     */
    public AdminPanelManageSensor(String username, String userLevel, 
            String email) {
        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        logedUser.setText(email);

     try {
            for (Station station : Serialization.deserializeStation()) {
                thestation.addStation(station);
                station.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        TableLoad();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        txt_stationid = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        stationtable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        Reset_All = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        logedUser = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1029, 491));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Sensor Station");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 110, 163, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Emergency");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 110, 133, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Admin Panel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 110, 145, 31);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Sensor Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(610, 110, 161, 31);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Sensor Data");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(810, 110, 150, 30);

        jButton6.setText("Manage Sensor");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 190, 121, 25);

        jButton7.setText("Manage User");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 257, 120, 25);

        jLabel1.setText("Station No :");

        jLabel2.setText("Station Type :");

        jLabel3.setText("Station Name :");

        jLabel4.setText("Location :");

        jLabel5.setText("Longitude :");

        jLabel6.setText("Latitude :");

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Add");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        Deletebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        stationtable.setForeground(new java.awt.Color(153, 153, 153));
        stationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "type", "name", "Location", "log", "lati"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stationtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        stationtable.setFillsViewportHeight(true);
        stationtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stationtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stationtable);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Flood", "Bin", "Traffic" }));

        Reset_All.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset_All.setText("Reset");
        Reset_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_AllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_stationid, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton9)
                        .addGap(66, 66, 66)
                        .addComponent(Deletebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset_All)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_stationid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(Deletebtn)
                    .addComponent(Reset_All))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(146, 138, 888, 344);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Log Out");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(910, 10, 103, 31);

        jLabel7.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        jLabel7.setText("Admin Panel");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 10, 316, 63);

        logedUser.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        logedUser.setForeground(new java.awt.Color(102, 102, 102));
        logedUser.setText("logged User");
        getContentPane().add(logedUser);
        logedUser.setBounds(10, 11, 192, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AD-Events-Logo-Smartcity-dialogues.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-40, 270, 1200, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //table mouse click
    private void stationtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stationtableMouseClicked

        // When user click on tbInfo table, all the information what in user 
        //  selected row will want to show on Update tab
        //  load info to update tab
        DefaultTableModel dtm = (DefaultTableModel) stationtable.getModel();

        int row = stationtable.getSelectedRow();

        txt_stationid.setText(stationtable.getValueAt(row, 0).toString());
        jComboBox1.setSelectedItem(stationtable.getValueAt(row, 1).toString());
        jTextField2.setText(stationtable.getValueAt(row, 2).toString());
        jTextField3.setText(stationtable.getValueAt(row, 3).toString());
        jTextField4.setText(stationtable.getValueAt(row, 4).toString());
        jTextField5.setText(stationtable.getValueAt(row, 5).toString());
        
        sensorStation station = findsensor(stationtable.getValueAt(row, 0).
                toString(), Serialization.getAllSensorStations());
       
        String station_type = station.getStation_Type();

        if (station_type.equals("Select")) {
              station_type = "Select";
            }
        else if(station_type.equals("Flood"))
                {
                  station_type = "Flood";
                }
        else if(station_type.equals("Bin")) 
                {
                    station_type = "Bin";
                }
        else{
            station_type ="Traffic";
            }

       
    }//GEN-LAST:event_stationtableMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        
        SensorData a = new SensorData(username, userLevel, logedUser.getText());
        a.setVisible(true);
        this.hide();
        thestation.removeAll(thestation);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        AdminPanelManageUser u = new AdminPanelManageUser(username, userLevel, 
                logedUser.getText());
        u.setVisible(true);
        this.hide();
        thestation.removeAll(thestation);
    }//GEN-LAST:event_jButton7MouseClicked

    
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton8MouseClicked
    //add button click
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        String station_type, station_name, stationid, location, longitude, 
                latitude;
        if (jComboBox1.getSelectedItem().toString().equals("Select") || 
             jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()
                || jTextField4.getText().isEmpty() || jTextField5.getText().
                        isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all details...", 
                    "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            station_type = jComboBox1.getSelectedItem().toString();
            station_name = jTextField2.getText();
            location = jTextField3.getText();
            longitude = jTextField4.getText();
            latitude = jTextField5.getText();
             String stationtype;
             
        if (station_type.equals("Select")) {
              stationtype = "Select";
            }
        else if(station_type.equals("Flood"))
                {
                  stationtype = "Flood";
                }
        else if(station_type.equals("Bin")) 
                {
                    stationtype = "Bin";
                }
        else{
            stationtype ="Traffic";
            }
            
          
        ArrayList<sensorStation> stat=new ArrayList<>();
        stat=Serialization.getAllSensorStations();
        sensorStation st=new sensorStation(txt_stationid.getText(),station_type,
                station_name,location,longitude,latitude);
        stat.add(st);
        boolean cheak=Serialization.write( "DataFiles/sensorstation.txt",stat);
        if (cheak){
            JOptionPane.showMessageDialog(this, "Sucessfully Added ");
        }
       
        
        
        TableLoad();
             
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed
     

    //update button click 
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String station_type, station_name, location, longitude, latitude;
        if (jComboBox1.getSelectedItem().toString().equals("Select") || 
              jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()
                || jTextField4.getText().isEmpty() || jTextField5.getText().
                        isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all details...", 
                    "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            station_type = jComboBox1.getSelectedItem().toString();
            station_name = jTextField2.getText();
            location = jTextField3.getText();
            longitude = jTextField4.getText();
            latitude = jTextField5.getText();
            String stationtype;
             
        if (station_type.equals("Select")) {
              stationtype = "Select";
            }
        else if(station_type.equals("Flood"))
                {
                  stationtype = "Flood";
                }
        else if(station_type.equals("Bin")) 
                {
                    stationtype = "Bin";
                }
        else{
            stationtype ="Traffic";
            }
        
            sensorStation st =new sensorStation(txt_stationid.getText(),
                    station_type,station_name,location,longitude,latitude);
            ArrayList<sensorStation> updatestat=new ArrayList<sensorStation>();
            updatestat=Serialization.getAllSensorStations();
            sensorStation sen =findsensor(txt_stationid.getText(),updatestat);
            System.out.println("asda"+sen.getStation_Name());
            updatestat.remove(sen);
            updatestat.add(st);
            boolean cheak=  Serialization.write( "DataFiles/sensorstation.txt" , 
                    updatestat);
     
        if (cheak){
            JOptionPane.showMessageDialog(this, "Sucessfully Updated ");
        }
        }
        TableLoad();
     
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * 
     * @param id
     * @param updatestat
     * @return station
     */
    //search sensor
    public sensorStation findsensor(String id,ArrayList<sensorStation> 
            updatestat){
     for(sensorStation station :updatestat){
            if(id.equals(station.getSensorStation_ID())){
              
              return station;
              
            }
        }
     return null;
    }
    
    
    //delete station button click
    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        int stationNum;
        int confirm = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to delete this farm?", "Confirm", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            if (txt_stationid.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                        "Please select a farm to delete...", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                
            } 
            else{
            
            ArrayList<sensorStation> updatestat=new ArrayList<sensorStation>();
            updatestat=Serialization.getAllSensorStations();
            sensorStation sen =findsensor(txt_stationid.getText(),updatestat);
            System.out.println("asda"+sen.getStation_Name());
            updatestat.remove(sen);
           
            boolean cheak=Serialization.write( "DataFiles/sensorstation.txt" , 
                    updatestat);
           
        if (cheak){
            JOptionPane.showMessageDialog(this, "Sucessfully Deleted ");
        }
            }
        }
        TableLoad();
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SensorStation ss = new SensorStation
        (username,userLevel,logedUser.getText());
        ss.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Emergency em = new Emergency();
        em.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminPanelManageSensor spms = new AdminPanelManageSensor
        (username,userLevel,logedUser.getText());
        spms.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SensorDetails sd = new SensorDetails
        (username,userLevel,logedUser.getText());
        sd.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SensorData sda = new SensorData(username,userLevel,logedUser.getText());
        sda.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Login Us = new Login();
        Us.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void Reset_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_AllActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_Reset_AllActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AdminPanelManageSensor spms = new AdminPanelManageSensor
        (username,userLevel,logedUser.getText());
        spms.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    //reset method
     public void reset() {
        txt_stationid.setText("");
        jComboBox1.setSelectedIndex(0);
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
        
        thestation.removeAll(thestation);
        try {
            for (Station station : Serialization.deserializeStation()) {
                thestation.addStation(station);
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
     
     
     
     //table load method
     public void TableLoad() {
         
        
        DefaultTableModel model = (DefaultTableModel) stationtable.getModel();
        model.setRowCount(0);
         for(sensorStation station :Serialization.getAllSensorStations()){
         model.addRow(new Object[]{
         station.getSensorStation_ID(),
         station.getStation_Type(),
         station.getStation_Name(),
         station.getLocation(),
         station.getLatitude(),
         station.getLongitude()
         });
         }
    }
     
     /**
      * 
      * @param station_type
      * @param station_name
      * @param location
      * @param longitude
      * @param latitude
      * @return status
      */
    //add station method
    public String addStation(String station_type, String station_name, 
            String location, String longitude, String latitude) {
        String status = "";
        Station st= Station.getInstance();
        
        new Station.SingletonBuilder(station_type, station_name, location, 
                longitude, latitude);
        thestation.addStation(Station.getInstance());
        try {
            Serialization.Serialize(thestation, FILE_NAME_station);
            status = "success";
        } catch (Exception ex) {
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
            java.util.logging.Logger.getLogger(AdminPanelManageSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanelManageSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanelManageSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanelManageSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanelManageSensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Reset_All;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel logedUser;
    private javax.swing.JTable stationtable;
    private javax.swing.JTextField txt_stationid;
    // End of variables declaration//GEN-END:variables
}
