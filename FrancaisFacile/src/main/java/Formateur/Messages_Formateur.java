/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formateur;

import Apprenant.Accueil;
import Apprenant.Bibliotheque;
import Apprenant.Cours;
import Apprenant.EnvoyeMessage;
import Apprenant.LesDefits;
//import Messages.Messages;
import Apprenant.Reunion;
import Apprenant.ScoreSuivi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


/**
 *
 * @author Lenovo IdeaPad L340
 */
public class Messages_Formateur extends javax.swing.JFrame {
    
    //Costume Tree Module
    
    /**
     * Creates new form Principale
     */
    DefaultTreeModel model;
    public Messages_Formateur()
     {
        initComponents();
        Load();
    }
    DefaultMutableTreeNode Message = new DefaultMutableTreeNode("Cours");
    public void Load()
    {
        DefaultMutableTreeNode Vocabulaire = new DefaultMutableTreeNode("Vocabulaire");
        Vocabulaire.add(new DefaultMutableTreeNode("-> 12/06/2022"));
        Vocabulaire.add(new DefaultMutableTreeNode("<- 18/08/2022"));
        
        DefaultMutableTreeNode Conjugaison = new DefaultMutableTreeNode("Conjugaison");
        Conjugaison.add(new DefaultMutableTreeNode("<- 11/11/2022"));
        Conjugaison.add(new DefaultMutableTreeNode("-> 01/01/2023"));
        
        DefaultMutableTreeNode Grammaire = new DefaultMutableTreeNode("Grammaire");
        Grammaire.add(new DefaultMutableTreeNode("-> 14/08/2022"));
        Grammaire.add(new DefaultMutableTreeNode("-> 15/11/2022"));
        
        DefaultMutableTreeNode Orthographe = new DefaultMutableTreeNode("Orthographe");
        Orthographe.add(new DefaultMutableTreeNode("<- 07/08/2022"));
        Orthographe.add(new DefaultMutableTreeNode("<- 30/11/2022"));
        

        Message.add(Vocabulaire);
        Message.add(Conjugaison);
        Message.add(Grammaire);
        Message.add(Orthographe);
        
        model = (DefaultTreeModel)jTree1.getModel();
        model.setRoot(Message);
        jTree1.setModel(model);
 
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
        Formations = new javax.swing.JMenuItem();
        MonProfil = new javax.swing.JMenuItem();
        Messages = new javax.swing.JMenuItem();
        Reunion = new javax.swing.JMenuItem();
        LesExercices = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        ContenuMsg = new javax.swing.JTextPane();

        Acceuil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Acceuil.setText("Accceuil");
        Acceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceuilActionPerformed(evt);
            }
        });
        jPopupMenu.add(Acceuil);

        Formations.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Formations.setText("Formations");
        Formations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormationsActionPerformed(evt);
            }
        });
        jPopupMenu.add(Formations);

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

        LesExercices.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        LesExercices.setText("Exercices");
        LesExercices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LesExercicesActionPerformed(evt);
            }
        });
        jPopupMenu.add(LesExercices);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\ETUDE\\SEMESTRE 05\\IHM\\FrançaisFacile\\FrancaisFacile\\src\\main\\java\\Images\\Messages.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ETUDE\\SEMESTRE 05\\IHM\\FrançaisFacile\\FrancaisFacile\\src\\main\\java\\Images\\Menu.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("  Menu");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\ETUDE\\SEMESTRE 05\\IHM\\FrançaisFacile\\FrancaisFacile\\src\\main\\java\\Images\\Retour.png")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("  Retour");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Nouveau message +");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTree1.setBackground(new java.awt.Color(255, 255, 255));
        jTree1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTree1.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reçu");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("12/08/2022");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("27/09/2022");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("02/10/2022");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Envoyées");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("19/05/2022");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("24/06/2022");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setFocusCycleRoot(true);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        ContenuMsg.setBackground(new java.awt.Color(255, 255, 255));
        ContenuMsg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(ContenuMsg);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jScrollPane4)))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(243, 243, 243)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Accueil_Formateur nextInterface = new Accueil_Formateur();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        EnvoyeMessage nextInterface = new EnvoyeMessage();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        // TODO add your handling code here:
        
        Message = (DefaultMutableTreeNode)jTree1.getSelectionPath().getLastPathComponent();
        ContenuMsg.setText(Message.getUserObject().toString());
        
         String select =  Message.getUserObject().toString();
        
         if(select.equals("-> 12/06/2022"))
         {
             ContenuMsg.setText("Quels sont les conseils que tu donnerais à quelqu'un qui vient de commencer à apprendre le français?");
         }
         else if(select.equals("<- 18/08/2022"))
         {
              ContenuMsg.setText("Essayez de trouver des films ou des émissions de télévision en français pour améliorer votre compréhension de la langue.");
         }
          else if(select.equals("<- 11/11/2022"))
         {
              ContenuMsg.setText("Faites des exercices de grammaire et de conjugaison régulièrement pour renforcer vos connaissances.");
         }
         else if(select.equals("-> 01/01/2023"))
         {
              ContenuMsg.setText("Bonne année pour touts le monde !");
         }
        
         else if(select.equals("-> 14/08/2022"))
         {
             ContenuMsg.setText("Quels sont tes objectifs à court et à long terme pour ton apprentissage du français?");
         }
          else if(select.equals("<- 15/11/2022"))
         {
              ContenuMsg.setText("Ne soyez pas trop dur avec vous-même si vous faites des erreurs. Tout le monde fait des erreurs quand il apprend une nouvelle langue, c'est normal.");
         }
         else if(select.equals("<- 07/08/2022"))
         {
              ContenuMsg.setText("Il est important de toujours avoir un dictionnaire à portée de main pendant que vous étudiez le français.");
         }
          else if(select.equals("<- 30/11/2022"))
         {
              ContenuMsg.setText("Ne soyez pas trop dur avec vous-même si vous faites des erreurs. Tout le monde fait des erreurs quand il apprend une nouvelle langue, c'est normal.");
         }
    }//GEN-LAST:event_jTree1MouseClicked

    private void AcceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceuilActionPerformed
        // TODO add your handling code here:
        Accueil_Formateur nextInterface = new Accueil_Formateur();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AcceuilActionPerformed

    private void FormationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormationsActionPerformed
        // TODO add your handling code here:
        Formations nextInterface = new Formations();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_FormationsActionPerformed

    private void MonProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonProfilActionPerformed
        // TODO add your handling code here:
        MonProfil_Formateur nextInterface = new MonProfil_Formateur();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MonProfilActionPerformed

    private void MessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessagesActionPerformed
        // TODO add your handling code here:
        Messages_Formateur nextInterface = new Messages_Formateur();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MessagesActionPerformed

    private void ReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReunionActionPerformed
        // TODO add your handling code here:
        Reunion_Formateur nextInterface = new Reunion_Formateur();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ReunionActionPerformed

    private void LesExercicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LesExercicesActionPerformed
        // TODO add your handling code here:
        Exercices nextInterface = new Exercices();
        nextInterface.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LesExercicesActionPerformed

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
            java.util.logging.Logger.getLogger(Messages_Formateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Messages_Formateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Messages_Formateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Messages_Formateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Messages_Formateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acceuil;
    private javax.swing.JTextPane ContenuMsg;
    private javax.swing.JMenuItem Formations;
    private javax.swing.JMenuItem LesExercices;
    private javax.swing.JMenuItem Messages;
    private javax.swing.JMenuItem MonProfil;
    private javax.swing.JMenuItem Reunion;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
