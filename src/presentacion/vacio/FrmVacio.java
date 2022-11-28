package presentacion.vacio;

import javax.swing.ImageIcon;
import presentacion.files.componentes.cartaAnimada.ModelCart;

public class FrmVacio extends javax.swing.JPanel {

    public FrmVacio () {
        initComponents();
        infoCarta();
    }

    private void infoCarta () {
        cart1.setModel(new ModelCart("Jhair Steven", "Mendoza Sernaqué",
                "19 años",
                "Administrador",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart1.png"))));

        cart2.setModel(new ModelCart("Manuel Enrique", "Antón Cisneros",
                "19 años",
                "Administrador",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart1.png"))));

        cart3.setModel(new ModelCart("Geampier Eduardo", "Atoche Córdova",
                "19 años",
                "Operario",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart2.png"))));

        cart4.setModel(new ModelCart("Lizver Antuane", "Sosa Ladines",
                "19 años",
                "Operaria",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart2.png"))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCat = new javax.swing.JLabel();
        jCat1 = new javax.swing.JLabel();
        jCat2 = new javax.swing.JLabel();
        jCat3 = new javax.swing.JLabel();
        cart1 = new presentacion.files.componentes.cartaAnimada.Cart();
        cart2 = new presentacion.files.componentes.cartaAnimada.Cart();
        cart3 = new presentacion.files.componentes.cartaAnimada.Cart();
        cart4 = new presentacion.files.componentes.cartaAnimada.Cart();
        titulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        add(jCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 290, -1, -1));

        jCat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        add(jCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, -1, -1));

        jCat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/registro/catLeftTopForm.png"))); // NOI18N
        add(jCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jCat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/registro/catLeftTopForm.png"))); // NOI18N
        add(jCat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        add(cart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 280, 310));
        add(cart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 360, 280, 310));
        add(cart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 360, 280, 310));
        add(cart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 280, 310));

        titulo.setFont(new java.awt.Font("Gilroy-Bold", 0, 70)); // NOI18N
        titulo.setForeground(new java.awt.Color(82, 183, 136));
        titulo.setText("PoliVet PetCare");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/brownBottomWave.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 796, 1300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenTopWave.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private presentacion.files.componentes.cartaAnimada.Cart cart1;
    private presentacion.files.componentes.cartaAnimada.Cart cart2;
    private presentacion.files.componentes.cartaAnimada.Cart cart3;
    private presentacion.files.componentes.cartaAnimada.Cart cart4;
    private javax.swing.JLabel jCat;
    private javax.swing.JLabel jCat1;
    private javax.swing.JLabel jCat2;
    private javax.swing.JLabel jCat3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
