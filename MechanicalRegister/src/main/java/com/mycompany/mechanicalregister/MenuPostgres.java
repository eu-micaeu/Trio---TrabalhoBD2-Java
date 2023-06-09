/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mechanicalregister;

/**
 *
 * @author micae
 */
public class MenuPostgres extends javax.swing.JFrame {

    /**
     * Creates new form Menu
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

        rotInserir = new javax.swing.JLabel();
        rotConsultar = new javax.swing.JLabel();
        rotApagar = new javax.swing.JLabel();
        btInserirCliente = new javax.swing.JButton();
        btInserirVeiculo = new javax.swing.JButton();
        btInserirServico = new javax.swing.JButton();
        btConsultarCliente = new javax.swing.JButton();
        btConsultarProduto = new javax.swing.JButton();
        btConsultarServico = new javax.swing.JButton();
        btApagarCliente = new javax.swing.JButton();
        btApagarVeiculo = new javax.swing.JButton();
        btApagarServico = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btConsultarVeiculo = new javax.swing.JButton();
        btClienteCarro = new javax.swing.JButton();
        btClienteProduto = new javax.swing.JButton();
        btBackup = new javax.swing.JButton();
        btApagarFuncionario = new javax.swing.JButton();
        btInserirFuncionario = new javax.swing.JButton();
        btConsultarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotInserir.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        rotInserir.setForeground(new java.awt.Color(255, 255, 255));
        rotInserir.setText("INSERIR");

        rotConsultar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        rotConsultar.setForeground(new java.awt.Color(255, 255, 255));
        rotConsultar.setText("CONSULTAR");

        rotApagar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        rotApagar.setForeground(new java.awt.Color(255, 255, 255));
        rotApagar.setText("APAGAR");

        btInserirCliente.setBackground(new java.awt.Color(93, 40, 221));
        btInserirCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirCliente.setForeground(new java.awt.Color(255, 255, 255));
        btInserirCliente.setText("CLIENTE");
        btInserirCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btInserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirClienteActionPerformed(evt);
            }
        });

        btInserirVeiculo.setBackground(new java.awt.Color(93, 40, 221));
        btInserirVeiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btInserirVeiculo.setText("PRODUTO");
        btInserirVeiculo.setPreferredSize(new java.awt.Dimension(100, 50));
        btInserirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirVeiculoActionPerformed(evt);
            }
        });

        btInserirServico.setBackground(new java.awt.Color(93, 40, 221));
        btInserirServico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirServico.setForeground(new java.awt.Color(255, 255, 255));
        btInserirServico.setText("SERVIÇO");
        btInserirServico.setPreferredSize(new java.awt.Dimension(100, 50));
        btInserirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirServicoActionPerformed(evt);
            }
        });

        btConsultarCliente.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarCliente.setText("CLIENTE");
        btConsultarCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarClienteActionPerformed(evt);
            }
        });

        btConsultarProduto.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarProduto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarProduto.setText("PRODUTO");
        btConsultarProduto.setPreferredSize(new java.awt.Dimension(100, 50));
        btConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarProdutoActionPerformed(evt);
            }
        });

        btConsultarServico.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarServico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarServico.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarServico.setText("SERVIÇO");
        btConsultarServico.setPreferredSize(new java.awt.Dimension(100, 50));
        btConsultarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarServicoActionPerformed(evt);
            }
        });

        btApagarCliente.setBackground(new java.awt.Color(93, 40, 221));
        btApagarCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btApagarCliente.setText("CLIENTE");
        btApagarCliente.setPreferredSize(new java.awt.Dimension(100, 50));
        btApagarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarClienteActionPerformed(evt);
            }
        });

        btApagarVeiculo.setBackground(new java.awt.Color(93, 40, 221));
        btApagarVeiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btApagarVeiculo.setText("PRODUTO");
        btApagarVeiculo.setPreferredSize(new java.awt.Dimension(100, 50));
        btApagarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarVeiculoActionPerformed(evt);
            }
        });

        btApagarServico.setBackground(new java.awt.Color(93, 40, 221));
        btApagarServico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarServico.setForeground(new java.awt.Color(255, 255, 255));
        btApagarServico.setText("SERVIÇO");
        btApagarServico.setPreferredSize(new java.awt.Dimension(100, 50));
        btApagarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarServicoActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(93, 40, 221));
        btSair.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("VOLTAR");
        btSair.setPreferredSize(new java.awt.Dimension(100, 50));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btConsultarVeiculo.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarVeiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarVeiculo.setText("VEICULO");
        btConsultarVeiculo.setPreferredSize(new java.awt.Dimension(100, 50));
        btConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarVeiculoActionPerformed(evt);
            }
        });

        btClienteCarro.setBackground(new java.awt.Color(93, 40, 221));
        btClienteCarro.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btClienteCarro.setForeground(new java.awt.Color(255, 255, 255));
        btClienteCarro.setText("CLIENTES COM CARRO");
        btClienteCarro.setPreferredSize(new java.awt.Dimension(100, 50));
        btClienteCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteCarroActionPerformed(evt);
            }
        });

        btClienteProduto.setBackground(new java.awt.Color(93, 40, 221));
        btClienteProduto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btClienteProduto.setForeground(new java.awt.Color(255, 255, 255));
        btClienteProduto.setText("CLIENTES QUE COMPRARAM ALGUM PRODUTO");
        btClienteProduto.setPreferredSize(new java.awt.Dimension(100, 50));
        btClienteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteProdutoActionPerformed(evt);
            }
        });

        btBackup.setBackground(new java.awt.Color(93, 40, 221));
        btBackup.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btBackup.setForeground(new java.awt.Color(255, 255, 255));
        btBackup.setText("BACKUP DE CLIENTE");
        btBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackupActionPerformed(evt);
            }
        });

        btApagarFuncionario.setBackground(new java.awt.Color(93, 40, 221));
        btApagarFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btApagarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btApagarFuncionario.setText("FUNCIONÁRIO");
        btApagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarFuncionarioActionPerformed(evt);
            }
        });

        btInserirFuncionario.setBackground(new java.awt.Color(93, 40, 221));
        btInserirFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btInserirFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btInserirFuncionario.setText("FUNCIONÁRIO");
        btInserirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirFuncionarioActionPerformed(evt);
            }
        });

        btConsultarFuncionario.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarFuncionario.setText("FUNCIONÁRIO");
        btConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btClienteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btInserirVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btInserirServico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btInserirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btInserirFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(rotInserir)))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btConsultarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotConsultar, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(btConsultarFuncionario))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btApagarVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(btApagarServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(btApagarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rotApagar)
                                        .addGap(35, 35, 35))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btClienteCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
=======
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(rotApagar))
                                    .addComponent(btApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btApagarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btApagarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(btClienteCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btClienteProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 26196953026e2e5ef2fb7e34103561c0fd6f8c10
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotApagar)
                        .addGap(18, 18, 18)
                        .addComponent(btApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btApagarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btApagarServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btInserirVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btInserirServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultarServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClienteCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClienteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
=======
                .addGap(27, 27, 27)
                .addComponent(btBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
>>>>>>> 26196953026e2e5ef2fb7e34103561c0fd6f8c10
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirClienteActionPerformed
        InserirCliente inserirCliente = new InserirCliente();
        inserirCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirClienteActionPerformed

    private void btInserirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirVeiculoActionPerformed
        InserirProduto inserirVeiculo = new InserirProduto();
        inserirVeiculo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirVeiculoActionPerformed

    private void btInserirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirServicoActionPerformed
        InserirServico inserirServico = new InserirServico();
        inserirServico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirServicoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void btConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarClienteActionPerformed
        ConsultarCliente consultarCliente = new ConsultarCliente();
        consultarCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarClienteActionPerformed

    private void btConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarProdutoActionPerformed
        ConsultarProduto consultarProduto = new ConsultarProduto();
        consultarProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarProdutoActionPerformed

    private void btConsultarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarServicoActionPerformed
        ConsultarServico consultarServico = new ConsultarServico();
        consultarServico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarServicoActionPerformed

    private void btApagarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarServicoActionPerformed
        ApagarServico apagarServico = new ApagarServico();
        apagarServico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarServicoActionPerformed

    private void btApagarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarVeiculoActionPerformed
        ApagarProduto apagarVeiculo = new ApagarProduto();
        apagarVeiculo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarVeiculoActionPerformed

    private void btApagarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarClienteActionPerformed
        ApagarCliente apagarCliente = new ApagarCliente();
        apagarCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarClienteActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Identificacao identificacao = new Identificacao();
        identificacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarVeiculoActionPerformed
        ConsultarVeiculo consultarVeiculo = new ConsultarVeiculo();
        consultarVeiculo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarVeiculoActionPerformed

    private void btClienteCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteCarroActionPerformed
        ViewClienteCarroPostgres clienteCarro = new ViewClienteCarroPostgres();
        clienteCarro.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btClienteCarroActionPerformed

    private void btClienteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteProdutoActionPerformed
        ViewClienteProduto clienteProduto = new ViewClienteProduto();
        clienteProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btClienteProdutoActionPerformed

    private void btBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackupActionPerformed
        BackupCliente backup = new BackupCliente();
        backup.setVisible(true);
        dispose();
    }//GEN-LAST:event_btBackupActionPerformed

    private void btApagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarFuncionarioActionPerformed
        ApagarFuncionario apagarfuncionario = new ApagarFuncionario();
        apagarfuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btApagarFuncionarioActionPerformed

    private void btInserirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirFuncionarioActionPerformed
        InserirFuncionario inserirfuncionario = new InserirFuncionario();
        inserirfuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInserirFuncionarioActionPerformed

    private void btConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarFuncionarioActionPerformed
        ConsultarFuncionario consultarfuncionario = new ConsultarFuncionario();
        consultarfuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btConsultarFuncionarioActionPerformed

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
    private javax.swing.JButton btApagarServico;
    private javax.swing.JButton btApagarVeiculo;
    private javax.swing.JButton btBackup;
    private javax.swing.JButton btClienteCarro;
    private javax.swing.JButton btClienteProduto;
    private javax.swing.JButton btConsultarCliente;
    private javax.swing.JButton btConsultarFuncionario;
    private javax.swing.JButton btConsultarProduto;
    private javax.swing.JButton btConsultarServico;
    private javax.swing.JButton btConsultarVeiculo;
    private javax.swing.JButton btInserirCliente;
    private javax.swing.JButton btInserirFuncionario;
    private javax.swing.JButton btInserirServico;
    private javax.swing.JButton btInserirVeiculo;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel rotApagar;
    private javax.swing.JLabel rotConsultar;
    private javax.swing.JLabel rotInserir;
    // End of variables declaration//GEN-END:variables
}
