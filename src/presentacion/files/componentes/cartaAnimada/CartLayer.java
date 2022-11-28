package presentacion.files.componentes.cartaAnimada;

public class CartLayer extends javax.swing.JComponent {

    public CartLayer () {
        initComponents();
    }

    public void setModel (ModelCart model) {
        txt.setText(model.getDescription());
        labelNombres.setText(model.getNombres());
        labelApellidos.setText(model.getApellidos());
        labelDatos.setText(model.getEdad());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new cart.TextPaneCenter();
        labelLink = new cart.Button();
        labelDatos = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 148, 268, -1));

        labelLink.setText("GitHub");
        labelLink.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        add(labelLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 50));

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
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelDatos;
    private cart.Button labelLink;
    private javax.swing.JLabel labelNombres;
    private cart.TextPaneCenter txt;
    // End of variables declaration//GEN-END:variables
}
