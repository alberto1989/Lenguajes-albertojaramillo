
package ProyectoFinal;

import java.awt.*;


public class ContenedorGraficadora extends Canvas {
    public static float apertura=0.01f;
    
    //Lo estatico es lo primero que el compilador corre ya que no necesita constructor ni inicializar variables
    

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(),getHeight());
        //eje x
        g.setColor(Color.WHITE);
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        //eje y
        g.setColor(Color.white);
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        
        g.translate(getWidth()/2, getHeight()/2);
        //Vamos a graficar una parábola.
       
       float x0=-100;
       float x1=-99;
       float y0;
       float y1;
       ///ciclo for
       for(int i=0;i<=200;i++){
        y0=apertura*-x0*x0;
        y1=apertura*-x1*x1;
        g.drawLine((int)x0,(int)y0,(int)x1,(int)y1);
        x0++;
        x1++;
       
    }
       
       
       // Vamos a graficar la funcion seno
        
       double xseno0=-100*Math.PI-1;
       double xseno1=-100*Math.PI;
       double yseno0;
       double yseno1;
       
       
       
        g.setColor(Color.white);
        
        for(int i=0;i<=600;i++){
       
        yseno0=100*Math.sin(xseno0*(apertura*5));
        yseno1=100*Math.sin(xseno1*(apertura*5));
        
       
       g.drawLine((int)xseno0,(int)yseno0,(int)xseno1,(int)yseno1);
       
       
        xseno0++;
        xseno1++;
        
        }
        
        
    }
    
    
    
    
    
}
