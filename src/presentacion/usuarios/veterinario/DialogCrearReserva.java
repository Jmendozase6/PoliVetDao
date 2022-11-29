package presentacion.usuarios.veterinario;

import businessobject.MascotaControl;
import businessobject.ReservaControl;
import businessobject.Utilidades;
import java.awt.Color;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class DialogCrearReserva extends javax.swing.JDialog {

    private final ReservaControl RESERVA_CONTROL;
    private final MascotaControl MASCOTA_CONTROL;
    private final FrmReservaCitas frmReservaCitas;

    public DialogCrearReserva (java.awt.Frame parent, boolean modal, FrmReservaCitas frmReservaCitas) {
        super(parent, modal);
        this.setUndecorated(true);
        this.setBackground(new Color(1, 1, 1, 0));
        initComponents();
        RESERVA_CONTROL = new ReservaControl();
        MASCOTA_CONTROL = new MascotaControl();
        this.frmReservaCitas = frmReservaCitas;
        jcbxMascota.setModel(MASCOTA_CONTROL.seleccionar());
        jcbxMascota.setSelectedIndex(0);
        jdcFechaReserva.setMinSelectableDate(new Date());
    }

    private int obtenerIdDelCombo (JComboBox combo) {
        return Integer.parseInt(combo.getSelectedItem().toString().split("-")[0].trim());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jdcFechaReserva = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtDescripcion = new javax.swing.JTextArea();
        jcbxMascota = new javax.swing.JComboBox<>();
        labelError = new javax.swing.JLabel();
        jCorreo1 = new javax.swing.JLabel();
        jbtnRegistrarMascota = new presentacion.files.componentes.ButtonCustom();
        jCorreo3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCorreo4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTitle4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(320, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom2.setBackground(new java.awt.Color(242, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdcFechaReserva.setBackground(new java.awt.Color(242, 255, 255));
        jdcFechaReserva.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        panelCustom2.add(jdcFechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, 200, 30));

        jScrollPane1.setBorder(null);

        jtxtDescripcion.setBackground(new java.awt.Color(242, 255, 255));
        jtxtDescripcion.setColumns(20);
        jtxtDescripcion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtxtDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jtxtDescripcion.setLineWrap(true);
        jtxtDescripcion.setRows(5);
        jtxtDescripcion.setBorder(null);
        jtxtDescripcion.setSelectionColor(new java.awt.Color(82, 183, 136));
        jScrollPane1.setViewportView(jtxtDescripcion);

        panelCustom2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 265, 210, 130));

        jcbxMascota.setBackground(new java.awt.Color(242, 255, 255));
        jcbxMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 12)); // NOI18N
        jcbxMascota.setBorder(null);
        panelCustom2.add(jcbxMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 105, 200, 30));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        panelCustom2.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 407, 280, 25));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jbtnRegistrarMascota.setText("Registrar");
        jbtnRegistrarMascota.setFocusPainted(false);
        jbtnRegistrarMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarMascotaActionPerformed(evt);
            }
        });
        panelCustom2.add(jbtnRegistrarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 40));

        jCorreo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 45, 66));
        jLabel8.setText("Fecha de reserva");
        panelCustom2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jCorreo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtDescripcion.png"))); // NOI18N
        panelCustom2.add(jCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 270, 140));

        jLabel9.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 45, 66));
        jLabel9.setText("Descripción");
        panelCustom2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("ID Mascota");
        panelCustom2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTitle4.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle4.setForeground(new java.awt.Color(82, 183, 136));
        jTitle4.setText("Crear Reserva");
        panelCustom2.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        getContentPane().add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarMascotaActionPerformed

        if (jtxtDescripcion.getText().isBlank()) {
            labelError.setText("Error, debe completar todos los campos");
            return;
        }

        String resp
                = RESERVA_CONTROL.agregar(obtenerIdDelCombo(jcbxMascota), Utilidades.obtenerFechaChooser(jdcFechaReserva), jtxtDescripcion.getText());

        if (resp.equalsIgnoreCase("OK")) {
            JOptionPane.showMessageDialog(this, "Se registró la reserva correctamente",
                    "Sistema", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            frmReservaCitas.listar();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Ocurrió un error en el registro.", "Sistema",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnRegistrarMascotaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo3;
    private javax.swing.JLabel jCorreo4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitle4;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarMascota;
    private javax.swing.JComboBox<String> jcbxMascota;
    private com.toedter.calendar.JDateChooser jdcFechaReserva;
    private javax.swing.JTextArea jtxtDescripcion;
    private javax.swing.JLabel labelError;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
