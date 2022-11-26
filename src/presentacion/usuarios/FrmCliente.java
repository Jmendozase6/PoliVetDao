package presentacion.usuarios;

import businessobject.UsuarioControl;
import java.awt.Font;

public class FrmCliente extends javax.swing.JPanel {

    private final UsuarioControl CONTROL;
    private final byte idTipoRol = 2;

    public FrmCliente () {
        initComponents();
        CONTROL = new UsuarioControl();
        this.listar("nombres", "");
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
        jbtnRegistrarse.setText("Volver al inicio   ");
        jbtnRegistrarse.setFocusPainted(false);
        jbtnRegistrarse.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 650, 200, 40));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarKeyTyped
        this.listar(getSelected(), jtxtBuscar.getText().trim());
    }//GEN-LAST:event_jtxtBuscarKeyTyped

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarse;
    private presentacion.files.componentes.CheckBoxCustom jchDocumento;
    private presentacion.files.componentes.CheckBoxCustom jchNombres;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
