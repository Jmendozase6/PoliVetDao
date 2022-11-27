package presentacion.principal;

import java.awt.Component;
import presentacion.usuarios.FrmCliente;
import presentacion.vacio.FrmVacio;

public class FrmPrincipal extends javax.swing.JFrame {

    private byte tipoUsuario;

    public FrmPrincipal (byte tipoUsuario) {
        initComponents();
//        addEvent();
        showForm(new FrmVacio());
    }

    public void showForm (Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
//
//    private void addEvent () {
//        menu.addEvent((int index, int indexSubMenu) -> {
//            //                if (index == 0 && indexSubMenu == 0) {
////                    showForm(new Form_Dashboard());
////                } else {
////                    showForm(new Form_Empty(index + " " + indexSubMenu));
////                }
//            if (index == 0) {
//                showForm(new FrmInicio());
//            } else if (index == 1) {
//                showForm(new FrmCliente());
//            } else {
//                showForm(new FrmVacio());
//            }
//
//        });
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        menu1 = new presentacion.files.componentes.menu.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());
        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1300, 900));
        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel1;
    private presentacion.files.componentes.menu.Menu menu1;
    // End of variables declaration//GEN-END:variables
}
