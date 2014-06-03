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
			JMenu menuArchivo = new JMenu("Archivo");
                    
			menuArchivo.setMnemonic('C');
						
			JMenuItem itemAcerca = new JMenuItem("Acerca de...");
			itemAcerca.setMnemonic('A');
			menuArchivo.add(itemAcerca);
			itemAcerca.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
							JOptionPane.showMessageDialog(frmMain.this,
									"Ejemplo Login",
									"Acerca de", JOptionPane.INFORMATION_MESSAGE);
						}
					} 
			);
			JMenuItem itemSalir = new JMenuItem("Salir");
			itemSalir.setMnemonic('S');
			menuArchivo.add(itemSalir);
			itemSalir.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent evento)
						{
							System.exit(0);
						}
					}
			);
			barramenu.add(menuArchivo);  
			setJMenuBar(barramenu);
			setSize(1022, 700);
			setLocationRelativeTo(this.getParent());
			setVisible(mostrar);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
}
