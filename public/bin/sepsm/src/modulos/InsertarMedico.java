
package modulos;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Container;
import java.sql.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InsertarMedico extends javax.swing.JFrame {
        static int z, ide; 
        String b,c;
        
          private database.conexion conn = new database.conexion();   
          
        static Statement s;
        static ResultSet rs;
    
        public InsertarMedico() 
        {
            initComponents();   
            //limpiar();
            //desbloquear();
            
            
        
        }       
      
    public void autoincrementar() {
        try {
       
            s = conn.getConnection().createStatement();
            ResultSet rs = s.executeQuery("select MAX(idusuario) as maximo FROM usuarios");

            while (rs.next()) {
                System.out.println("Indice=" + rs.getObject("maximo"));
                ide = rs.getInt("maximo");
                ide = ide+1;
                System.out.print("Resultado:" + ide);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
    
    public void insertar(int ide,String nombre, String pass, String cedula)
    {
      try
      {
 
          s=conn.getConnection().createStatement();
          s.execute("INSERT INTO usuarios values("+ide+", '"+nombre +"', '"+pass+"','"+cedula+"')");           
              mostrarMensaje("Médico Registrado exitosamente");
        }
      
      catch(SQLException ex)
      {
          System.out.println(ex);
      }
    }

    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Paciente");
        setBackground(new java.awt.Color(255, 51, 51));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(1000, 1000, 0, 0));
        setMinimumSize(new java.awt.Dimension(450, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 60, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 80, 17);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 130, 270, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 170, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("NUEVO MÉDICO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 10, 220, 29);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 240, 140, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cédula Profesional:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 170, 140, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 90, 310, 30);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 240, 120, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   protected void mostrarMensaje(String mensaje) {
                JOptionPane.showMessageDialog(this, mensaje, "Registro",
                                JOptionPane.WARNING_MESSAGE);
        }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    autoincrementar();
        
        String a=jTextField1.getText();
        String b=jTextField2.getText();
        String c =jTextField3.getText();
      
        autoincrementar();
        insertar(ide,a, b,c); 
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
       /* char c;
        c=evt.getKeyChar();
        if(!(c<'0'||c>'9'))
        evt.consume();*/
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

  
   
     
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InsertarMedico().setVisible(true);
                
                
            }
        });
        
    }

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
