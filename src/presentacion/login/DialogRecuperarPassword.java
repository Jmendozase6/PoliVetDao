package presentacion.login;

import businessobject.EmailControl;
import businessobject.UsuarioControl;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class DialogRecuperarPassword extends javax.swing.JFrame {

    private final EmailControl EMAIL;
    private String codigoGenerado;

    public DialogRecuperarPassword () {
        this.setUndecorated(true);
        this.setBackground(new Color(1, 1, 1, 0));
        EMAIL = new EmailControl();
        initComponents();
    }

    private void validarTextfield (KeyEvent evt, JTextField txt, JTextField nextTxt) {
        if (!Character.isDigit(evt.getKeyChar()) || txt.getText().length() > 1) {
            evt.consume();
        } else {
            nextTxt.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedCustom1 = new presentacion.files.componentes.TabbedCustom();
        recuperacion = new javax.swing.JPanel();
        jtxtCorreo = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jCat = new javax.swing.JLabel();
        jTitle4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCorreo = new javax.swing.JLabel();
        jbtnEnviarCodigo = new presentacion.files.componentes.ButtonCustom();
        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        labelErrorRecuperacion = new javax.swing.JLabel();
        verificacion = new javax.swing.JPanel();
        jCat1 = new javax.swing.JLabel();
        jTitle5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelCustom4 = new presentacion.files.componentes.PanelCustom();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtxt1 = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jtxt2 = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jtxt3 = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jtxt4 = new presentacion.files.componentes.TextFieldSuggestionCustom();
        labelErrorVerificacion = new javax.swing.JLabel();
        jbtnVerificarCodigo = new presentacion.files.componentes.ButtonCustom();
        nuevaClave = new javax.swing.JPanel();
        jCat2 = new javax.swing.JLabel();
        jTitle6 = new javax.swing.JLabel();
        panelCustom3 = new presentacion.files.componentes.PanelCustom();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        labelErrorRecuperacion1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCorreo1 = new javax.swing.JLabel();
        jCorreo2 = new javax.swing.JLabel();
        jbtnGuardarClave = new presentacion.files.componentes.ButtonCustom();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedCustom1.setForeground(new java.awt.Color(255, 255, 255));

        recuperacion.setBackground(new Color(1, 1, 1, 0));
        recuperacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtCorreo.setBorder(null);
        jtxtCorreo.setText("jhairmendoza2003@gmail.com");
        jtxtCorreo.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtCorreo.setSelectionColor(new java.awt.Color(82, 183, 136));
        recuperacion.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 195, 210, 30));

        jCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        recuperacion.add(jCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jTitle4.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle4.setForeground(new java.awt.Color(82, 183, 136));
        jTitle4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitle4.setText("Recuperación");
        jTitle4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        recuperacion.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, -1));

        jLabel4.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 45, 66));
        jLabel4.setText("Correo electrónico");
        recuperacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtCorreoElectronico.png"))); // NOI18N
        recuperacion.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jbtnEnviarCodigo.setText("Enviar código");
        jbtnEnviarCodigo.setBorderPainted(false);
        jbtnEnviarCodigo.setFocusPainted(false);
        jbtnEnviarCodigo.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnEnviarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEnviarCodigoActionPerformed(evt);
            }
        });
        recuperacion.add(jbtnEnviarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 280, 40));

        panelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);

        jSeparator1.setForeground(new java.awt.Color(82, 183, 136));

        jLabel5.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 45, 66));
        jLabel5.setText("<html>Ingresa a tu correo y te enviaremos un código de recuperación</html>");

        labelErrorRecuperacion.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelErrorRecuperacion.setForeground(new java.awt.Color(228, 49, 49));

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCustom2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelErrorRecuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(labelErrorRecuperacion)
                .addGap(91, 91, 91))
        );

        recuperacion.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 350));

        tabbedCustom1.addTab("", recuperacion);

        verificacion.setBackground(new Color(1,1,1,0));
        verificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        verificacion.add(jCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jTitle5.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle5.setForeground(new java.awt.Color(82, 183, 136));
        jTitle5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitle5.setText("Verificación");
        jTitle5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verificacion.add(jTitle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, -1));

        jLabel6.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("Código");
        verificacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        panelCustom4.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom4.setRoundBottomLeft(20);
        panelCustom4.setRoundBottomRight(20);
        panelCustom4.setRoundTopLeft(20);
        panelCustom4.setRoundTopRight(20);
        panelCustom4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(82, 183, 136));
        panelCustom4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 127, 141, 10));

        jLabel7.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("<html>Ingresa el código de 4 digitos que acabamos de enviar a tu correo\n</html>");
        panelCustom4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 79, 240, 42));

        jtxt1.setForeground(new java.awt.Color(82, 183, 136));
        jtxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt1KeyTyped(evt);
            }
        });
        panelCustom4.add(jtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 50, 50));

        jtxt2.setForeground(new java.awt.Color(82, 183, 136));
        jtxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt2KeyTyped(evt);
            }
        });
        panelCustom4.add(jtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 50, 50));

        jtxt3.setForeground(new java.awt.Color(82, 183, 136));
        jtxt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt3KeyTyped(evt);
            }
        });
        panelCustom4.add(jtxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 50, 50));

        jtxt4.setForeground(new java.awt.Color(82, 183, 136));
        jtxt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt4KeyTyped(evt);
            }
        });
        panelCustom4.add(jtxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 50, 50));

        labelErrorVerificacion.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelErrorVerificacion.setForeground(new java.awt.Color(228, 49, 49));
        panelCustom4.add(labelErrorVerificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 290, 20));

        jbtnVerificarCodigo.setText("Verificar código");
        jbtnVerificarCodigo.setBorderPainted(false);
        jbtnVerificarCodigo.setFocusPainted(false);
        jbtnVerificarCodigo.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnVerificarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerificarCodigoActionPerformed(evt);
            }
        });
        panelCustom4.add(jbtnVerificarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 280, 40));

        verificacion.add(panelCustom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 350));

        tabbedCustom1.addTab("", verificacion);

        nuevaClave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        nuevaClave.add(jCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jTitle6.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle6.setForeground(new java.awt.Color(82, 183, 136));
        jTitle6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitle6.setText("Contraseña");
        jTitle6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevaClave.add(jTitle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, -1));

        panelCustom3.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom3.setRoundBottomLeft(20);
        panelCustom3.setRoundBottomRight(20);
        panelCustom3.setRoundTopLeft(20);
        panelCustom3.setRoundTopRight(20);

        jSeparator3.setForeground(new java.awt.Color(82, 183, 136));

        jLabel9.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 45, 66));
        jLabel9.setText("<html>Ingresa tu nueva contraseña</html>");

        labelErrorRecuperacion1.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelErrorRecuperacion1.setForeground(new java.awt.Color(228, 49, 49));

        jLabel8.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 45, 66));
        jLabel8.setText("Contraseña");

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtPassword.png"))); // NOI18N

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtPassword.png"))); // NOI18N

        jbtnGuardarClave.setText("Guardar Contraseña");
        jbtnGuardarClave.setBorderPainted(false);
        jbtnGuardarClave.setFocusPainted(false);
        jbtnGuardarClave.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnGuardarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarClaveActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Confirmar contraseña");

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGroup(panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCustom3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(labelErrorRecuperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnGuardarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCorreo2)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCorreo1))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCorreo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelErrorRecuperacion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCorreo2)
                .addGap(27, 27, 27)
                .addComponent(jbtnGuardarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        nuevaClave.add(panelCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 350));

        tabbedCustom1.addTab("", nuevaClave);

        getContentPane().add(tabbedCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -42, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEnviarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEnviarCodigoActionPerformed
        if (jtxtCorreo.getText().isBlank()) {
            labelErrorRecuperacion.setText("Error, debe completar todos los campos.");
            return;
        }

        tabbedCustom1.setSelectedIndex(1);
        tabbedCustom1.setEnabledAt(0, false);
        codigoGenerado = EMAIL.generarCorreo(jtxtCorreo.getText());
    }//GEN-LAST:event_jbtnEnviarCodigoActionPerformed

    private void jbtnVerificarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerificarCodigoActionPerformed
        if (UsuarioControl.sonTextfieldsVacios(jtxt1, jtxt2, jtxt3, jtxt4)) {
            labelErrorVerificacion.setText("Error, debe completar todos los campos.");
            return;
        }

        String c1 = jtxt1.getText(), c2 = jtxt2.getText(), c3 = jtxt3.getText(), c4 = jtxt4.getText();
        String codigoDialog = c1.concat(c2.concat(c3.concat(c4)));

        if (codigoGenerado.equals(codigoDialog)) {
            tabbedCustom1.setSelectedIndex(2);
            tabbedCustom1.setEnabledAt(1, false);
        } else {
            labelErrorVerificacion.setText("El código es incorrecto.");
        }
    }//GEN-LAST:event_jbtnVerificarCodigoActionPerformed

    private void jtxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt1KeyTyped
        validarTextfield(evt, jtxt1, jtxt2);
    }//GEN-LAST:event_jtxt1KeyTyped

    private void jtxt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt2KeyTyped
        validarTextfield(evt, jtxt2, jtxt3);
    }//GEN-LAST:event_jtxt2KeyTyped

    private void jtxt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt3KeyTyped
        validarTextfield(evt, jtxt3, jtxt4);
    }//GEN-LAST:event_jtxt3KeyTyped

    private void jtxt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt4KeyTyped
        validarTextfield(evt, jtxt4, jtxt4);
    }//GEN-LAST:event_jtxt4KeyTyped

    private void jbtnGuardarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarClaveActionPerformed
        // TODO: CONFIRMAR QUE AMBAS CONTRASEÑAS SON IGUALES Y ACTUALIZAR
    }//GEN-LAST:event_jbtnGuardarClaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCat;
    private javax.swing.JLabel jCat1;
    private javax.swing.JLabel jCat2;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jTitle4;
    private javax.swing.JLabel jTitle5;
    private javax.swing.JLabel jTitle6;
    private presentacion.files.componentes.ButtonCustom jbtnEnviarCodigo;
    private presentacion.files.componentes.ButtonCustom jbtnGuardarClave;
    private presentacion.files.componentes.ButtonCustom jbtnVerificarCodigo;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxt1;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxt2;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxt3;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxt4;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxtCorreo;
    private javax.swing.JLabel labelErrorRecuperacion;
    private javax.swing.JLabel labelErrorRecuperacion1;
    private javax.swing.JLabel labelErrorVerificacion;
    private javax.swing.JPanel nuevaClave;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    private presentacion.files.componentes.PanelCustom panelCustom3;
    private presentacion.files.componentes.PanelCustom panelCustom4;
    private javax.swing.JPanel recuperacion;
    private presentacion.files.componentes.TabbedCustom tabbedCustom1;
    private javax.swing.JPanel verificacion;
    // End of variables declaration//GEN-END:variables
}
