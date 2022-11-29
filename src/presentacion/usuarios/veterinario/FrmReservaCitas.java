package presentacion.usuarios.veterinario;

import businessobject.ReservaControl;
import businessobject.UsuarioControl;
import businessobject.Utilidades;
import datatransferobject.ReservaDTO;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmReservaCitas extends javax.swing.JPanel {

    private final ReservaControl CONTROL;
    private ReservaDTO reservaDTO;

    public FrmReservaCitas () {
        initComponents();
        CONTROL = new ReservaControl();
        jbtnSubir.setVisible(false);
        tablaReservas.setModel(this.CONTROL.listar(Utilidades.obtenerFechaSqlFormat(), "Especifica", ""));
    }

    private void mostrarBotonTabla () {
        if (jScrollPane1.getVerticalScrollBar().getValue() > 450) {
            jbtnSubir.setVisible(true);
            revalidate();
        } else {
            jbtnSubir.setVisible(false);
            revalidate();
        }
    }

    public void listar () {
        if (jchEspecificas.isSelected()) {
            if (Objects.nonNull(jchEspecifica)) {
                tablaReservas.setModel(this.CONTROL.listar(Utilidades.obtenerFechaChooser(jchEspecifica), "Especifica", ""));
                jtxtIdReserva.setText("");
                jtxtIdMascota.setText("");
                jtxtDescripcion.setText("");
                return;
            }
        }

        if (jchPasadas.isSelected()) {
            tablaReservas.setModel(this.CONTROL.listar(Utilidades.obtenerFechaSqlFormat(), "Pasadas", ""));
            return;
        }

        if (jchProximas.isSelected()) {
            tablaReservas.setModel(this.CONTROL.listar(Utilidades.obtenerFechaSqlFormat(), "Proximas", ""));
            return;
        }

        if (jchHoy.isSelected()) {
            tablaReservas.setModel(this.CONTROL.listar(Utilidades.obtenerFechaSqlFormat(), "Especifica", ""));
            return;
        }

        if (jchDosFechas.isSelected()) {
            if (Objects.nonNull(jdcFechaInicial) && Objects.nonNull(jdcFechaFinal)) {
                tablaReservas.setModel(this.CONTROL.listar(Utilidades.obtenerFechaChooser(jdcFechaInicial), "Entre dos", Utilidades.obtenerFechaChooser(jdcFechaFinal)));
            }
        }
        Utilidades.limpiarTextfields(jtxtIdReserva, jtxtIdMascota);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupReservas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        jbtnSubir = new presentacion.files.componentes.ButtonCustom();
        jtxtIdMascota = new javax.swing.JTextField();
        jtxtIdReserva = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtDescripcion = new javax.swing.JTextArea();
        jdcFechaProgramada = new com.toedter.calendar.JDateChooser();
        jCorreo = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPassword2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jbtnActualizar = new presentacion.files.componentes.ButtonCustom();
        jbtnNuevaCita = new presentacion.files.componentes.ButtonCustom();
        jchEspecificas = new presentacion.files.componentes.CheckBoxCustom();
        jchPasadas = new presentacion.files.componentes.CheckBoxCustom();
        jLabel2 = new javax.swing.JLabel();
        jdcFechaInicial = new com.toedter.calendar.JDateChooser();
        jchDosFechas = new presentacion.files.componentes.CheckBoxCustom();
        jchProximas = new presentacion.files.componentes.CheckBoxCustom();
        jdcFechaFinal = new com.toedter.calendar.JDateChooser();
        jchEspecifica = new com.toedter.calendar.JDateChooser();
        jchHoy = new presentacion.files.componentes.CheckBoxCustom();
        jbtnFiltrar = new presentacion.files.componentes.ButtonCustom();

        setBackground(new java.awt.Color(232, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        tablaReservas.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        tablaReservas.getTableHeader().setFont(new Font("Monospaced", 0, 13));
        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaReservas.setRowHeight(30);
        tablaReservas.setSelectionBackground(new java.awt.Color(82, 183, 136));
        tablaReservas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaReservas.setShowGrid(true);
        tablaReservas.getTableHeader().setResizingAllowed(false);
        tablaReservas.getTableHeader().setReorderingAllowed(false);
        tablaReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReservas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1260, 510));

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

        jtxtIdMascota.setEditable(false);
        jtxtIdMascota.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdMascota.setBorder(null);
        jtxtIdMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jtxtIdMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 755, 190, 30));

        jtxtIdReserva.setEditable(false);
        jtxtIdReserva.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdReserva.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdReserva.setBorder(null);
        jtxtIdReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 685, 190, 30));

        jScrollPane2.setBorder(null);

        jtxtDescripcion.setBackground(new java.awt.Color(232, 245, 254));
        jtxtDescripcion.setColumns(20);
        jtxtDescripcion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtxtDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jtxtDescripcion.setLineWrap(true);
        jtxtDescripcion.setRows(5);
        jtxtDescripcion.setBorder(null);
        jtxtDescripcion.setSelectionColor(new java.awt.Color(82, 183, 136));
        jScrollPane2.setViewportView(jtxtDescripcion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 755, 210, 130));

        jdcFechaProgramada.setBackground(new java.awt.Color(232, 245, 254));
        jdcFechaProgramada.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jdcFechaProgramada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 685, 190, 30));

        jCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtDescripcion.png"))); // NOI18N
        add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Descripción");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("ID Reserva");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        jPassword1.setBackground(new java.awt.Color(255, 255, 255));
        jPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 750, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("ID Mascota");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, -1, -1));

        jPassword2.setBackground(new java.awt.Color(255, 255, 255));
        jPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtFechaNacimiento.png"))); // NOI18N
        add(jPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(43, 45, 66));
        jLabel13.setText("Fecha Programada");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, -1));

        jLabel17.setFont(new java.awt.Font("Gilroy-Regular", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("RESERVAS PROGRAMADAS");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 800, 280, 20));

        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setFocusPainted(false);
        jbtnActualizar.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 830, 130, 40));

        jbtnNuevaCita.setText("Nueva reserva");
        jbtnNuevaCita.setFocusPainted(false);
        jbtnNuevaCita.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnNuevaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevaCitaActionPerformed(evt);
            }
        });
        add(jbtnNuevaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 830, 140, 40));

        jchEspecificas.setBackground(new java.awt.Color(82, 183, 136));
        groupReservas.add(jchEspecificas);
        jchEspecificas.setForeground(new java.awt.Color(43, 45, 66));
        jchEspecificas.setText("Reservas especificas");
        jchEspecificas.setContentAreaFilled(false);
        jchEspecificas.setFocusPainted(false);
        jchEspecificas.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchEspecificas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, -1, -1));

        jchPasadas.setBackground(new java.awt.Color(82, 183, 136));
        groupReservas.add(jchPasadas);
        jchPasadas.setForeground(new java.awt.Color(43, 45, 66));
        jchPasadas.setText("Reservas pasadas");
        jchPasadas.setContentAreaFilled(false);
        jchPasadas.setFocusPainted(false);
        jchPasadas.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchPasadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 690, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenTopWave.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jdcFechaInicial.setBackground(new java.awt.Color(232, 245, 254));
        jdcFechaInicial.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jdcFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 810, 190, 30));

        jchDosFechas.setBackground(new java.awt.Color(82, 183, 136));
        groupReservas.add(jchDosFechas);
        jchDosFechas.setForeground(new java.awt.Color(43, 45, 66));
        jchDosFechas.setText("Reservas de fecha específica");
        jchDosFechas.setContentAreaFilled(false);
        jchDosFechas.setFocusPainted(false);
        jchDosFechas.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchDosFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 780, -1, -1));

        jchProximas.setBackground(new java.awt.Color(82, 183, 136));
        groupReservas.add(jchProximas);
        jchProximas.setForeground(new java.awt.Color(43, 45, 66));
        jchProximas.setText("Reservas proximas");
        jchProximas.setContentAreaFilled(false);
        jchProximas.setFocusPainted(false);
        jchProximas.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchProximas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 720, -1, -1));

        jdcFechaFinal.setBackground(new java.awt.Color(232, 245, 254));
        jdcFechaFinal.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jdcFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 810, 190, 30));

        jchEspecifica.setBackground(new java.awt.Color(232, 245, 254));
        jchEspecifica.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchEspecifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 650, 190, 30));

        jchHoy.setBackground(new java.awt.Color(82, 183, 136));
        groupReservas.add(jchHoy);
        jchHoy.setForeground(new java.awt.Color(43, 45, 66));
        jchHoy.setSelected(true);
        jchHoy.setText("Reservas de hoy");
        jchHoy.setContentAreaFilled(false);
        jchHoy.setFocusPainted(false);
        jchHoy.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 750, -1, -1));

        jbtnFiltrar.setText("Filtrar");
        jbtnFiltrar.setFocusPainted(false);
        jbtnFiltrar.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFiltrarActionPerformed(evt);
            }
        });
        add(jbtnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 800, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        mostrarBotonTabla();
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

        if (jtxtIdReserva.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un usuario de la tabla", "Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jtxtDescripcion.getText().isBlank()) {
            labelError.setText("Debe colocar una descripción");
            return;
        }

        reservaDTO = new ReservaDTO(Integer.parseInt(jtxtIdReserva.getText()), Integer.parseInt(jtxtIdMascota.getText()), Utilidades.obtenerFechaChooser(jdcFechaProgramada), jtxtDescripcion.getText());

        String respuesta = CONTROL.actualizar(reservaDTO);

        if (respuesta.equalsIgnoreCase("OK")) {

            Utilidades.limpiarTextfields(jtxtIdReserva, jtxtIdMascota);
            jtxtDescripcion.setText("");
            JOptionPane.showMessageDialog(this, "Se actualizó correctamente el registro");
            jchHoy.setSelected(true);
            tablaReservas.setModel(this.CONTROL.listar(Utilidades.obtenerFechaSqlFormat(), "Especifica", ""));
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el registro", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

        jbtnFiltrarActionPerformed(evt);
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void tablaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseClicked
        if (tablaReservas.getSelectedRowCount() == 1) {
            try {
                String idReserva = String.valueOf(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 0));
                String idMascota = String.valueOf(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 1));
                String fecha = String.valueOf(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 2));
                String aDescripcion = String.valueOf(tablaReservas.getValueAt(tablaReservas.getSelectedRow(), 3));
                jtxtIdReserva.setText(idReserva);
                jtxtIdMascota.setText(idMascota);
                Date date = new SimpleDateFormat("yyyy-mm-dd").parse(fecha);
                jdcFechaProgramada.setDate(date);
                jtxtDescripcion.setText(aDescripcion);
            } catch (ParseException ex) {
                Logger.getLogger(FrmReservaCitas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tablaReservasMouseClicked

    private void jbtnNuevaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevaCitaActionPerformed
        new DialogCrearReserva(null, true, this).setVisible(true);
    }//GEN-LAST:event_jbtnNuevaCitaActionPerformed

    private void jbtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiltrarActionPerformed
        this.listar();
    }//GEN-LAST:event_jbtnFiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descripcion;
    private javax.swing.ButtonGroup groupReservas;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jPassword1;
    private javax.swing.JLabel jPassword2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private presentacion.files.componentes.ButtonCustom jbtnActualizar;
    private presentacion.files.componentes.ButtonCustom jbtnFiltrar;
    private presentacion.files.componentes.ButtonCustom jbtnNuevaCita;
    private presentacion.files.componentes.ButtonCustom jbtnSubir;
    private presentacion.files.componentes.CheckBoxCustom jchDosFechas;
    private com.toedter.calendar.JDateChooser jchEspecifica;
    private presentacion.files.componentes.CheckBoxCustom jchEspecificas;
    private presentacion.files.componentes.CheckBoxCustom jchHoy;
    private presentacion.files.componentes.CheckBoxCustom jchPasadas;
    private presentacion.files.componentes.CheckBoxCustom jchProximas;
    private com.toedter.calendar.JDateChooser jdcFechaFinal;
    private com.toedter.calendar.JDateChooser jdcFechaInicial;
    private com.toedter.calendar.JDateChooser jdcFechaProgramada;
    private javax.swing.JTextArea jtxtDescripcion;
    private javax.swing.JTextField jtxtIdMascota;
    private javax.swing.JTextField jtxtIdReserva;
    private javax.swing.JLabel labelError;
    private javax.swing.JTable tablaReservas;
    // End of variables declaration//GEN-END:variables
}
