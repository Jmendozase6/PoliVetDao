package presentacion.principal;

import businessobject.UsuarioActivo;
import java.awt.Component;
import presentacion.login.FrmLogin;
import presentacion.usuarios.FrmCliente;
import presentacion.usuarios.FrmConfiguracion;
import presentacion.usuarios.FrmVeterinario;
import presentacion.usuarios.cliente.FrmDetalleVentaCliente;
import presentacion.usuarios.cliente.FrmGraficaCliente;
import presentacion.usuarios.cliente.FrmProductoCliente;
import presentacion.usuarios.cliente.FrmReservaCitaCliente;
import presentacion.usuarios.veterinario.FrmCitasProgramadas;
import presentacion.usuarios.veterinario.FrmMascotas;
import presentacion.usuarios.veterinario.FrmTarjetaVacuna;
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
    }

    private void switchCliente (int index, int indexSubMenu) {
        if (index == 0) {
            showForm(new FrmInicio());
        }
        if (index == 1) {
            showForm(new FrmDetalleVentaCliente());
        }
        if (index == 2) {
            showForm(new FrmGraficaCliente());
        }
        if (index == 3) {
            showForm(new FrmReservaCitaCliente());
        }
        if (index == 4) {
            showForm(new FrmProductoCliente());
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
