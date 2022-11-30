package presentacion.login;

import businessobject.UsuarioControl;
import businessobject.Utilidades;
import java.util.Objects;
import javax.swing.JOptionPane;

public class FrmRegistro extends javax.swing.JFrame {

    public FrmRegistro () {
        initComponents();
        Utilidades.colorDateChooser(jdcFechaNacimiento);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtNombres = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jtxtApellidos = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jcbxGenero = new javax.swing.JComboBox<>();
        jtxtDNI = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jtxtDireccion = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jtxtTelefono = new javax.swing.JFormattedTextField();
        jtxtCorreo = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jtxtPass = new javax.swing.JPasswordField();
        jTitle4 = new javax.swing.JLabel();
        jCat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCorreo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPassword = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCorreo1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPassword4 = new javax.swing.JLabel();
        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jGreenBackForm1 = new javax.swing.JLabel();
        jGreenBackForm2 = new javax.swing.JLabel();
        jGreenTopWave = new javax.swing.JLabel();
        jBrownBottonWave = new javax.swing.JLabel();
        jTitle5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCorreo2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPassword3 = new javax.swing.JLabel();
        jtgPassword = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jCorreo3 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jbtnRegistrarme = new presentacion.files.componentes.ButtonCustom();
        panelCustom3 = new presentacion.files.componentes.PanelCustom();
        jGreenBackForm3 = new javax.swing.JLabel();
        jGreenBackForm4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 245, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombres.setBorder(null);
        jtxtNombres.setForeground(new java.awt.Color(51, 51, 51));
        jtxtNombres.setText("Jhair 2");
        jtxtNombres.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtNombres.setSelectionColor(new java.awt.Color(82, 183, 136));
        jPanel1.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 190, 30));

        jtxtApellidos.setBorder(null);
        jtxtApellidos.setForeground(new java.awt.Color(51, 51, 51));
        jtxtApellidos.setText("Mendoza 2");
        jtxtApellidos.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtApellidos.setSelectionColor(new java.awt.Color(82, 183, 136));
        jPanel1.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 335, 190, 30));

        jcbxGenero.setBackground(new java.awt.Color(255, 255, 255));
        jcbxGenero.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jcbxGenero.setForeground(new java.awt.Color(51, 51, 51));
        jcbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jcbxGenero.setBorder(null);
        jPanel1.add(jcbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 415, 210, 30));

        jtxtDNI.setBorder(null);
        jtxtDNI.setForeground(new java.awt.Color(51, 51, 51));
        jtxtDNI.setText("90909090");
        jtxtDNI.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtDNI.setSelectionColor(new java.awt.Color(82, 183, 136));
        jtxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDNIKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 555, 190, 30));

        jtxtDireccion.setBorder(null);
        jtxtDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jtxtDireccion.setText("Piura Castilla");
        jtxtDireccion.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtDireccion.setSelectionColor(new java.awt.Color(82, 183, 136));
        jPanel1.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 626, 190, 30));

        jtxtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jtxtTelefono.setBorder(null);
        jtxtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jtxtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtTelefono.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jPanel1.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 263, 190, 30));

        jtxtCorreo.setBorder(null);
        jtxtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        jtxtCorreo.setText("jhair2@gmail.com");
        jtxtCorreo.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtCorreo.setSelectionColor(new java.awt.Color(82, 183, 136));
        jtxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 190, 30));

        jdcFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jdcFechaNacimiento.setForeground(new java.awt.Color(51, 51, 51));
        jdcFechaNacimiento.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jPanel1.add(jdcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 480, 230, 40));

        jtxtPass.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPass.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtPass.setForeground(new java.awt.Color(51, 51, 51));
        jtxtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtPass.setText("jhair2");
        jtxtPass.setBorder(null);
        jtxtPass.setEchoChar('*');
        jPanel1.add(jtxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 437, 170, 30));

        jTitle4.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle4.setForeground(new java.awt.Color(82, 183, 136));
        jTitle4.setText("Datos personales");
        jPanel1.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 180, -1, -1));

        jCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/registro/catLeftTopForm.png"))); // NOI18N
        jPanel1.add(jCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 76, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 45, 66));
        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 231, -1, -1));

        jCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        jPanel1.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 255, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Dirección");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 600, -1, -1));

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 620, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 45, 66));
        jLabel8.setText("Apellidos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 305, -1, -1));

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 45, 66));
        jLabel5.setText("Genero");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 385, -1, -1));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtGenero.png"))); // NOI18N
        jPanel1.add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 45, 66));
        jLabel9.setText("Fecha de nacimiento");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 460, -1, -1));

        jPassword1.setBackground(new java.awt.Color(255, 255, 255));
        jPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtFechaNacimiento.png"))); // NOI18N
        jPanel1.add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("DNI");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 530, -1, -1));

        jPassword4.setBackground(new java.awt.Color(255, 255, 255));
        jPassword4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtDNI.png"))); // NOI18N
        jPanel1.add(jPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 550, -1, -1));

        panelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel1.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 143, 350, 560));

        jGreenBackForm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenBackForm.png"))); // NOI18N
        jPanel1.add(jGreenBackForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 503, -1, -1));

        jGreenBackForm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenBackForm.png"))); // NOI18N
        jPanel1.add(jGreenBackForm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 123, -1, -1));

        jGreenTopWave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenTopWave.png"))); // NOI18N
        jPanel1.add(jGreenTopWave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jBrownBottonWave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/brownBottomWave.png"))); // NOI18N
        jPanel1.add(jBrownBottonWave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, -1, -1));

        jTitle5.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle5.setForeground(new java.awt.Color(82, 183, 136));
        jTitle5.setText("Datos de acceso");
        jPanel1.add(jTitle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 177, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("Correo electrónico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 318, -1, -1));

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtCorreoElectronico.png"))); // NOI18N
        jPanel1.add(jCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 345, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("Contraseña");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 405, -1, -1));

        jPassword3.setBackground(new java.awt.Color(255, 255, 255));
        jPassword3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtPassword.png"))); // NOI18N
        jPanel1.add(jPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 432, -1, -1));

        jtgPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconHidePassword.png"))); // NOI18N
        jtgPassword.setBorderPainted(false);
        jtgPassword.setContentAreaFilled(false);
        jtgPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtgPassword.setFocusPainted(false);
        jtgPassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconShowPassword.png"))); // NOI18N
        jtgPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtgPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jtgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 440, 25, 25));

        jLabel7.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("Teléfono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 231, -1, -1));

        jCorreo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtTelefono.png"))); // NOI18N
        jPanel1.add(jCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 258, -1, -1));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        jPanel1.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 487, 280, 20));

        jbtnRegistrarme.setText("Registrarme");
        jbtnRegistrarme.setFocusPainted(false);
        jbtnRegistrarme.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarmeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 520, 280, 40));

        panelCustom3.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom3.setRoundBottomLeft(20);
        panelCustom3.setRoundBottomRight(20);
        panelCustom3.setRoundTopLeft(20);
        panelCustom3.setRoundTopRight(20);

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jPanel1.add(panelCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 143, 350, 436));

        jGreenBackForm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenBackForm.png"))); // NOI18N
        jPanel1.add(jGreenBackForm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 123, -1, -1));

        jGreenBackForm4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenBackForm.png"))); // NOI18N
        jPanel1.add(jGreenBackForm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 379, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtgPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgPasswordActionPerformed
        jtxtPass.setEchoChar(jtgPassword.isSelected()
                ? (char) 0
                : '*');
    }//GEN-LAST:event_jtgPasswordActionPerformed

    private void jbtnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarmeActionPerformed

        if (Utilidades.sonTextfieldsVacios(jtxtNombres, jtxtApellidos, jtxtDNI, jtxtDireccion, jtxtCorreo, jtxtPass) || Objects.isNull(jdcFechaNacimiento.getCalendar())) {
            labelError.setText("Error, debe completar todos los campos.");
            return;
        }

        UsuarioControl CONTROL = new UsuarioControl();
        String email = jtxtCorreo.getText(), pass = jtxtPass.getText();
        String resp = CONTROL.agregar((byte) 2, jtxtNombres.getText(), jtxtApellidos.getText(), (byte) jcbxGenero.getSelectedIndex(), Utilidades.obtenerFechaChooser(jdcFechaNacimiento), (byte) 1, jtxtDNI.getText(), jtxtDireccion.getText(), jtxtTelefono.getText(), email, pass);

        switch (resp) {
            case "El registro ya existe.":
                JOptionPane.showMessageDialog(this, "El email o DNI ya están registrado en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case "OK":
                JOptionPane.showMessageDialog(this, "Se registró correctamente", "Sistema", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new FrmLogin(email, pass).setVisible(true);
                break;
            case "Error en el registro.":
                JOptionPane.showMessageDialog(this, "Ocurrió un error en el registro.", "Sistema", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_jbtnRegistrarmeActionPerformed

    private void jtxtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCorreoKeyTyped
        labelError.setText(Utilidades.validarEmail(jtxtCorreo.getText()));
    }//GEN-LAST:event_jtxtCorreoKeyTyped

    private void jtxtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDNIKeyTyped
        if (Character.isDigit(evt.getKeyChar()) || jtxtDNI.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDNIKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBrownBottonWave;
    private javax.swing.JLabel jCat;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo2;
    private javax.swing.JLabel jCorreo3;
    private javax.swing.JLabel jGreenBackForm1;
    private javax.swing.JLabel jGreenBackForm2;
    private javax.swing.JLabel jGreenBackForm3;
    private javax.swing.JLabel jGreenBackForm4;
    private javax.swing.JLabel jGreenTopWave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPassword;
    private javax.swing.JLabel jPassword1;
    private javax.swing.JLabel jPassword3;
    private javax.swing.JLabel jPassword4;
    private javax.swing.JLabel jTitle4;
    private javax.swing.JLabel jTitle5;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarme;
    private javax.swing.JComboBox<String> jcbxGenero;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JToggleButton jtgPassword;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxtApellidos;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxtCorreo;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxtDNI;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxtDireccion;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxtNombres;
    private javax.swing.JPasswordField jtxtPass;
    private javax.swing.JFormattedTextField jtxtTelefono;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelError;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    private presentacion.files.componentes.PanelCustom panelCustom3;
    // End of variables declaration//GEN-END:variables
}
