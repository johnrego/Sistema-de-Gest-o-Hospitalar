/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.gui;

import br.edu.ufersa.controlConsult.model.Frequencia;
import br.edu.ufersa.controlConsult.model.Medico;
import java.util.SortedSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan
 */
public class ListarFrequencia extends javax.swing.JFrame {

    private Medico medico;

    /**
     * Creates new form ListarFrequencia
     */
    public ListarFrequencia(Medico medico) {
        initComponents();
        this.setMedico(medico);
        preencherCampos();
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    private void preencherCampos() {
        SortedSet<Frequencia> frequencias = null;
        try {
            medicoNome_jTextField.setText(medico.getPessoa().getNome());
            frequencias = medico.getListFrequencia();
        } catch (NullPointerException e) {
            medicoNome_jTextField.setText("<Sem Informações>");
        }

        // Artifício para bloquear alterações nos campos da jTable.
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        model.addColumn("Entrada");
        model.addColumn("Saída");
        model.addColumn("Usuário Responsável pelos registros");
        if (frequencias != null) {
            for (Frequencia f : frequencias) {
                String entrada = (f.getEntrada() != null) ? f.getEntrada().toString() : "-";
                String saida = (f.getSaida() != null) ? f.getSaida().toString() : "-";
                model.addRow(new String[]{
                    entrada, saida, f.getUsuario().getUsername()
                });
            }
        } else {
            model.addRow(new String[]{"-", "-", "-"});
        }
        jTable.setModel(model);
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
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        medicoNome_jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Entrada", "Saída", "Usuario responsável"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Nome do Funcionário: ");
        jPanel1.add(jLabel1);

        medicoNome_jTextField.setEditable(false);
        jPanel1.add(medicoNome_jTextField);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListarFrequencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFrequencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFrequencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFrequencia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFrequencia(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField medicoNome_jTextField;
    // End of variables declaration//GEN-END:variables
}
