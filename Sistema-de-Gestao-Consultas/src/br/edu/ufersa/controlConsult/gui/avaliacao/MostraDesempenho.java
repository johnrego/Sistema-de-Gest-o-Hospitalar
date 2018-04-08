/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.controlConsult.gui.avaliacao;

import br.edu.ufersa.controlConsult.model.Pessoa;
import br.edu.ufersa.controlConsult.model.Questionario;
import br.edu.ufersa.controlConsult.model.jpaDAO.JpaFactory;
import br.edu.ufersa.controlConsult.model.jpaDAO.QuestionarioJpaController;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author asus
 */
public class MostraDesempenho extends javax.swing.JFrame {

    /**
     * Creates new form MostraDesempenho
     */
    public MostraDesempenho() {
        initComponents();
    }
    private Pessoa pessoa;
    public MostraDesempenho(Pessoa p){
        this.pessoa = p;
        initComponents();
        nome_medico.setText(pessoa.getNome());
        especialidade.setText(pessoa.getMedico().getEspecialidade().getNome());
        mqp1.setText(String.valueOf(Questionario.mediaQ(pessoa.getMedico(), "1")));
        mqp2.setText(String.valueOf(Questionario.mediaQ(pessoa.getMedico(), "2")));
        mqp3.setText(String.valueOf(Questionario.mediaQ(pessoa.getMedico(), "3")));
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
        jLabel1 = new javax.swing.JLabel();
        nome_jLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nome_jLabel2 = new javax.swing.JLabel();
        nome_jLabel3 = new javax.swing.JLabel();
        mt = new javax.swing.JLabel();
        hs = new javax.swing.JLabel();
        nome_medico = new javax.swing.JLabel();
        especialidade = new javax.swing.JLabel();
        nome_jLabel5 = new javax.swing.JLabel();
        mqp1 = new javax.swing.JLabel();
        nome_jLabel6 = new javax.swing.JLabel();
        mqp2 = new javax.swing.JLabel();
        nome_jLabel7 = new javax.swing.JLabel();
        mqp3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Desempenho");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Desempenho Médico");

        nome_jLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome_jLabel.setText("Nome:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Especialidade:");

        nome_jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome_jLabel2.setText("Média de Tempo em Consulta:");

        nome_jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome_jLabel3.setText("Quantidade de Horas Trabalhada na Última Semana:");

        mt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mt.setText("_____");

        hs.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hs.setText("_____");

        nome_medico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome_medico.setText("___________");

        especialidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        especialidade.setText("___________");

        nome_jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome_jLabel5.setText("Média Questionário Paciente na questão 1:");

        mqp1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mqp1.setText("_____");

        nome_jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome_jLabel6.setText("Média Questionário Paciente na questão 2:");

        mqp2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mqp2.setText("_____");

        nome_jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome_jLabel7.setText("Média Questionário Paciente na questão 3:");

        mqp3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mqp3.setText("_____");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome_jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mqp1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(especialidade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome_medico))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome_jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hs))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome_jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mt))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nome_jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mqp2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nome_jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mqp3)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome_jLabel)
                    .addComponent(nome_medico))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(especialidade))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome_jLabel3)
                    .addComponent(hs))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome_jLabel2))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_jLabel5)
                    .addComponent(mqp1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_jLabel6)
                    .addComponent(mqp2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_jLabel7)
                    .addComponent(mqp3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(MostraDesempenho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostraDesempenho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostraDesempenho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostraDesempenho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostraDesempenho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel especialidade;
    private javax.swing.JLabel hs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mqp1;
    private javax.swing.JLabel mqp2;
    private javax.swing.JLabel mqp3;
    private javax.swing.JLabel mt;
    private javax.swing.JLabel nome_jLabel;
    private javax.swing.JLabel nome_jLabel2;
    private javax.swing.JLabel nome_jLabel3;
    private javax.swing.JLabel nome_jLabel5;
    private javax.swing.JLabel nome_jLabel6;
    private javax.swing.JLabel nome_jLabel7;
    private javax.swing.JLabel nome_medico;
    // End of variables declaration//GEN-END:variables
}
