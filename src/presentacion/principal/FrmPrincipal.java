package presentacion.principal;

import businessobject.UsuarioActivo;
import java.awt.Component;
import javax.swing.JOptionPane;
import presentacion.configuracion.FrmEditarPerfil;
import presentacion.login.*;
import presentacion.producto.*;
import presentacion.usuarios.*;
import presentacion.usuarios.administador.FrmDetalleVenta;
import presentacion.usuarios.administador.FrmEstadisticas;
import presentacion.usuarios.veterinario.*;
import presentacion.vacio.FrmVacio;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal () {
        initComponents();
        showForm(new FrmVacio());
        addEvent();
    }

    private void showForm (Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    private void switchAdministrador (int index, int indexSubMenu) {
        if (index == 0) {
            showForm(new FrmVacio());
        }
        if (index == 1) {
            showForm(new FrmCliente());
        }
        if (index == 2) {
            showForm(new FrmVeterinario());
        }
        if (index == 3) {
            showForm(new FrmProveedor());
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
            showForm(new FrmMascotas());
        }
        if (index == 9 && indexSubMenu == 1) {
            showForm(new FrmEditarPerfil());
        }
        if (index == 9 && indexSubMenu == 2) {
            JOptionPane.showMessageDialog(null, "Alertas");
            //TODO: MOSTRAR UN JOPTIONPANE PARA ACTIVAR EL MODO OSCURO
        }
        if (index == 9 && indexSubMenu == 3) {
            if (JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar su sesión actual?", "Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                new FrmLogin().setVisible(true);
                this.dispose();
            }
        }
    }

    private void switchCliente (int index, int indexSubMenu) {
        if (index == 0) {
            showForm(new FrmVacio());
        }
        if (index == 1) {
            showForm(new FrmProducto());
        }
        if (index == 2 && indexSubMenu == 1) {
            showForm(new FrmEditarPerfil());
        }
        if (index == 2 && indexSubMenu == 2) {
            JOptionPane.showMessageDialog(null, "Alertas");
        }
        if (index == 2 && indexSubMenu == 3) {
            if (JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar su sesión actual?", "Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                new FrmLogin().setVisible(true);
                this.dispose();
            }
        }
    }

    private void switchVeterinario (int index, int indexSubMenu) {
        if (index == 0) {
            showForm(new FrmVacio());
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
        if (index == 4 && indexSubMenu == 1) {
            showForm(new FrmEditarPerfil());
        }
        if (index == 4 && indexSubMenu == 2) {
            JOptionPane.showMessageDialog(null, "Alertas");
        }
        if (index == 4 && indexSubMenu == 3) {
            if (JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar su sesión actual?", "Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                new FrmLogin().setVisible(true);
                this.dispose();
            }
        }
    }

    private void addEvent () {

        menu.addEvent((int index, int indexSubMenu) -> {
            if (UsuarioActivo.idRol == 1) {
                switchAdministrador(index, indexSubMenu);
                return;
            }
            if (UsuarioActivo.idRol == 2) {
                switchCliente(index, indexSubMenu);
                return;
            }
            if (UsuarioActivo.idRol == 4) {
                switchVeterinario(index, indexSubMenu);
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
