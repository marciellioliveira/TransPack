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
public class CadastrarFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarFornecedor
     */
    public CadastrarFornecedor() {
        initComponents();
        //setLocationRelativeTo(null);
        
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
        panelCadFornecedor = new javax.swing.JPanel();
        txtEndereco = new javax.swing.JTextField();
        labelTipoDoProduto = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelCNPJ = new javax.swing.JLabel();
        txtTipoDoProduto = new javax.swing.JTextField();
        labelContatoInterno = new javax.swing.JLabel();
        txtContatoInterno = new javax.swing.JTextField();
        btnCadastrarFornecedor = new javax.swing.JButton();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Cadastrar Fornecedor");
        setPreferredSize(new java.awt.Dimension(816, 548));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTipoDoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTipoDoProduto.setForeground(new java.awt.Color(72, 61, 139));
        labelTipoDoProduto.setText("Tipo do Produto");

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(72, 61, 139));
        labelTelefone.setText("Telefone");

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(72, 61, 139));
        labelNome.setText("Nome");

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEndereco.setForeground(new java.awt.Color(72, 61, 139));
        labelEndereco.setText("Endereço");

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(72, 61, 139));
        labelEmail.setText("Email");

        labelCNPJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCNPJ.setForeground(new java.awt.Color(72, 61, 139));
        labelCNPJ.setText("CNPJ");

        labelContatoInterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelContatoInterno.setForeground(new java.awt.Color(72, 61, 139));
        labelContatoInterno.setText("Contato Interno");

        btnCadastrarFornecedor.setBackground(new java.awt.Color(72, 61, 139));
        btnCadastrarFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFornecedor.setText("Cadastrar");
        btnCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFornecedorActionPerformed(evt);
            }
        });

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelCadFornecedorLayout = new javax.swing.GroupLayout(panelCadFornecedor);
        panelCadFornecedor.setLayout(panelCadFornecedorLayout);
        panelCadFornecedorLayout.setHorizontalGroup(
            panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadFornecedorLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelCadFornecedorLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEndereco)
                                .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelCNPJ, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(panelCadFornecedorLayout.createSequentialGroup()
                            .addComponent(labelTipoDoProduto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTipoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(labelContatoInterno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                            .addComponent(txtContatoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        panelCadFornecedorLayout.setVerticalGroup(
            panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadFornecedorLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(31, 31, 31)
                .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCNPJ)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereco))
                .addGap(31, 31, 31)
                .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCadFornecedorLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(labelTipoDoProduto))
                        .addComponent(txtTipoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelContatoInterno)
                        .addComponent(txtContatoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarFornecedor)
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        setBounds(0, 0, 1057, 614);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFornecedorActionPerformed
     JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
    }//GEN-LAST:event_btnCadastrarFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCNPJ;
    private javax.swing.JLabel labelContatoInterno;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTipoDoProduto;
    private javax.swing.JPanel panelCadFornecedor;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtContatoInterno;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtTipoDoProduto;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}