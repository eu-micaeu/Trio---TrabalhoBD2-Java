/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mechanicalregister;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brena
 */
public class ApagarProduto extends javax.swing.JFrame {

    /**
     * Creates new form ApagarVeiculo
     */
    public ApagarProduto() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(0, 0, 0)); // Define o fundo como preto
        tabApagarProduto.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tabApagarProduto.getTableHeader().setOpaque(false);
        tabApagarProduto.getTableHeader().setBackground(new Color(93, 40, 221));
        tabApagarProduto.getTableHeader().setForeground(new Color(0, 0, 0));
        tabApagarProduto.setRowHeight(25);
        listarTab();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btApagar = new javax.swing.JButton();
        cxApagar = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabApagarProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APAGAR PRODUTO:");

        btApagar.setBackground(new java.awt.Color(93, 40, 221));
        btApagar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btApagar.setForeground(new java.awt.Color(255, 255, 255));
        btApagar.setText("APAGAR");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(93, 40, 221));
        btVoltar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tabApagarProduto.setBackground(new java.awt.Color(0, 0, 0));
        tabApagarProduto.setForeground(new java.awt.Color(255, 255, 255));
        tabApagarProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PLACA", "ANO", "MARCA", "MODELO", "COR"
            }
        ));
        tabApagarProduto.setFocusable(false);
        tabApagarProduto.setGridColor(new java.awt.Color(255, 255, 255));
        tabApagarProduto.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tabApagarProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabApagarProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(cxApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btApagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btApagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cxApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();

    }//GEN-LAST:event_btVoltarActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        listarTabDel();
        listarTab();
    }//GEN-LAST:event_btApagarActionPerformed
    public void voltar() {

        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente voltar?",
                "VOLTAR",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            MenuPostgres menu = new MenuPostgres();
            menu.setVisible(true);
            dispose();
        }
    }

    public void listarTabDel() {
        DefaultTableModel tabModel = (DefaultTableModel) tabApagarProduto.getModel();
        tabModel.setRowCount(0);

        try (Connection conexao = new Conexao().getConnection()) {
            PreparedStatement inicio = conexao.prepareStatement("BEGIN");
            inicio.execute();
            String query = "DELETE FROM produto WHERE id_produto = ?";
            String id_cliente = cxApagar.getText();
            PreparedStatement statement2 = conexao.prepareStatement(query);
            statement2.setInt(1, Integer.parseInt(id_cliente));
            statement2.executeUpdate();
            PreparedStatement fimC = conexao.prepareStatement("COMMIT");
            fimC.execute();
            PreparedStatement fimR = conexao.prepareStatement("ROLLBACk");
            fimR.execute();
            conexao.close();
        } catch (SQLException e) {
        }
    }

    public void listarTab() {
        DefaultTableModel tabModel = (DefaultTableModel) tabApagarProduto.getModel();
        tabModel.setRowCount(0); // Limpa as linhas existentes na tabela

        try (Connection conexao = new Conexao().getConnection()) {
            PreparedStatement inicio = conexao.prepareStatement("BEGIN");
            inicio.execute();
            String query = "SELECT * FROM produto";
            Statement statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id_produto");
                String nome = resultSet.getString("nome_produto");
                float valor = resultSet.getFloat("valor");
                int quantidade = resultSet.getInt("quantidade");
                tabModel.addRow(new Object[]{id, nome, valor, quantidade});
            }
            PreparedStatement fimC = conexao.prepareStatement("COMMIT");
            fimC.execute();
            PreparedStatement fimR = conexao.prepareStatement("ROLLBACk");
            fimR.execute();
            conexao.close();
            JOptionPane.showMessageDialog(
                        null,
                        "Produto apagado com sucesso!",
                        "",
                        JOptionPane.INFORMATION_MESSAGE
                );
        } catch (SQLException e) {
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
            java.util.logging.Logger.getLogger(ApagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApagarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApagarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxApagar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabApagarProduto;
    // End of variables declaration//GEN-END:variables
}
