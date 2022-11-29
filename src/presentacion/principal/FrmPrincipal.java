package presentacion.principal;

import businessobject.UsuarioActivo;
import java.awt.Component;
import presentacion.login.*;
import presentacion.producto.*;
import presentacion.usuarios.*;
import presentacion.usuarios.administador.FrmDetalleVenta;
import presentacion.usuarios.administador.FrmEstadisticas;
import presentacion.usuarios.cliente.*;
import presentacion.usuarios.veterinario.*;
import presentacion.vacio.FrmVacio;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal () {
        initComponents();
        addEvent();
        showForm(new FrmVacio());
    }

    private void showForm (Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    private void switchAdministrador (int index, int indexSubMenu) {
        if (index == 0) {
            showForm(new FrmInicio());
        }
        if (index == 1) {
            showForm(new FrmCliente());
        }
        if (index == 2) {
            showForm(new FrmVeterinario());
        }
        if (index == 3) {
            showForm(new FrmInicio());
        }
        if (index == 4) {
            showForm(new FrmDetalleVenta());
        }
        if (index == 5) {
            showForm(new FrmEstadisticas());
        }
        if (index == 6) {
            showForm(new FrmProducto());
        }
        if (index == 7) {
            showForm(new FrmReservaCitas());
        }
        if (index == 8) {
            showForm(new FrmCitasProgramadas());
        }
        if (index == 9 && indexSubMenu == 1) {
            //TODO: MOSTRAR UN FORMULARIO PARA ACTUALIZAR MI CUENTA
        }
        if (index == 9 && indexSubMenu == 2) {
            //TODO: MOSTRAR UN JOPTIONPANE PARA ACTIVAR EL MODO OSCURO
        }
        if (index == 9 && indexSubMenu == 3) {
            //TODO: MOSTRAR UN JOPTIONPANE PARA CERRAR SESIÓN
            new FrmLogin().setVisible(true);
            this.dispose();
        }
    }

    private void switchCliente (int index, int indexSubMenu) {
        if (index == 0) {
            showForm(new FrmInicio());
        }
        if (index == 1) {
            showForm(new FrmDetallesComprasCliente());
        }
        if (index == 2) {
            showForm(new FrmEstadisticasCliente());
        }
        if (index == 3) {
            showForm(new FrmProducto());
        }

        if (index == 5) {
            showForm(new FrmConfiguracion());
        }
        if (index == 5 && indexSubMenu == 1) {
            //TODO: MOSTRAR UN JOPTIONPANE PARA ACTIVAR EL MODO OSCURO
        }
        if (index == 5 && indexSubMenu == 2) {
            //TODO: MOSTRAR UN JOPTIONPANE PARA CERRAR SESIÓN
            new FrmLogin().setVisible(true);
            this.dispose();
        }
    }

    private void switchVeterinario (int index, int indexSubMenu) {
        if (index == 0) {
            showForm(new FrmInicio());
        }
        if (index == 1) {
            showForm(new FrmMascotas());
        }
        if (index == 2) {
            showForm(new FrmTarjetaVacuna());
        }
        if (index == 3) {
            showForm(new FrmReservaCitas());
        }
        if (index == 4) {
            showForm(new FrmCitasProgramadas());
        }
    }

    private void addEvent () {
        menu.addEvent((int index, int indexSubMenu) -> {
            switch (UsuarioActivo.idRol) {
                case 1: {
                    switchAdministrador(index, indexSubMenu);
                }
                break;
                case 2: {
                    switchCliente(index, indexSubMenu);
                }
                case 4: {
                    switchVeterinario(index, indexSubMenu);
                }
                break;
                default: {
                    switchCliente(index, indexSubMenu);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        menu = new presentacion.files.componentes.menu.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());
        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1300, 900));
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 900));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel1;
    private presentacion.files.componentes.menu.Menu menu;
    // End of variables declaration//GEN-END:variables
}
