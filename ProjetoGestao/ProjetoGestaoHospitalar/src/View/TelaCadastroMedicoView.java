/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author david
 */
public class TelaCadastroMedicoView extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroMedicoView
     */
    public TelaCadastroMedicoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCRMMedico = new javax.swing.JTextField();
        jComboBoxUFMedico = new javax.swing.JComboBox<>();
        jComboBoxEspecialidadesMedicas1 = new javax.swing.JComboBox<>();
        jTextFieldNomeCadastroMedico1 = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCRMMedico.setBackground(new java.awt.Color(153, 153, 255));
        jTextFieldCRMMedico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCRMMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCRMMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCRMMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 300, 30));

        jComboBoxUFMedico.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxUFMedico.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxUFMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Amapá (AP)", "Amazonas (AM)", "Pará (PA)", "Rondônia (RO)", "Roraima (RR)", "Tocantins (TO)", "Alagoas (AL)", "Bahia (BA)", "Ceará (CE)", "Maranhão (MA)", "Paraíba (PB)", "Pernambuco (PE)", "Piauí (PI)", "Rio Grande do Norte (RN)", "Sergipe (SE)", "Distrito Federal (DF)", "Goiás (GO)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Espírito Santo (ES)", "Minas Gerais (MG)", "Rio de Janeiro (RJ)", "São Paulo (SP)", "Paraná (PR)", "Rio Grande do Sul (RS)", "Santa Catarina (SC)" }));
        jComboBoxUFMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUFMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxUFMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 374, 300, 30));

        jComboBoxEspecialidadesMedicas1.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxEspecialidadesMedicas1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBoxEspecialidadesMedicas1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxEspecialidadesMedicas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia", "Ortopedia", "Pediatria", "Ginecologia", "Dermatologia", "Neurologia", "Oncologia", "Psiquiatria", "Endocrinologia", "Urologia", "Anestesiologia", "Reumatologia", "Gastroenterologia" }));
        jComboBoxEspecialidadesMedicas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidadesMedicas1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEspecialidadesMedicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 300, 30));

        jTextFieldNomeCadastroMedico1.setBackground(new java.awt.Color(153, 153, 255));
        jTextFieldNomeCadastroMedico1.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCadastroMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCadastroMedico1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCadastroMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 300, 30));

        jButtonCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCadastrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastro Médico .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCRMMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCRMMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCRMMedicoActionPerformed

    private void jComboBoxUFMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUFMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUFMedicoActionPerformed

    private void jTextFieldNomeCadastroMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCadastroMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCadastroMedico1ActionPerformed

    private void jComboBoxEspecialidadesMedicas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadesMedicas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspecialidadesMedicas1ActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
    private javax.swing.JTextField jTextFieldCRMMedico;
    private javax.swing.JTextField jTextFieldNomeCadastroMedico1;
    // End of variables declaration//GEN-END:variables
}