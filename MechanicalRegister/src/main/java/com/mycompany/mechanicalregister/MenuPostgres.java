/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mechanicalregister;

import javax.swing.JOptionPane;

/**
 *
 * @author brena
 */
public class MenuPostgres extends javax.swing.JFrame {

    /**
     * Creates new form MenuPostgre
     */
    public MenuPostgres() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(0, 0, 0)); // Define o fundo como preto

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btConsultarVeiculo = new javax.swing.JButton();
        btInserirFuncionario = new javax.swing.JButton();
        btInserirCliente = new javax.swing.JButton();
        btInserirServico = new javax.swing.JButton();
        btInserirProduto = new javax.swing.JButton();
        btConsultarFuncionario = new javax.swing.JButton();
        btConsultarCliente = new javax.swing.JButton();
        btConsultarServico = new javax.swing.JButton();
        btConsultarProduto = new javax.swing.JButton();
        btApagarServico = new javax.swing.JButton();
        btApagarProduto = new javax.swing.JButton();
        btApagarFuncionario = new javax.swing.JButton();
        btApagarCliente = new javax.swing.JButton();
        btbackup = new javax.swing.JButton();
        btClientCarro = new javax.swing.JButton();
        btClienteProduto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(93, 40, 221));
        btSair.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAR:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INSERIR:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APAGAR:");

        btConsultarVeiculo.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarVeiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarVeiculo.setText("VEÍCULO");
        btConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarVeiculoActionPerformed(evt);
            }
        });

        btInserirFuncionario.setBackground(new java.awt.Color(93, 40, 221));
        btInserirFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btInserirFuncionario.setText("FUNC.");
        btInserirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirFuncionarioActionPerformed(evt);
            }
        });

        btInserirCliente.setBackground(new java.awt.Color(93, 40, 221));
        btInserirCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirCliente.setForeground(new java.awt.Color(255, 255, 255));
        btInserirCliente.setText("CLIENTE");
        btInserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirClienteActionPerformed(evt);
            }
        });

        btInserirServico.setBackground(new java.awt.Color(93, 40, 221));
        btInserirServico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirServico.setForeground(new java.awt.Color(255, 255, 255));
        btInserirServico.setText("SERVIÇO");
        btInserirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirServicoActionPerformed(evt);
            }
        });

        btInserirProduto.setBackground(new java.awt.Color(93, 40, 221));
        btInserirProduto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirProduto.setForeground(new java.awt.Color(255, 255, 255));
        btInserirProduto.setText("PRODUTO ");
        btInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirProdutoActionPerformed(evt);
            }
        });

        btConsultarFuncionario.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarFuncionario.setText("FUNC.");
        btConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarFuncionarioActionPerformed(evt);
            }
        });

        btConsultarCliente.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarCliente.setText("CLIENTE");
        btConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarClienteActionPerformed(evt);
            }
        });

        btConsultarServico.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarServico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarServico.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarServico.setText("SERVIÇO");
        btConsultarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarServicoActionPerformed(evt);
            }
        });

        btConsultarProduto.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarProduto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarProduto.setText("PRODUTO");
        btConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarProdutoActionPerformed(evt);
            }
        });

        btApagarServico.setBackground(new java.awt.Color(93, 40, 221));
        btApagarServico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarServico.setForeground(new java.awt.Color(255, 255, 255));
        btApagarServico.setText("SERVIÇO");
        btApagarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarServicoActionPerformed(evt);
            }
        });

        btApagarProduto.setBackground(new java.awt.Color(93, 40, 221));
        btApagarProduto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btApagarProduto.setText("PRODUTO");
        btApagarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarProdutoActionPerformed(evt);
            }
        });

        btApagarFuncionario.setBackground(new java.awt.Color(93, 40, 221));
        btApagarFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btApagarFuncionario.setText("FUNC.");
        btApagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarFuncionarioActionPerformed(evt);
            }
        });

        btApagarCliente.setBackground(new java.awt.Color(93, 40, 221));
        btApagarCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btApagarCliente.setText("CLIENTE");
        btApagarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarClienteActionPerformed(evt);
            }
        });

        btbackup.setBackground(new java.awt.Color(93, 40, 221));
        btbackup.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btbackup.setForeground(new java.awt.Color(255, 255, 255));
        btbackup.setText("BACKUP CLIENTE");
        btbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackupActionPerformed(evt);
            }
        });

        btClientCarro.setBackground(new java.awt.Color(93, 40, 221));
        btClientCarro.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btClientCarro.setForeground(new java.awt.Color(255, 255, 255));
        btClientCarro.setText("CLIENTE - VEÍCULO");
        btClientCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientCarroActionPerformed(evt);
            }
        });

        btClienteProduto.setBackground(new java.awt.Color(93, 40, 221));
        btClienteProduto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btClienteProduto.setForeground(new java.awt.Color(255, 255, 255));
        btClienteProduto.setText("CLIENTE - PRODUTO");
        btClienteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteProdutoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("BACKUP DE CLIENTES QUE FORAM APAGADOS");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("CLIENTES QUE POSSUEM VEICULO REGISTRADO NO SISTEMA");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("CLIENTES QUE COMPRARAM ALGUM PRODUTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btInserirServico, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btInserirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(btConsultarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(btConsultarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addComponent(btApagarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btApagarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btApagarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(btApagarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btClientCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(btClienteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserirServico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClientCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClienteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirClienteActionPerformed
        InserirCliente inserirCliente = new InserirCliente();
        inserirCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirClienteActionPerformed

    private void btInserirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirServicoActionPerformed
        InserirServico inserirServico = new InserirServico();
        inserirServico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirServicoActionPerformed

    private void btInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirProdutoActionPerformed
        InserirProduto inserirProduto = new InserirProduto();
        inserirProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirProdutoActionPerformed

    private void btInserirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirFuncionarioActionPerformed
        InserirFuncionario inserirFuncionario = new InserirFuncionario();
        inserirFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirFuncionarioActionPerformed

    private void btConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarClienteActionPerformed
        ConsultarCliente consultarCliente = new ConsultarCliente();
        consultarCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarClienteActionPerformed

    private void btConsultarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarServicoActionPerformed
        ConsultarServico consultarServico = new ConsultarServico();
        consultarServico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarServicoActionPerformed

    private void btConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarProdutoActionPerformed
        ConsultarProduto consultarProduto = new ConsultarProduto();
        consultarProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarProdutoActionPerformed

    private void btConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarFuncionarioActionPerformed
        ConsultarFuncionario Funcionario = new ConsultarFuncionario();
        Funcionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarFuncionarioActionPerformed

    private void btConsultarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarVeiculoActionPerformed
        ConsultarVeiculo consultarVeiculo = new ConsultarVeiculo();
        consultarVeiculo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarVeiculoActionPerformed

    private void btApagarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarClienteActionPerformed
        ApagarCliente apagarCliente = new ApagarCliente();
        apagarCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarClienteActionPerformed

    private void btApagarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarServicoActionPerformed
        ApagarServico apagarServico = new ApagarServico();
        apagarServico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarServicoActionPerformed

    private void btApagarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarProdutoActionPerformed
        ApagarProduto apagarProduto = new ApagarProduto();
        apagarProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarProdutoActionPerformed

    private void btApagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarFuncionarioActionPerformed
        ApagarFuncionario apagarFuncionario = new ApagarFuncionario();
        apagarFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarFuncionarioActionPerformed

    private void btbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackupActionPerformed
        BackupCliente backup = new BackupCliente();
        backup.setVisible(true);
        dispose();
    }//GEN-LAST:event_btbackupActionPerformed

    private void btClientCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientCarroActionPerformed
        ViewClienteCarroPostgres clienteCarro = new ViewClienteCarroPostgres();
        clienteCarro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btClientCarroActionPerformed

    private void btClienteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteProdutoActionPerformed
        ViewClienteProduto clienteProduto = new ViewClienteProduto();
        clienteProduto.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btClienteProdutoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        voltar();
    }//GEN-LAST:event_btSairActionPerformed

    public void voltar() {

        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente voltar?",
                "Voltar",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            MechanicalRegister identificacao = new MechanicalRegister();
            identificacao.setVisible(true);
            dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(MenuPostgres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPostgres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPostgres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPostgres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPostgres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagarCliente;
    private javax.swing.JButton btApagarFuncionario;
    private javax.swing.JButton btApagarProduto;
    private javax.swing.JButton btApagarServico;
    private javax.swing.JButton btClientCarro;
    private javax.swing.JButton btClienteProduto;
    private javax.swing.JButton btConsultarCliente;
    private javax.swing.JButton btConsultarFuncionario;
    private javax.swing.JButton btConsultarProduto;
    private javax.swing.JButton btConsultarServico;
    private javax.swing.JButton btConsultarVeiculo;
    private javax.swing.JButton btInserirCliente;
    private javax.swing.JButton btInserirFuncionario;
    private javax.swing.JButton btInserirProduto;
    private javax.swing.JButton btInserirServico;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btbackup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
