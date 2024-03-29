package presentacion.usuarios.administador;

import businessobject.ProductoControl;
import javax.swing.JOptionPane;

public class DialogSeleccionarProducto extends javax.swing.JDialog {

    private FrmVenta frm;
    private final ProductoControl CONTROL;

    public DialogSeleccionarProducto (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        CONTROL = new ProductoControl();
        this.listar("");
        this.jbtnSubir.setVisible(false);
    }

    public void setModel (FrmVenta frm) {
        this.frm = frm;
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

    private void ocultarColumnas () {

        //id
        tablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);

        //id producto
        tablaProductos.getColumnModel().getColumn(1).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(1).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);

        // proveedor
        tablaProductos.getColumnModel().getColumn(2).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(2).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);

        // estado
        tablaProductos.getColumnModel().getColumn(8).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(8).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
    }

    public void listar (String buscar) {
        tablaProductos.setModel(this.CONTROL.listar(buscar, (byte) 1));
        ocultarColumnas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jbtnSeleccionarProducto = new presentacion.files.componentes.ButtonCustom();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnSubir = new presentacion.files.componentes.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        tablaProductos.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
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
        jScrollPane1.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1260, 510));

        jbtnSeleccionarProducto.setText("Seleccionar Producto");
        jbtnSeleccionarProducto.setFocusPainted(false);
        jbtnSeleccionarProducto.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnSeleccionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSeleccionarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSeleccionarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 200, 40));

        jtxtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jtxtBuscar.setFont(new java.awt.Font("Gilroy-LightItalic", 0, 16)); // NOI18N
        jtxtBuscar.setText(" ");
        jtxtBuscar.setBorder(null);
        jtxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 640, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/principal/jSearchBar.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Hey Comic", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("PRODUCTOS");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jbtnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 650, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        mostrarBotonTabla();
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jbtnSeleccionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSeleccionarProductoActionPerformed
        if (tablaProductos.getSelectedRowCount() == 1) {
            String idProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
            String nombre = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 3));
            String precio = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 6));
            String cantidad = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 7));
            this.frm.agregarDetalles(idProducto, nombre, cantidad, precio);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el artículo que desea agregar", "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnSeleccionarProductoActionPerformed

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jtxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyReleased
        this.listar(jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private presentacion.files.componentes.ButtonCustom jbtnSeleccionarProducto;
    private presentacion.files.componentes.ButtonCustom jbtnSubir;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
