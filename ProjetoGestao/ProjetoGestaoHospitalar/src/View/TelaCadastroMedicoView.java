
package View;

import Utel.ValidacaoCadastro;
import Controller.LoginController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaCadastroMedicoView extends javax.swing.JFrame {

    
    public TelaCadastroMedicoView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCRMMedico = new javax.swing.JTextField();
        jComboBoxUFMedico = new javax.swing.JComboBox<>();
        jComboBoxEspecialidadesMedicas1 = new javax.swing.JComboBox<>();
        jTextFieldCPFMedico = new javax.swing.JTextField();
        jTextFieldsenhaMedico1 = new javax.swing.JTextField();
        jTextFieldemailMedico = new javax.swing.JTextField();
        jTextFieldNomeCadastroMedico3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelNomeCadastroMeidco = new javax.swing.JLabel();
        jLabelNomeCadastroMeidco1 = new javax.swing.JLabel();
        jLabelNomeCadastroMeidco2 = new javax.swing.JLabel();
        jLabelNomeCadastroMeidco4 = new javax.swing.JLabel();
        jLabelNomeCadastroMeidco9 = new javax.swing.JLabel();
        jLabelNomeCadastroMeidco10 = new javax.swing.JLabel();
        jLabelNomeCadastroMeidco3 = new javax.swing.JLabel();
        jLabeleamialMedico = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Medico");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCRMMedico.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldCRMMedico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCRMMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCRMMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCRMMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 110, 30));

        jComboBoxUFMedico.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxUFMedico.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxUFMedico.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxUFMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Amapá (AP)", "Amazonas (AM)", "Pará (PA)", "Rondônia (RO)", "Roraima (RR)", "Tocantins (TO)", "Alagoas (AL)", "Bahia (BA)", "Ceará (CE)", "Maranhão (MA)", "Paraíba (PB)", "Pernambuco (PE)", "Piauí (PI)", "Rio Grande do Norte (RN)", "Sergipe (SE)", "Distrito Federal (DF)", "Goiás (GO)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Espírito Santo (ES)", "Minas Gerais (MG)", "Rio de Janeiro (RJ)", "São Paulo (SP)", "Paraná (PR)", "Rio Grande do Sul (RS)", "Santa Catarina (SC)" }));
        jComboBoxUFMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUFMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxUFMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 170, 30));

        jComboBoxEspecialidadesMedicas1.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxEspecialidadesMedicas1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxEspecialidadesMedicas1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxEspecialidadesMedicas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia", "Ortopedia", "Pediatria", "Ginecologia", "Dermatologia", "Neurologia", "Oncologia", "Psiquiatria", "Endocrinologia", "Urologia", "Anestesiologia", "Reumatologia", "Gastroenterologia" }));
        jComboBoxEspecialidadesMedicas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidadesMedicas1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEspecialidadesMedicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 300, 30));

        jTextFieldCPFMedico.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldCPFMedico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCPFMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCPFMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 300, 30));

        jTextFieldsenhaMedico1.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldsenhaMedico1.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldsenhaMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsenhaMedico1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldsenhaMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 300, 30));

        jTextFieldemailMedico.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldemailMedico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldemailMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldemailMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 300, 30));

        jTextFieldNomeCadastroMedico3.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldNomeCadastroMedico3.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCadastroMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCadastroMedico3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCadastroMedico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 300, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 30, -1));

        jButtonCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCadastrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 270, 50));

        jLabelNomeCadastroMeidco.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroMeidco.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelNomeCadastroMeidco.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCadastroMeidco.setText("UF");
        getContentPane().add(jLabelNomeCadastroMeidco, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, -1, -1));

        jLabelNomeCadastroMeidco1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroMeidco1.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelNomeCadastroMeidco1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCadastroMeidco1.setText("CPF");
        getContentPane().add(jLabelNomeCadastroMeidco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        jLabelNomeCadastroMeidco2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroMeidco2.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelNomeCadastroMeidco2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCadastroMeidco2.setText("Especialidade");
        getContentPane().add(jLabelNomeCadastroMeidco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jLabelNomeCadastroMeidco4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroMeidco4.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelNomeCadastroMeidco4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCadastroMeidco4.setText("CRM");
        getContentPane().add(jLabelNomeCadastroMeidco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jLabelNomeCadastroMeidco9.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroMeidco9.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelNomeCadastroMeidco9.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCadastroMeidco9.setText("Nome Completo");
        getContentPane().add(jLabelNomeCadastroMeidco9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jLabelNomeCadastroMeidco10.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroMeidco10.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelNomeCadastroMeidco10.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCadastroMeidco10.setText("E-mail");
        getContentPane().add(jLabelNomeCadastroMeidco10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabelNomeCadastroMeidco3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroMeidco3.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelNomeCadastroMeidco3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeCadastroMeidco3.setText("Senha");
        getContentPane().add(jLabelNomeCadastroMeidco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        jLabeleamialMedico.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabeleamialMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastro Médico  (3).png"))); // NOI18N
        getContentPane().add(jLabeleamialMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));
        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCRMMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCRMMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCRMMedicoActionPerformed

    private void jComboBoxUFMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUFMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUFMedicoActionPerformed

    private void jTextFieldemailMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldemailMedicoActionPerformed

    private void jComboBoxEspecialidadesMedicas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadesMedicas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspecialidadesMedicas1ActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

      

        if (jTextFieldNomeCadastroMedico3.getText().matches("") || jTextFieldemailMedico.getText().matches("") || jTextFieldCRMMedico.getText().matches("") || jTextFieldsenhaMedico1.getText().matches("") || jTextFieldCRMMedico.getText().matches("")) {
            JOptionPane.showMessageDialog(rootPane, "Preenchar todos os campus");

        } else {
            try {
                LoginController cadastro = new LoginController();
                cadastro.CadastrarUsuario(this);
            } catch (IOException ex) {
                Logger.getLogger(TelaCadastroMedicoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Cadastro Realizado com Sucesso");
            this.setVisible(false);

        }


    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldCPFMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFMedicoActionPerformed

    private void jTextFieldNomeCadastroMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCadastroMedico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCadastroMedico3ActionPerformed

    private void jTextFieldsenhaMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsenhaMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsenhaMedico1ActionPerformed

    public JTextField getjTextFieldCRMMedico() {
        return jTextFieldCRMMedico;
    }

    public void setjTextFieldCRMMedico(JTextField jTextFieldCRMMedico) {
        this.jTextFieldCRMMedico = jTextFieldCRMMedico;
    }

    public JTextField getjTextFieldNomeCadastroMedico3() {
        return jTextFieldNomeCadastroMedico3;
    }

    public void setjTextFieldNomeCadastroMedico3(JTextField jTextFieldNomeCadastroMedico3) {
        this.jTextFieldNomeCadastroMedico3 = jTextFieldNomeCadastroMedico3;
    }

    public JTextField getjTextFieldemailMedico() {
        return jTextFieldemailMedico;
    }

    public void setjTextFieldemailMedico(JTextField jTextFieldemailMedico) {
        this.jTextFieldemailMedico = jTextFieldemailMedico;
    }

    public JTextField getjTextFieldsenhaMedico() {
        return jTextFieldCPFMedico;
    }

    public void setjTextFieldsenhaMedico(JTextField jTextFieldsenhaMedico) {
        this.jTextFieldCPFMedico = jTextFieldsenhaMedico;
    }

    public JTextField getjTextFieldCPFMedico() {
        return jTextFieldCPFMedico;
    }

    public void setjTextFieldCPFMedico(JTextField jTextFieldCPFMedico) {
        this.jTextFieldCPFMedico = jTextFieldCPFMedico;
    }

    public JTextField getjTextFieldsenhaMedico1() {
        return jTextFieldsenhaMedico1;
    }

    public void setjTextFieldsenhaMedico1(JTextField jTextFieldsenhaMedico) {
        this.jTextFieldsenhaMedico1 = jTextFieldsenhaMedico;
    }

    public JComboBox<String> getjComboBoxEspecialidadesMedicas1() {
        return jComboBoxEspecialidadesMedicas1;
    }

    public void setjComboBoxEspecialidadesMedicas1(JComboBox<String> jComboBoxEspecialidadesMedicas1) {
        this.jComboBoxEspecialidadesMedicas1 = jComboBoxEspecialidadesMedicas1;
    }

    public JComboBox<String> getjComboBoxUFMedico() {
        return jComboBoxUFMedico;
    }

    public void setjComboBoxUFMedico(JComboBox<String> jComboBoxUFMedico) {
        this.jComboBoxUFMedico = jComboBoxUFMedico;
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
            java.util.logging.Logger.getLogger(TelaCadastroMedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroMedicoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JComboBox<String> jComboBoxEspecialidadesMedicas1;
    private javax.swing.JComboBox<String> jComboBoxUFMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomeCadastroMeidco;
    private javax.swing.JLabel jLabelNomeCadastroMeidco1;
    private javax.swing.JLabel jLabelNomeCadastroMeidco10;
    private javax.swing.JLabel jLabelNomeCadastroMeidco2;
    private javax.swing.JLabel jLabelNomeCadastroMeidco3;
    private javax.swing.JLabel jLabelNomeCadastroMeidco4;
    private javax.swing.JLabel jLabelNomeCadastroMeidco9;
    private javax.swing.JLabel jLabeleamialMedico;
    private javax.swing.JTextField jTextFieldCPFMedico;
    private javax.swing.JTextField jTextFieldCRMMedico;
    private javax.swing.JTextField jTextFieldNomeCadastroMedico3;
    private javax.swing.JTextField jTextFieldemailMedico;
    private javax.swing.JTextField jTextFieldsenhaMedico1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables

    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
