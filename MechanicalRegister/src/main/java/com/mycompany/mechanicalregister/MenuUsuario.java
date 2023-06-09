/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mechanicalregister;

import javax.swing.JOptionPane;

/**
 *
 * @author micae
 */
public class MenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuario
     */
    public MenuUsuario() {
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

        btClienteCarro = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btClienteCarro1 = new javax.swing.JButton();
        btConsultarFuncionario = new javax.swing.JButton();
        btConsultarCliente = new javax.swing.JButton();
        btConsultarServico = new javax.swing.JButton();
        btConsultarProduto = new javax.swing.JButton();
        btbackup = new javax.swing.JButton();
        btConsultarVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btClienteCarro.setBackground(new java.awt.Color(93, 40, 221));
        btClienteCarro.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btClienteCarro.setForeground(new java.awt.Color(255, 255, 255));
        btClienteCarro.setText("CLIENTES - VEÍCULO");
        btClienteCarro.setPreferredSize(new java.awt.Dimension(100, 50));
        btClienteCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteCarroActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTAR:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INSERIR:");

        btClienteCarro1.setBackground(new java.awt.Color(93, 40, 221));
        btClienteCarro1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btClienteCarro1.setForeground(new java.awt.Color(255, 255, 255));
        btClienteCarro1.setText("CLIENTES - VEÍCULO");
        btClienteCarro1.setPreferredSize(new java.awt.Dimension(100, 50));
        btClienteCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteCarro1ActionPerformed(evt);
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

        btbackup.setBackground(new java.awt.Color(93, 40, 221));
        btbackup.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btbackup.setForeground(new java.awt.Color(255, 255, 255));
        btbackup.setText("BACKUP CLIENTE");
        btbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackupActionPerformed(evt);
            }
        });

        btConsultarVeiculo.setBackground(new java.awt.Color(93, 40, 221));
        btConsultarVeiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btConsultarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarVeiculo.setText("VEÍCULO");
        btConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btConsultarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btConsultarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btConsultarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btConsultarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btConsultarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btClienteCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btClienteCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btClienteCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btConsultarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btConsultarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btClienteCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void btClienteCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteCarroActionPerformed
        ViewClienteVeiculoUsuario clienteCarro = new ViewClienteVeiculoUsuario();
        clienteCarro.setVisible(true);
    }//GEN-LAST:event_btClienteCarroActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        voltar();
    }//GEN-LAST:event_btSairActionPerformed

    private void btClienteCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteCarro1ActionPerformed
        InserirClienteVeiculo clientecarro = new InserirClienteVeiculo();
        clientecarro.setVisible(true);
    }//GEN-LAST:event_btClienteCarro1ActionPerformed

    private void btConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarFuncionarioActionPerformed
        ConsultarFuncionario Funcionario = new ConsultarFuncionario();
        Funcionario.setVisible(true);
    }//GEN-LAST:event_btConsultarFuncionarioActionPerformed

    private void btConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarClienteActionPerformed
        ConsultarCliente consultarCliente = new ConsultarCliente();
        consultarCliente.setVisible(true);
    }//GEN-LAST:event_btConsultarClienteActionPerformed

    private void btConsultarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarServicoActionPerformed
        ConsultarServico consultarServico = new ConsultarServico();
        consultarServico.setVisible(true);
    }//GEN-LAST:event_btConsultarServicoActionPerformed

    private void btConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarProdutoActionPerformed
        ConsultarProduto consultarProduto = new ConsultarProduto();
        consultarProduto.setVisible(true);
    }//GEN-LAST:event_btConsultarProdutoActionPerformed

    private void btbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackupActionPerformed
        BackupCliente backup = new BackupCliente();
        backup.setVisible(true);
    }//GEN-LAST:event_btbackupActionPerformed

    private void btConsultarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarVeiculoActionPerformed
        ConsultarVeiculo consultarVeiculo = new ConsultarVeiculo();
        consultarVeiculo.setVisible(true);
    }//GEN-LAST:event_btConsultarVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClienteCarro;
    private javax.swing.JButton btClienteCarro1;
    private javax.swing.JButton btConsultarCliente;
    private javax.swing.JButton btConsultarFuncionario;
    private javax.swing.JButton btConsultarProduto;
    private javax.swing.JButton btConsultarServico;
    private javax.swing.JButton btConsultarVeiculo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btbackup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
