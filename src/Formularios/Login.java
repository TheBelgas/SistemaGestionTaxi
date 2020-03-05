/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Configuracion.Sistema;
import Entidades.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.jTextFUser.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jBCreateAccount = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextFUser = new javax.swing.JTextField();
        jlLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(546, 265));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CREATE A NEW");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 30));

        jBCreateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/User.png"))); // NOI18N
        jBCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(jBCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 160, 171));

        jBLogin.setText("LOGIN");
        jBLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 250, 30));

        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPasswordField1.setText("            ");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseMoved(evt);
            }
        });
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseExited(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 250, -1));

        jTextFUser.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jTextFUser.setBorder(null);
        jTextFUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 250, -1));

        jlLogin.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(0, 0, 0));
        jlLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin.setText("LOGIN");
        getContentPane().add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 40, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ACCOUNT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, 30));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonCerrar2.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 40, 40));

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonVolver.png"))); // NOI18N
        jButtonVolver.setBorder(null);
        jButtonVolver.setBorderPainted(false);
        jButtonVolver.setContentAreaFilled(false);
        jButtonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 400));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        Sistema.usuario = Sistema.usuarios.validar(this.jTextFUser.getText(), this.jPasswordField1.getText());
        if(Sistema.usuario!=null){
            JOptionPane.showMessageDialog(this, "BIENVENIDO "+Sistema.usuario.getNombre()+"!");
            if(Sistema.usuario instanceof Cliente){
                InicioCliente inicioAd= new InicioCliente();
                inicioAd.setVisible(true);
                inicioAd.setLocationRelativeTo(null);
                this.dispose();
            }else if(Sistema.usuario instanceof Administrador){
                InicioAdministrador inicioAd= new InicioAdministrador();
                inicioAd.setVisible(true);
                inicioAd.setLocationRelativeTo(null);
                this.dispose();
            }
        }else{
        Icon i = new ImageIcon(getClass().getResource("/Recursos/error.png"));
        JOptionPane.showMessageDialog(null, "Error!",null,JOptionPane.INFORMATION_MESSAGE,i);
        }
        
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jBCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreateAccountActionPerformed
        CreateAccount C = new CreateAccount();
        C.setVisible(true);
        C.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBCreateAccountActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Inicio i= new Inicio();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        this.jPasswordField1.transferFocus();
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
       //
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MouseExited

    private void jPasswordField1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MouseMoved

    private void jTextFUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFUserActionPerformed
        this.jTextFUser.transferFocus();
    }//GEN-LAST:event_jTextFUserActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        this.jPasswordField1.setText(null);
    }//GEN-LAST:event_jPasswordField1FocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCreateAccount;
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFUser;
    private javax.swing.JLabel jlLogin;
    // End of variables declaration//GEN-END:variables
}