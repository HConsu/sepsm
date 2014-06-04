package sistema_de_diagnostico;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODProgressBarUI;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ProgressBarUI;

public class Entradita extends javax.swing.JFrame implements Runnable {

    public void run() {
        try {
            initComponents();
            setIconImage(new ImageIcon(getClass().getResource("/imagenes/linux.png")).getImage());
            setVisible(true);
            for (int i = 0; i <= 100; i += 5) {
                if (i == 5) {
                    lblTextito.setText("Cargando Modulos...");
                } else if (i == 50) {
                    lblTextito.setText("Cargando Librerias...");
                } else if (i == 90) {
                    lblTextito.setText("Iniciando el programa...");
                }
                jpbEntrada.setBackground(Color.BLACK);
                jpbEntrada.setForeground(jpbEntrada.getForeground());
                jpbEntrada.setUI((ProgressBarUI) NimRODProgressBarUI.createUI(null));
                jpbEntrada.setValue(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Entradita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
        }
        new Pantalla_Principal().setVisible(true);
        this.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpbEntrada = new javax.swing.JProgressBar();
        lblTextito = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MICCASIB 1.0");
        setUndecorated(true);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1 = new Panelcito("Azulll.jpg");
        jPanel1.setLayout(null);

        jpbEntrada.setName("jpbEntrada"); // NOI18N
        jPanel1.add(jpbEntrada);
        jpbEntrada.setBounds(60, 150, 305, 10);

        lblTextito.setForeground(new java.awt.Color(0, 51, 51));
        lblTextito.setName("lblTextito"); // NOI18N
        jPanel1.add(lblTextito);
        lblTextito.setBounds(60, 160, 179, 14);

        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("® Copyright (C) 2010-2011");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(112, 267, 305, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-417)/2, (screenSize.height-302)/2, 417, 302);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Entradita e = new Entradita();
                Thread t = new Thread(e);
                t.setDaemon(true);
                t.start();
                NimRODTheme nt = new NimRODTheme();
                //Pone en rojo los colores
//                nt.setPrimary1(new Color(184, 00, 00));
//                nt.setPrimary2(new Color(194, 00, 00));
//                nt.setPrimary3(new Color(204, 00, 00));
//                nt.setSecondary1(new Color(220, 220, 220));
//                nt.setSecondary2(new Color(230, 230, 230));
//                nt.setSecondary3(new Color(240, 240, 240));

                //Pone en azul los colores
                nt.setPrimary1(new Color(00, 133, 235));
                nt.setPrimary2(new Color(00, 143, 245));
                nt.setPrimary3(new Color(00, 153, 255));
                nt.setSecondary1(new Color(220, 220, 220));
                nt.setSecondary2(new Color(230, 230, 230));
                nt.setSecondary3(new Color(240, 240, 240));
                nt.setWhite(new Color(250, 250, 250));
                nt.setBlack(new Color(0, 0, 0));
                nt.setOpacity(0);
                nt.setMenuOpacity(0);
                nt.setFrameOpacity(0);
                NimRODLookAndFeel nlf = new NimRODLookAndFeel();
                nlf.setCurrentTheme(nt);
              
                try {
                    UIManager.setLookAndFeel(nlf);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Entradita.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jpbEntrada;
    private javax.swing.JLabel lblTextito;
    // End of variables declaration//GEN-END:variables

}
