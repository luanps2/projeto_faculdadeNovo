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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Luan Costa
 */
public class frmReceitarVacina extends javax.swing.JFrame {

    public void pesquisarAgendamento(String query) {
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>();
        jtAgendamentos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

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
//Gerador de codigos
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

//        jcPaciente.addItem(dados[0]);
        //Listar Pacientes em JComboBox
        try {
            FileReader fr = new FileReader(pacientes);
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();

//            while (linha != null) {
//                jcPaciente.addItem(linha);
//                linha = br.readLine();
//
//            }
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

//Carrega tabela com Vacinas aplicadas
        String vacinasaplicadas = "C:\\SistemaVacinas\\vacinasaplicadas.txt";
        File file2 = new File(vacinasaplicadas);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file2));
//            String firstLine = br.readLine().trim();
//            String[] NomeColunas = firstLine.split(" ");
            DefaultTableModel model = (DefaultTableModel) jtVacinasAplicadas.getModel();
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

        //Pesquisar Agendamentos
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAgendamentos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtSenhaFila = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcVacina = new javax.swing.JComboBox<>();
        btnReceitar = new javax.swing.JButton();
        txtPesquisaAgendamento = new javax.swing.JTextField();
        btnPesquisarAgendamento = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtVacinasAplicadas = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        jLabel11.setText("Cód Consulta:");

        txtCodConsulta.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(305, 60, 0, 0);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Receitar Vacina");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 10, 137, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 10, 50, 50);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Consultas Agendadas");

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
        if (jtAgendamentos.getColumnModel().getColumnCount() > 0) {
            jtAgendamentos.getColumnModel().getColumn(1).setHeaderValue("Nome Paciente");
            jtAgendamentos.getColumnModel().getColumn(5).setHeaderValue("Horário");
            jtAgendamentos.getColumnModel().getColumn(6).setHeaderValue("CPF");
            jtAgendamentos.getColumnModel().getColumn(7).setHeaderValue("Endereço");
            jtAgendamentos.getColumnModel().getColumn(8).setHeaderValue("Telefone");
            jtAgendamentos.getColumnModel().getColumn(9).setHeaderValue("Tipo");
            jtAgendamentos.getColumnModel().getColumn(10).setHeaderValue("Usuário");
        }

        jLabel12.setText("Senha Fila:");

        txtSenhaFila.setEditable(false);
        txtSenhaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaFilaActionPerformed(evt);
            }
        });

        jLabel2.setText("Vacina:");

        btnReceitar.setText("Receitar Vacina");
        btnReceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceitarActionPerformed(evt);
            }
        });

        txtPesquisaAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaAgendamentoActionPerformed(evt);
            }
        });
        txtPesquisaAgendamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaAgendamentoKeyReleased(evt);
            }
        });

        btnPesquisarAgendamento.setText("Pesquisar");
        btnPesquisarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenhaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnReceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisarAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisarAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtSenhaFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jTabbedPane1.addTab("Consultas Agendadas", jPanel1);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Vacinas Aplicadas");

        jtVacinasAplicadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Vacina", "Idade", "Dosagem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtVacinasAplicadas);

        jToggleButton1.setText("Pesquisar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vacinas Aplicadas", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 60, 720, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceitarActionPerformed

        int posicao = jtAgendamentos.getSelectedRow();

        if (jtAgendamentos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um paciente");
        } else {
            String senhafila = (String) jtAgendamentos.getValueAt(posicao, 0); //pega a linha escolhida e a posição da coluna zero
            String nome = (String) jtAgendamentos.getValueAt(posicao, 1); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:
            String idade = (String) jtAgendamentos.getValueAt(posicao, 2); //pega a linha escolhida e a posição da coluna um// isso vai te retornar o indice da linha selecionada.        // TODO add your handling code here:

            r.Receitar(senhafila, nome, jcVacina.getSelectedItem().toString(), idade);
        }

//        r.Receitar(txtSenhaFila.getText(), jcPaciente.getSelectedItem().toString(), jcVacina.getSelectedItem().toString(), (txtIdadeP.getText()));
    }//GEN-LAST:event_btnReceitarActionPerformed

    private void txtSenhaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFilaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPesquisarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAgendamentoActionPerformed


    }//GEN-LAST:event_btnPesquisarAgendamentoActionPerformed

    private void txtPesquisaAgendamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaAgendamentoKeyReleased
        String query = txtPesquisaAgendamento.getText().toLowerCase();
        
        pesquisarAgendamento(query);
    }//GEN-LAST:event_txtPesquisaAgendamentoKeyReleased

    private void txtPesquisaAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaAgendamentoActionPerformed

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
    private javax.swing.JToggleButton btnPesquisarAgendamento;
    private javax.swing.JButton btnReceitar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jcVacina;
    private javax.swing.JTable jtAgendamentos;
    private javax.swing.JTable jtVacinasAplicadas;
    private javax.swing.JTextField txtCodConsulta;
    private javax.swing.JTextField txtPesquisaAgendamento;
    private javax.swing.JTextField txtSenhaFila;
    // End of variables declaration//GEN-END:variables
}
