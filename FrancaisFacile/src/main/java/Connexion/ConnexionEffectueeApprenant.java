/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Connexion;

import Admin.Admin;
import Apprenant.Accueil;
import Apprenant.Bibliotheque;
import Apprenant.LesDefits;
import Apprenant.Messages;
import Apprenant.Reunion;
import Apprenant.ScoreSuivi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 *
 * @author Lenovo IdeaPad L340
 */
public class ConnexionEffectueeApprenant extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    public ConnexionEffectueeApprenant() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        Acceuil = new javax.swing.JMenuItem();
        Cours = new javax.swing.JMenuItem();
        MonProfil = new javax.swing.JMenuItem();
        Messages = new javax.swing.JMenuItem();
        Reunion = new javax.swing.JMenuItem();
        Bibliotheque = new javax.swing.JMenuItem();
        LesDefits = new javax.swing.JMenuItem();
        ScoreSuivi = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        Acceuil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Acceuil.setText("Accceuil");
        Acceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceuilActionPerformed(evt);
            }
        });
        jPopupMenu.add(Acceuil);

        Cours.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Cours.setText("Cours");
        Cours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoursActionPerformed(evt);
            }
        });
        jPopupMenu.add(Cours);

        MonProfil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        MonProfil.setText("Profile");
        MonProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonProfilActionPerformed(evt);
            }
        });
        jPopupMenu.add(MonProfil);

        Messages.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Messages.setText("Messages");
        Messages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessagesActionPerformed(evt);
            }
        });
        jPopupMenu.add(Messages);

        Reunion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Reunion.setText("Reunion");
        Reunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReunionActionPerformed(evt);
            }
        });
        jPopupMenu.add(Reunion);

        Bibliotheque.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Bibliotheque.setText("Bibliothèque");
        Bibliotheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BibliothequeActionPerformed(evt);
            }
        });
        jPopupMenu.add(Bibliotheque);

        LesDefits.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        LesDefits.setText("Les Défits");
        LesDefits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LesDefitsActionPerformed(evt);
            }
        });
        jPopupMenu.add(LesDefits);

        ScoreSuivi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ScoreSuivi.setText("Score / Suivi");
        ScoreSuivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreSuiviActionPerformed(evt);
            }
        });
        jPopupMenu.add(ScoreSuivi);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Connexion effectuée avec succès !");

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ok");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceuilActionPerformed
        // TODO add your handling code here:
        Accueil nextInterface = new Accueil();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AcceuilActionPerformed

    private void CoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoursActionPerformed
        // TODO add your handling code here:
        ConnexionEffectueeApprenant nextInterface = new ConnexionEffectueeApprenant();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CoursActionPerformed

    private void MonProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonProfilActionPerformed
        // TODO add your handling code here:
        ConnexionEffectueeApprenant nextInterface = new ConnexionEffectueeApprenant();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MonProfilActionPerformed

    private void MessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessagesActionPerformed
        // TODO add your handling code here:
        Messages nextInterface = new Messages();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MessagesActionPerformed

    private void ReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReunionActionPerformed
        // TODO add your handling code here:
        Reunion nextInterface = new Reunion();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ReunionActionPerformed

    private void BibliothequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BibliothequeActionPerformed
        // TODO add your handling code here:
        Bibliotheque nextInterface = new Bibliotheque();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BibliothequeActionPerformed

    private void LesDefitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LesDefitsActionPerformed
        // TODO add your handling code here:
        LesDefits nextInterface = new LesDefits();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LesDefitsActionPerformed

    private void ScoreSuiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreSuiviActionPerformed
        // TODO add your handling code here:
        ScoreSuivi nextInterface = new ScoreSuivi();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ScoreSuiviActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Accueil nextInterface = new Accueil();
        nextInterface.setVisible(true);
        setVisible(false);   
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ConnexionEffectueeApprenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnexionEffectueeApprenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnexionEffectueeApprenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnexionEffectueeApprenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ConnexionEffectueeApprenant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acceuil;
    private javax.swing.JMenuItem Bibliotheque;
    private javax.swing.JMenuItem Cours;
    private javax.swing.JMenuItem LesDefits;
    private javax.swing.JMenuItem Messages;
    private javax.swing.JMenuItem MonProfil;
    private javax.swing.JMenuItem Reunion;
    private javax.swing.JMenuItem ScoreSuivi;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu;
    // End of variables declaration//GEN-END:variables
}
