package presentacion.vacio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import presentacion.files.componentes.cartaAnimada.ModelCart;

public class FrmVacio extends javax.swing.JPanel implements Runnable {

    String horas, minutos, segundos;
    Thread hilo;

    public FrmVacio () {
        initComponents();
        infoCarta();
        hilo = new Thread(this);
        hilo.start();
        setFecha();
    }

    private void setHora () {
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        horas = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        labelHora.setText(horas + ":" + minutos + ":" + segundos);
    }

    private void setFecha () {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        labelFecha.setText(formatoFecha.format(fecha));
    }

    @Override
    public void run () {
        Thread actual = Thread.currentThread();
        while (actual == hilo) {
            setHora();
        }
    }

    private void infoCarta () {
        cart1.setModel(new ModelCart(
                "Jhair Steven",
                "Mendoza Sernaqué",
                "19 años",
                "Piura - Administrador",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart1.png")),
                "945295127"));

        cart2.setModel(new ModelCart(
                "Manuel Enrique",
                "Antón Cisneros",
                "19 años",
                "Sullana - Administrador",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart1.png")),
                "929953419"));

        cart3.setModel(new ModelCart(
                "Geampier Eduardo",
                "Atoche Córdova",
                "19 años",
                "Sullana - dministrador",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart2.png")),
                "URL"));

        cart4.setModel(new ModelCart(
                "Lizver Antuane",
                "Sosa Ladines",
                "19 años",
                "Sullana - Administrador",
                new ImageIcon(getClass().getResource("/presentacion/files/mascota/cart2.png")),
                "953158648"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHora = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        jCat = new javax.swing.JLabel();
        jCat1 = new javax.swing.JLabel();
        jCat2 = new javax.swing.JLabel();
        jCat3 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        cart1 = new presentacion.files.componentes.cartaAnimada.Cart();
        cart2 = new presentacion.files.componentes.cartaAnimada.Cart();
        cart3 = new presentacion.files.componentes.cartaAnimada.Cart();
        cart4 = new presentacion.files.componentes.cartaAnimada.Cart();
        jDog = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jAstronautDog = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 245, 254));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHora.setFont(new java.awt.Font("Gilroy-Bold", 0, 36)); // NOI18N
        labelHora.setForeground(new java.awt.Color(82, 183, 136));
        labelHora.setText("00:00:00");
        add(labelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, -1, -1));

        titulo1.setFont(new java.awt.Font("Gilroy-Bold", 0, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(51, 51, 51));
        titulo1.setText("Bienvenido a");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        titulo.setFont(new java.awt.Font("Gilroy-Bold", 0, 70)); // NOI18N
        titulo.setForeground(new java.awt.Color(82, 183, 136));
        titulo.setText("PoliVet");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/principal/iconJGreenBack.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        titulo3.setFont(new java.awt.Font("Gilroy-Bold", 0, 36)); // NOI18N
        titulo3.setForeground(new java.awt.Color(51, 51, 51));
        titulo3.setText("Fecha y hora");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        jCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        add(jCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

        jCat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        add(jCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, -1, -1));

        jCat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/registro/catLeftTopForm.png"))); // NOI18N
        add(jCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jCat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/registro/catLeftTopForm.png"))); // NOI18N
        add(jCat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        labelFecha.setFont(new java.awt.Font("Gilroy-Bold", 0, 36)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(82, 183, 136));
        labelFecha.setText("dd-mm-yyyy");
        add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, -1, -1));
        add(cart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 280, 310));
        add(cart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 280, 310));
        add(cart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 280, 310));
        add(cart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, 280, 310));

        jDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/dog.png"))); // NOI18N
        add(jDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 750, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenTopWave.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        jAstronautDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/astronautDog.png"))); // NOI18N
        add(jAstronautDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/brownBottomWave.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 796, 1300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/principal/jGreenBack.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/principal/jGreenBack.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private presentacion.files.componentes.cartaAnimada.Cart cart1;
    private presentacion.files.componentes.cartaAnimada.Cart cart2;
    private presentacion.files.componentes.cartaAnimada.Cart cart3;
    private presentacion.files.componentes.cartaAnimada.Cart cart4;
    private javax.swing.JLabel jAstronautDog;
    private javax.swing.JLabel jCat;
    private javax.swing.JLabel jCat1;
    private javax.swing.JLabel jCat2;
    private javax.swing.JLabel jCat3;
    private javax.swing.JLabel jDog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables

}
