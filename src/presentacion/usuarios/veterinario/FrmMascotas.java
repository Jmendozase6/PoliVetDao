package presentacion.usuarios.veterinario;

import businessobject.MascotaControl;
import businessobject.UsuarioControl;
import businessobject.Utilidades;
import datatransferobject.MascotaDTO;
import javax.swing.JOptionPane;

public class FrmMascotas extends javax.swing.JPanel {

    private final MascotaControl CONTROL;
    private MascotaDTO mascotaActualizar;

    public FrmMascotas () {
        initComponents();
        CONTROL = new MascotaControl();
        this.listar("");
        jbtnSubir.setVisible(false);

    }

    private void mostrarBoton () {
        if (jScrollPane1.getVerticalScrollBar().getValue() > 450) {
            jbtnSubir.setVisible(true);
            revalidate();
        } else {
            jbtnSubir.setVisible(false);
            revalidate();
        }
    }

    public void listar (String buscar) {
        tablaMascotas.setModel(this.CONTROL.listar("", buscar, (byte) 0, (byte) 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnSubir = new presentacion.files.componentes.ButtonCustom();
        jtxtIdTipoMascota = new javax.swing.JTextField();
        jtxtIdMascota = new javax.swing.JTextField();
        jtxtPeso = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtRaza = new javax.swing.JTextField();
        jtxtGenero = new javax.swing.JTextField();
        jtxtIdCliente = new javax.swing.JTextField();
        jCorreo = new javax.swing.JLabel();
        jPassword = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCorreo1 = new javax.swing.JLabel();
        jPassword2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPassword3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCorreo2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jbtnActualizar = new presentacion.files.componentes.ButtonCustom();
        jLabel20 = new javax.swing.JLabel();
        jchMostrarRegistrosInactivos = new presentacion.files.componentes.CheckBoxCustom();
        jLabel2 = new javax.swing.JLabel();
        jbtnNuevoRegistro = new presentacion.files.componentes.ButtonCustom();

        setBackground(new java.awt.Color(232, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        tablaMascotas.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMascotas.setRowHeight(30);
        tablaMascotas.setSelectionBackground(new java.awt.Color(82, 183, 136));
        tablaMascotas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaMascotas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaMascotas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaMascotas.setShowGrid(true);
        tablaMascotas.getTableHeader().setResizingAllowed(false);
        tablaMascotas.getTableHeader().setReorderingAllowed(false);
        tablaMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMascotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMascotas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1260, 510));

        jtxtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jtxtBuscar.setFont(new java.awt.Font("Gilroy-LightItalic", 0, 16)); // NOI18N
        jtxtBuscar.setText(" ");
        jtxtBuscar.setBorder(null);
        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyTyped(evt);
            }
        });
        add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 640, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/principal/jSearchBar.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jbtnSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconTopContinue.png"))); // NOI18N
        jbtnSubir.setFocusPainted(false);
        jbtnSubir.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnSubir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnSubir.setRound(200);
        jbtnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirActionPerformed(evt);
            }
        });
        add(jbtnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 660, 40, 40));

        jtxtIdTipoMascota.setEditable(false);
        jtxtIdTipoMascota.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdTipoMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdTipoMascota.setBorder(null);
        jtxtIdTipoMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtIdTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 845, 190, 30));

        jtxtIdMascota.setEditable(false);
        jtxtIdMascota.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdMascota.setBorder(null);
        jtxtIdMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtIdMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 685, 200, 30));

        jtxtPeso.setBackground(new java.awt.Color(232, 245, 254));
        jtxtPeso.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtPeso.setBorder(null);
        jtxtPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 685, 210, 30));

        jtxtNombre.setBackground(new java.awt.Color(232, 245, 254));
        jtxtNombre.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtNombre.setBorder(null);
        jtxtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 685, 210, 30));

        jtxtRaza.setBackground(new java.awt.Color(232, 245, 254));
        jtxtRaza.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtRaza.setBorder(null);
        jtxtRaza.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 765, 210, 30));

        jtxtGenero.setBackground(new java.awt.Color(232, 245, 254));
        jtxtGenero.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtGenero.setBorder(null);
        jtxtGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 845, 210, 30));

        jtxtIdCliente.setEditable(false);
        jtxtIdCliente.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdCliente.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdCliente.setBorder(null);
        jtxtIdCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 765, 210, 30));

        jCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("ID Cliente");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("ID Mascota");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        jPassword1.setBackground(new java.awt.Color(255, 255, 255));
        jPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("ID Tipo de Mascota");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, -1, -1));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, -1, -1));

        jPassword2.setBackground(new java.awt.Color(255, 255, 255));
        jPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtFechaNacimiento.png"))); // NOI18N
        add(jPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 760, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(43, 45, 66));
        jLabel13.setText("Raza");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 740, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(43, 45, 66));
        jLabel14.setText("Nombre");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, -1));

        jPassword3.setBackground(new java.awt.Color(255, 255, 255));
        jPassword3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtGenero.png"))); // NOI18N
        add(jPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(43, 45, 66));
        jLabel15.setText("Genero");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 820, -1, -1));

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtCorreoElectronico.png"))); // NOI18N
        add(jCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, -1, 40));

        jLabel17.setFont(new java.awt.Font("Gilroy-Regular", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("MASCOTAS");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 45, -1, -1));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 730, 280, 20));

        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setFocusPainted(false);
        jbtnActualizar.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 760, 280, 40));

        jLabel20.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(43, 45, 66));
        jLabel20.setText("Peso");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, -1));

        jchMostrarRegistrosInactivos.setBackground(new java.awt.Color(82, 183, 136));
        jchMostrarRegistrosInactivos.setForeground(new java.awt.Color(43, 45, 66));
        jchMostrarRegistrosInactivos.setText("Mostrar registros inactivos");
        jchMostrarRegistrosInactivos.setContentAreaFilled(false);
        jchMostrarRegistrosInactivos.setFocusPainted(false);
        jchMostrarRegistrosInactivos.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jchMostrarRegistrosInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchMostrarRegistrosInactivosActionPerformed(evt);
            }
        });
        add(jchMostrarRegistrosInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/mascota/imgMascotaRightBottom.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 660, 240, 230));

        jbtnNuevoRegistro.setText("Nuevo Registro");
        jbtnNuevoRegistro.setFocusPainted(false);
        jbtnNuevoRegistro.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoRegistroActionPerformed(evt);
            }
        });
        add(jbtnNuevoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 840, 280, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        mostrarBoton();
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped
        this.listar(jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jchMostrarRegistrosInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchMostrarRegistrosInactivosActionPerformed
        if (jchMostrarRegistrosInactivos.isSelected()) {
            tablaMascotas.setModel(this.CONTROL.listar("", "", (byte) 0, (byte) 0));
        } else {
            this.listar("");
        }
    }//GEN-LAST:event_jchMostrarRegistrosInactivosActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

        if (tablaMascotas.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado una mascota de la tabla", "Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (Utilidades.sonTextfieldsVacios(jtxtIdMascota, jtxtIdCliente, jtxtIdTipoMascota, jtxtNombre, jtxtRaza, jtxtGenero, jtxtPeso)) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Sistema", JOptionPane.ERROR_MESSAGE);
            return;
        }

        mascotaActualizar = new MascotaDTO(Integer.parseInt(jtxtIdMascota.getText()), Integer.parseInt(jtxtIdCliente.getText()), Integer.parseInt(jtxtIdTipoMascota.getText()), jtxtNombre.getText(), jtxtRaza.getText(), jtxtGenero.getText(), jtxtPeso.getText());

        String respuesta = CONTROL.actualizar(mascotaActualizar);

        if (respuesta.equalsIgnoreCase("OK")) {
            Utilidades.limpiarTextfields(jtxtIdMascota, jtxtIdCliente, jtxtIdTipoMascota, jtxtNombre, jtxtRaza, jtxtGenero, jtxtPeso);
            JOptionPane.showMessageDialog(this, "Se actualizó correctamente el registro");
            this.listar("");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el registro", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

        jchMostrarRegistrosInactivosActionPerformed(evt);

    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void tablaMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMascotasMouseClicked

        if (tablaMascotas.getSelectedRowCount() == 1) {
            String idMascota = String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0));
            String idCliente = String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 1));
            String idTipoMascota = String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 2));
            String nombre = String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 3));
            String raza = String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 4));
            String genero = String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 5));
            String peso = String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 6));

            jtxtIdMascota.setText(idMascota);
            jtxtIdCliente.setText(idCliente);
            jtxtIdTipoMascota.setText(idTipoMascota);
            jtxtNombre.setText(nombre);
            jtxtRaza.setText(raza);
            jtxtGenero.setText(genero);
            jtxtPeso.setText(peso);
        }
    }//GEN-LAST:event_tablaMascotasMouseClicked

    private void jbtnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoRegistroActionPerformed
        new DialogRegistrarMascota(null, true, this).setVisible(true);
    }//GEN-LAST:event_jbtnNuevoRegistroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jPassword;
    private javax.swing.JLabel jPassword1;
    private javax.swing.JLabel jPassword2;
    private javax.swing.JLabel jPassword3;
    private javax.swing.JScrollPane jScrollPane1;
    private presentacion.files.componentes.ButtonCustom jbtnActualizar;
    private presentacion.files.componentes.ButtonCustom jbtnNuevoRegistro;
    private presentacion.files.componentes.ButtonCustom jbtnSubir;
    private presentacion.files.componentes.CheckBoxCustom jchMostrarRegistrosInactivos;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtGenero;
    private javax.swing.JTextField jtxtIdCliente;
    private javax.swing.JTextField jtxtIdMascota;
    private javax.swing.JTextField jtxtIdTipoMascota;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPeso;
    private javax.swing.JTextField jtxtRaza;
    private javax.swing.JLabel labelError;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables
}
