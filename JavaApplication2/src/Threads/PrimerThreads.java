/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class PrimerThreads extends Thread {
    
    public void run(){
        try {
            //tercer paso ejecutado
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrimerThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("primer threads");
    }
    
    
}
