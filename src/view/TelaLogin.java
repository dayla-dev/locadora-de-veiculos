
package view;

import br.com.locadoraPBD.JPAUtil.Criptografia;
import br.com.locadoraPBD.model.DAO.ValidacaoDAO;
import br.com.locadoraPBD.model.beans.Usuario;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayla
 */
public class TelaLogin extends javax.swing.JFrame {

    ArrayList<Usuario> usuarios = new ArrayList<>();
  
   private ValidacaoDAO validacao;
   private JFrame tela;
   
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        senhaField = new javax.swing.JPasswordField();
        entrarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        logomarca = new javax.swing.JLabel();
        notificacao = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginLabel.setText("Login:");
        getContentPane().add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        senhaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        senhaLabel.setText("Senha:");
        getContentPane().add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        loginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 140, -1));

        senhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, -1));

        entrarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        sairButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        logomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        getContentPane().add(logomarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 90));
        getContentPane().add(notificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 140, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background-banner.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFieldActionPerformed

    private void senhaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaFieldActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
       
        if(loginField.getText().equals("super")&&senhaField.getText().equals("super")){
            TelaInicialSuper telaSuper = new TelaInicialSuper();
            telaSuper.setVisible(true);
            this.dispose();            
        }
        else{
            List<Usuario> usuarios = validacao.ValidarLogin(loginField.getText());
            if(usuarios.size() == 0){
                notificacao.setText("Login Errado!");
            }
              else{
                   for(Usuario user: usuarios){
                       if(senhaField.getText().equals(Criptografia.descriptografar(user.getSenha()))){
                          notificacao.setText("Logado com sucesso!");
                        }
                       else{
                           notificacao.setText("Senha Errado!");
                       }
                    }
                }
        }
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel background;
    private javax.swing.JButton entrarButton;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel logomarca;
    private javax.swing.JLabel notificacao;
    private javax.swing.JButton sairButton;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
