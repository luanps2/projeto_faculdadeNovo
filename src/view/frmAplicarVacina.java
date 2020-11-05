/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AplicarVacina;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luan Costa
 */
public class frmAplicarVacina extends javax.swing.JFrame {

    File vacinas = new File("C:\\SistemaVacinas\\vacinas.txt"); //Arquivo com as Vacinas
    File pacientes = new File("C:\\SistemaVacinas\\pacientes.txt"); //Arquivo com os nomes dos Pacientes

    /**
     * Creates new form frmAplicarVacina
     */
    public frmAplicarVacina() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
//        txtIdadeP.setText("");
        AplicarVacina av = new AplicarVacina();
        av.CriarVacinas();

        //Listar Vacinas em JComboBox
//        try {
//            FileReader fr = new FileReader(vacinas);
//            BufferedReader br = new BufferedReader(fr);
//            String linha = br.readLine();
//
//            while (linha != null) {
//                jcVacina.addItem(linha);
//                linha = br.readLine();
//
//            }
//
//            fr.close();
//
//        } catch (IOException e) {
//            System.err.printf("Erro na leitura do Arquivo: %s.\n",
//                    e.getMessage());
//        }

        //Listar Pacientes em JComboBox
        try {
            FileReader fr = new FileReader(pacientes);
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();

            while (linha != null) {
//                jcPaciente.addItem(linha);
                linha = br.readLine();

            }

            fr.close();

        } catch (IOException e) {
            System.err.printf("Erro na leitura do Arquivo: %s.\n",
                    e.getMessage());
        }

        //Carrega Tabela com dados de agendamentos
        String agendamentos = "C:\\SistemaVacinas\\receitas.txt";
        File file = new File(agendamentos);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
//            String firstLine = br.readLine().trim();
//            String[] NomeColunas = firstLine.split(" ");
            DefaultTableModel model = (DefaultTableModel) jtAgendamentos.getModel();
//            model.setColumnIdentifiers(NomeColunas);

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" ");
                model.addRow(dataRow);
            }

        } catch (Exception ex) {
            Logger.getLogger(frmAplicarVacina.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAplicarVacina = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAgendamentos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Pesquisar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Aplicar Vacina");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 10, 125, 24);

        btnAplicarVacina.setText("Aplicar Vacina");
        btnAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarVacinaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAplicarVacina);
        btnAplicarVacina.setBounds(270, 310, 112, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/vacina.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 40, 64, 64);

        jtAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Senha Fila", "Nome", "Vacina", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtAgendamentos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 120, 640, 170);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 50, 50);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Vacinas Receitadas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarVacinaActionPerformed
        
        if (jtAgendamentos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um paciente da tabela para aplicar a vacina!");
        } else {
            int posicao = jtAgendamentos.getSelectedRow();
            String senhafila = (String) jtAgendamentos.getValueAt(posicao, 0); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:
            String nome = (String) jtAgendamentos.getValueAt(posicao, 1); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:
            String vacina = (String) jtAgendamentos.getValueAt(posicao, 2); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:
            String idade = (String) jtAgendamentos.getValueAt(posicao, 3); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:

            AplicarVacina av = new AplicarVacina();
            av.Aplicar(senhafila, nome, vacina, Integer.parseInt(idade));
            
        }

//        av.Aplicar(jcVacina.getSelectedItem().toString(), Integer.parseInt(txtIdadeP.getText()));
    }//GEN-LAST:event_btnAplicarVacinaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(frmAplicarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAplicarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAplicarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAplicarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAplicarVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarVacina;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtAgendamentos;
    // End of variables declaration//GEN-END:variables
}
