/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofacebook;

import facebook4j.FacebookException;
import facebook4j.conf.ConfigurationBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Int extends javax.swing.JFrame {
    Metodos uhum = new Metodos();
    
    /**
     * Creates new form Int
     */
    public Int() {
        initComponents();
        uhum.iniciar();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bestado = new javax.swing.JButton();
        Blike = new javax.swing.JButton();
        Bfoto = new javax.swing.JButton();
        Btema = new javax.swing.JButton();
        Bcomfoto = new javax.swing.JButton();
        Bcoments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FEISBU");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        Bestado.setBackground(new java.awt.Color(0, 102, 204));
        Bestado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bestado.setForeground(new java.awt.Color(255, 255, 255));
        Bestado.setText("Escribir estado");
        Bestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BestadoActionPerformed(evt);
            }
        });

        Blike.setBackground(new java.awt.Color(0, 102, 204));
        Blike.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Blike.setForeground(new java.awt.Color(255, 255, 255));
        Blike.setText("Dar Like");
        Blike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlikeActionPerformed(evt);
            }
        });

        Bfoto.setBackground(new java.awt.Color(0, 102, 204));
        Bfoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bfoto.setForeground(new java.awt.Color(255, 255, 255));
        Bfoto.setText("Publicar foto");
        Bfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfotoActionPerformed(evt);
            }
        });

        Btema.setBackground(new java.awt.Color(0, 102, 204));
        Btema.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btema.setForeground(new java.awt.Color(255, 255, 255));
        Btema.setText("Buscar tema");
        Btema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtemaActionPerformed(evt);
            }
        });

        Bcomfoto.setBackground(new java.awt.Color(0, 102, 204));
        Bcomfoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bcomfoto.setForeground(new java.awt.Color(255, 255, 255));
        Bcomfoto.setText("Comentar foto");
        Bcomfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcomfotoActionPerformed(evt);
            }
        });

        Bcoments.setBackground(new java.awt.Color(0, 102, 204));
        Bcoments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bcoments.setForeground(new java.awt.Color(255, 255, 255));
        Bcoments.setText("Obtener comentarios");
        Bcoments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcomentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bestado, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(Btema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bcomfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Bfoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bcoments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Blike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bestado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blike, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btema, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcomfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcoments, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    
    
    private void BestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BestadoActionPerformed
        try {
            uhum.estado();
        } catch (FacebookException ex) {
            Logger.getLogger(Int.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BestadoActionPerformed

    private void BlikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlikeActionPerformed
        try {
            uhum.darLike();
        } catch (FacebookException ex) {
            Logger.getLogger(Int.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BlikeActionPerformed

    private void BfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfotoActionPerformed
        try {
            uhum.postImagen();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Int.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FacebookException ex) {
            Logger.getLogger(Int.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BfotoActionPerformed

    private void BtemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtemaActionPerformed
        try {
            uhum.buscarTema();
        } catch (FacebookException ex) {
            Logger.getLogger(Int.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtemaActionPerformed

    private void BcomfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcomfotoActionPerformed
        try {
            uhum.comentarFoto();
        } catch (FacebookException ex) {
            Logger.getLogger(Int.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BcomfotoActionPerformed

    private void BcomentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcomentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcomentsActionPerformed

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
            java.util.logging.Logger.getLogger(Int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Int().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcoments;
    private javax.swing.JButton Bcomfoto;
    private javax.swing.JButton Bestado;
    private javax.swing.JButton Bfoto;
    private javax.swing.JButton Blike;
    private javax.swing.JButton Btema;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
