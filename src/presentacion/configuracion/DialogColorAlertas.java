package presentacion.configuracion;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.awt.Color;
import javax.swing.JOptionPane;

public class DialogColorAlertas extends javax.swing.JDialog {

    public DialogColorAlertas (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        this.setBackground(new Color(1, 1, 1, 0));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jbtnRegistrarMascota = new presentacion.files.componentes.ButtonCustom();
        jTitle4 = new javax.swing.JLabel();
        jcbxColorAlertas = new javax.swing.JComboBox<>();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCustom2.setBackground(new java.awt.Color(242, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrarMascota.setText("Seleccionar");
        jbtnRegistrarMascota.setFocusPainted(false);
        jbtnRegistrarMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarMascotaActionPerformed(evt);
            }
        });
        panelCustom2.add(jbtnRegistrarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 40));

        jTitle4.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle4.setForeground(new java.awt.Color(82, 183, 136));
        jTitle4.setText("Seleccione un color");
        panelCustom2.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jcbxColorAlertas.setBackground(new java.awt.Color(242, 255, 255));
        jcbxColorAlertas.setFont(new java.awt.Font("Gilroy-Regular", 0, 12)); // NOI18N
        jcbxColorAlertas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Morado", "Oscuras" }));
        jcbxColorAlertas.setBorder(null);
        panelCustom2.add(jcbxColorAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 270, 40));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconCerrar.png"))); // NOI18N
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFocusPainted(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        panelCustom2.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 24, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarMascotaActionPerformed

        if (jcbxColorAlertas.getSelectedIndex() == 0) {
            FlatArcOrangeIJTheme.setup();
        }

        if (jcbxColorAlertas.getSelectedIndex() == 1) {
            FlatDarkPurpleIJTheme.setup();
        }

        if (jcbxColorAlertas.getSelectedIndex() == 2) {
            FlatOneDarkIJTheme.setup();
        }

        JOptionPane.showMessageDialog(null, "Ejemplo de las alertas");

    }//GEN-LAST:event_jbtnRegistrarMascotaActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jTitle4;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarMascota;
    private javax.swing.JComboBox<String> jcbxColorAlertas;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
