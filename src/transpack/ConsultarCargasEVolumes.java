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
public class ConsultarCargasEVolumes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarCargasEVolumes
     */
    public ConsultarCargasEVolumes() {
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

        labelNIdentificacao = new javax.swing.JLabel();
        txtNIdentificacao = new javax.swing.JTextField();
        labelNPedido = new javax.swing.JLabel();
        txtNPedido = new javax.swing.JTextField();
        labelDestino = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jPanelBGConsultaCargasEVolumes1 = new javax.swing.JPanel();
        btnAlterarConsultaCargasEVolumes = new javax.swing.JButton();
        btnExcluirConsultaCargasEVolumes = new javax.swing.JButton();
        jPanelBGConsultaCargasEVolumes2 = new javax.swing.JPanel();
        btnConsultarConsultaCargasEVolumes = new javax.swing.JButton();
        btnNovaConsultaCargasEVolumes = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consultar Cargas e Volumes");

        labelNIdentificacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNIdentificacao.setForeground(new java.awt.Color(72, 61, 139));
        labelNIdentificacao.setText("N° Identificação");

        labelNPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNPedido.setForeground(new java.awt.Color(72, 61, 139));
        labelNPedido.setText("N° Pedido");

        labelDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDestino.setForeground(new java.awt.Color(72, 61, 139));
        labelDestino.setText("Destino");

        jPanelBGConsultaCargasEVolumes1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(72, 61, 139), 1, true));
        jPanelBGConsultaCargasEVolumes1.setForeground(new java.awt.Color(72, 61, 139));

        btnAlterarConsultaCargasEVolumes.setBackground(new java.awt.Color(72, 61, 139));
        btnAlterarConsultaCargasEVolumes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterarConsultaCargasEVolumes.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarConsultaCargasEVolumes.setText("Alterar");

        btnExcluirConsultaCargasEVolumes.setBackground(new java.awt.Color(72, 61, 139));
        btnExcluirConsultaCargasEVolumes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluirConsultaCargasEVolumes.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirConsultaCargasEVolumes.setText("Excluir");

        javax.swing.GroupLayout jPanelBGConsultaCargasEVolumes1Layout = new javax.swing.GroupLayout(jPanelBGConsultaCargasEVolumes1);
        jPanelBGConsultaCargasEVolumes1.setLayout(jPanelBGConsultaCargasEVolumes1Layout);
        jPanelBGConsultaCargasEVolumes1Layout.setHorizontalGroup(
            jPanelBGConsultaCargasEVolumes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGConsultaCargasEVolumes1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBGConsultaCargasEVolumes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarConsultaCargasEVolumes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirConsultaCargasEVolumes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelBGConsultaCargasEVolumes1Layout.setVerticalGroup(
            jPanelBGConsultaCargasEVolumes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGConsultaCargasEVolumes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlterarConsultaCargasEVolumes)
                .addGap(17, 17, 17)
                .addComponent(btnExcluirConsultaCargasEVolumes)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelBGConsultaCargasEVolumes2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(72, 61, 139), 1, true));
        jPanelBGConsultaCargasEVolumes2.setForeground(new java.awt.Color(72, 61, 139));

        btnConsultarConsultaCargasEVolumes.setBackground(new java.awt.Color(72, 61, 139));
        btnConsultarConsultaCargasEVolumes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultarConsultaCargasEVolumes.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarConsultaCargasEVolumes.setText("Consultar");

        btnNovaConsultaCargasEVolumes.setBackground(new java.awt.Color(72, 61, 139));
        btnNovaConsultaCargasEVolumes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovaConsultaCargasEVolumes.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaConsultaCargasEVolumes.setText("Nova Consulta");

        javax.swing.GroupLayout jPanelBGConsultaCargasEVolumes2Layout = new javax.swing.GroupLayout(jPanelBGConsultaCargasEVolumes2);
        jPanelBGConsultaCargasEVolumes2.setLayout(jPanelBGConsultaCargasEVolumes2Layout);
        jPanelBGConsultaCargasEVolumes2Layout.setHorizontalGroup(
            jPanelBGConsultaCargasEVolumes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGConsultaCargasEVolumes2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBGConsultaCargasEVolumes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarConsultaCargasEVolumes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaConsultaCargasEVolumes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelBGConsultaCargasEVolumes2Layout.setVerticalGroup(
            jPanelBGConsultaCargasEVolumes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGConsultaCargasEVolumes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultarConsultaCargasEVolumes)
                .addGap(18, 18, 18)
                .addComponent(btnNovaConsultaCargasEVolumes)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(labelNIdentificacao)
                        .addGap(18, 18, 18)
                        .addComponent(txtNIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelNPedido)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(labelDestino)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelBGConsultaCargasEVolumes1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jPanelBGConsultaCargasEVolumes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNIdentificacao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNPedido))
                        .addGap(20, 20, 20)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDestino))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBGConsultaCargasEVolumes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBGConsultaCargasEVolumes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarConsultaCargasEVolumes;
    private javax.swing.JButton btnConsultarConsultaCargasEVolumes;
    private javax.swing.JButton btnExcluirConsultaCargasEVolumes;
    private javax.swing.JButton btnNovaConsultaCargasEVolumes;
    private javax.swing.JPanel jPanelBGConsultaCargasEVolumes1;
    private javax.swing.JPanel jPanelBGConsultaCargasEVolumes2;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelNIdentificacao;
    private javax.swing.JLabel labelNPedido;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtNIdentificacao;
    private javax.swing.JTextField txtNPedido;
    // End of variables declaration//GEN-END:variables
}
