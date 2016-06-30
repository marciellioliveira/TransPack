/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpack;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcielli
 */
public class CadastrarVolumes extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarVolumes
     */
    public CadastrarVolumes() {
        initComponents();
    }
    
    //Abrir jInternalFrame Centralizado
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labeNPedido = new javax.swing.JLabel();
        txtNPedido = new javax.swing.JTextField();
        labelPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        labelDimensoes = new javax.swing.JLabel();
        txtDimensoes = new javax.swing.JTextField();
        labelQntVolumes = new javax.swing.JLabel();
        txtQntVolumes = new javax.swing.JTextField();
        btnCadastrarClienteFisico = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Volumes");

        labeNPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labeNPedido.setForeground(new java.awt.Color(72, 61, 139));
        labeNPedido.setText("N° Pedido");

        labelPeso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPeso.setForeground(new java.awt.Color(72, 61, 139));
        labelPeso.setText("Peso");

        labelDimensoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDimensoes.setForeground(new java.awt.Color(72, 61, 139));
        labelDimensoes.setText("Dimensões");

        labelQntVolumes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQntVolumes.setForeground(new java.awt.Color(72, 61, 139));
        labelQntVolumes.setText("Quantidade de Volumes");

        btnCadastrarClienteFisico.setBackground(new java.awt.Color(72, 61, 139));
        btnCadastrarClienteFisico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarClienteFisico.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarClienteFisico.setText("Cadastrar");
        btnCadastrarClienteFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteFisicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrarClienteFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelPeso)
                                .addGap(18, 18, 18)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(labelDimensoes)
                                .addGap(18, 18, 18)
                                .addComponent(txtDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelQntVolumes)
                                .addGap(18, 18, 18)
                                .addComponent(txtQntVolumes, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(labeNPedido)
                            .addGap(18, 18, 18)
                            .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeNPedido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPeso))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDimensoes))
                        .addGap(18, 18, 18)
                        .addComponent(txtQntVolumes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelQntVolumes))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarClienteFisico)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteFisicoActionPerformed
JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");      
    }//GEN-LAST:event_btnCadastrarClienteFisicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarClienteFisico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labeNPedido;
    private javax.swing.JLabel labelDimensoes;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelQntVolumes;
    private javax.swing.JTextField txtDimensoes;
    private javax.swing.JTextField txtNPedido;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtQntVolumes;
    // End of variables declaration//GEN-END:variables
}