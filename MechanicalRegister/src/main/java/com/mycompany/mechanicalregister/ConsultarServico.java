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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brena
 */
public class ConsultarServico extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarServico
     */
    public ConsultarServico() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(0, 0, 0)); // Define o fundo como preto
        tabConsultarServico.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tabConsultarServico.getTableHeader().setOpaque(false);
        tabConsultarServico.getTableHeader().setBackground(new Color(93, 40, 221));
        tabConsultarServico.getTableHeader().setForeground(new Color(0, 0, 0));
        tabConsultarServico.setRowHeight(25);
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

        btConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabConsultarServico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cxConsultar = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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

        tabConsultarServico.setBackground(new java.awt.Color(0, 0, 0));
        tabConsultarServico.setForeground(new java.awt.Color(255, 255, 255));
        tabConsultarServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Valor"
            }
        ));
        tabConsultarServico.setFocusable(false);
        tabConsultarServico.setGridColor(new java.awt.Color(255, 255, 255));
        tabConsultarServico.setRowHeight(25);
        tabConsultarServico.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tabConsultarServico.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabConsultarServico);
        if (tabConsultarServico.getColumnModel().getColumnCount() > 0) {
            tabConsultarServico.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAR SERVIÇO");

        btVoltar.setBackground(new java.awt.Color(93, 40, 221));
        btVoltar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1))
                            .addComponent(cxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        listarTabUnic();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
        
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated
   public void voltar(){
		
		int resp = JOptionPane.showConfirmDialog(
				null,
				"Deseja realmente voltar?",
				"VOLTAR",
				JOptionPane.YES_NO_OPTION
			);
		if(resp == 0){
			MenuPostgre menu = new MenuPostgre();
                        menu.setVisible(true);
			dispose();
		}
    }
    public void listarTab() {
        DefaultTableModel tabModel = (DefaultTableModel) tabConsultarServico.getModel();
        tabModel.setRowCount(0); // Limpa as linhas existentes na tabela

        Conexao conexao = new Conexao();
        try (Connection connection = conexao.getConnection()) {
            String query = "SELECT * FROM servico";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id_servico");
                String tipo = resultSet.getString("tipo");
                float valor = resultSet.getFloat("valor");
                tabModel.addRow(new Object[]{id, tipo, valor});
            }

        } catch (SQLException e) {
        }
    }
    
    public void listarTabUnic() {
        DefaultTableModel tabModel = (DefaultTableModel) tabConsultarServico.getModel();
        tabModel.setRowCount(0); // Limpa as linhas existentes na tabela

        Conexao conexao = new Conexao();
        try (Connection connection = conexao.getConnection()) {
            String query = "SELECT * FROM servico";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id_servico");
                String tipo = resultSet.getString("tipo");
                float valor = resultSet.getFloat("valor");
                if(Integer.parseInt(cxConsultar.getText()) == id){
                    tabModel.addRow(new Object[]{id, tipo, valor});
                }
                
            }

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
            java.util.logging.Logger.getLogger(ConsultarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabConsultarServico;
    // End of variables declaration//GEN-END:variables
}
