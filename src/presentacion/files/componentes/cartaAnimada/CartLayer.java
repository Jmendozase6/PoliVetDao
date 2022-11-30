package presentacion.files.componentes.cartaAnimada;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CartLayer extends javax.swing.JComponent {

    private ModelCart model;

    public CartLayer () {
        initComponents();
    }

    private void buttonAction () {
        try {
            Desktop.getDesktop().browse(new URI(model.getNumero()));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(CartLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setTextos (ModelCart model) {
        this.model = model;
        labelDescripcion.setText(model.getDescription());
        labelNombres.setText(model.getNombres());
        labelApellidos.setText(model.getApellidos());
        labelDatos.setText(model.getEdad());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDatos = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        labelDescripcion = new presentacion.files.componentes.cartaAnimada.TextPaneCenter();
        button1 = new presentacion.files.componentes.cartaAnimada.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDatos.setFont(new java.awt.Font("Gilroy-Regular", 0, 18)); // NOI18N
        labelDatos.setForeground(new java.awt.Color(82, 183, 136));
        labelDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDatos.setText("19 años - Piura");
        add(labelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 20));

        labelApellidos.setBackground(new java.awt.Color(51, 51, 51));
        labelApellidos.setFont(new java.awt.Font("Gilroy-Regular", 1, 18)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(51, 51, 51));
        labelApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApellidos.setText("Apellidos");
        add(labelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 20));

        labelNombres.setBackground(new java.awt.Color(51, 51, 51));
        labelNombres.setFont(new java.awt.Font("Gilroy-Regular", 1, 18)); // NOI18N
        labelNombres.setForeground(new java.awt.Color(51, 51, 51));
        labelNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombres.setText("Nombres");
        add(labelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 20));
        add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, -1));

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/whatsapp.png"))); // NOI18N
        button1.setText(" WhatsApp");
        button1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 50));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private presentacion.files.componentes.cartaAnimada.Button button1;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelDatos;
    private presentacion.files.componentes.cartaAnimada.TextPaneCenter labelDescripcion;
    private javax.swing.JLabel labelNombres;
    // End of variables declaration//GEN-END:variables
}
