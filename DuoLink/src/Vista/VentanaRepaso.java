/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author BOG-A408-E-016
 */
public class VentanaRepaso extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRepaso
     */
    public VentanaRepaso() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbutFrase = new javax.swing.JButton();
        jbutPronunciacion = new javax.swing.JButton();
        jbutRegresar5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE UNA OPCION DE REPASO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/44.PNG"))); // NOI18N

        jbutFrase.setBackground(new java.awt.Color(153, 0, 0));
        jbutFrase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbutFrase.setForeground(new java.awt.Color(255, 255, 255));
        jbutFrase.setText("Frase");
        jbutFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutFraseActionPerformed(evt);
            }
        });

        jbutPronunciacion.setBackground(new java.awt.Color(153, 0, 0));
        jbutPronunciacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbutPronunciacion.setForeground(new java.awt.Color(255, 255, 255));
        jbutPronunciacion.setText("Pronunciacion");
        jbutPronunciacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutPronunciacionActionPerformed(evt);
            }
        });

        jbutRegresar5.setBackground(new java.awt.Color(153, 0, 0));
        jbutRegresar5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbutRegresar5.setForeground(new java.awt.Color(255, 255, 255));
        jbutRegresar5.setText("Regresar");
        jbutRegresar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutRegresar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbutRegresar5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbutFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbutPronunciacion)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutPronunciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutRegresar5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutFraseActionPerformed
       VentanaFrases Vf = new VentanaFrases();
       Vf.setVisible(true);
       Vf.setTitle(" DuoLink - Repaso / Frase ");
       this.dispose();
    }//GEN-LAST:event_jbutFraseActionPerformed
/**
    private void jbutPronunciacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutPronunciacionActionPerformed
    }//GEN-LAST:event_jbutPronunciacionActionPerformed
*/
    private void jbutPronunciacionActionPerformed(java.awt.event.ActionEvent evt){
        VentanaPronunciacion Vp = new VentanaPronunciacion();
        Vp.setVisible(true);
        Vp.setTitle(" DuoLink - Repaso / Pronunciacion ");
        this.dispose();
    }
    private void jbutRegresar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutRegresar5ActionPerformed
        VentanaInicio Vi = new VentanaInicio();
        Vi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbutRegresar5ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRepaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRepaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutFrase;
    private javax.swing.JButton jbutPronunciacion;
    private javax.swing.JButton jbutRegresar5;
    // End of variables declaration//GEN-END:variables
}
