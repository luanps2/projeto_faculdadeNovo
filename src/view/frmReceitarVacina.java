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

    public void CarregarVacinas() {
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

    }

    public void VacinasReceitadas() {

        String agendamentos = "C:\\SistemaVacinas\\receitas.txt";
        File file = new File(agendamentos);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
//            String firstLine = br.readLine().trim();
//            String[] NomeColunas = firstLine.split(" ");
            DefaultTableModel model = (DefaultTableModel) jtVacinasReceitadas.getModel();
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
        CarregarVacinas();
        VacinasReceitadas();
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
        jpConsultasAgendadas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAgendamentos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtSenhaFila = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcVacina = new javax.swing.JComboBox<>();
        btnReceitar = new javax.swing.JButton();
        jpVacinasAplicadas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtVacinasAplicadas = new javax.swing.JTable();
        jpVacinasReceitadas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtVacinasReceitadas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jLabel11.setText("Cód Consulta:");

        txtCodConsulta.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Receitar Vacina");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Consultas Agendadas");

        jtAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Paciente", "Idade", "Data Consulta", "Horário", "CPF", "Endereço", "Telefone", "Tipo", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtAgendamentos);

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

        javax.swing.GroupLayout jpConsultasAgendadasLayout = new javax.swing.GroupLayout(jpConsultasAgendadas);
        jpConsultasAgendadas.setLayout(jpConsultasAgendadasLayout);
        jpConsultasAgendadasLayout.setHorizontalGroup(
            jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultasAgendadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultasAgendadasLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(515, 522, Short.MAX_VALUE))
                    .addGroup(jpConsultasAgendadasLayout.createSequentialGroup()
                        .addGroup(jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jpConsultasAgendadasLayout.createSequentialGroup()
                                .addGroup(jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpConsultasAgendadasLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultasAgendadasLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)))
                                .addGroup(jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenhaFila, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 488, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jpConsultasAgendadasLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btnReceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpConsultasAgendadasLayout.setVerticalGroup(
            jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultasAgendadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtSenhaFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConsultasAgendadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultas Agendadas", jpConsultasAgendadas);

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

        javax.swing.GroupLayout jpVacinasAplicadasLayout = new javax.swing.GroupLayout(jpVacinasAplicadas);
        jpVacinasAplicadas.setLayout(jpVacinasAplicadasLayout);
        jpVacinasAplicadasLayout.setHorizontalGroup(
            jpVacinasAplicadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVacinasAplicadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVacinasAplicadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(jpVacinasAplicadasLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpVacinasAplicadasLayout.setVerticalGroup(
            jpVacinasAplicadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVacinasAplicadasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vacinas Aplicadas", jpVacinasAplicadas);

        jtVacinasReceitadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtVacinasReceitadas);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Vacinas Receitadas");

        javax.swing.GroupLayout jpVacinasReceitadasLayout = new javax.swing.GroupLayout(jpVacinasReceitadas);
        jpVacinasReceitadas.setLayout(jpVacinasReceitadasLayout);
        jpVacinasReceitadasLayout.setHorizontalGroup(
            jpVacinasReceitadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVacinasReceitadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVacinasReceitadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVacinasReceitadasLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpVacinasReceitadasLayout.setVerticalGroup(
            jpVacinasReceitadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVacinasReceitadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vacinas Receitadas", jpVacinasReceitadas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(jLabel6))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel3))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

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
        VacinasReceitadas();
//        r.Receitar(txtSenhaFila.getText(), jcPaciente.getSelectedItem().toString(), jcVacina.getSelectedItem().toString(), (txtIdadeP.getText()));
    }//GEN-LAST:event_btnReceitarActionPerformed

    private void txtSenhaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFilaActionPerformed

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcVacina;
    private javax.swing.JPanel jpConsultasAgendadas;
    private javax.swing.JPanel jpVacinasAplicadas;
    private javax.swing.JPanel jpVacinasReceitadas;
    private javax.swing.JTable jtAgendamentos;
    private javax.swing.JTable jtVacinasAplicadas;
    private javax.swing.JTable jtVacinasReceitadas;
    private javax.swing.JTextField txtCodConsulta;
    private javax.swing.JTextField txtSenhaFila;
    // End of variables declaration//GEN-END:variables
}
