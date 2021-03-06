/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpack;

import java.awt.Dimension;

/**
 *
 * @author Marcielli
 */
public class ControlarSaidaDeCarga extends javax.swing.JInternalFrame {

    /**
     * Creates new form ControlarSaidaDeCarga
     */
    public ControlarSaidaDeCarga() {
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
        jPanelBGConsultaDataDeSaida2 = new javax.swing.JPanel();
        btnCadastrarConsultaSaidaDeCarga = new javax.swing.JButton();
        labelNIdentificacao = new javax.swing.JLabel();
        txtNIdentificacao = new javax.swing.JTextField();
        labelNPedido = new javax.swing.JLabel();
        txtNPedido = new javax.swing.JTextField();
        labelDataDeSaida = new javax.swing.JLabel();
        txtDataDeSaida = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Controlar Saída de Carga");

        jPanelBGConsultaDataDeSaida2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(72, 61, 139), 1, true));
        jPanelBGConsultaDataDeSaida2.setForeground(new java.awt.Color(72, 61, 139));

        btnCadastrarConsultaSaidaDeCarga.setBackground(new java.awt.Color(72, 61, 139));
        btnCadastrarConsultaSaidaDeCarga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarConsultaSaidaDeCarga.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarConsultaSaidaDeCarga.setText("Cadastrar");

        javax.swing.GroupLayout jPanelBGConsultaDataDeSaida2Layout = new javax.swing.GroupLayout(jPanelBGConsultaDataDeSaida2);
        jPanelBGConsultaDataDeSaida2.setLayout(jPanelBGConsultaDataDeSaida2Layout);
        jPanelBGConsultaDataDeSaida2Layout.setHorizontalGroup(
            jPanelBGConsultaDataDeSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGConsultaDataDeSaida2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarConsultaSaidaDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBGConsultaDataDeSaida2Layout.setVerticalGroup(
            jPanelBGConsultaDataDeSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGConsultaDataDeSaida2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarConsultaSaidaDeCarga)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNIdentificacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNIdentificacao.setForeground(new java.awt.Color(72, 61, 139));
        labelNIdentificacao.setText("N° Identificação");

        labelNPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNPedido.setForeground(new java.awt.Color(72, 61, 139));
        labelNPedido.setText("N° Pedido");

        labelDataDeSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDataDeSaida.setForeground(new java.awt.Color(72, 61, 139));
        labelDataDeSaida.setText("Data de Saída");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(labelNIdentificacao)
                        .addGap(18, 18, 18)
                        .addComponent(txtNIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelDataDeSaida)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataDeSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanelBGConsultaDataDeSaida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelNPedido)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNIdentificacao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNPedido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDataDeSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataDeSaida))
                .addGap(22, 22, 22)
                .addComponent(jPanelBGConsultaDataDeSaida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarConsultaSaidaDeCarga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBGConsultaDataDeSaida2;
    private javax.swing.JLabel labelDataDeSaida;
    private javax.swing.JLabel labelNIdentificacao;
    private javax.swing.JLabel labelNPedido;
    private javax.swing.JTextField txtDataDeSaida;
    private javax.swing.JTextField txtNIdentificacao;
    private javax.swing.JTextField txtNPedido;
    // End of variables declaration//GEN-END:variables
}
