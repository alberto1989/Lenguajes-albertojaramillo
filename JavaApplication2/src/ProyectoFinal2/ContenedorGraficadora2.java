
package ProyectoFinal2;

import java.awt.*;


public class ContenedorGraficadora2 extends Canvas {
    public static float apertura;

    static float A,B,C;
    static float XV,YV,XC,XC2,YC;
    
    //Lo estatico es lo primero que el compilador corre ya que no necesita constructor ni inicializar variables
    

    @Override
    public  void paint(Graphics g) {    
        //Calculos
      // VARIABLES de los campos de texto
         A= Float.parseFloat( MiGraficadora.textoA.getText());
         B=Float.parseFloat(MiGraficadora.textoB.getText());
         C=Float.parseFloat(MiGraficadora.textoC.getText());
        //CALCULO VERTICE
          XV=(-1*B)/(2*A);
          YV= (float) ((A*Math.pow(XV, 2))+(B*XV)+C);
          //CALCULO CORTE EJE X
          XC=(float) ((-B+(Math.sqrt((Math.pow(B,2)-4*A*C))))/2*A);
          XC2=(float) ((-B-(Math.sqrt((Math.pow(B,2)-4*A*C))))/2*A);
          
          apertura=(XC-XC2)/100;
          // CORTE EJE Y
          YC=C;
      
          
          System.out.println("El vertice es:"+XV+","+YV);
          System.out.println("corte en eje x:"+XC+","+XC2);
          System.out.println("corte en eje y:"+YC);
          System.out.println("la apertura es:"+apertura);
        
          
      
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
        
        g.drawString("Origen",0,0);
        
        
        
        //Vamos a graficar una parábola.
       
      double x0=XC;
      double x1=XC2;
       float y0;
       float y1=YC;
       
       
      
       ///ciclo for
       for(int i=0;i<=200;i++){ 
           
         // CALCULO DE ABERTURA DE LA PARABOLA  
           int AX=i;
           float AY=(float) (A*(Math.pow(AX, 2))+(AX*B)+C);
           
           System.out.println(AX+","+AY);
           
           
        y0=(float) (apertura*-AX*AX);
        y1=(float) (apertura*-AY*AY);
        g.drawLine((int)AX,(int)y0,(int)AY,(int)y1);
       
       
    }
       
       
       
     /*  
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
        
        */
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        System.out.println("Posicion es :("+x+","+y+")");
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
