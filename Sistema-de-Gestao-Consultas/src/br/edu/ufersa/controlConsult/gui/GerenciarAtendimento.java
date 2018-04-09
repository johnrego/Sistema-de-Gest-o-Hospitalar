/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.gui;

import br.edu.ufersa.controlConsult.model.Consulta;
import br.edu.ufersa.controlConsult.model.jpaDAO.exceptions.NonexistentEntityException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leone
 */
public class GerenciarAtendimento extends javax.swing.JFrame {

    /**
     * Creates new form GerenciarAtendimento
     */
    private List<Consulta> consultas;
    private int posicao=0;
    public GerenciarAtendimento() {
        initComponents();
    }
    
    public GerenciarAtendimento(List<Consulta> con){
        initComponents();
        this.consultas = con;
        nome_medico.setText(consultas.get(0).getMedico().getPessoa().getNome());
        nome_paciente_atual.setText(consultas.get(0).getPaciente().getPessoa().getNome());
        numero_paciente_atual.setText("1");
        cpf_paciente_atual.setText(consultas.get(0).getPaciente().getPessoa().getCpf());
        Date data = new Date();
        consultas.get(0).setData_inicio(data);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome_medico = new javax.swing.JLabel();
        nome_paciente_atual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpf_paciente_atual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        numero_paciente_atual = new javax.swing.JLabel();
        j = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Atendimentos");

        nome_medico.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nome_medico.setText("___________");

        nome_paciente_atual.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nome_paciente_atual.setText("Fulano de Tal");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Médico Responsável: ");

        cpf_paciente_atual.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cpf_paciente_atual.setText("____________");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Paciente nº: ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("CPF:");

        jButton1.setText("Próximo Atendimento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        numero_paciente_atual.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        numero_paciente_atual.setText("_____");

        j.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        j.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_medico))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cpf_paciente_atual))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero_paciente_atual)
                        .addGap(18, 18, 18)
                        .addComponent(j)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_paciente_atual)))
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome_medico))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_paciente_atual)
                    .addComponent(jLabel5)
                    .addComponent(numero_paciente_atual)
                    .addComponent(j))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf_paciente_atual)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        posicao++;
        if(posicao==(consultas.size()-1)){
            jButton1.setText("Finalizar Atendimento");
        }
        if(posicao==consultas.size()){
            Date data = new Date();
            consultas.get(posicao-1).setData_fim(data);
            long tempo_total=0l;
            for(Consulta c : consultas){
                tempo_total = tempo_total + (c.getData_fim().getTime() - c.getData_inicio().getTime());
                try {
                    c.update();
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(GerenciarAtendimento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            long tempo_medio = tempo_total/consultas.size();
            long diffMinutestotal = tempo_total / (60 * 1000) % 60;
            long diffMinutesmedio = tempo_medio / (60 * 1000) % 60;
            AtendimentoFinalizado af = new AtendimentoFinalizado(String.valueOf(diffMinutestotal)+ " minutos",String.valueOf(diffMinutesmedio)+ " minutos");
            af.setVisible(true);
            af.setLocationRelativeTo(null);
        }else{
            Date data = new Date();
            consultas.get(posicao-1).setData_fim(data);
            consultas.get(posicao).setData_inicio(data);
            numero_paciente_atual.setText(String.valueOf(posicao+1));
            nome_paciente_atual.setText(consultas.get(posicao).getPaciente().getPessoa().getNome());
            cpf_paciente_atual.setText(consultas.get(posicao).getPaciente().getPessoa().getCpf());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpf_paciente_atual;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nome_medico;
    private javax.swing.JLabel nome_paciente_atual;
    private javax.swing.JLabel numero_paciente_atual;
    // End of variables declaration//GEN-END:variables
}
