/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import javax.swing.*;
import classesApp.Motivo;
import java.util.List;
import java.awt.event.*;

/**
 *
 * @author GASS
 */
public class Menu_PCR extends javax.swing.JFrame {

    /**
     * Creates new form Menu_PCR
     */
    private String Valor_motivo_pcr;

    
    public Menu_PCR() {
        
        Motivo_box = new JComboBox<>();
        initComponents();
        setupComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jDesktopPanePCR1 = new javax.swing.JDesktopPane();
        Label_Motivo_PCR1 = new javax.swing.JLabel();
        Label_Equipa_Local_SAV1 = new javax.swing.JLabel();
        Motivo_box = new javax.swing.JComboBox<>();
        Equipa_Local_SAV = new javax.swing.JComboBox<>();
        PCR_Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        n_evento = new javax.swing.JLabel();
        PCR_Voltar1 = new javax.swing.JButton();
        Label_Hora_Inicio_SAV = new javax.swing.JLabel();
        Hora_Inicio_SAV = new javax.swing.JFormattedTextField();
        Label_Procedimento_SAV = new javax.swing.JLabel();
        SAV_Ventilacao = new javax.swing.JCheckBox();
        SAV_Desfibrlhação = new javax.swing.JCheckBox();
        SAV_CTE = new javax.swing.JCheckBox();
        SAV_Farmacos = new javax.swing.JCheckBox();
        Label_Hora_Inicio_SAV1 = new javax.swing.JLabel();
        Label_RCE = new javax.swing.JLabel();
        RCE_box = new javax.swing.JComboBox<>();
        Hora_Inicio_SAV1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jDesktopPanePCR1.setBackground(new java.awt.Color(242, 242, 242));
        jDesktopPanePCR1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PCR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        jDesktopPanePCR1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        Label_Motivo_PCR1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Motivo_PCR1.setText("Motivo PCR");

        Label_Equipa_Local_SAV1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Equipa_Local_SAV1.setText("Equipa Local faz SAV");

        Motivo_box.setBackground(new java.awt.Color(242, 242, 242));
        Motivo_box.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Motivo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Motivo_boxActionPerformed(evt);
            }
        });

        Equipa_Local_SAV.setBackground(new java.awt.Color(242, 242, 242));
        Equipa_Local_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Equipa_Local_SAV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sim", "Nao", " " }));
        Equipa_Local_SAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipa_Local_SAVActionPerformed(evt);
            }
        });

        PCR_Voltar.setBackground(new java.awt.Color(242, 242, 242));
        PCR_Voltar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        PCR_Voltar.setText("Voltar");
        PCR_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCR_VoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Evento: ");

        n_evento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        PCR_Voltar1.setBackground(new java.awt.Color(242, 242, 242));
        PCR_Voltar1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        PCR_Voltar1.setText("Guardar");
        PCR_Voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCR_Voltar1ActionPerformed(evt);
            }
        });

        Label_Hora_Inicio_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Hora_Inicio_SAV.setText("Hora Inicio SAV:");

        Hora_Inicio_SAV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        Hora_Inicio_SAV.setText("00:00");
        Hora_Inicio_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Hora_Inicio_SAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hora_Inicio_SAVActionPerformed(evt);
            }
        });

        Label_Procedimento_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Procedimento_SAV.setText("Procedimentos SAV");

        SAV_Ventilacao.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_Ventilacao.setText("Ventilação");

        SAV_Desfibrlhação.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_Desfibrlhação.setText("Desfibrilhação");

        SAV_CTE.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_CTE.setText("CTE");

        SAV_Farmacos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_Farmacos.setText("Fármacos");

        Label_Hora_Inicio_SAV1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Hora_Inicio_SAV1.setText("Hora 1º Choque");

        Label_RCE.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_RCE.setText("RCE");

        RCE_box.setBackground(new java.awt.Color(242, 242, 242));
        RCE_box.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        RCE_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "sim", "não" }));
        RCE_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCE_boxActionPerformed(evt);
            }
        });

        Hora_Inicio_SAV1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        Hora_Inicio_SAV1.setText("00:00");
        Hora_Inicio_SAV1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Hora_Inicio_SAV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hora_Inicio_SAV1ActionPerformed(evt);
            }
        });

        jDesktopPanePCR1.setLayer(Label_Motivo_PCR1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_Equipa_Local_SAV1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Motivo_box, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Equipa_Local_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(PCR_Voltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(n_evento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(PCR_Voltar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_Hora_Inicio_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Hora_Inicio_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_Procedimento_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_Ventilacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_Desfibrlhação, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_CTE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_Farmacos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_Hora_Inicio_SAV1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_RCE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(RCE_box, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Hora_Inicio_SAV1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanePCR1Layout = new javax.swing.GroupLayout(jDesktopPanePCR1);
        jDesktopPanePCR1.setLayout(jDesktopPanePCR1Layout);
        jDesktopPanePCR1Layout.setHorizontalGroup(
            jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                        .addComponent(Label_Motivo_PCR1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Motivo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                        .addComponent(Label_Equipa_Local_SAV1)
                        .addGap(18, 18, 18)
                        .addComponent(Equipa_Local_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                        .addComponent(Label_Hora_Inicio_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hora_Inicio_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                        .addComponent(Label_Hora_Inicio_SAV1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hora_Inicio_SAV1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                        .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Procedimento_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_RCE, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RCE_box, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SAV_Ventilacao)
                                    .addComponent(SAV_CTE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SAV_Farmacos)
                                    .addComponent(SAV_Desfibrlhação)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePCR1Layout.createSequentialGroup()
                                .addComponent(PCR_Voltar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PCR_Voltar)
                                .addGap(7, 7, 7)))))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jDesktopPanePCR1Layout.setVerticalGroup(
            jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(n_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Motivo_PCR1)
                    .addComponent(Motivo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Equipa_Local_SAV1)
                    .addComponent(Equipa_Local_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Hora_Inicio_SAV)
                    .addComponent(Hora_Inicio_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Procedimento_SAV)
                    .addComponent(SAV_Ventilacao)
                    .addComponent(SAV_Desfibrlhação))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAV_CTE)
                    .addComponent(SAV_Farmacos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Hora_Inicio_SAV1)
                    .addComponent(Hora_Inicio_SAV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_RCE)
                    .addComponent(RCE_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCR_Voltar)
                    .addComponent(PCR_Voltar1))
                .addContainerGap())
        );

        Motivo_box.getAccessibleContext().setAccessibleName("Motivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPanePCR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPanePCR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PCR_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCR_VoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_PCR_VoltarActionPerformed

    private void Equipa_Local_SAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipa_Local_SAVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Equipa_Local_SAVActionPerformed

    private void Motivo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Motivo_boxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Motivo_boxActionPerformed

    private void PCR_Voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCR_Voltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCR_Voltar1ActionPerformed

    private void Hora_Inicio_SAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hora_Inicio_SAVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hora_Inicio_SAVActionPerformed

    private void RCE_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCE_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RCE_boxActionPerformed

    private void Hora_Inicio_SAV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hora_Inicio_SAV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hora_Inicio_SAV1ActionPerformed

    private void setupComboBox() {
        Motivo_box.addItem("-");
    
        List<Motivo> motivos = Motivo.getAllMotivos();
        for (Motivo motivo : motivos) {
            Motivo_box.addItem(motivo.getMOTIVO());
        }
    }
    
    private void setupOptions() {
     
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
            java.util.logging.Logger.getLogger(Menu_PCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_PCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_PCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_PCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_PCR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Equipa_Local_SAV;
    private javax.swing.JFormattedTextField Hora_Inicio_SAV;
    private javax.swing.JFormattedTextField Hora_Inicio_SAV1;
    private javax.swing.JLabel Label_Equipa_Local_SAV1;
    private javax.swing.JLabel Label_Hora_Inicio_SAV;
    private javax.swing.JLabel Label_Hora_Inicio_SAV1;
    private javax.swing.JLabel Label_Motivo_PCR1;
    private javax.swing.JLabel Label_Procedimento_SAV;
    private javax.swing.JLabel Label_RCE;
    private javax.swing.JComboBox<String> Motivo_box;
    private javax.swing.JButton PCR_Voltar;
    private javax.swing.JButton PCR_Voltar1;
    private javax.swing.JComboBox<String> RCE_box;
    private javax.swing.JCheckBox SAV_CTE;
    private javax.swing.JCheckBox SAV_Desfibrlhação;
    private javax.swing.JCheckBox SAV_Farmacos;
    private javax.swing.JCheckBox SAV_Ventilacao;
    private javax.swing.JDesktopPane jDesktopPanePCR1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel n_evento;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

}
