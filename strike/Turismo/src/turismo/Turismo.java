package turismo;
import java.awt.Color;
import portada.inicio;
/**
 *
 * @author Luis
 */
  
        
public class Turismo {

    public static void main(String[] args) {
        inicio ventana1 = new inicio();
        ventana1.setVisible(true);
        ventana1.setLocation(350, 150);
        ventana1.setTitle("SELTHI");
        for(int x=0;x<=100;x++){
            inicio.jProgressBar1.setValue(x);
            inicio.jProgressBar1.repaint();  
        try{
            Thread.sleep(30);
        }
        catch(Exception ex){}
        }
        //Nomina.ventana1.setVisible(false);
        ventana1.setVisible(false);
        Uno ventana2 = new Uno();
        ventana2.setVisible(true);
        ventana2.setLocation(300, 150);
    }
}
