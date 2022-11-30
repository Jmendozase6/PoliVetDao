package presentacion.producto;

import businessobject.ProductoControl;
import businessobject.ProveedorControl;
import businessobject.TipoProductoControl;
import businessobject.Utilidades;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class DialogCrearProducto extends javax.swing.JDialog {

    private final ProductoControl PRODUCTO_CONTROL;
    private final ProveedorControl PROVEEDOR_CONTROL;
    private final TipoProductoControl T_PRODUCTO_CONTROL;
    private final FrmProducto FRM_Producto;

    public DialogCrearProducto (java.awt.Frame parent, boolean modal, FrmProducto frmMascotas) {
        super(parent, modal);
        this.setUndecorated(true);
        this.setBackground(new Color(1, 1, 1, 0));
        initComponents();
        this.FRM_Producto = frmMascotas;
        PRODUCTO_CONTROL = new ProductoControl();
        T_PRODUCTO_CONTROL = new TipoProductoControl();
        PROVEEDOR_CONTROL = new ProveedorControl();
        jcbxIdTipoProducto.setModel(T_PRODUCTO_CONTROL.seleccionar());
        jcbxIdTipoProducto.setSelectedIndex(0);
        jcbxIdProveedor.setModel(PROVEEDOR_CONTROL.seleccionar());
        jcbxIdProveedor.setSelectedIndex(0);

    }

    private int obtenerIdDelCombo (JComboBox combo) {
        return Integer.parseInt(combo.getSelectedItem().toString().split("-")[0].trim());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jcbxIdTipoProducto = new javax.swing.JComboBox<>();
        jcbxIdProveedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtDescripcion = new javax.swing.JTextArea();
        labelError = new javax.swing.JLabel();
        jCorreo1 = new javax.swing.JLabel();
        jCorreo2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtnRegistrarMascota = new presentacion.files.componentes.ButtonCustom();
        jtxtNombre = new javax.swing.JTextField();
        jCorreo3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCorreo4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtMarca = new javax.swing.JTextField();
        jCorreo5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jCorreo6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTitle4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtCantidad = new javax.swing.JTextField();
        jCorreo7 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(320, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxIdTipoProducto.setBackground(new java.awt.Color(255, 255, 255));
        jcbxIdTipoProducto.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jcbxIdTipoProducto.setForeground(new java.awt.Color(51, 51, 51));
        jcbxIdTipoProducto.setBorder(null);
        panelCustom2.add(jcbxIdTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 105, 200, 30));

        jcbxIdProveedor.setBackground(new java.awt.Color(255, 255, 255));
        jcbxIdProveedor.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jcbxIdProveedor.setForeground(new java.awt.Color(51, 51, 51));
        jcbxIdProveedor.setBorder(null);
        panelCustom2.add(jcbxIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, 200, 30));

        jScrollPane1.setBorder(null);

        jtxtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jtxtDescripcion.setColumns(20);
        jtxtDescripcion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtxtDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jtxtDescripcion.setLineWrap(true);
        jtxtDescripcion.setRows(5);
        jtxtDescripcion.setBorder(null);
        jtxtDescripcion.setSelectionColor(new java.awt.Color(82, 183, 136));
        jScrollPane1.setViewportView(jtxtDescripcion);

        panelCustom2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 345, 210, 130));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        panelCustom2.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 280, 25));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 45, 66));
        jLabel7.setText("ID Proveedor");
        panelCustom2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jbtnRegistrarMascota.setText("Registrar");
        jbtnRegistrarMascota.setFocusPainted(false);
        jbtnRegistrarMascota.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarMascotaActionPerformed(evt);
            }
        });
        panelCustom2.add(jbtnRegistrarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 280, 40));

        jtxtNombre.setBackground(new java.awt.Color(255, 255, 255));
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

        jCorreo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtDescripcion.png"))); // NOI18N
        panelCustom2.add(jCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 140));

        jLabel9.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 45, 66));
        jLabel9.setText("Descripción");
        panelCustom2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jtxtMarca.setBackground(new java.awt.Color(255, 255, 255));
        jtxtMarca.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(51, 51, 51));
        jtxtMarca.setBorder(null);
        jtxtMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCustom2.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 505, 200, 30));

        jCorreo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("Marca");
        panelCustom2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jtxtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPrecio.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtPrecio.setForeground(new java.awt.Color(51, 51, 51));
        jtxtPrecio.setBorder(null);
        jtxtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCustom2.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 585, 200, 30));

        jCorreo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("Precio");
        panelCustom2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 45, 66));
        jLabel6.setText("ID Tipo de Producto");
        panelCustom2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTitle4.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle4.setForeground(new java.awt.Color(82, 183, 136));
        jTitle4.setText("Registrar mascota");
        panelCustom2.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("Cantidad");
        panelCustom2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        jtxtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCantidad.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtCantidad.setForeground(new java.awt.Color(51, 51, 51));
        jtxtCantidad.setBorder(null);
        jtxtCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCustom2.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 665, 200, 30));

        jCorreo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtNombres.png"))); // NOI18N
        panelCustom2.add(jCorreo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

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

        getContentPane().add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarMascotaActionPerformed

        if (Utilidades.sonTextfieldsVacios(jtxtNombre, jtxtMarca, jtxtPrecio) || jtxtDescripcion.getText().isBlank()) {
            labelError.setText("Error, debe completar todos los campos.");
            return;
        }

        String resp = PRODUCTO_CONTROL.agregar(
                Byte.parseByte(String.valueOf(obtenerIdDelCombo(jcbxIdTipoProducto))),
                obtenerIdDelCombo(jcbxIdProveedor),
                jtxtNombre.getText(),
                jtxtDescripcion.getText(),
                jtxtMarca.getText(),
                Float.parseFloat(jtxtPrecio.getText()),
                Float.parseFloat(jtxtCantidad.getText()));

        if (resp.equalsIgnoreCase("OK")) {
            JOptionPane.showMessageDialog(this, "Se registró correctamente", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            FRM_Producto.listar("");
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error en el registro.", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnRegistrarMascotaActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo2;
    private javax.swing.JLabel jCorreo3;
    private javax.swing.JLabel jCorreo4;
    private javax.swing.JLabel jCorreo5;
    private javax.swing.JLabel jCorreo6;
    private javax.swing.JLabel jCorreo7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitle4;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarMascota;
    private javax.swing.JComboBox<String> jcbxIdProveedor;
    private javax.swing.JComboBox<String> jcbxIdTipoProducto;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextArea jtxtDescripcion;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JLabel labelError;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
