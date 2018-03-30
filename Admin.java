/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboproject;

import java.awt.GridBagLayout;

/**
 *
 * @author Devi
 */
public class Admin extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    Pc pc;
    Transaksi tr;
    Log lg;
    
    public Admin() {
        initComponents();
        
        pc = new Pc();
        tr = new Transaksi();
        lg = new Log();
               
        isi.setLayout(layout);
        isi.add(pc);
        isi.add(tr);
        isi.add(lg);
        
        pc.setVisible(false);
        tr.setVisible(false);
        lg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isi = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        TR = new javax.swing.JButton();
        LOG = new javax.swing.JButton();
        PC = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(isi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 990, 380));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 220, 140, 20));

        jLabel3.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel3.setText("Paket");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel4.setText("Waktu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel5.setText("Waktu Tersisa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel6.setText("Total Harga");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        getContentPane().add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 270, 140, 20));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        getContentPane().add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 320, 140, 20));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        getContentPane().add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 170, 140, 20));

        TR.setText("TRANSAKSI");
        TR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRActionPerformed(evt);
            }
        });
        getContentPane().add(TR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 100, 60));

        LOG.setText("LOG");
        LOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGActionPerformed(evt);
            }
        });
        getContentPane().add(LOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 100, 60));

        PC.setText("PC");
        PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCActionPerformed(evt);
            }
        });
        getContentPane().add(PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 60));

        jTabbedPane1.setBackground(new java.awt.Color(212, 186, 116));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jTabbedPane1.addTab("PC", jLabel2);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jTabbedPane1.addTab("TRANSAKSI", jLabel7);
        jTabbedPane1.addTab("LOG", jLabel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 410, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pboproject/ui/admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCActionPerformed
    
    }//GEN-LAST:event_PCActionPerformed

    private void TRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRActionPerformed
    
    }//GEN-LAST:event_TRActionPerformed

    private void LOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGActionPerformed
        pc.setVisible(false);
        tr.setVisible(false);
        lg.setVisible(true);
    }//GEN-LAST:event_LOGActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        pc.setVisible(true);
        tr.setVisible(false);
        lg.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        pc.setVisible(false);
        tr.setVisible(true);
        lg.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOG;
    private javax.swing.JButton PC;
    private javax.swing.JButton TR;
    private javax.swing.JPanel isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
