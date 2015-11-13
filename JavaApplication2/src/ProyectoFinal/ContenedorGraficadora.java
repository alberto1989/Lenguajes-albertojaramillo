
package ProyectoFinal;

import java.awt.*;


public class ContenedorGraficadora extends Canvas {

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(),getHeight());
        g.setColor(Color.WHITE);
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g.setColor(Color.white);
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        
    }
    
    
    
    
    
}
