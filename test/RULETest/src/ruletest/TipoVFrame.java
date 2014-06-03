/*
 * TipoVFrame.java
 *
 * Created on 25 de marzo de 2008, 08:20 AM
 */
package ruletest;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class TipoVFrame extends javax.swing.JInternalFrame
{

    Principal objP;
    String Numr, Motor;
    String tipoV="";

    /** Creates new form TipoVFrame */
    public TipoVFrame(Principal objP)
    {
        this.objP = objP;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MotorGrup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BAcep = new javax.swing.JButton();
        BCancel = new javax.swing.JButton();
        jRBMotorSi = new javax.swing.JRadioButton();
        jRBMotorNo = new javax.swing.JRadioButton();
        jCBNumR = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Tipo de Vehiculo");

        jLabel1.setText("Numero de Ruedas");

        jLabel2.setText("Motor");

        BAcep.setText("Aceptar");
        BAcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAcepActionPerformed(evt);
            }
        });

        BCancel.setText("Cancelar");
        BCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelActionPerformed(evt);
            }
        });

        MotorGrup.add(jRBMotorSi);
        jRBMotorSi.setText("Si");
        jRBMotorSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMotorSiActionPerformed(evt);
            }
        });

        MotorGrup.add(jRBMotorNo);
        jRBMotorNo.setSelected(true);
        jRBMotorNo.setText("No");
        jRBMotorNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMotorNoActionPerformed(evt);
            }
        });

        jCBNumR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addComponent(jRBMotorSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRBMotorNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BAcep)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(BCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jCBNumR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBNumR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRBMotorSi)
                    .addComponent(jRBMotorNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAcep)
                    .addComponent(BCancel))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jRBMotorSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMotorSiActionPerformed
        // TODO add your handling code here:
        if (jRBMotorSi.isSelected())
        {
            jRBMotorNo.setSelected(false);
            Motor = "yes";
        }
}//GEN-LAST:event_jRBMotorSiActionPerformed

    private void jRBMotorNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMotorNoActionPerformed
        // TODO add your handling code here:
        if (jRBMotorNo.isSelected())
        {
            jRBMotorSi.setSelected(false);
            Motor = "no";
        }
    }//GEN-LAST:event_jRBMotorNoActionPerformed

    private void BCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BCancelActionPerformed

    private void BAcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAcepActionPerformed
        // TODO add your handling code here:
        Numr = String.valueOf(jCBNumR.getSelectedItem());
        tipoV = objP.objBR.getTipoVehiculo(Numr, Motor);
        System.out.println("Resultado ----> " + tipoV);
        if (tipoV==null)
        {
            JOptionPane.showMessageDialog(this, "Verifica las entradas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Resultado ----> " + tipoV);
            objP.lanzaFrame(tipoV);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_BAcepActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAcep;
    private javax.swing.JButton BCancel;
    private javax.swing.ButtonGroup MotorGrup;
    private javax.swing.JComboBox jCBNumR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBMotorNo;
    private javax.swing.JRadioButton jRBMotorSi;
    // End of variables declaration//GEN-END:variables
}