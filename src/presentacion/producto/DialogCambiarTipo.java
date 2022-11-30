package presentacion.producto;

import businessobject.RolControl;
import businessobject.TipoProductoControl;
import java.awt.Color;
import javax.swing.JComboBox;

public class DialogCambiarTipo extends javax.swing.JDialog {

    private final TipoProductoControl CONTROL;
    private final FrmProducto FRM;

    public DialogCambiarTipo (java.awt.Frame parent, boolean modal, FrmProducto frm) {
        super(parent, modal);
        this.setUndecorated(true);
        this.setBackground(new Color(1, 1, 1, 0));
        initComponents();
        CONTROL = new TipoProductoControl();
        this.FRM = frm;
        jcbxTipoProducto.setModel(CONTROL.seleccionar());
        jcbxTipoProducto.setSelectedIndex(0);
    }

    private int obtenerIdDelCombo (JComboBox combo) {
        return Integer.parseInt(combo.getSelectedItem().toString().split("-")[0].trim());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jbtnRegistrarMascota = new presentacion.files.componentes.ButtonCustom();
        jTitle4 = new javax.swing.JLabel();
        jcbxTipoProducto = new javax.swing.JComboBox<>();
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
        jTitle4.setText("Seleccione un tipo");
        panelCustom2.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jcbxTipoProducto.setBackground(new java.awt.Color(242, 255, 255));
        jcbxTipoProducto.setFont(new java.awt.Font("Gilroy-Regular", 0, 12)); // NOI18N
        jcbxTipoProducto.setForeground(new java.awt.Color(51, 51, 51));
        jcbxTipoProducto.setBorder(null);
        panelCustom2.add(jcbxTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 270, 40));

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
        FRM.jtxtIdTipoProducto.setText(String.valueOf(obtenerIdDelCombo(jcbxTipoProducto)));
        this.dispose();
    }//GEN-LAST:event_jbtnRegistrarMascotaActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jTitle4;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarMascota;
    private javax.swing.JComboBox<String> jcbxTipoProducto;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
