
package turismo;

/**
 *
 * @author Luis
 */
public class Dos extends javax.swing.JFrame {
     String opcion, lugar, aux;
    Reglas objR = new Reglas();
    
    public Dos(String opcion) {
        initComponents();
        aux = opcion;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBFrio = new javax.swing.JButton();
        jBCalienteH = new javax.swing.JButton();
        jBTempladoS = new javax.swing.JButton();
        jBSecoA = new javax.swing.JButton();
        jBTempladoH = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBF = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("¿Qué tipo de clima busca?");

        jBFrio.setText("Frío");
        jBFrio.setPreferredSize(new java.awt.Dimension(80, 75));
        jBFrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFrioActionPerformed(evt);
            }
        });

        jBCalienteH.setText("Caliente húmedo");
        jBCalienteH.setPreferredSize(new java.awt.Dimension(80, 75));
        jBCalienteH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalienteHActionPerformed(evt);
            }
        });

        jBTempladoS.setText("Calido humedo");
        jBTempladoS.setPreferredSize(new java.awt.Dimension(80, 75));
        jBTempladoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTempladoSActionPerformed(evt);
            }
        });

        jBSecoA.setText("Seco árido");
        jBSecoA.setPreferredSize(new java.awt.Dimension(80, 75));
        jBSecoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSecoAActionPerformed(evt);
            }
        });

        jBTempladoH.setText("Templado húmedo");
        jBTempladoH.setPreferredSize(new java.awt.Dimension(80, 75));
        jBTempladoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTempladoHActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jBF.setText("Seco");
        jBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFrio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSecoA, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBCalienteH, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTempladoS, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTempladoH, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCalienteH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTempladoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSecoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTempladoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ventana");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Principal");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBFrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFrioActionPerformed
        opcion = "frio";
        lugar = objR.Corredor(aux,opcion);
        System.out.println("Escogiste:" + aux + "y" + lugar);
        Tres ventana = new Tres(lugar);
        setVisible(false);
        ventana.setVisible(true);
        ventana.setLocation(300, 150);
    }//GEN-LAST:event_jBFrioActionPerformed

    private void jBCalienteHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalienteHActionPerformed
        opcion = "caliente humedo";
        lugar = objR.Corredor(aux,opcion);
        System.out.println("Escogiste:" + aux + "y" + lugar);
        Tres ventana = new Tres(lugar);
        setVisible(false);
        ventana.setVisible(true);
        ventana.setLocation(300, 150);
    }//GEN-LAST:event_jBCalienteHActionPerformed

    private void jBTempladoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTempladoSActionPerformed
        opcion = "calido humedo";
        lugar = objR.Corredor(aux,opcion);
        System.out.println("Escogiste:" + aux + "y" + lugar);
        Tres ventana = new Tres(lugar);
        setVisible(false);
        ventana.setVisible(true);
        ventana.setLocation(300, 150);
    }//GEN-LAST:event_jBTempladoSActionPerformed

    private void jBSecoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSecoAActionPerformed
        opcion = "seco arido";
        lugar = objR.Corredor(aux,opcion);
        System.out.println("Escogiste:" + aux + "y" + lugar);
        Tres ventana = new Tres(lugar);
        setVisible(false);
        ventana.setVisible(true);
        ventana.setLocation(300, 150);
    }//GEN-LAST:event_jBSecoAActionPerformed

    private void jBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFActionPerformed
        opcion = "seco";
        lugar = objR.Corredor(aux,opcion);
        System.out.println("Escogiste:" + aux + "y" + lugar);
        Tres ventana = new Tres(lugar);
        setVisible(false);
        ventana.setVisible(true);
        ventana.setLocation(300, 150);
    }//GEN-LAST:event_jBFActionPerformed

    private void jBTempladoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTempladoHActionPerformed
        opcion = "templado humedo";
        lugar = objR.Corredor(aux,opcion);
        System.out.println("Escogiste:" + aux + "y" + lugar);
        Tres ventana = new Tres(lugar);
        setVisible(false);
        ventana.setVisible(true);
        ventana.setLocation(300, 150);
    }//GEN-LAST:event_jBTempladoHActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalienteH;
    private javax.swing.JButton jBF;
    private javax.swing.JButton jBFrio;
    private javax.swing.JButton jBSecoA;
    private javax.swing.JButton jBTempladoH;
    private javax.swing.JButton jBTempladoS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
