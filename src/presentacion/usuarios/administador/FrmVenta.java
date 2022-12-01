package presentacion.usuarios.administador;

import businessobject.UsuarioControl;
import businessobject.Utilidades;
import businessobject.VentaControl;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmVenta extends javax.swing.JPanel {

    private final VentaControl CONTROL;
    public DefaultTableModel modeloDetalles;
    private final UsuarioControl USUARIO_CONTROL;

    public FrmVenta () {
        initComponents();
        CONTROL = new VentaControl();
        this.listar("");
        jbtnSubir.setVisible(false);
        tabGeneral.setEnabledAt(1, false);
        crearDetalle();
        USUARIO_CONTROL = new UsuarioControl();
        jcbxCliente.setModel(USUARIO_CONTROL.seleccionarCliente());
        jcbxCliente.setSelectedIndex(0);
    }

    private void crearDetalle () {
        modeloDetalles = new DefaultTableModel() {
            @Override
            public void setValueAt (Object aValue, int row, int column) {
                super.setValueAt(aValue, row, column); //To change body of generated methods, choose Tools | Templates.
                calcularTotales();
                fireTableDataChanged();
            }

        };
        modeloDetalles.setColumnIdentifiers(new Object[]{"ID Producto", "Nombre Producto", "Cantidad", "Precio"});
        tablaDetalles.setModel(modeloDetalles);
    }

    public void agregarDetalles (String idProducto, String nombre, String cantidad, String precio) {
        String idT;
        boolean existe = false;
        for (int i = 0; i < this.modeloDetalles.getRowCount(); i++) {
            idT = String.valueOf(this.modeloDetalles.getValueAt(i, 0));
            if (idT.equals(idProducto)) {
                existe = true;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "El producto ya está agregado", "Sistema", JOptionPane.ERROR_MESSAGE);
        } else {
            this.modeloDetalles.addRow(new Object[]{idProducto, nombre, cantidad, precio});
            this.calcularTotales();
        }
    }

    private void calcularTotales () {
        double total = 0;
        int items = modeloDetalles.getRowCount();
        if (items == 0) {
            total = 0;
        } else {
            double totalT = 0;
            for (int i = 0; i < items; i++) {
                totalT = Double.parseDouble(String.valueOf(modeloDetalles.getValueAt(i, 3))) * Double.parseDouble(String.valueOf(modeloDetalles.getValueAt(i, 3)));
                total += totalT;
            }
        }

        jtxtTotal.setText(String.format("%.2f", total));
    }

    private void mostrarBotonTabla (int valor) {
        if (jScrollPane1.getVerticalScrollBar().getValue() > valor) {
            jbtnSubir.setVisible(true);
            revalidate();
        } else {
            jbtnSubir.setVisible(false);
            revalidate();
        }
    }

    public void listar (String buscar) {
        tablaVentas.setModel(this.CONTROL.listar(buscar));
    }

    private int obtenerIdDelCombo (JComboBox combo) {
        return Integer.parseInt(combo.getSelectedItem().toString().split("-")[0].trim());
    }

    private String obtenerNombreDelCombo (JComboBox combo) {
        return combo.getSelectedItem().toString().split("-")[1].trim();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnSubir = new presentacion.files.componentes.ButtonCustom();
        jLabel17 = new javax.swing.JLabel();
        jbtnActualizarTotal = new presentacion.files.componentes.ButtonCustom();
        jbtnCrearProducto = new presentacion.files.componentes.ButtonCustom();
        tabGeneral = new presentacion.files.componentes.TabbedCustom();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jcbxCliente = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDetalles = new javax.swing.JTable();
        jbtnCancelar = new presentacion.files.componentes.ButtonCustom();
        jPassword4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxtNumeroComprobante = new javax.swing.JFormattedTextField();
        jPassword5 = new javax.swing.JLabel();
        jbtnGuardar = new presentacion.files.componentes.ButtonCustom();
        jLabel19 = new javax.swing.JLabel();
        jbtnVerProductos = new presentacion.files.componentes.ButtonCustom();
        jtxtTotal = new javax.swing.JFormattedTextField();
        jPassword3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(jbtnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 660, 40, 40));

        jLabel17.setFont(new java.awt.Font("Hey Comic", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("VENTAS");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        jbtnActualizarTotal.setText("Actualizar");
        jbtnActualizarTotal.setFocusPainted(false);
        jbtnActualizarTotal.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnActualizarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarTotalActionPerformed(evt);
            }
        });
        add(jbtnActualizarTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 130, 40));

        jbtnCrearProducto.setText("Nueva venta");
        jbtnCrearProducto.setFocusPainted(false);
        jbtnCrearProducto.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearProductoActionPerformed(evt);
            }
        });
        add(jbtnCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 130, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        tablaVentas.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        tablaVentas.getTableHeader().setFont(new Font("Monospaced", 0, 13));
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVentas.setRowHeight(30);
        tablaVentas.setSelectionBackground(new java.awt.Color(82, 183, 136));
        tablaVentas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaVentas.setShowGrid(true);
        tablaVentas.getTableHeader().setResizingAllowed(false);
        tablaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1255, 486));

        tabGeneral.addTab("", jPanel1);

        jPanel2.setBackground(new java.awt.Color(232, 245, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxCliente.setBackground(new java.awt.Color(232, 245, 254));
        jcbxCliente.setFont(new java.awt.Font("Gilroy-Regular", 0, 12)); // NOI18N
        jcbxCliente.setForeground(new java.awt.Color(51, 51, 51));
        jcbxCliente.setBorder(null);
        jPanel2.add(jcbxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 55, 220, 30));

        jScrollPane3.setBorder(null);
        jScrollPane3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane3MouseWheelMoved(evt);
            }
        });

        tablaDetalles.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        tablaDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDetalles.setRowHeight(30);
        tablaDetalles.setSelectionBackground(new java.awt.Color(82, 183, 136));
        tablaDetalles.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaDetalles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDetalles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDetalles.setShowGrid(true);
        tablaDetalles.getTableHeader().setResizingAllowed(false);
        tablaDetalles.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaDetalles);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1255, 310));

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setFocusPainted(false);
        jbtnCancelar.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnCancelar.setStyle(presentacion.files.componentes.ButtonCustom.ButtonStyle.SECONDARY);
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 130, 40));

        jPassword4.setBackground(new java.awt.Color(255, 255, 255));
        jPassword4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtCantidad.png"))); // NOI18N
        jPanel2.add(jPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(43, 45, 66));
        jLabel16.setText("Cliente");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(43, 45, 66));
        jLabel18.setText("Seleccione artículos");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jtxtNumeroComprobante.setBackground(new java.awt.Color(232, 245, 254));
        jtxtNumeroComprobante.setBorder(null);
        jtxtNumeroComprobante.setForeground(new java.awt.Color(51, 51, 51));
        jtxtNumeroComprobante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtNumeroComprobante.setText("0001");
        jtxtNumeroComprobante.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jPanel2.add(jtxtNumeroComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 55, 190, 30));

        jPassword5.setBackground(new java.awt.Color(255, 255, 255));
        jPassword5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtCantidad.png"))); // NOI18N
        jPanel2.add(jPassword5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setFocusPainted(false);
        jbtnGuardar.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 130, 40));

        jLabel19.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(43, 45, 66));
        jLabel19.setText("Número de comprobante");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jbtnVerProductos.setText("Productos");
        jbtnVerProductos.setFocusPainted(false);
        jbtnVerProductos.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerProductosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnVerProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 130, 40));

        jtxtTotal.setBackground(new java.awt.Color(232, 245, 254));
        jtxtTotal.setBorder(null);
        jtxtTotal.setForeground(new java.awt.Color(51, 51, 51));
        jtxtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtTotal.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtTotalKeyTyped(evt);
            }
        });
        jPanel2.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 445, 190, 30));

        jPassword3.setBackground(new java.awt.Color(255, 255, 255));
        jPassword3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtCantidad.png"))); // NOI18N
        jPanel2.add(jPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(43, 45, 66));
        jLabel15.setText("TOTAL");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        tabGeneral.addTab("", jPanel2);

        add(tabGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1260, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped
        this.listar(jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        mostrarBotonTabla(450);
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jbtnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearProductoActionPerformed
        tabGeneral.setEnabledAt(1, true);
        tabGeneral.setEnabledAt(0, false);
        tabGeneral.setSelectedIndex(1);
    }//GEN-LAST:event_jbtnCrearProductoActionPerformed

    private void jtxtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTotalKeyTyped
        if (jtxtTotal.getText().length() == 2) {
            jtxtTotal.setText(jtxtTotal.getText() + "-");
        }
        if (jtxtTotal.getText().length() == 5) {
            jtxtTotal.setText(jtxtTotal.getText() + "-");
        }
    }//GEN-LAST:event_jtxtTotalKeyTyped

    private void jScrollPane3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane3MouseWheelMoved
        mostrarBotonTabla(390);
    }//GEN-LAST:event_jScrollPane3MouseWheelMoved

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        tabGeneral.setEnabledAt(0, true);
        tabGeneral.setEnabledAt(1, false);
        tabGeneral.setSelectedIndex(0);
        Utilidades.limpiarTextfields(jtxtNumeroComprobante, jtxtTotal, jtxtBuscar);
        jcbxCliente.setSelectedIndex(0);
        modeloDetalles.setColumnIdentifiers(new Object[]{"ID Producto", "Nombre Producto", "Cantidad", "Precio"});
        modeloDetalles.setRowCount(0);
        tablaDetalles.setModel(modeloDetalles);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed

        if (Utilidades.sonTextfieldsVacios(jtxtNumeroComprobante)) {
            JOptionPane.showMessageDialog(null, "Defina el número de comprobante", "Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String resp = CONTROL.insertar(obtenerIdDelCombo(jcbxCliente), obtenerNombreDelCombo(jcbxCliente), jtxtNumeroComprobante.getText(), Double.parseDouble(jtxtTotal.getText()), modeloDetalles);

        if (resp.equals("OK")) {
            JOptionPane.showMessageDialog(null, "Se registró la venta correctamente");
            Utilidades.limpiarTextfields(jtxtNumeroComprobante, jtxtTotal, jtxtBuscar);
            this.listar("");

            tabGeneral.setSelectedIndex(0);
            tabGeneral.setEnabledAt(1, false);
            tabGeneral.setEnabledAt(0, true);

        } else {
            JOptionPane.showMessageDialog(null, "Ocurrió un error en el registro", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerProductosActionPerformed
        DialogSeleccionarProducto dialog = new DialogSeleccionarProducto(null, true);
        dialog.setModel(this);
        dialog.setVisible(true);
        dialog.toFront();
    }//GEN-LAST:event_jbtnVerProductosActionPerformed

    private void jbtnActualizarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarTotalActionPerformed
        calcularTotales();
    }//GEN-LAST:event_jbtnActualizarTotalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPassword3;
    private javax.swing.JLabel jPassword4;
    private javax.swing.JLabel jPassword5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private presentacion.files.componentes.ButtonCustom jbtnActualizarTotal;
    private presentacion.files.componentes.ButtonCustom jbtnCancelar;
    private presentacion.files.componentes.ButtonCustom jbtnCrearProducto;
    private presentacion.files.componentes.ButtonCustom jbtnGuardar;
    private presentacion.files.componentes.ButtonCustom jbtnSubir;
    private presentacion.files.componentes.ButtonCustom jbtnVerProductos;
    private javax.swing.JComboBox<String> jcbxCliente;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JFormattedTextField jtxtNumeroComprobante;
    private javax.swing.JFormattedTextField jtxtTotal;
    private presentacion.files.componentes.TabbedCustom tabGeneral;
    private javax.swing.JTable tablaDetalles;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
