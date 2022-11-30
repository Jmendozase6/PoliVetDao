package presentacion.usuarios.veterinario;

import businessobject.MascotaControl;
import businessobject.TipoMascotaControl;
import businessobject.UsuarioControl;
import businessobject.Utilidades;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class DialogRegistrarMascota extends javax.swing.JDialog {

    private final UsuarioControl USUARIO_CONTROL;
    private final TipoMascotaControl T_MASCOTA_CONTROL;
    private final FrmMascotas FRM_Mascotas;

    public DialogRegistrarMascota (java.awt.Frame parent, boolean modal, FrmMascotas frmMascotas) {
        super(parent, modal);
        this.setUndecorated(true);
        this.setBackground(new Color(1, 1, 1, 0));
        initComponents();
        USUARIO_CONTROL = new UsuarioControl();
        T_MASCOTA_CONTROL = new TipoMascotaControl();
        this.FRM_Mascotas = frmMascotas;
        jcbxCliente.setModel(USUARIO_CONTROL.seleccionar());
        jcbxCliente.setSelectedIndex(0);
        jcbxTipoMascota.setModel(T_MASCOTA_CONTROL.seleccionar());
        jcbxTipoMascota.setSelectedIndex(0);
    }

    private int obtenerIdDelCombo (JComboBox combo) {
        return Integer.parseInt(combo.getSelectedItem().toString().split("-")[0].trim());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jcbxCliente = new javax.swing.JComboBox<>();
        jcbxTipoMascota = new javax.swing.JComboBox<>();
        labelError = new javax.swing.JLabel();
        jCorreo1 = new javax.swing.JLabel();
        jCorreo2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtnRegistrarMascota = new presentacion.files.componentes.ButtonCustom();
        jtxtNombre = new javax.swing.JTextField();
        jCorreo3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtRaza = new javax.swing.JTextField();
        jCorreo4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtGenero = new javax.swing.JTextField();
        jCorreo5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtPeso = new javax.swing.JTextField();
        jCorreo6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTitle4 = new javax.swing.JLabel();
        cerrar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(320, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom2.setBackground(new java.awt.Color(242, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxCliente.setBackground(new java.awt.Color(242, 255, 255));
        jcbxCliente.setFont(new java.awt.Font("Gilroy-Regular", 0, 12)); // NOI18N
        jcbxCliente.setForeground(new java.awt.Color(51, 51, 51));
        jcbxCliente.setBorder(null);
        panelCustom2.add(jcbxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 105, 200, 30));

        jcbxTipoMascota.setBackground(new java.awt.Color(242, 255, 255));
        jcbxTipoMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 12)); // NOI18N
        jcbxTipoMascota.setForeground(new java.awt.Color(51, 51, 51));
        jcbxTipoMascota.setBorder(null);
        panelCustom2.add(jcbxTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, 200, 30));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        panelCustom2.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 280, 25));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("ID Tipo Mascota");
        panelCustom2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jbtnRegistrarMascota.setText("Registrar");
        jbtnRegistrarMascota.setFocusPainted(false);
        jbtnRegistrarMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarMascotaActionPerformed(evt);
            }
        });
        panelCustom2.add(jbtnRegistrarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 280, 40));

        jtxtNombre.setBackground(new java.awt.Color(242, 255, 255));
        jtxtNombre.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(51, 51, 51));
        jtxtNombre.setBorder(null);
        jtxtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCustom2.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 265, 200, 30));

        jCorreo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 45, 66));
        jLabel8.setText("Nombre");
        panelCustom2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jtxtRaza.setBackground(new java.awt.Color(242, 255, 255));
        jtxtRaza.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtRaza.setForeground(new java.awt.Color(51, 51, 51));
        jtxtRaza.setBorder(null);
        jtxtRaza.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCustom2.add(jtxtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 345, 200, 30));

        jCorreo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 45, 66));
        jLabel9.setText("Raza");
        panelCustom2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jtxtGenero.setBackground(new java.awt.Color(242, 255, 255));
        jtxtGenero.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtGenero.setForeground(new java.awt.Color(51, 51, 51));
        jtxtGenero.setBorder(null);
        jtxtGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCustom2.add(jtxtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 425, 200, 30));

        jCorreo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Genero");
        panelCustom2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jtxtPeso.setBackground(new java.awt.Color(242, 255, 255));
        jtxtPeso.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtPeso.setForeground(new java.awt.Color(51, 51, 51));
        jtxtPeso.setBorder(null);
        jtxtPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCustom2.add(jtxtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 505, 200, 30));

        jCorreo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("Peso");
        panelCustom2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("Usuario");
        panelCustom2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTitle4.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle4.setForeground(new java.awt.Color(82, 183, 136));
        jTitle4.setText("Registrar mascota");
        panelCustom2.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        cerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconCerrar.png"))); // NOI18N
        cerrar2.setBorderPainted(false);
        cerrar2.setContentAreaFilled(false);
        cerrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar2.setFocusPainted(false);
        cerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar2ActionPerformed(evt);
            }
        });
        panelCustom2.add(cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 24, 24));

        getContentPane().add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarMascotaActionPerformed

        if (Utilidades.sonTextfieldsVacios(jtxtNombre, jtxtRaza, jtxtGenero, jtxtPeso)) {
            labelError.setText("Error, debe completar todos los campos.");
            return;
        }

        MascotaControl mascota = new MascotaControl();
        String resp = mascota.agregar(obtenerIdDelCombo(jcbxCliente), obtenerIdDelCombo(jcbxTipoMascota), jtxtNombre.getText(), jtxtRaza.getText(), jtxtGenero.getText(), jtxtPeso.getText());

        if (resp.equalsIgnoreCase("OK")) {
            JOptionPane.showMessageDialog(this, "Se registró correctamente", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            FRM_Mascotas.listar("");
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error en el registro.", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnRegistrarMascotaActionPerformed

    private void cerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar2;
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo2;
    private javax.swing.JLabel jCorreo3;
    private javax.swing.JLabel jCorreo4;
    private javax.swing.JLabel jCorreo5;
    private javax.swing.JLabel jCorreo6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jTitle4;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarMascota;
    private javax.swing.JComboBox<String> jcbxCliente;
    private javax.swing.JComboBox<String> jcbxTipoMascota;
    private javax.swing.JTextField jtxtGenero;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPeso;
    private javax.swing.JTextField jtxtRaza;
    private javax.swing.JLabel labelError;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
