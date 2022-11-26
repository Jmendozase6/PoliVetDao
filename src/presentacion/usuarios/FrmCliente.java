package presentacion.usuarios;

import businessobject.UsuarioControl;
import java.awt.Font;
import presentacion.files.componentes.customswitch.SwitchListener;

public class FrmCliente extends javax.swing.JPanel {

    private final UsuarioControl CONTROL;
    private final byte idTipoRol = 2;

    public FrmCliente () {
        initComponents();
        CONTROL = new UsuarioControl();
        this.listar("nombres", "");
        ocultarColumnas();
    }

    private void ocultarColumnas () {
        tablaClientes.getColumnModel().getColumn(11).setMaxWidth(0);
        tablaClientes.getColumnModel().getColumn(11).setMinWidth(0);
        tablaClientes.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
        tablaClientes.getTableHeader().getColumnModel().getColumn(11).setMinWidth(0);
    }

    private void listar (String columna, String buscar) {
        tablaClientes.setModel(this.CONTROL.listar(columna, buscar, idTipoRol));
    }

    private String getSelected () {
        return jchNombres.isSelected() ? "nombres" : "documento";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnRegistrarse = new presentacion.files.componentes.ButtonCustom();
        jchDocumento = new presentacion.files.componentes.CheckBoxCustom();
        jchNombres = new presentacion.files.componentes.CheckBoxCustom();
        jswEstado = new presentacion.files.componentes.customswitch.SwitchButton();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtNombres = new javax.swing.JTextField();
        jcbxGenero = new javax.swing.JComboBox<>();
        jtxtDNI = new javax.swing.JFormattedTextField();
        jtxtFecha = new javax.swing.JFormattedTextField();
        jtxtIdCliente = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JFormattedTextField();
        jtxtIdCliente2 = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
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
        jLabel18 = new javax.swing.JLabel();
        jCorreo3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jbtnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconTopContinue.png"))); // NOI18N
        jbtnRegistrarse.setFocusPainted(false);
        jbtnRegistrarse.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnRegistrarse.setRound(200);
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 650, 40, 40));

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

        jtxtApellidos.setEditable(false);
        jtxtApellidos.setBackground(new java.awt.Color(232, 245, 254));
        jtxtApellidos.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtApellidos.setBorder(null);
        jtxtApellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 845, 190, 30));

        jtxtDireccion.setEditable(false);
        jtxtDireccion.setBackground(new java.awt.Color(232, 245, 254));
        jtxtDireccion.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtDireccion.setBorder(null);
        jtxtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 685, 210, 30));

        jtxtNombres.setEditable(false);
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

        jtxtDNI.setBackground(new java.awt.Color(232, 245, 254));
        jtxtDNI.setBorder(null);
        jtxtDNI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtDNI.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDNIKeyTyped(evt);
            }
        });
        add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 845, 190, 30));

        jtxtFecha.setBackground(new java.awt.Color(232, 245, 254));
        jtxtFecha.setBorder(null);
        jtxtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jtxtFecha.setText("2003-07-07");
        jtxtFecha.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFechaKeyTyped(evt);
            }
        });
        add(jtxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 765, 190, 30));

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
        jtxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtTelefonoKeyTyped(evt);
            }
        });
        add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 765, 190, 30));

        jtxtIdCliente2.setEditable(false);
        jtxtIdCliente2.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdCliente2.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdCliente2.setBorder(null);
        jtxtIdCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtIdCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 760, 210, 30));

        jtxtCorreo.setEditable(false);
        jtxtCorreo.setBackground(new java.awt.Color(232, 245, 254));
        jtxtCorreo.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtCorreo.setBorder(null);
        jtxtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 685, 210, 30));

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

        jLabel17.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("Correo");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, -1));

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

        jLabel18.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(43, 45, 66));
        jLabel18.setText("Dirección");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, -1, -1));

        jCorreo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtCorreoElectronico.png"))); // NOI18N
        add(jCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped
        this.listar(getSelected(), jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
//        if(jScrollPane1.getVerticalScrollBar().getValue()>)
        jScrollPane1.getVerticalScrollBar().getValue(); //
        jScrollPane1.getVerticalScrollBar().setValue(0);

    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

    private void jtxtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDNIKeyTyped
        if (jtxtDNI.getText().length() == 2) {
            jtxtDNI.setText(jtxtDNI.getText() + "-");
        }
        if (jtxtDNI.getText().length() == 5) {
            jtxtDNI.setText(jtxtDNI.getText() + "-");
        }
    }//GEN-LAST:event_jtxtDNIKeyTyped

    private void jtxtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFechaKeyTyped

    private void jtxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelefonoKeyTyped

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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jPassword;
    private javax.swing.JLabel jPassword1;
    private javax.swing.JLabel jPassword2;
    private javax.swing.JLabel jPassword3;
    private javax.swing.JLabel jPassword4;
    private javax.swing.JLabel jPassword5;
    private javax.swing.JScrollPane jScrollPane1;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarse;
    private javax.swing.JComboBox<String> jcbxGenero;
    private presentacion.files.componentes.CheckBoxCustom jchDocumento;
    private presentacion.files.componentes.CheckBoxCustom jchNombres;
    private presentacion.files.componentes.customswitch.SwitchButton jswEstado;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JFormattedTextField jtxtDNI;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JFormattedTextField jtxtFecha;
    private javax.swing.JTextField jtxtIdCliente;
    private javax.swing.JTextField jtxtIdCliente2;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JFormattedTextField jtxtTelefono;
    private javax.swing.JLabel labelActivo;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
