/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.gui;

import br.edu.ufersa.controlConsult.gui.FormPessoa.TipoContextoEnum;
import br.edu.ufersa.controlConsult.model.Pessoa;
import br.edu.ufersa.controlConsult.model.Pessoa.TipoPessoaEnum;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author juan
 */
public class ListarPessoa extends javax.swing.JFrame {

    private TipoPessoaEnum tipoPessoa;

    /**
     * Creates new form DEBUG_USUARIO
     */
    public ListarPessoa(TipoPessoaEnum tipoPessoa) {
        initComponents();
        this.setTipoPessoa(tipoPessoa);
        load(tipoPessoa);
    }

    private void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
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
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        atualizar_jButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        edit_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 150));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        atualizar_jButton.setText("Atualizar");
        atualizar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar_jButtonActionPerformed(evt);
            }
        });
        jPanel2.add(atualizar_jButton);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        edit_jButton.setText("Editar");
        edit_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_jButtonActionPerformed(evt);
            }
        });
        jPanel1.add(edit_jButton);

        getContentPane().add(jPanel1, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Pessoa pessoa = pessoas.get(jList1.getSelectedIndex());
            BuscPessoa bp = new BuscPessoa(tipoPessoa, pessoa);
            bp.preencherFormularioPessoa();
            bp.setVisible(true);
            bp.setLocationRelativeTo(null);
        } catch (IndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_jButtonActionPerformed
        try {
            Pessoa pessoa = pessoas.get(jList1.getSelectedIndex());
            FormPessoa fp = new FormPessoa(TipoContextoEnum.ATUALIZAR, tipoPessoa, pessoa);
            fp.setVisible(true);
            fp.setLocationRelativeTo(null);
        } catch (IndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_edit_jButtonActionPerformed

    private void atualizar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar_jButtonActionPerformed
        load(tipoPessoa);
    }//GEN-LAST:event_atualizar_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ListarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarPessoa(TipoPessoaEnum.AMBOS).setVisible(true);
            }
        });
    }
    private List<Pessoa> pessoas;

    private void load(TipoPessoaEnum tipoPessoa) {
        DefaultListModel<String> model = new DefaultListModel<>();
        switch (tipoPessoa) {
            case AMBOS:
                pessoas = Pessoa.findAll();
                break;
            case MEDICO:
                pessoas = Pessoa.findMedicos();
                break;
            case PACIENTE:
                pessoas = Pessoa.findPacientes();
                break;
        }
        for (Pessoa p : pessoas) {
            model.addElement(p.toString());
        }
        jList1.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar_jButton;
    private javax.swing.JButton edit_jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
