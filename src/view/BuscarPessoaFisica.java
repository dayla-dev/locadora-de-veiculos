
package view;

import java.awt.Color;

/**
 *
 * @author Dayla
 */
public class BuscarPessoaFisica extends javax.swing.JDialog {

    
    public BuscarPessoaFisica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelCadPF.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPesq = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        panelPesq = new javax.swing.JPanel();
        pesqLabel = new javax.swing.JLabel();
        pesqField = new javax.swing.JTextField();
        pesqNome = new javax.swing.JRadioButton();
        pesqCPF = new javax.swing.JRadioButton();
        panelCadPF = new javax.swing.JPanel();
        labelCadPF = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar pessoa física");

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelPesq.setBackground(new java.awt.Color(242, 249, 249));

        pesqLabel.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        pesqLabel.setText("Pesquisar:");

        grupoPesq.add(pesqNome);
        pesqNome.setText("Pesquisar por nome");

        grupoPesq.add(pesqCPF);
        pesqCPF.setText("Pesquisar por CPF");

        panelCadPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCadPFMouseClicked(evt);
            }
        });

        labelCadPF.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelCadPF.setForeground(new java.awt.Color(0, 51, 204));
        labelCadPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addPessoa.png"))); // NOI18N
        labelCadPF.setText("Cadastrar nova pessoa física");

        javax.swing.GroupLayout panelCadPFLayout = new javax.swing.GroupLayout(panelCadPF);
        panelCadPF.setLayout(panelCadPFLayout);
        panelCadPFLayout.setHorizontalGroup(
            panelCadPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadPFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCadPF)
                .addContainerGap())
        );
        panelCadPFLayout.setVerticalGroup(
            panelCadPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadPFLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCadPF, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelPesqLayout = new javax.swing.GroupLayout(panelPesq);
        panelPesq.setLayout(panelPesqLayout);
        panelPesqLayout.setHorizontalGroup(
            panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesqLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(pesqNome)
                .addGap(18, 18, 18)
                .addComponent(pesqCPF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesqLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesqLayout.createSequentialGroup()
                        .addComponent(panelCadPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesqLayout.createSequentialGroup()
                        .addComponent(pesqLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesqField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        panelPesqLayout.setVerticalGroup(
            panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesqLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesqNome)
                    .addComponent(pesqCPF))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        editButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editButton.setText("Editar");

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(panelPesq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton)
                        .addGap(66, 66, 66))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void panelCadPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCadPFMouseClicked
        CadastroPessoaFisica cadPessoaFisica = new CadastroPessoaFisica(new TelaInicialSuper(), true);
        cadPessoaFisica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelCadPFMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoPesq;
    private javax.swing.JLabel labelCadPF;
    private javax.swing.JPanel panelCadPF;
    private javax.swing.JPanel panelPesq;
    private javax.swing.JRadioButton pesqCPF;
    private javax.swing.JTextField pesqField;
    private javax.swing.JLabel pesqLabel;
    private javax.swing.JRadioButton pesqNome;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
