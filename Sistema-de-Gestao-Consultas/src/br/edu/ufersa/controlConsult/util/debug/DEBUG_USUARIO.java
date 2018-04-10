/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.util.debug;

import br.edu.ufersa.controlConsult.model.Usuario;
import java.util.List;

/**
 *
 * @author juan
 */
public class DEBUG_USUARIO extends javax.swing.JFrame {

    public static Usuario getUsuarioAleatorio() {
        List<Usuario> usuarios_teste = Usuario.findAll();
        if (usuarios_teste.isEmpty()) {
            Usuario user_temp = cadastrarAdminUser();
            usuarios_teste.add(user_temp);
        }
        Usuario uAutenticado = usuarios_teste.get(0);
        System.err.println("[DEBUG] Usuario autenticado: " + uAutenticado.getUsername());
        return uAutenticado;
    }

    public static Usuario cadastrarAdminUser() {
        Usuario u = new Usuario("admin", "admin".toCharArray());
        System.err.println("[DEBUG] Usuario admin foi inserido no banco de dados");
        try {
            u.create();
        } catch (Exception e) {
        }
        return u;
    }

    /**
     * Creates new form DEBUG_USUARIO
     */
    public DEBUG_USUARIO() {
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

        newPassword_jPasswordField = new javax.swing.JPasswordField();
        newUsername_jTextField = new javax.swing.JTextField();
        cadastrar_jButton = new javax.swing.JButton();
        status_jLabel = new javax.swing.JLabel();
        login_jButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newUsername_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUsername_jTextFieldActionPerformed(evt);
            }
        });

        cadastrar_jButton.setText("Cadastrar");
        cadastrar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_jButtonActionPerformed(evt);
            }
        });

        status_jLabel.setText("Sem status");

        login_jButton.setText("Login");
        login_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_jButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newUsername_jTextField)
                            .addComponent(newPassword_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastrar_jButton)
                            .addComponent(login_jButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(status_jLabel)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newUsername_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPassword_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrar_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login_jButton)))
                .addGap(18, 18, 18)
                .addComponent(status_jLabel)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUsername_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUsername_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUsername_jTextFieldActionPerformed

    private void cadastrar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_jButtonActionPerformed
        String username = newUsername_jTextField.getText();
        char[] password_raw = newPassword_jPasswordField.getPassword();
        if (!username.isEmpty() && password_raw.length > 0) {
            try {
                new Usuario(username, password_raw).create();
                status_jLabel.setText("Cadastrado.");
            } catch (Exception e) {
                status_jLabel.setText("Error em cadastro.");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cadastrar_jButtonActionPerformed

    private void login_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_jButtonActionPerformed
        // TODO add your handling code here:
        String username = newUsername_jTextField.getText();
        char[] password_raw = newPassword_jPasswordField.getPassword();
        if (!username.isEmpty() && password_raw.length > 0) {
            try {
                new Usuario(username, password_raw).login();
                status_jLabel.setText("Autenticado.");
            } catch (IllegalAccessException e) {
                status_jLabel.setText("Não autenticado!");
            }
        }

    }//GEN-LAST:event_login_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DEBUG_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEBUG_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEBUG_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEBUG_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEBUG_USUARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_jButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login_jButton;
    private javax.swing.JPasswordField newPassword_jPasswordField;
    private javax.swing.JTextField newUsername_jTextField;
    private javax.swing.JLabel status_jLabel;
    // End of variables declaration//GEN-END:variables
}
