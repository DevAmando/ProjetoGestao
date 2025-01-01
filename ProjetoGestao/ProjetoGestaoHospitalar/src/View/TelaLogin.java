
package View;

import Controller.LoginController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TelaLogin extends javax.swing.JFrame {

    
    public TelaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordFieldsenhaLogin = new javax.swing.JPasswordField();
        jTextFieldemailLogi = new javax.swing.JTextField();
        BotaoEntrarLogin = new javax.swing.JButton();
        jButtonRealizarCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        panel1 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordFieldsenhaLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldsenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldsenhaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldsenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 260, 40));

        jTextFieldemailLogi.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldemailLogi, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 260, 40));

        BotaoEntrarLogin.setBackground(new java.awt.Color(51, 51, 51));
        BotaoEntrarLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        BotaoEntrarLogin.setText("Login");
        BotaoEntrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 270, 50));

        jButtonRealizarCadastro.setBackground(new java.awt.Color(0, 255, 255));
        jButtonRealizarCadastro.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jButtonRealizarCadastro.setText("Realizar Cadastro");
        jButtonRealizarCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRealizarCadastro.setBorderPainted(false);
        jButtonRealizarCadastro.setContentAreaFilled(false);
        jButtonRealizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarCadastro.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jButtonRealizarCadastroComponentHidden(evt);
            }
        });
        jButtonRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 190, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaLogin.png"))); // NOI18N
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));
        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 80, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldsenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldsenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldsenhaLoginActionPerformed

    private void BotaoEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarLoginActionPerformed

        if (jTextFieldemailLogi.getText().matches("") || jPasswordFieldsenhaLogin.getText().matches("")) {

            JOptionPane.showMessageDialog(rootPane, "Preenchar todos os campus");
        } else {
            try {
                LoginController login = new LoginController();
                login.loginUsuario(this);
                TelaPrincipalView telaPrincipalView = new TelaPrincipalView();
                telaPrincipalView.setVisible(true);
                
            } catch (IOException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);

            }

        }


    }//GEN-LAST:event_BotaoEntrarLoginActionPerformed

    private void jButtonRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarCadastroActionPerformed
        TelaCadastroMedicoView telaDeCadastro = new TelaCadastroMedicoView();
        telaDeCadastro.setVisible(true);
    }//GEN-LAST:event_jButtonRealizarCadastroActionPerformed

    public JButton getBotaoEntrarLogin() {
        return BotaoEntrarLogin;
    }

    public void setBotaoEntrarLogin(JButton BotaoEntrarLogin) {
        this.BotaoEntrarLogin = BotaoEntrarLogin;
    }

    public JPasswordField getjPasswordFieldsenhaLogin() {
        return jPasswordFieldsenhaLogin;
    }

    public void setjPasswordFieldsenhaLogin(JPasswordField jPasswordFieldsenhaLogin) {
        this.jPasswordFieldsenhaLogin = jPasswordFieldsenhaLogin;
    }

    public JTextField getjTextFieldemailLogi() {
        return jTextFieldemailLogi;
    }

    public void setjTextFieldemailLogi(JTextField jTextFieldemailLogi) {
        this.jTextFieldemailLogi = jTextFieldemailLogi;
    }


    private void jButtonRealizarCadastroComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButtonRealizarCadastroComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRealizarCadastroComponentHidden

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
    private javax.swing.JButton BotaoEntrarLogin;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButtonRealizarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordFieldsenhaLogin;
    private javax.swing.JTextField jTextFieldemailLogi;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
