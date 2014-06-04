package sistema_de_diagnostico;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panelcito extends JPanel{
    String imagen="";    
    public Panelcito(String NombreImagen) {
        imagen=NombreImagen;      
    }
    

@Override
    public void paint(Graphics g) {

        Dimension d = this.getSize();
        g.drawImage(new ImageIcon(getClass().getResource("/imagenes/"+imagen)).getImage(), 0, 0,d.width,d.height, null);
        setOpaque(false);
        super.paint(g);
}
}
