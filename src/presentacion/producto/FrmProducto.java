package presentacion.producto;

import businessobject.ProductoControl;
import businessobject.ProductoQrControl;
import businessobject.UsuarioActivo;
import businessobject.Utilidades;
import datatransferobject.ProductoDTO;
import java.awt.Font;
import javax.swing.JOptionPane;
import presentacion.files.componentes.customswitch.SwitchListener;
import presentacion.usuarios.administador.FrmVenta;

public class FrmProducto extends javax.swing.JPanel {

    private FrmVenta frm;
    private final ProductoControl CONTROL;
    private ProductoDTO productoActualizar;

    public FrmProducto () {
        initComponents();
        CONTROL = new ProductoControl();
        this.listar("");
        jbtnSubir.setVisible(false);
        ocultarBotones();
    }

    public void setModel (FrmVenta frm) {
        this.frm = frm;
    }

    private void ocultarBotones () {
        if (UsuarioActivo.idRol == 2) {
            jbtnActualizar.setVisible(false);
            jbtnActivarDesactivar.setVisible(false);
            jbtnCrearProducto.setVisible(false);
            jbtnCambiarTipo.setVisible(false);
            jchMostrarRegistrosInactivos.setVisible(false);
            jLabel19.setVisible(false);
            labelActivo.setVisible(false);
            jPassword5.setVisible(false);
            jswEstado.setVisible(false);
            jbtnGenerarQR.setVisible(false);
            // Editable textfields
            jtxtIdProducto.setEditable(false);
            jtxtIdTipoProducto.setEditable(false);
            jtxtIdProveedor.setEditable(false);
            jtxtNombre.setEditable(false);
            jtxtDescripcion.setEditable(false);
            jtxtMarca.setEditable(false);
            jtxtPrecio.setEditable(false);
            jtxtCantidad.setEnabled(false);

        }
    }

    private void ocultarColumnas () {

        tablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);

