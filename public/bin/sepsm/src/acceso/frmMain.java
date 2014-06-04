/* *

* */

package acceso;
/*LIBRERIAS NECESARIAS*/



//**************************//
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import modulos.NvDiagnostico;
import modulos.NvMedico;
import modulos.NvPaciente;


public class frmMain extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar barramenu;
	public frmMain()
	{
		super("SEPSM 1.0");
                
                /*MANDAR LLAMAR LA IMAGEN */
                ImageIcon imagen = new ImageIcon("img/medico.png");
                JLabel etiqueta = new JLabel(imagen);
		//AGREGAMOS LA ETIQUETA QUE CONTIENE LA IMAGEN AL FRAME
		getContentPane().add(etiqueta);
		
		//ESTABLECEMOS EL TAMAÑO DEL FRAME
		this.setSize(500, 400);
               
                
                
	}
	
       
 

        

        
	public void mostrarForm(boolean mostrar){
		if (mostrar == true){
			barramenu = new JMenuBar(); 
			JMenu archivo = new JMenu("Archivo");
                        JMenu paciente = new JMenu("Pacientes");
                       JMenu medico = new JMenu("Médico");
                        JMenu diagnostico = new JMenu("Diagnóticos");
                       JMenu ayuda = new JMenu("Ayuda");
                        
                       
			archivo.setMnemonic('C');
                        paciente.setMnemonic('P');
                        medico.setMnemonic('É');
                        diagnostico.setMnemonic('I');
                        ayuda.setMnemonic('U');
			
                        /*SALIR PERTENECE A OPCION DE MENU ARCHIVO*/
			JMenuItem itemSalir = new JMenuItem("Salir");
			itemSalir.setMnemonic('S');
                        /*Se agrega el item SALIR a ARCHIVO*/
			archivo.add(itemSalir);
                  
			itemSalir.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent evento)
						{
							System.exit(0);
						}
					}
			);
                        
                        /*Nuevo Paciente.. PERTENECE A OPCION DE MENU Pacientes*/		
			JMenuItem itemNvPaciente = new JMenuItem("Nuevo");
			itemNvPaciente.setMnemonic('N');
                        /*Se agrega el item NUEVO a PACIENTE*/
			paciente.add(itemNvPaciente);
			
                        itemNvPaciente.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
                                                 NvPaciente paciente=new NvPaciente();
                                                 paciente.setVisible(true);
                                                        
                                                }
					} 
			);
                        /*Lista Paciente.. PERTENECE A OPCION DE MENU Paciente*/		
			JMenuItem itemLstPaciente = new JMenuItem("Lista");
			itemLstPaciente.setMnemonic('L');
                        /*Se agrega el item LISTA a PACIENTE*/
			paciente.add(itemLstPaciente);
			
                        itemLstPaciente.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
						/*
                                                    AGREGAR FUNCION PARA LISTA DE PACIENTES
                                                    */	
                                                }
					} 
			);
                        
                        /*Nuevo MEDICO.. PERTENECE A OPCION DE MENU MEDICO*/		
			JMenuItem itemNvMedico = new JMenuItem("Nuevo");
			itemNvMedico.setMnemonic('N');
                        /*Se agrega el item NUEVO a MEDICO*/
			medico.add(itemNvMedico);
			
                        itemNvMedico.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
						 NvMedico medico =new NvMedico();
                                                 medico.setVisible(true);
                                                }
					} 
			);
                        /*Lista MEDICO.. PERTENECE A OPCION DE MENU MEDICO*/		
			JMenuItem itemLstMedico = new JMenuItem("Lista");
			itemLstMedico.setMnemonic('L');
                        /*Se agrega el item LISTA a MEDICO*/
			medico.add(itemLstMedico);
			
                        itemLstMedico.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
						/*
                                                    AGREGAR FUNCION PARA LISTA DE MEDICO
                                                    */	
                                                }
					} 
			);
                        
                        /*Nuevo DIAGNOSTICO.. PERTENECE A OPCION DE MENU DIAGNOSTICO*/		
			JMenuItem itemNvDiagnostico = new JMenuItem("Nuevo");
			itemNvDiagnostico.setMnemonic('N');
                        /*Se agrega el item NUEVO a DIAGNOSTICO*/
			diagnostico.add(itemNvDiagnostico);
			
                        itemNvDiagnostico.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
						 NvDiagnostico diagnostico = new NvDiagnostico();
                                                
                                                }
					} 
			);
                        /*Lista DIAGNOSTICO.. PERTENECE A OPCION DE MENU DIAGNOSTICO*/		
			JMenuItem itemLstDiagnostico = new JMenuItem("Lista");
			itemLstDiagnostico.setMnemonic('L');
                        /*Se agrega el item LISTA a DIAGNOSTICO*/
			diagnostico.add(itemLstDiagnostico);
			
                        itemLstDiagnostico.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
						/*
                                                    AGREGAR FUNCION PARA LISTA DE DIAGNOSTICO
                                                    */	
                                                }
					} 
			);
                        
                       /*Ayuda.. PERTENECE A OPCION DE MENU AYUDA*/		
			JMenuItem imemAyuda = new JMenuItem("Ayuda");
			imemAyuda.setMnemonic('U');
                        /*Se agrega el item ayuda a ayuda*/
			ayuda.add(imemAyuda);
			
                        imemAyuda.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent evento)
						{
							/*
                                                    AGREGAR FUNCION PARA ayuda
                                                    */	
						}
					} 
			);
                        
                        
                        /*ACERCA DE.. PERTENECE A OPCION DE MENU AYUDA*/		
			JMenuItem itemAcerca = new JMenuItem("Acerca de...");
			itemAcerca.setMnemonic('A');
                        /*Se agrega el item acerca de a ayuda*/
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
                        
                        
                        
                        
                        
                        
                        
			barramenu.add(archivo);  
                        barramenu.add(paciente);
                        barramenu.add(medico);
                        barramenu.add(diagnostico);
                        barramenu.add(ayuda);
                        setJMenuBar(barramenu);
			setSize(500, 400);
                       setResizable(false);
                  getContentPane().setBackground(new Color (52,152,221));
			setLocationRelativeTo(this.getParent());
			setVisible(mostrar);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
                
                
	}
        
        
        
}

