/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Class.Serialization.Serialization;
import Class.user.SendEmail;
import Class.user.SetOfRandomCode;
import Class.user.SetOfUsers;
import Class.user.User;
import Class.user.randomCode;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilina
 */
public class ForgetPassword extends javax.swing.JFrame {

    
    public static SetOfUsers searchUsers = new SetOfUsers();
    public static final String FILE_NAME_Users = "DataFiles/Users.txt";

    public static SetOfRandomCode searchCode = new SetOfRandomCode();
    public static final String FILE_NAME_RandomCodes = "DataFiles/RandomCodes.txt";

    /**
     * Creates new form Forget_Password
     */
    public ForgetPassword() {
        initComponents();
        try {
            for (User member : Serialization.deserializeUsers()) {
                searchUsers.addUser(member);
                member.print();
            }

            for (randomCode code : Serialization.deserializeRandomCode()) {
                searchCode.addCode(code);
                code.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtsenderEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtVerificationCode1 = new javax.swing.JTextField();
        btnancSave = new javax.swing.JButton();
        btnancSave1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1012, 552));
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Enter Email Address           :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(268, 259, 187, 17);

        txtsenderEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenderEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtsenderEmail);
        txtsenderEmail.setBounds(489, 249, 199, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Enter Verification Code      :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(268, 320, 188, 17);
        getContentPane().add(txtVerificationCode1);
        txtVerificationCode1.setBounds(489, 312, 199, 30);

        btnancSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnancSave.setText("Send");
        btnancSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancSaveMouseClicked(evt);
            }
        });
        getContentPane().add(btnancSave);
        btnancSave.setBounds(746, 255, 67, 25);

        btnancSave1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnancSave1.setText("OK");
        btnancSave1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancSave1MouseClicked(evt);
            }
        });
        getContentPane().add(btnancSave1);
        btnancSave1.setBounds(746, 316, 57, 25);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel2.setText("We have send a verification code to your email ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(118, 11, 777, 42);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Resend Code");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(489, 372, 103, 26);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 21, 65, 36);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-main.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-70, 120, 1140, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsenderEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenderEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenderEmailActionPerformed

    //email save button click
    private void btnancSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancSaveMouseClicked
        // TODO add your handling code here:
         if (txtsenderEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the email address...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            String status = "";

            for (User user : searchUsers) {
                if (user.getUsername().equals(txtsenderEmail.getText())) {
                    status = "true";
                    break;
                } else {
                    status = "false";
                }
            }

            if (status == "true") {
                String stat = sendMessage(txtsenderEmail.getText());
                if (stat == "success") {
                    JOptionPane.showMessageDialog(this, "Varification Code has been send to your email...\n"
                            + " Please type the code below to reset your password ", "Next Step", JOptionPane.INFORMATION_MESSAGE);
                    searchCode.removeAll(searchCode);
                    try {
                        for (randomCode code : Serialization.deserializeRandomCode()) {
                            searchCode.addCode(code);
                            code.print();
                        }
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Seems to be a internet connection error.. try again later... ", "Error", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(this, "Please Register to the system...", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        
        
    }//GEN-LAST:event_btnancSaveMouseClicked

    //resend verification code
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        if (txtsenderEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the email address...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            String status = "";

            for (User user : searchUsers) {
                if (user.getUsername().equals(txtsenderEmail.getText())) {
                    status = "true";
                    break;
                } else {
                    status = "false";
                }
            }

            if (status == "true") {
                String stat = sendMessage(txtsenderEmail.getText());
                if (stat == "success") {
                    JOptionPane.showMessageDialog(this, "Varification Code has been send to your email...\n"
                            + " Please type the code below to reset your password ", "Next Step", JOptionPane.INFORMATION_MESSAGE);
                    searchCode.removeAll(searchCode);
                    try {
                        for (randomCode code : Serialization.deserializeRandomCode()) {
                            searchCode.addCode(code);
                            code.print();
                        }
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Seems to be a internet connection error.. try again later... ", "Error", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(this, "Please Register to the system...", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jLabel9MouseClicked

    //save button click
    private void btnancSave1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancSave1MouseClicked
        // TODO add your handling code here:
        
        String status = null;
        try {
            status = validateCode(txtsenderEmail.getText(), txtVerificationCode1.getText());
        } catch (IOException ex) {
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (status == "success") {
            resetPassword r = new resetPassword(txtsenderEmail.getText());
            r.setVisible(true);
            searchCode.removeAll(searchCode);
            txtsenderEmail.setText("");
            txtVerificationCode1.setText("");
            this.hide();

        } else {
            JOptionPane.showMessageDialog(this, "Varification code not match...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnancSave1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login L = new Login();
        L.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * 
     * @param email
     * @param code
     * @return status
     * @throws IOException 
     */
    //validate code
    public static String validateCode(String email, String code) throws IOException {
        String status = "";
        for (randomCode random : searchCode) {

            if (random.getEmail().equals(email) && random.getRandomCode().equals(code)) {
                status = "success";
                searchCode.removeCode(random);
                
                    Serialization.Serialize(searchCode, FILE_NAME_RandomCodes);
                
                break;
            } else {
                status = "error";

            }
        }

        return status;
    }
    
    //get code
    public static String getAlphaNumbericRandom() {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int numberOfCodes = 0;
        String code = "";
        while (numberOfCodes < 7) {
            char c = chars.charAt((int) (Math.random() * chars.length()));
            code += c;
            numberOfCodes++;
        }
        return code;
    }
    
    /**
     * 
     * @param email
     * @return status
     */
    //send email method
    public static String sendMessage(String email) {
        String verifyCode = getAlphaNumbericRandom();
        String status = "";
        try {
            SendEmail mailSender;
            mailSender = new SendEmail(email, "Verification Message", "Your Verification Code is : " + verifyCode);

            new randomCode.SingletonBuilder(email, verifyCode).build();
            searchCode.addCode(randomCode.getInstance());
            try {
                Serialization.Serialize(searchCode, FILE_NAME_RandomCodes);
                status = "success";
            } catch (Exception ex) {
                status = "fail";
                System.out.println(ex.getMessage());
            }

        } catch (Exception ex) {
            status = "error";
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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnancSave;
    private javax.swing.JButton btnancSave1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtVerificationCode1;
    private javax.swing.JTextField txtsenderEmail;
    // End of variables declaration//GEN-END:variables
}