        tablaProductos.getColumnModel().getColumn(1).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(1).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);

        tablaProductos.getColumnModel().getColumn(2).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(2).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);

        tablaProductos.getColumnModel().getColumn(8).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(8).setMinWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        tablaProductos.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
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
        tablaProductos.setModel(this.CONTROL.listar(buscar, (byte) 1));
        ocultarColumnas();
    }

    private byte getEstado () {
        return jswEstado.isOn() ? (byte) 1 : (byte) 0;
    }

    private void setEstado (String estado) {
        jswEstado.setOn(estado.equalsIgnoreCase("activo"));
        labelActivo.setText(estado.equalsIgnoreCase("activo") ? "Producto activo" : "Producto inactivo");
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
        jswEstado = new presentacion.files.componentes.customswitch.SwitchButton();
        jtxtIdProveedor = new javax.swing.JTextField();
        jtxtIdTipoProducto = new javax.swing.JTextField();
        jtxtCantidad = new javax.swing.JFormattedTextField();
        jtxtIdProducto = new javax.swing.JTextField();
        jtxtPrecio = new javax.swing.JFormattedTextField();
        jtxtMarca = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtDescripcion = new javax.swing.JTextArea();
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
        jbtnActualizar = new presentacion.files.componentes.ButtonCustom();
        jLabel20 = new javax.swing.JLabel();
        jbtnActivarDesactivar = new presentacion.files.componentes.ButtonCustom();
        jchMostrarRegistrosInactivos = new presentacion.files.componentes.CheckBoxCustom();
        jbtnCrearProducto = new presentacion.files.componentes.ButtonCustom();
        jbtnCambiarTipo = new presentacion.files.componentes.ButtonCustom();
        jbtnGenerarQR = new presentacion.files.componentes.ButtonCustom();

        setBackground(new java.awt.Color(232, 245, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

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

        jswEstado.setRound(20);
        jswEstado.setSpace(1);
        jswEstado.setSwitchColor(new java.awt.Color(82, 183, 136));
        add(jswEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 840, 100, 40));
        jswEstado.addEventSwitchSelected(new SwitchListener(){
            @Override
            public void selectChange(boolean valor){
                labelActivo.setText(valor
                    ? "Producto activo"
                    : "Producto inactivo");
            }
        });

        jtxtIdProveedor.setEditable(false);
        jtxtIdProveedor.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdProveedor.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdProveedor.setForeground(new java.awt.Color(51, 51, 51));
        jtxtIdProveedor.setBorder(null);
        jtxtIdProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jtxtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 845, 190, 30));

        jtxtIdTipoProducto.setEditable(false);
        jtxtIdTipoProducto.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdTipoProducto.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdTipoProducto.setForeground(new java.awt.Color(51, 51, 51));
        jtxtIdTipoProducto.setBorder(null);
        jtxtIdTipoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jtxtIdTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 765, 190, 30));

        jtxtCantidad.setBackground(new java.awt.Color(232, 245, 254));
        jtxtCantidad.setBorder(null);
        jtxtCantidad.setForeground(new java.awt.Color(51, 51, 51));
        jtxtCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtCantidad.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 685, 190, 30));

        jtxtIdProducto.setEditable(false);
        jtxtIdProducto.setBackground(new java.awt.Color(232, 245, 254));
        jtxtIdProducto.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtIdProducto.setForeground(new java.awt.Color(51, 51, 51));
        jtxtIdProducto.setBorder(null);
        jtxtIdProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 685, 190, 30));

        jtxtPrecio.setBackground(new java.awt.Color(232, 245, 254));
        jtxtPrecio.setBorder(null);
        jtxtPrecio.setForeground(new java.awt.Color(51, 51, 51));
        jtxtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jtxtPrecio.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 765, 190, 30));

        jtxtMarca.setBackground(new java.awt.Color(232, 245, 254));
        jtxtMarca.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(51, 51, 51));
        jtxtMarca.setBorder(null);
        jtxtMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 685, 210, 30));

        jtxtNombre.setBackground(new java.awt.Color(232, 245, 254));
        jtxtNombre.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(51, 51, 51));
        jtxtNombre.setBorder(null);
        jtxtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 685, 190, 30));

        jScrollPane2.setBackground(new java.awt.Color(232, 245, 254));
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 755, 210, 130));

        jCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtId.png"))); // NOI18N
        add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtId.png"))); // NOI18N
        add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 45, 66));
        jLabel10.setText("ID Tipo de Producto");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 45, 66));
        jLabel11.setText("ID Producto");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        jPassword1.setBackground(new java.awt.Color(255, 255, 255));
        jPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtId.png"))); // NOI18N
        add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 45, 66));
        jLabel12.setText("ID Proveedor");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, -1, -1));

        jCorreo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtNombre.png"))); // NOI18N
        add(jCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, -1, -1));

        jPassword2.setBackground(new java.awt.Color(255, 255, 255));
        jPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtDescripcion.png"))); // NOI18N
        add(jPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 750, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(43, 45, 66));
        jLabel13.setText("Descripción");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(43, 45, 66));
        jLabel14.setText("Nombre");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, -1));

        jPassword3.setBackground(new java.awt.Color(255, 255, 255));
        jPassword3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtCantidad.png"))); // NOI18N
        add(jPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(43, 45, 66));
        jLabel15.setText("Cantidad");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, -1, -1));

        jCorreo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtMarca.png"))); // NOI18N
        add(jCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, -1, 40));

        jPassword4.setBackground(new java.awt.Color(255, 255, 255));
        jPassword4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/producto/txtPrecio.png"))); // NOI18N
        add(jPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 760, -1, -1));

        jLabel16.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(43, 45, 66));
        jLabel16.setText("Precio");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 740, -1, -1));

        jLabel17.setFont(new java.awt.Font("Hey Comic", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(43, 45, 66));
        jLabel17.setText("PRODUCTOS");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        labelActivo.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelActivo.setForeground(new java.awt.Color(51, 51, 51));
        labelActivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelActivo.setText("Producto activo");
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
        jLabel20.setText("Marca");
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

        jbtnCrearProducto.setText("Crear Producto");
        jbtnCrearProducto.setFocusPainted(false);
        jbtnCrearProducto.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearProductoActionPerformed(evt);
            }
        });
        add(jbtnCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 840, 130, 40));

        jbtnCambiarTipo.setText("Cambiar Tipo");
        jbtnCambiarTipo.setFocusPainted(false);
        jbtnCambiarTipo.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnCambiarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCambiarTipoActionPerformed(evt);
            }
        });
        add(jbtnCambiarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 840, 130, 40));

        jbtnGenerarQR.setText("QR");
        jbtnGenerarQR.setFocusPainted(false);
        jbtnGenerarQR.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnGenerarQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarQRActionPerformed(evt);
            }
        });
        add(jbtnGenerarQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 760, 50, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped
        this.listar(jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnSubirActionPerformed

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        mostrarBotonTabla();
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

        if (jtxtIdProducto.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un producto de la tabla", "Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (Utilidades.sonTextfieldsVacios(jtxtIdProducto, jtxtIdTipoProducto, jtxtIdProveedor, jtxtNombre, jtxtMarca, jtxtPrecio, jtxtCantidad) && jtxtDescripcion.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Sistema", JOptionPane.ERROR_MESSAGE);
            return;
        }

        productoActualizar = new ProductoDTO(
                Integer.parseInt(jtxtIdProducto.getText()),
                Byte.parseByte(jtxtIdTipoProducto.getText()),
                Integer.parseInt(jtxtIdProveedor.getText()),
                jtxtNombre.getText(),
                jtxtDescripcion.getText(),
                jtxtMarca.getText(),
                Float.parseFloat(jtxtPrecio.getText()),
                Float.parseFloat(jtxtCantidad.getText()),
                getEstado()
        );

        String respuesta = CONTROL.actualizar(productoActualizar);
        if (respuesta.equalsIgnoreCase("OK")) {
            Utilidades.limpiarTextfields(jtxtIdProducto, jtxtIdTipoProducto, jtxtIdProveedor, jtxtNombre, jtxtMarca, jtxtPrecio, jtxtCantidad, jtxtBuscar);
            jtxtDescripcion.setText("");
            JOptionPane.showMessageDialog(this, "Se actualizó correctamente el producto");
            this.listar("");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el registro", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

        jchMostrarRegistrosInactivosActionPerformed(evt);

    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        if (tablaProductos.getSelectedRowCount() == 1) {

            String idProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
            String idTipoProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 1));
            String idProveedor = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 2));
            String nombre = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 3));
            String descripcion = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 4));
            String marca = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 5));
            String precio = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 6));
            String cantidad = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 7));
            String estado = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 8));

            jtxtIdProducto.setText(idProducto);
            jtxtIdTipoProducto.setText(idTipoProducto);
            jtxtIdProveedor.setText(idProveedor);
            jtxtNombre.setText(nombre);
            jtxtDescripcion.setText(descripcion);
            jtxtMarca.setText(marca);
            jtxtPrecio.setText(precio);
            jtxtCantidad.setText(cantidad);
            setEstado(estado);
            jbtnActivarDesactivar.setText(estado.equalsIgnoreCase("activo") ? "Desactivar" : "Activar");
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void jbtnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActivarDesactivarActionPerformed

        if (jtxtIdProducto.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un producto de la tabla", "Sistema", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idProducto = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
        String nombres = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 3));
        String marca = String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 5));

        int respuesta = JOptionPane.showConfirmDialog(this, "Desea " + jbtnActivarDesactivar.getText().toLowerCase() + " el producto con los datos"
                + "\nID Producto = " + idProducto
                + "\nNombre = " + nombres
                + "\nMarca = " + marca, "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.NO_OPTION) {
            return;
        }

        String resp;
        if (jbtnActivarDesactivar.getText().equalsIgnoreCase("Activar")) {
            resp = CONTROL.activar(Integer.parseInt(idProducto));
        } else {
            resp = CONTROL.desactivar(Integer.parseInt(idProducto));
        }

        if (resp.equals("OK")) {
            JOptionPane.showMessageDialog(this, "Se actualizó el estado del registro.");
            this.listar("nombres");
            Utilidades.limpiarTextfields(jtxtIdProducto, jtxtIdTipoProducto, jtxtIdProveedor, jtxtNombre, jtxtMarca, jtxtPrecio, jtxtCantidad, jtxtBuscar);
            jtxtDescripcion.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el estado del registro", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnActivarDesactivarActionPerformed

    private void jchMostrarRegistrosInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchMostrarRegistrosInactivosActionPerformed
        if (jchMostrarRegistrosInactivos.isSelected()) {
            tablaProductos.setModel(this.CONTROL.listar("", (byte) 0));
            ocultarColumnas();
        } else {
            this.listar("");
        }
    }//GEN-LAST:event_jchMostrarRegistrosInactivosActionPerformed

    private void jbtnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearProductoActionPerformed
        new DialogCrearProducto(null, true, this).setVisible(true);
    }//GEN-LAST:event_jbtnCrearProductoActionPerformed

    private void jbtnCambiarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCambiarTipoActionPerformed
        if (jtxtIdProducto.getText().isBlank()) {
            labelError.setText("No ha seleccionado un producto de la tabla");
            return;
        }

        new DialogCambiarTipo(null, true, this).setVisible(true);
    }//GEN-LAST:event_jbtnCambiarTipoActionPerformed

    private void jbtnGenerarQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarQRActionPerformed
        ProductoQrControl productoQr = new ProductoQrControl();

        if (productoQr.generarQR(this).equals("OK")) {
            JOptionPane.showMessageDialog(this, "Se generaron los códigos QR");
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error mientras se generaban los códigos", "Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnGenerarQRActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jPassword;
    private javax.swing.JLabel jPassword1;
    private javax.swing.JLabel jPassword2;
    private javax.swing.JLabel jPassword3;
    private javax.swing.JLabel jPassword4;
    private javax.swing.JLabel jPassword5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private presentacion.files.componentes.ButtonCustom jbtnActivarDesactivar;
    private presentacion.files.componentes.ButtonCustom jbtnActualizar;
    private presentacion.files.componentes.ButtonCustom jbtnCambiarTipo;
    private presentacion.files.componentes.ButtonCustom jbtnCrearProducto;
    private presentacion.files.componentes.ButtonCustom jbtnGenerarQR;
    private presentacion.files.componentes.ButtonCustom jbtnSubir;
    private presentacion.files.componentes.CheckBoxCustom jchMostrarRegistrosInactivos;
    private presentacion.files.componentes.customswitch.SwitchButton jswEstado;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JFormattedTextField jtxtCantidad;
    private javax.swing.JTextArea jtxtDescripcion;
    private javax.swing.JTextField jtxtIdProducto;
    private javax.swing.JTextField jtxtIdProveedor;
    public javax.swing.JTextField jtxtIdTipoProducto;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JFormattedTextField jtxtPrecio;
    private javax.swing.JLabel labelActivo;
    private javax.swing.JLabel labelError;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
