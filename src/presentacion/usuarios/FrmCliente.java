package presentacion.usuarios;

import businessobject.UsuarioActivo;
import businessobject.UsuarioControl;
import businessobject.Utilidades;
import datatransferobject.UsuarioDTO;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import presentacion.files.componentes.customswitch.SwitchListener;

public class FrmCliente extends javax.swing.JPanel {

    private final UsuarioControl CONTROL;
    private final byte idTipoRol = 2;
    private UsuarioDTO usuarioActualizar;

    public FrmCliente () {
        initComponents();
        CONTROL = new UsuarioControl();
        this.listar("nombres", "");
        jbtnSubir.setVisible(false);
        jbtnCambiarRol.setVisible(false);
        mostrarBotonCambioRol();
        Utilidades.colorDateChooser(jdcFechaNacimiento);
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

    private void mostrarBotonCambioRol () {
        if (UsuarioActivo.idRol == 1) {
            jbtnCambiarRol.setVisible(true);
        }
    }

    public void actualizarRol (int idRol) {
        if (tablaClientes.getSelectedRowCount() == 1) {
            CONTROL.actualizarRol(Integer.parseInt(jtxtIdCliente.getText()), idRol);
        }
    }

    private void ocultarColumnas () {
        tablaClientes.getColumnModel().getColumn(11).setMaxWidth(0);
        tablaClientes.getColumnModel().getColumn(11).setMinWidth(0);
        tablaClientes.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
        tablaClientes.getTableHeader().getColumnModel().getColumn(11).setMinWidth(0);
    }

    public void listar (String columna, String buscar) {
        tablaClientes.setModel(this.CONTROL.listar(columna, buscar, idTipoRol, (byte) 1));
        ocultarColumnas();
    }

    private String getSelected () {
        return jchNombres.isSelected() ? "nombres" : "documento";
    }

    private void setEstado (String estado) {
        jswEstado.setOn(estado.equalsIgnoreCase("activo"));
        labelActivo.setText(estado.equalsIgnoreCase("activo") ? "Cliente activo" : "Cliente inactivo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnSubir = new presentacion.files.componentes.ButtonCustom();
        jchDocumento = new presentacion.files.componentes.CheckBoxCustom();
        jchNombres = new presentacion.files.componentes.CheckBoxCustom();
        jswEstado = new presentacion.files.componentes.customswitch.SwitchButton();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtNombres = new javax.swing.JTextField();
        jcbxGenero = new javax.swing.JComboBox<>();
        jtxtDocumento = new javax.swing.JFormattedTextField();
        jtxtIdCliente = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JFormattedTextField();
        jtxtEmail = new javax.swing.JTextField();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
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
        jPassword4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelActivo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPassword5 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jCorreo3 = new javax.swing.JLabel();
        jbtnActualizar = new presentacion.files.componentes.ButtonCustom();
        jLabel20 = new javax.swing.JLabel();
        jbtnActivarDesactivar = new presentacion.files.componentes.ButtonCustom();
        jchMostrarRegistrosInactivos = new presentacion.files.componentes.CheckBoxCustom();
        jLabel21 = new javax.swing.JLabel();
        jbtnCambiarRol = new presentacion.files.componentes.ButtonCustom();

        setBackground(new java.awt.Color(232, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        tablaClientes.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        tablaClientes.getTableHeader().setFont(new Font("Monospaced", 0, 13));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.setRowHeight(30);
        tablaClientes.setSelectionBackground(new java.awt.Color(82, 183, 136));
        tablaClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.setShowGrid(true);
        tablaClientes.getTableHeader().setResizingAllowed(false);
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

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

        jchDocumento.setBackground(new java.awt.Color(82, 183, 136));
        buttonGroup1.add(jchDocumento);
        jchDocumento.setForeground(new java.awt.Color(43, 45, 66));
        jchDocumento.setText("Documento");
        jchDocumento.setContentAreaFilled(false);
        jchDocumento.setFocusPainted(false);
        jchDocumento.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 75, -1, -1));

        jchNombres.setBackground(new java.awt.Color(82, 183, 136));
        buttonGroup1.add(jchNombres);
        jchNombres.setForeground(new java.awt.Color(43, 45, 66));
        jchNombres.setSelected(true);
        jchNombres.setText("Nombres");
        jchNombres.setContentAreaFilled(false);
        jchNombres.setFocusPainted(false);
        jchNombres.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jchNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 45, -1, -1));

        jswEstado.setRound(20);
        jswEstado.setSpace(1);
        jswEstado.setSwitchColor(new java.awt.Color(82, 183, 136));
        add(jswEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 840, 100, 40));
        jswEstado.addEventSwitchSelected(new SwitchListener(){
            @Override
            public void selectChange(boolean valor){
                labelActivo.setText(valor
                    ? "Cliente activo"
                    : "Cliente inactivo");
            }
        });

