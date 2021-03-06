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
public class SobreTransPack extends javax.swing.JInternalFrame {

    /**
     * Creates new form SobreTransPack
     */
    public SobreTransPack() {
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
        lbEntreEmContatoSite = new javax.swing.JLabel();
        lbEntreEmContatoSitewww = new javax.swing.JLabel();
        lbEntreEmContatoEmail = new javax.swing.JLabel();
        lbEntreEmContatoEmailContato = new javax.swing.JLabel();
        lbEntreEmContatoEmail1 = new javax.swing.JLabel();
        lbEntreEmContatoEmailContato1 = new javax.swing.JLabel();
        lbEntreEmContatoEmail2 = new javax.swing.JLabel();
        lbEntreEmContatoEmailContato2 = new javax.swing.JLabel();
        lbEntreEmContatoEmail3 = new javax.swing.JLabel();
        lbEntreEmContatoEmailContato3 = new javax.swing.JLabel();
        scrollbar1 = new java.awt.Scrollbar();

        setClosable(true);
        setResizable(true);
        setTitle("Sobre TransPack");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbEntreEmContatoSite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoSite.setForeground(new java.awt.Color(72, 61, 139));
        lbEntreEmContatoSite.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEntreEmContatoSite.setText("Site");

        lbEntreEmContatoSitewww.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoSitewww.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEntreEmContatoSitewww.setText("    www.transpack.tk");

        lbEntreEmContatoEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmail.setForeground(new java.awt.Color(72, 61, 139));
        lbEntreEmContatoEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEntreEmContatoEmail.setText("Email");

        lbEntreEmContatoEmailContato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmailContato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEntreEmContatoEmailContato.setText("    contato@transpack.tk");

        lbEntreEmContatoEmail1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmail1.setForeground(new java.awt.Color(72, 61, 139));
        lbEntreEmContatoEmail1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEntreEmContatoEmail1.setText("Facebook");

        lbEntreEmContatoEmailContato1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmailContato1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEntreEmContatoEmailContato1.setText("  TransPackBR");

        lbEntreEmContatoEmail2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmail2.setForeground(new java.awt.Color(72, 61, 139));
        lbEntreEmContatoEmail2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEntreEmContatoEmail2.setText("Twitter");

        lbEntreEmContatoEmailContato2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmailContato2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEntreEmContatoEmailContato2.setText("  @TransPackBR");

        lbEntreEmContatoEmail3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmail3.setForeground(new java.awt.Color(72, 61, 139));
        lbEntreEmContatoEmail3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEntreEmContatoEmail3.setText("Tumblr");

        lbEntreEmContatoEmailContato3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEntreEmContatoEmailContato3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEntreEmContatoEmailContato3.setText("  transpackbr.tumblr.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEntreEmContatoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEntreEmContatoSite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEntreEmContatoEmail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEntreEmContatoEmail2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEntreEmContatoEmail3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEntreEmContatoSitewww, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEntreEmContatoEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbEntreEmContatoEmailContato1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEntreEmContatoEmailContato3, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEntreEmContatoEmailContato2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntreEmContatoSite)
                    .addComponent(lbEntreEmContatoSitewww))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntreEmContatoEmail)
                    .addComponent(lbEntreEmContatoEmailContato))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntreEmContatoEmail1)
                    .addComponent(lbEntreEmContatoEmailContato1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntreEmContatoEmail2)
                    .addComponent(lbEntreEmContatoEmailContato2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntreEmContatoEmail3)
                    .addComponent(lbEntreEmContatoEmailContato3))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollbar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEntreEmContatoEmail;
    private javax.swing.JLabel lbEntreEmContatoEmail1;
    private javax.swing.JLabel lbEntreEmContatoEmail2;
    private javax.swing.JLabel lbEntreEmContatoEmail3;
    private javax.swing.JLabel lbEntreEmContatoEmailContato;
    private javax.swing.JLabel lbEntreEmContatoEmailContato1;
    private javax.swing.JLabel lbEntreEmContatoEmailContato2;
    private javax.swing.JLabel lbEntreEmContatoEmailContato3;
    private javax.swing.JLabel lbEntreEmContatoSite;
    private javax.swing.JLabel lbEntreEmContatoSitewww;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables
}
