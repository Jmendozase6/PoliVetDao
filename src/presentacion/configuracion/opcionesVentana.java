package presentacion.configuracion;

public class opcionesVentana extends javax.swing.JPanel {

    public opcionesVentana () {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnMinimizar = new javax.swing.JButton();
        jbtnMinimizar1 = new javax.swing.JButton();
        jbtnMinimizar2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconMinimizar.png"))); // NOI18N
        jbtnMinimizar.setBorderPainted(false);
        jbtnMinimizar.setContentAreaFilled(false);
        jbtnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMinimizar.setFocusPainted(false);
        jbtnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizarActionPerformed(evt);
            }
        });
        add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jbtnMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconCerrar.png"))); // NOI18N
        jbtnMinimizar1.setBorderPainted(false);
        jbtnMinimizar1.setContentAreaFilled(false);
        jbtnMinimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMinimizar1.setFocusPainted(false);
        jbtnMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizar1ActionPerformed(evt);
            }
        });
        add(jbtnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 0, -1, -1));

        jbtnMinimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconMaximizar.png"))); // NOI18N
        jbtnMinimizar2.setBorderPainted(false);
        jbtnMinimizar2.setContentAreaFilled(false);
        jbtnMinimizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMinimizar2.setFocusPainted(false);
        jbtnMinimizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizar2ActionPerformed(evt);
            }
        });
        add(jbtnMinimizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMinimizarActionPerformed

    private void jbtnMinimizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMinimizar2ActionPerformed

    private void jbtnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnMinimizar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnMinimizar;
    private javax.swing.JButton jbtnMinimizar1;
    private javax.swing.JButton jbtnMinimizar2;
    // End of variables declaration//GEN-END:variables
}
