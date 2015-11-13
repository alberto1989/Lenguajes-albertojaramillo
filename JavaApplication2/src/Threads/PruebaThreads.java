/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class PruebaThreads  implements Runnable {
    
    public static void main(String[] args) {
        
        //primer forma de crear threads
        PrimerThreads t1=new PrimerThreads();
        /// segundo paso iniciado
  
        
   // segunda froma de crear threads clase polimorfica
        Runnable r2 = new PruebaThreads();
        Thread t2=new Thread(r2);
        
        //TERCE FORMA DE CREAR THREADS ESTA ES LA BUENA USANDO CLASES INTERNAS ANOMINAS
        Thread t3=new Thread(new Runnable(){
            public void run() {
                System.out.println("Threads clase interna anonima ");
                
           }
            
            
        });
        
        t1.start();
        t2.start();
        t3.start();
      
        }


    public void run() {
        System.out.println("segundo thread");
    }
        
        
        
    
    
}
