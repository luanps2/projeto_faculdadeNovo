/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Cadastro;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan Costa
 */
public class frmPrincipal extends javax.swing.JFrame {

    Cadastro paciente = new Cadastro();

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setTitle("Painel Principal");
        setResizable(false);
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel43 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtNomeP = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtUsuarioP = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtSenhaP = new javax.swing.JTextField();
        txtIdadeP = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        btnCadastraPaciente = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        txtCPFP = new javax.swing.JFormattedTextField();
        txtTelefoneP = new javax.swing.JFormattedTextField();
        txtEnderecoP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtNomeE = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtUsuarioE = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtSenhaE = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtEnderecoE = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btnCadastraEnfermeira = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtCPFE = new javax.swing.JFormattedTextField();
        txtTelefoneE = new javax.swing.JFormattedTextField();
        txtCOREN = new javax.swing.JFormattedTextField();
        txtIdadeE = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCadastraMedico = new javax.swing.JButton();
        txtSenhaM = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUsuarioM = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtEnderecoM = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNomeM = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefoneM = new javax.swing.JFormattedTextField();
        txtCPFM = new javax.swing.JFormattedTextField();
        txtCRM = new javax.swing.JFormattedTextField();
        txtIdadeM = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setText("Sistema De Vacinas");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 180, 32));

        btnInfo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnInfo.setText("Informações do Sistema");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jPanel5.setLayout(null);
        jPanel5.add(jLabel3);
        jLabel3.setBounds(596, 28, 0, 118);

        jLabel2.setText("Usuário:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(240, 200, 47, 16);
        jPanel5.add(txtUsuario);
        txtUsuario.setBounds(290, 200, 148, 24);

        jLabel5.setText("Senha:");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(240, 240, 39, 16);
        jPanel5.add(txtSenha);
        txtSenha.setBounds(290, 230, 150, 22);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEntrar);
        btnEntrar.setBounds(320, 260, 80, 40);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/hospital-2_icon-icons.com_66067 (1).png"))); // NOI18N
        jPanel5.add(jLabel40);
        jLabel40.setBounds(300, 40, 128, 130);

        jTabbedPane2.addTab("Login", jPanel5);

        jLabel34.setText("Nome:");

        jLabel35.setText("Telefone");

        jLabel36.setText("Usuário:");

        jLabel37.setText("CPF:");

        jLabel38.setText("Idade:");

        jLabel39.setText("Senha:");

        jLabel41.setText("Endereço:");

        btnCadastraPaciente.setText("Cadastrar");
        btnCadastraPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraPacienteActionPerformed(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/paciente.png"))); // NOI18N

        try {
            txtCPFP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefoneP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnCadastraPaciente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41)
                            .addComponent(jLabel37)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdadeP)
                            .addComponent(txtCPFP, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtNomeP)
                            .addComponent(txtEnderecoP))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtTelefoneP, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSenhaP, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel34))
                            .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel35))
                            .addComponent(txtTelefoneP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel37))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel36))
                                    .addComponent(txtUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtCPFP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdadeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenhaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(12, 12, 12)
                .addComponent(btnCadastraPaciente))
        );

        jTabbedPane1.addTab("Paciente", jPanel1);

        jLabel25.setText("Nome:");

        jLabel26.setText("Telefone");

        jLabel27.setText("Usuário:");

        jLabel28.setText("CPF:");

        jLabel30.setText("Senha:");

        jLabel31.setText("COREN:");

        jLabel32.setText("Endereço:");

        btnCadastraEnfermeira.setText("Cadastrar");
        btnCadastraEnfermeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraEnfermeiraActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/enfermeira.png"))); // NOI18N

        try {
            txtCPFE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefoneE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCOREN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("COREN-AA-###.###-AAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCOREN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCORENActionPerformed(evt);
            }
        });

        jLabel44.setText("Idade:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeE, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPFE, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdadeE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEnderecoE, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCOREN, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSenhaE, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel26))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefoneE, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUsuarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnCadastraEnfermeira)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtNomeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtCPFE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtTelefoneE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtUsuarioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtSenhaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdadeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(txtCOREN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEnderecoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))))))
                .addGap(18, 18, 18)
                .addComponent(btnCadastraEnfermeira)
                .addGap(82, 82, 82))
        );

        jTabbedPane1.addTab("Enfermeira", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastraMedico.setText("Cadastrar");
        btnCadastraMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraMedicoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCadastraMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 272, -1, -1));
        jPanel3.add(txtSenhaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 174, -1));

        jLabel16.setText("Senha:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel17.setText("Usuário:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));
        jPanel3.add(txtUsuarioM, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 170, 182, -1));

        jLabel18.setText("Telefone");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 144, -1, -1));

        jLabel19.setText("Endereço:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 234, -1, -1));
        jPanel3.add(txtEnderecoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 230, 140, -1));

        jLabel21.setText("CPF:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 166, -1, -1));
        jPanel3.add(txtNomeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 140, 130, -1));

        jLabel22.setText("Nome:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 144, -1, -1));

        jLabel24.setText("CRM:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/medico.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 30, -1, -1));

        try {
            txtTelefoneM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txtTelefoneM, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 142, 186, -1));

        try {
            txtCPFM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFMActionPerformed(evt);
            }
        });
        jPanel3.add(txtCPFM, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 170, 130, 24));

        try {
            txtCRM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#/AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(txtCRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 230, 174, 30));
        jPanel3.add(txtIdadeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 200, 130, -1));

        jLabel45.setText("Idade:");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 204, -1, -1));

        jTabbedPane1.addTab("Médico", jPanel3);

        jTabbedPane2.addTab("Cadastro", jTabbedPane1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 760, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(null, ""
                + "\nNome: Carlos Roberto de Oliveira Júnior - 2306518-4 "
                + "\nNome: Emerson Gustavo Nifa - RGM: 2338868-4 "
                + "\nNome: Flávio Galdino Félix - RGM: 2337035-1 "
                + "\nNome: Lilian Cortez - RGM: 2304362-8 "
                + "\nNome: Luan da Costa Oliveira Esposito - RGM: 2294933-0"
                + "\nNome: Murilo Cardoso dos Santos - RGM: 2314693-7");

        
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnCadastraMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraMedicoActionPerformed
        paciente.CadastrarCod(txtNomeM.getText(),
            txtCPFM.getText(),
            Integer.parseInt(txtIdadeM.getText()),
            txtEnderecoM.getText(),
            txtTelefoneM.getText(),
            "Medico",
            txtUsuarioM.getText(),
            txtSenhaM.getText(),
            txtCRM.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastraMedicoActionPerformed

    private void txtCORENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCORENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCORENActionPerformed

    private void btnCadastraEnfermeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraEnfermeiraActionPerformed
        paciente.CadastrarCod(txtNomeE.getText(),
            txtCPFE.getText(),
            Integer.parseInt(txtIdadeE.getText()),
            txtEnderecoE.getText(),
            txtTelefoneP.getText(),
            "Enfermeira",
            txtUsuarioE.getText(),
            txtSenhaE.getText(),
            txtCOREN.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastraEnfermeiraActionPerformed

    private void btnCadastraPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraPacienteActionPerformed

        paciente.CadastrarPaciente(txtNomeP.getText(),
            txtCPFP.getText(),
            Integer.parseInt(txtIdadeP.getText()),
            txtEnderecoP.getText(),
            txtTelefoneP.getText(),
            "Paciente",
            txtUsuarioP.getText(),
            txtSenhaP.getText());
        
//        paciente.DadosPaciente();

        //        LocalDateTime datetime = LocalDateTime.parse(txtDataP.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //        String data = datetime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //        cadastro.CadastrarPaciente(txtNomeP.getText(),
            //            txtCPFP.getText(),
            //            data,
            //            txtEnderecoP.getText(),
            //            txtTelefoneP.getText(),
            //            "Paciente",
            //            txtUsuarioP.getText(),
            //            txtSenhaP.getText());
        //        cadastro2.CadastrarPaciente(
            //                txtNomeP.getText(),
            //                txtCPFP.getText(),
            //                data,
            //                txtEnderecoP.getText(),
            //                txtTelefoneP.getText(),
            //                "Paciente",
            //                txtUsuarioP.getText(),
            //                txtSenhaP.getText());
        //        Paciente paciente = new Paciente();
    }//GEN-LAST:event_btnCadastraPacienteActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String user = txtUsuario.getText();
        String pass = txtSenha.getText();
        if (user == null || pass == null) {
            JOptionPane.showMessageDialog(null, "Dados Inválidos");
        }

        paciente.LoginPaciente(user, pass);
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtCPFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFMActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastraEnfermeira;
    private javax.swing.JButton btnCadastraMedico;
    private javax.swing.JButton btnCadastraPaciente;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JFormattedTextField txtCOREN;
    private javax.swing.JFormattedTextField txtCPFE;
    private javax.swing.JFormattedTextField txtCPFM;
    private javax.swing.JFormattedTextField txtCPFP;
    private javax.swing.JFormattedTextField txtCRM;
    private javax.swing.JTextField txtEnderecoE;
    private javax.swing.JTextField txtEnderecoM;
    private javax.swing.JTextField txtEnderecoP;
    private javax.swing.JTextField txtIdadeE;
    private javax.swing.JTextField txtIdadeM;
    private javax.swing.JTextField txtIdadeP;
    private javax.swing.JTextField txtNomeE;
    private javax.swing.JTextField txtNomeM;
    private javax.swing.JTextField txtNomeP;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSenhaE;
    private javax.swing.JTextField txtSenhaM;
    private javax.swing.JTextField txtSenhaP;
    private javax.swing.JFormattedTextField txtTelefoneE;
    private javax.swing.JFormattedTextField txtTelefoneM;
    private javax.swing.JFormattedTextField txtTelefoneP;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioE;
    private javax.swing.JTextField txtUsuarioM;
    private javax.swing.JTextField txtUsuarioP;
    // End of variables declaration//GEN-END:variables
}
