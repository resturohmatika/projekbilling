/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Devi
 */
public class PopUpAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PopUpAdmin
     */
    public PopUpAdmin() {
        initComponents();
    }

    private String getTxtPassword() {
        String password = "";
        char passwordArray[] = isipassword.getPassword();
        for (int i = 0; i < passwordArray.length; i++) {
            password += passwordArray[i];
        }
        return password;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        isipassword = new javax.swing.JPasswordField();
        idadmin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pboproject/ui/ok.png"))); // NOI18N
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pboproject/ui/cancel.png"))); // NOI18N
        cancel.setContentAreaFilled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        isipassword.setBackground(new java.awt.Color(222, 213, 114));
        isipassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        isipassword.setBorder(null);
        getContentPane().add(isipassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 400, 30));

        idadmin.setBackground(new java.awt.Color(222, 212, 114));
        idadmin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idadmin.setBorder(null);
        idadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadminActionPerformed(evt);
            }
        });
        getContentPane().add(idadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 400, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pboproject/ui/popup admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 470));

        setSize(new java.awt.Dimension(636, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadminActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String username = idadmin.getText();
        String password = isipassword.getText();
        boolean login = false;
        if (username.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Username dan Password Harus Diisi!");
        } else {
            login = true;
        }
        if (login) {
            if (username.equals("admin") && password.equals("admin")) {
                new Admin().setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new Login().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField idadmin;
    private javax.swing.JPasswordField isipassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
