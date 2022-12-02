package presentacion.usuarios.invitado;

import businessobject.ProductoControl;
import java.awt.Font;

public class FrmProductoInvitado extends javax.swing.JPanel {

    private final ProductoControl CONTROL;
    private String nombre, nombreProducto, descripcion, marca, precio;

    public FrmProductoInvitado () {
        initComponents();
        CONTROL = new ProductoControl();
        this.listar("");
        jbtnSubir.setVisible(false);
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

    public void listar (String buscar) {
        tablaProductos.setModel(this.CONTROL.listarModoInvitado(buscar));
    }

    private boolean seleccionar () {
        if (tablaProductos.getSelectedRowCount() == 1) {

            nombreProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
            descripcion = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 1));
            marca = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 2));
            precio = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 3));

            jtxtNombre.setText(nombreProducto);
            jtxtDescripcion.setText(descripcion);
            jtxtMarca.setText(marca);
            jtxtPrecio.setText(precio);
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnSubir = new presentacion.files.componentes.ButtonCustom();
        jtxtPrecio = new javax.swing.JFormattedTextField();
        jtxtMarca = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtDescripcion = new javax.swing.JTextArea();
        jCorreo1 = new javax.swing.JLabel();
        jPassword2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCorreo2 = new javax.swing.JLabel();
        jPassword4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        tablaProductos.setAutoCreateRowSorter(true);
        tablaProductos.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        tablaProductos.getTableHeader().setFont(new Font("Monospaced", 0, 13));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos.setRowHeight(30);
        tablaProductos.setSelectionBackground(new java.awt.Color(82, 183, 136));
        tablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.setShowGrid(true);
        tablaProductos.getTableHeader().setResizingAllowed(false);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1260, 510));

        jtxtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jtxtBuscar.setFont(new java.awt.Font("Gilroy-LightItalic", 0, 16)); // NOI18N
        jtxtBuscar.setText(" ");
        jtxtBuscar.setBorder(null);
        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
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

        jtxtPrecio.setEditable(false);
        jtxtPrecio.setBackground(new java.awt.Color(232, 245, 254));
        jtxtPrecio.setBorder(null);
        jtxtPrecio.setForeground(new java.awt.Color(51, 51, 51));
        jtxtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtPrecio.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 755, 190, 30));

        jtxtMarca.setEditable(false);
        jtxtMarca.setBackground(new java.awt.Color(232, 245, 254));
        jtxtMarca.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(51, 51, 51));
        jtxtMarca.setBorder(null);
        jtxtMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 675, 210, 30));

        jtxtNombre.setEditable(false);
        jtxtNombre.setBackground(new java.awt.Color(232, 245, 254));
        jtxtNombre.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(51, 51, 51));
        jtxtNombre.setBorder(null);
        jtxtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 675, 190, 30));

        jScrollPane2.setBackground(new java.awt.Color(232, 245, 254));
        jScrollPane2.setBorder(null);

        jtxtDescripcion.setEditable(false);
        jtxtDescripcion.setBackground(new java.awt.Color(232, 245, 254));
        jtxtDescripcion.setColumns(20);
        jtxtDescripcion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtxtDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jtxtDescripcion.setLineWrap(true);
        jtxtDescripcion.setRows(5);
        jtxtDescripcion.setBorder(null);
        jtxtDescripcion.setSelectionColor(new java.awt.Color(82, 183, 136));
        jScrollPane2.setViewportView(jtxtDescripcion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 745, 210, 130));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtNombre.png"))); // NOI18N
        add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jPassword2.setBackground(new java.awt.Color(255, 255, 255));
        jPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtDescripcion.png"))); // NOI18N
        add(jPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(43, 45, 66));
        jLabel13.setText("Descripción");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(43, 45, 66));
        jLabel14.setText("Nombre");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtMarca.png"))); // NOI18N
        add(jCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, -1, 40));

        jPassword4.setBackground(new java.awt.Color(255, 255, 255));
        jPassword4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtPrecio.png"))); // NOI18N
        add(jPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 750, -1, -1));

        jLabel16.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(43, 45, 66));
        jLabel16.setText("Precio");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, -1, -1));

        jLabel17.setFont(new java.awt.Font("Hey Comic", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("PRODUCTOS");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(43, 45, 66));
        jLabel20.setText("Marca");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        mostrarBotonTabla();
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        this.seleccionar();
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        this.listar(jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jCorreo1;
    private javax.swing.JLabel jCorreo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jPassword2;
    private javax.swing.JLabel jPassword4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private presentacion.files.componentes.ButtonCustom jbtnSubir;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextArea jtxtDescripcion;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JFormattedTextField jtxtPrecio;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
