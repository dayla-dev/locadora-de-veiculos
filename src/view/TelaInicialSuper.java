package view;

/**
 *
 * @author Dayla
 */
public class TelaInicialSuper extends javax.swing.JFrame {

    public TelaInicialSuper() {
        initComponents();
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TelaInicialSuper().setVisible(true);
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        usuariosCad = new javax.swing.JMenuItem();
        pessoaFisCad = new javax.swing.JMenuItem();
        pessoaJurCad = new javax.swing.JMenuItem();
        filialCad = new javax.swing.JMenuItem();
        categoriaCad = new javax.swing.JMenuItem();
        veiculoCad = new javax.swing.JMenuItem();
        CamionteCargaCad = new javax.swing.JMenuItem();
        camionetePassCad = new javax.swing.JMenuItem();
        buscas = new javax.swing.JMenu();
        bUsuario = new javax.swing.JMenuItem();
        bPessoaFis = new javax.swing.JMenuItem();
        bPessoaJur = new javax.swing.JMenuItem();
        bFilial = new javax.swing.JMenuItem();
        bCategoria = new javax.swing.JMenuItem();
        bVeiculo = new javax.swing.JMenuItem();
        bCamioneteCar = new javax.swing.JMenuItem();
        bCamionetePas = new javax.swing.JMenuItem();
        servicos = new javax.swing.JMenu();
        reservarCategoria = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        configuracoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super usuário");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(640, 465));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 455));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/telaBack.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 640, 480));

        cadastro.setText("Cadastrar");

        usuariosCad.setText("Usuarios");
        usuariosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosCadActionPerformed(evt);
            }
        });
        cadastro.add(usuariosCad);

        pessoaFisCad.setText("Pessoas físicas");
        pessoaFisCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaFisCadActionPerformed(evt);
            }
        });
        cadastro.add(pessoaFisCad);

        pessoaJurCad.setText("Pessoas jurídicas");
        pessoaJurCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaJurCadActionPerformed(evt);
            }
        });
        cadastro.add(pessoaJurCad);

        filialCad.setText("Filial");
        filialCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filialCadActionPerformed(evt);
            }
        });
        cadastro.add(filialCad);

        categoriaCad.setText("Categoria");
        categoriaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaCadActionPerformed(evt);
            }
        });
        cadastro.add(categoriaCad);

        veiculoCad.setText("Veículo");
        cadastro.add(veiculoCad);

        CamionteCargaCad.setText("Camionete carga");
        cadastro.add(CamionteCargaCad);

        camionetePassCad.setText("Camionete passageiros");
        cadastro.add(camionetePassCad);

        jMenuBar1.add(cadastro);

        buscas.setText("Buscar");

        bUsuario.setText("Usuario");
        bUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioActionPerformed(evt);
            }
        });
        buscas.add(bUsuario);

        bPessoaFis.setText("Pessoa Física");
        buscas.add(bPessoaFis);

        bPessoaJur.setText("Pessoa Jurídica");
        buscas.add(bPessoaJur);

        bFilial.setText("Filial");
        buscas.add(bFilial);

        bCategoria.setText("Categoria");
        bCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCategoriaActionPerformed(evt);
            }
        });
        buscas.add(bCategoria);

        bVeiculo.setText("Veiculo");
        bVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVeiculoActionPerformed(evt);
            }
        });
        buscas.add(bVeiculo);

        bCamioneteCar.setText("Camionete Carga");
        buscas.add(bCamioneteCar);

        bCamionetePas.setText("Camionete Passageiros");
        buscas.add(bCamionetePas);

        jMenuBar1.add(buscas);

        servicos.setText("Serviços");

        reservarCategoria.setText("Reservar Categoria");
        servicos.add(reservarCategoria);

        jMenuItem1.setText("Alocar Veículo");
        servicos.add(jMenuItem1);

        jMenuBar1.add(servicos);

        configuracoes.setText("Configurações");
        jMenuBar1.add(configuracoes);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categoriaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaCadActionPerformed
        CadastroCategoria cadCategoria = new CadastroCategoria(this, true);
        cadCategoria.setVisible(true);
    }//GEN-LAST:event_categoriaCadActionPerformed

    private void bVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVeiculoActionPerformed

    private void bUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bUsuarioActionPerformed

    private void bCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCategoriaActionPerformed

    private void usuariosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosCadActionPerformed
       CadastroUsuario cadUsuario = new CadastroUsuario(this, true);
       cadUsuario.setVisible(true);
    }//GEN-LAST:event_usuariosCadActionPerformed

    private void pessoaFisCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaFisCadActionPerformed
        CadastroPessoaFisica cadPessoaFisica = new CadastroPessoaFisica(this, true);
        cadPessoaFisica.setVisible(true);
    }//GEN-LAST:event_pessoaFisCadActionPerformed

    private void pessoaJurCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaJurCadActionPerformed
        CadastroPessoaJuridica cadPessoaJur = new CadastroPessoaJuridica(this, true);
        cadPessoaJur.setVisible(true);
    }//GEN-LAST:event_pessoaJurCadActionPerformed

    private void filialCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filialCadActionPerformed
        CadastroFilial cadFilial = new CadastroFilial(this, true);
        cadFilial.setVisible(true);
    }//GEN-LAST:event_filialCadActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CamionteCargaCad;
    private javax.swing.JMenuItem bCamioneteCar;
    private javax.swing.JMenuItem bCamionetePas;
    private javax.swing.JMenuItem bCategoria;
    private javax.swing.JMenuItem bFilial;
    private javax.swing.JMenuItem bPessoaFis;
    private javax.swing.JMenuItem bPessoaJur;
    private javax.swing.JMenuItem bUsuario;
    private javax.swing.JMenuItem bVeiculo;
    private javax.swing.JLabel background;
    private javax.swing.JMenu buscas;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem camionetePassCad;
    private javax.swing.JMenuItem categoriaCad;
    private javax.swing.JMenu configuracoes;
    private javax.swing.JMenuItem filialCad;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem pessoaFisCad;
    private javax.swing.JMenuItem pessoaJurCad;
    private javax.swing.JMenuItem reservarCategoria;
    private javax.swing.JMenu servicos;
    private javax.swing.JMenuItem usuariosCad;
    private javax.swing.JMenuItem veiculoCad;
    // End of variables declaration//GEN-END:variables

}
