/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mechanicalregister;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brena
 */
public class ConsultarVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarVeiculo
     */
    public ConsultarVeiculo() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(0, 0, 0)); // Define o fundo como preto
        tabVeiculo.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tabVeiculo.getTableHeader().setOpaque(false);
        tabVeiculo.getTableHeader().setBackground(new Color(93, 40, 221));
        tabVeiculo.getTableHeader().setForeground(new Color(0, 0, 0));
        tabVeiculo.setRowHeight(25);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabVeiculo = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        cxConsultar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabVeiculo.setBackground(new java.awt.Color(0, 0, 0));
        tabVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        tabVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PLACA", "MARCA", "MODELO", "COR", "MOTOR", "ANO"
            }
        ));
        tabVeiculo.setFocusable(false);
        tabVeiculo.setGridColor(new java.awt.Color(255, 255, 255));
        tabVeiculo.setRowHeight(25);
        tabVeiculo.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tabVeiculo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabVeiculo);

        btVoltar.setBackground(new java.awt.Color(93, 40, 221));
        btVoltar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btConsultar.setBackground(new java.awt.Color(93, 40, 221));
        btConsultar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLIENTE - VEÍCULO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(cxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed

    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        listarTabUnic();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated
    public void voltar() {

        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente voltar?",
                "VOLTAR",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            voltar();
            MenuPostgre menu = new MenuPostgre();
            menu.setVisible(true);
            dispose();
        }
    }

    public void listarTab() {
        DefaultTableModel tabModel = (DefaultTableModel) tabVeiculo.getModel();
        tabModel.setRowCount(0); // Limpa as linhas existentes na tabela

        Conexao conexao = new Conexao();
        try (Connection connection = conexao.getConnection()) {
            String query = "select id_veiculo, ano, marca, modelo,cor,motor,id_cliente from veiculo";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id_veiculo = resultSet.getInt("id_veiculo");
                int ano = resultSet.getInt("ano");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                String cor = resultSet.getString("cor");
                String motor = resultSet.getString("motor");
                int id_cliente = resultSet.getInt("id_cliente");
                tabModel.addRow(new Object[]{id_veiculo, ano, marca, modelo, cor, motor, id_cliente});
            }

        } catch (SQLException e) {
        }
    }

    public void listarTabUnic() {
        DefaultTableModel tabModel = (DefaultTableModel) tabVeiculo.getModel();
        tabModel.setRowCount(0); // Limpa as linhas existentes na tabela

        Conexao conexao = new Conexao();
        try (Connection connection = conexao.getConnection()) {
            String query = "select id_veiculo, ano, marca, modelo,cor,motor,id_cliente from veiculo";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id_veiculo = resultSet.getInt("id_veiculo");
                int ano = resultSet.getInt("ano");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                String cor = resultSet.getString("cor");
                String motor = resultSet.getString("motor");
                int id_cliente = resultSet.getInt("id_cliente");
                if (Integer.parseInt(cxConsultar.getText()) == id_veiculo) {
                    tabModel.addRow(new Object[]{id_veiculo, ano, marca, modelo, cor, motor, id_cliente});
                }

            }

        } catch (SQLException e) {
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
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxConsultar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabVeiculo;
    // End of variables declaration//GEN-END:variables
}