        jtxtApellidos.setBackground(new java.awt.Color(232, 245, 254));
        jtxtApellidos.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtApellidos.setBorder(null);
        jtxtApellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 845, 190, 30));

        jtxtDireccion.setBackground(new java.awt.Color(232, 245, 254));
        jtxtDireccion.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtDireccion.setBorder(null);
        jtxtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 685, 210, 30));

        jtxtNombres.setBackground(new java.awt.Color(232, 245, 254));
        jtxtNombres.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtNombres.setBorder(null);
        jtxtNombres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 765, 190, 30));

        jcbxGenero.setBackground(new java.awt.Color(232, 245, 254));
        jcbxGenero.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jcbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jcbxGenero.setBorder(null);
        add(jcbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 685, 210, 30));

        jtxtDocumento.setBackground(new java.awt.Color(232, 245, 254));
        jtxtDocumento.setBorder(null);
        jtxtDocumento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtDocumento.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDocumentoKeyTyped(evt);
            }
        });
        add(jtxtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 845, 190, 30));

        jtxtIdCliente.setEditable(false);
        jtxtIdCliente.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdCliente.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdCliente.setBorder(null);
        jtxtIdCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 685, 190, 30));

        jtxtTelefono.setBackground(new java.awt.Color(232, 245, 254));
        jtxtTelefono.setBorder(null);
        jtxtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtTelefono.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 765, 190, 30));

        jtxtEmail.setBackground(new java.awt.Color(232, 245, 254));
        jtxtEmail.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtEmail.setBorder(null);
        jtxtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEmailKeyTyped(evt);
            }
        });
        add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 685, 210, 30));

        jdcFechaNacimiento.setBackground(new java.awt.Color(232, 245, 254));
        jdcFechaNacimiento.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jdcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 760, 230, 40));

        jCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Nombres");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("ID Cliente");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        jPassword1.setBackground(new java.awt.Color(255, 255, 255));
        jPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("Apellidos");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, -1, -1));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtGenero.png"))); // NOI18N
        add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, -1, -1));

        jPassword2.setBackground(new java.awt.Color(255, 255, 255));
        jPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtFechaNacimiento.png"))); // NOI18N
        add(jPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 760, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(43, 45, 66));
        jLabel13.setText("Fecha de nacimiento");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 740, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(43, 45, 66));
        jLabel14.setText("Genero");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, -1));

        jPassword3.setBackground(new java.awt.Color(255, 255, 255));
        jPassword3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtDNI.png"))); // NOI18N
        add(jPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(43, 45, 66));
        jLabel15.setText("DNI");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 820, -1, -1));

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtCorreoElectronico.png"))); // NOI18N
        add(jCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, -1, 40));

        jPassword4.setBackground(new java.awt.Color(255, 255, 255));
        jPassword4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtTelefono.png"))); // NOI18N
        add(jPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 760, -1, -1));

        jLabel16.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(43, 45, 66));
        jLabel16.setText("Teléfono");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 740, -1, -1));

        jLabel17.setFont(new java.awt.Font("Hey Comic", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("CLIENTES");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        labelActivo.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelActivo.setForeground(new java.awt.Color(43, 45, 66));
        labelActivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelActivo.setText("Cliente activo");
        add(labelActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 840, 130, 40));

        jLabel19.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(43, 45, 66));
        jLabel19.setText("Estado");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 820, -1, -1));

        jPassword5.setBackground(new java.awt.Color(255, 255, 255));
        jPassword5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtEstado.png"))); // NOI18N
        add(jPassword5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 840, 170, -1));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 730, 280, 20));

        jCorreo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtCorreoElectronico.png"))); // NOI18N
        add(jCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, -1, -1));

        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setFocusPainted(false);
        jbtnActualizar.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 760, 130, 40));

        jLabel20.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(43, 45, 66));
        jLabel20.setText("Correo");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, -1));

        jbtnActivarDesactivar.setText("Activar");
        jbtnActivarDesactivar.setFocusPainted(false);
        jbtnActivarDesactivar.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActivarDesactivarActionPerformed(evt);
            }
        });
        add(jbtnActivarDesactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 760, 130, 40));

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

        jLabel21.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(43, 45, 66));
        jLabel21.setText("Dirección");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, -1, -1));

        jbtnCambiarRol.setText("Cambiar Rol");
        jbtnCambiarRol.setFocusPainted(false);
        jbtnCambiarRol.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnCambiarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCambiarRolActionPerformed(evt);
            }
        });
        add(jbtnCambiarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 840, 280, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped
        this.listar(getSelected(), jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jtxtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDocumentoKeyTyped
        if (jtxtDocumento.getText().length() == 2) {
            jtxtDocumento.setText(jtxtDocumento.getText() + "-");
        }
        if (jtxtDocumento.getText().length() == 5) {
            jtxtDocumento.setText(jtxtDocumento.getText() + "-");
        }
    }//GEN-LAST:event_jtxtDocumentoKeyTyped

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        mostrarBotonTabla();
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

        if (jtxtIdCliente.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un usuario de la tabla", "Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (Utilidades.sonTextfieldsVacios(jtxtNombres, jtxtApellidos, jtxtDocumento, jtxtDireccion, jtxtTelefono, jtxtEmail)) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Sistema", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Objects.isNull(jdcFechaNacimiento.getCalendar())) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Sistema", JOptionPane.ERROR_MESSAGE);
            return;
        }

        usuarioActualizar = new UsuarioDTO(Integer.parseInt(jtxtIdCliente.getText()), jtxtNombres.getText(), jtxtApellidos.getText(), Byte.parseByte(String.valueOf(jcbxGenero.getSelectedIndex())), Utilidades.obtenerFechaChooser(jdcFechaNacimiento), jtxtDocumento.getText(), jtxtDireccion.getText(), jtxtTelefono.getText(), jtxtEmail.getText());

        String respuesta = CONTROL.actualizar(usuarioActualizar);
        if (respuesta.equalsIgnoreCase("OK")) {
            Utilidades.limpiarTextfields(jtxtIdCliente, jtxtNombres, jtxtApellidos, jtxtDocumento, jtxtDireccion, jtxtTelefono, jtxtEmail, jtxtBuscar);
            JOptionPane.showMessageDialog(this, "Se actualizó correctamente el registro");
            this.listar("nombres", "");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el registro", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

        jchMostrarRegistrosInactivosActionPerformed(evt);

    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        if (tablaClientes.getSelectedRowCount() == 1) {
            try {
                String idCliente = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0));
                String nombres = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2));
                String apellidos = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 3));
                String genero = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 4));
                String fecha = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 5));
                String documento = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 7));
                String direccion = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 8));
                String telefono = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 9));
                String email = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 10));
                String estado = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 12));

                jtxtIdCliente.setText(idCliente);
                jtxtNombres.setText(nombres);
                jtxtApellidos.setText(apellidos);
                jcbxGenero.setSelectedIndex(Integer.parseInt(genero));
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                jdcFechaNacimiento.setDate(date);
                jtxtDocumento.setText(documento);
                jtxtDireccion.setText(direccion);
                jtxtTelefono.setText(telefono);
                jtxtEmail.setText(email);
                setEstado(estado);
                jbtnActivarDesactivar.setText(estado.equalsIgnoreCase("activo") ? "Desactivar" : "Activar");
            } catch (ParseException ex) {
                Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void jbtnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActivarDesactivarActionPerformed

        if (jtxtIdCliente.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un usuario de la tabla", "Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idCliente = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0));
        String nombres = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2));
        String documento = String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 7));

        int respuesta = JOptionPane.showConfirmDialog(this, "Desea " + jbtnActivarDesactivar.getText().toLowerCase() + " el registro con los datos"
                + "\nID Cliente = " + idCliente
                + "\nNombres = " + nombres
                + "\nNúmero de Documento = " + documento, "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.NO_OPTION) {
            return;
        }

        String resp;
        if (jbtnActivarDesactivar.getText().equalsIgnoreCase("Activar")) {
            resp = CONTROL.activar(Integer.parseInt(idCliente));
        } else {
            resp = CONTROL.desactivar(Integer.parseInt(idCliente));
        }

        if (resp.equals("OK")) {
            JOptionPane.showMessageDialog(this, "Se actualizó el estado del registro.");
            this.listar("nombres", "");
            Utilidades.limpiarTextfields(jtxtIdCliente, jtxtNombres, jtxtApellidos, jtxtDocumento, jtxtDireccion, jtxtTelefono, jtxtEmail, jtxtBuscar);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el estado del registro", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnActivarDesactivarActionPerformed

    private void jchMostrarRegistrosInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchMostrarRegistrosInactivosActionPerformed
        if (jchMostrarRegistrosInactivos.isSelected()) {
            tablaClientes.setModel(this.CONTROL.listar("nombres", "", idTipoRol, (byte) 0));
            ocultarColumnas();
        } else {
            this.listar("nombres", "");
        }
    }//GEN-LAST:event_jchMostrarRegistrosInactivosActionPerformed

    private void jtxtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEmailKeyTyped
        labelError.setText(Utilidades.validarEmail(jtxtEmail.getText()));
    }//GEN-LAST:event_jtxtEmailKeyTyped

    private void jbtnCambiarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCambiarRolActionPerformed
        new DialogModificarRol(null, true, this).setVisible(true);
    }//GEN-LAST:event_jbtnCambiarRolActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo2;
    private javax.swing.JLabel jCorreo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jPassword;
    private javax.swing.JLabel jPassword1;
    private javax.swing.JLabel jPassword2;
    private javax.swing.JLabel jPassword3;
    private javax.swing.JLabel jPassword4;
    private javax.swing.JLabel jPassword5;
    private javax.swing.JScrollPane jScrollPane1;
    private presentacion.files.componentes.ButtonCustom jbtnActivarDesactivar;
    private presentacion.files.componentes.ButtonCustom jbtnActualizar;
    private presentacion.files.componentes.ButtonCustom jbtnCambiarRol;
    private presentacion.files.componentes.ButtonCustom jbtnSubir;
    private javax.swing.JComboBox<String> jcbxGenero;
    private presentacion.files.componentes.CheckBoxCustom jchDocumento;
    private presentacion.files.componentes.CheckBoxCustom jchMostrarRegistrosInactivos;
    private presentacion.files.componentes.CheckBoxCustom jchNombres;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private presentacion.files.componentes.customswitch.SwitchButton jswEstado;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JFormattedTextField jtxtDocumento;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtIdCliente;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JFormattedTextField jtxtTelefono;
    private javax.swing.JLabel labelActivo;
    private javax.swing.JLabel labelError;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
