/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoCeneval;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class EjercicioTipoCeneval {
    public static int indice=30;
    /*Desarrollar el siguiente programa:
    Crear una ventana Jframe con un lable que al ejecutarse aparezca en el lable un contador que inicie desde 30 y que 
    que haga un conteo en retroceso . Al llegar al numero 20 , se debe cerrar esa ventana y abrirse automaticamente una
    segunda ventana con otro jLable que contenga un contador desde 19 hacia atras . Al llegar al 10 debe cerrarse dicha 
    ventana y debe aparecer una tercera jframe igual con las anteriores y en el lable debe continuar el conteo hasta llegar a cero y alli
    debe quedarse dicha ventana con el contador en cero el decremento en todo el ejercicio es de 1 en 1
 
    */
    
    public static void main(String[] args) {
          Thread t1=new Thread(new Runnable() {
            

            @Override
            public void run() {
                Contador1 c1=new Contador1();
                Contador2 c2=new Contador2();
                Contador3 c3=new Contador3();
                    
        
                        while(true){
                 
                            if(indice>=20){
                                
                               c1.setVisible(true);
                               Contador1.Etiqueta1.setText(""+indice);
                               
                               
                            } if(indice<20&&indice>=10){
                            
                            c2.setVisible(true);
                            
                            c1.setVisible(false);
                            Contador2.Contador2.setText(""+indice);
                            
                            
                            
                               } if(indice<10&&indice>=0){
                               
                               c3.setVisible(true);
                               c2.setVisible(false);
                                Contador3.Contador3.setText(""+indice);
                               
                                                 }
             
                 
                                
                               
                           
                    try {
                        Thread.sleep(1000);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Contador1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    indice--;
                  
                }
    }
});
          t1.start();
                  }
}