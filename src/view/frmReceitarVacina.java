/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AgendarConsulta;
import controller.AplicarVacina;
import controller.ReceitarVacina;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luan Costa
 */
public class frmReceitarVacina extends javax.swing.JFrame {
    AgendarConsulta a = new AgendarConsulta();

    File vacinas = new File("C:\\SistemaVacinas\\vacinas.txt"); //Arquivo com as Vacinas
    File pacientes = new File("C:\\SistemaVacinas\\pacientes.txt"); //Arquivo com os nomes dos Pacientes

    ReceitarVacina r = new ReceitarVacina();
    String[] dados = r.PopularPaciente();

    /**
     * Creates new form frmReceitarVacina
     */
    public frmReceitarVacina() {

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        AplicarVacina av = new AplicarVacina();
        av.CriarVacinas();

        Random gerador = new Random();
        int cod = gerador.nextInt(999);

        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";

        Random random = new Random();

        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < 2; i++) {
            index = random.nextInt(letras.length());
            armazenaChaves += letras.substring(index, index + 1);
        }
        System.out.println(armazenaChaves);
        txtSenhaFila.setText((armazenaChaves + Integer.toString(cod)));

        //Listar Vacinas em JComboBox
        try {
            FileReader fr = new FileReader(vacinas);
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();

            while (linha != null) {
                jcVacina.addItem(linha);
                linha = br.readLine();

            }

            fr.close();

        } catch (IOException e) {
            System.err.printf("Erro na leitura do Arquivo: %s.\n",
                    e.getMessage());
        }

        jcPaciente.addItem(dados[0]);

        //Listar Pacientes em JComboBox
        try {
            FileReader fr = new FileReader(pacientes);
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();

            while (linha != null) {
                jcPaciente.addItem(linha);
                linha = br.readLine();

            }

            fr.close();

        } catch (IOException e) {
            System.err.printf("Erro na leitura do Arquivo: %s.\n",
                    e.getMessage());
        }

        //Carrega Tabela com dados de agendamentos
        String agendamentos = "C:\\SistemaVacinas\\agendamentos.txt";
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

        jLabel11 = new javax.swing.JLabel();
        txtCodConsulta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcPaciente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcVacina = new javax.swing.JComboBox<>();
        btnReceitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAgendamentos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdadeP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSenhaFila = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jLabel11.setText("Cód Consulta:");

        txtCodConsulta.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Consultas Agendadas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 190, 24);

        jLabel2.setText("Vacina:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 310, 42, 16);

        jcPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcPacienteMouseClicked(evt);
            }
        });
        jcPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcPacienteKeyReleased(evt);
            }
        });
        getContentPane().add(jcPaciente);
        jcPaciente.setBounds(90, 270, 140, 26);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(305, 60, 0, 0);

        jLabel4.setText("Paciente:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 270, 53, 16);

        getContentPane().add(jcVacina);
        jcVacina.setBounds(90, 310, 140, 26);

        btnReceitar.setText("Receitar Vacina");
        btnReceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReceitar);
        btnReceitar.setBounds(270, 340, 120, 50);

        jtAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Paciente", "Idade", "Vacina", "Data Consulta", "Horário", "CPF", "Endereço", "Telefone", "Tipo", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtAgendamentos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 640, 130);

        jLabel5.setText("Idade:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 350, 34, 16);

        txtIdadeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadePActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdadeP);
        txtIdadeP.setBounds(90, 350, 140, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Receitar Vacina");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 10, 137, 24);

        jLabel12.setText("Senha Fila:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 230, 61, 16);

        txtSenhaFila.setEditable(false);
        txtSenhaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaFilaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenhaFila);
        txtSenhaFila.setBounds(90, 230, 138, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceitarActionPerformed

        int posicao = jtAgendamentos.getSelectedRow();
        
        if (jtAgendamentos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um paciente");
        }else{
        String senhafila = (String) jtAgendamentos.getValueAt(posicao, 0); //pega a linha escolhida e a posição da coluna zero
        String nome = (String) jtAgendamentos.getValueAt(posicao, 1); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:
        String idade = (String) jtAgendamentos.getValueAt(posicao, 2); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:

        r.Receitar(senhafila, nome, jcVacina.getSelectedItem().toString(), idade);
        }
        
        

//        r.Receitar(txtSenhaFila.getText(), jcPaciente.getSelectedItem().toString(), jcVacina.getSelectedItem().toString(), (txtIdadeP.getText()));
    }//GEN-LAST:event_btnReceitarActionPerformed

    private void txtIdadePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadePActionPerformed

    private void txtSenhaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFilaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jcPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcPacienteKeyReleased
        
    }//GEN-LAST:event_jcPacienteKeyReleased

    private void jcPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcPacienteMouseClicked
           String[] dados = a.preencher();

        Random gerador = new Random();
        int cod = gerador.nextInt(999);

        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";

        Random random = new Random();

        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i < 2; i++) {
            index = random.nextInt(letras.length());
            armazenaChaves += letras.substring(index, index + 1);
        }

       txtSenhaFila.setText((armazenaChaves + Integer.toString(cod)));
    }//GEN-LAST:event_jcPacienteMouseClicked

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
            java.util.logging.Logger.getLogger(frmReceitarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReceitarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReceitarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReceitarVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReceitarVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReceitar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcPaciente;
    private javax.swing.JComboBox<String> jcVacina;
    private javax.swing.JTable jtAgendamentos;
    private javax.swing.JTextField txtCodConsulta;
    private javax.swing.JTextField txtIdadeP;
    private javax.swing.JTextField txtSenhaFila;
    // End of variables declaration//GEN-END:variables
}
