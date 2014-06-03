/* *

* */

package sepsm;

import java.awt.event.*;
import javax.swing.*;


public class frmMain extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar barramenu;
	public frmMain()
	{
		super("SEPSM 1.0");
	}
	
	public void mostrarForm(boolean mostrar){
		if (mostrar == true){
			barramenu = new JMenuBar(); 
			JMenu archivo = new JMenu("Archivo");
                        JMenu pacientes = new JMenu("Pacientes");
                       JMenu medico = new JMenu("Médico");
                        JMenu diagnostico = new JMenu("Diagnóticos");
                       JMenu ayuda = new JMenu("Ayuda");
                        
                       
			archivo.setMnemonic('C');
                        pacientes.setMnemonic('P');
                        medico.setMnemonic('É');
                        diagnostico.setMnemonic('I');
                        ayuda.setMnemonic('U');
						
			JMenuItem itemAcerca = new JMenuItem("Acerca de...");
			itemAcerca.setMnemonic('A');
			ayuda.add(itemAcerca);
			itemAcerca.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
							JOptionPane.showMessageDialog(frmMain.this,
									"Sistema Experto para Pre diagnóstico del Síndrome Metabólico \n\n Colaboradores: \n * David Zahid Jiménez Grez \n www.zahid.mx \n * Adalberto Vargas Moreno \n www.adalbertovargas.com",
									"Acerca de", JOptionPane.INFORMATION_MESSAGE);
						}
					} 
			);
			JMenuItem itemSalir = new JMenuItem("Salir");
			itemSalir.setMnemonic('S');
			archivo.add(itemSalir);
                  
			itemSalir.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent evento)
						{
							System.exit(0);
						}
					}
			);
			barramenu.add(archivo);  
			setJMenuBar(barramenu);
                        barramenu.add(pacientes);
                  barramenu.add(medico);
                  barramenu.add(diagnostico);
                  barramenu.add(ayuda);
			setSize(800, 600);
			setLocationRelativeTo(this.getParent());
			setVisible(mostrar);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
}
