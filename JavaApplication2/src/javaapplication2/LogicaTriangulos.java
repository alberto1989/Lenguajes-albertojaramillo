/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LogicaTriangulos {
    int lado1;
    int lado2;
    int lado3;
    
    
    
    public LogicaTriangulos (int p,int a,int c ){
    
    lado1=p;
    lado2=a;
    lado3=c;
    
    
    }
    
    
    public String Calculo(){
       
        
      
         if(lado1==lado2&&lado1==lado3) 
                                { 
        System.out.println("\n El triangulo es equilatero"); 
                                  
                                 } 
        else {  
             if(lado1==lado2||lado1==lado3||lado2==lado3)
                  { 
              System.out.println("\n El triangulo es isosceles"); 
                   } 
             
        else {
                 if(lado1!=lado2&&lado1!=lado2&&lado2!=lado3) 
                    { 
               System.out.println("\n El triangulo es escaleno");     
                     } 
        else 
        {
        System.out.println("\n Error  el 0 es invalido");
        
        }
       
     
        }
    
    
         }
        return null;
         }
}

  
        
        
        


        









    
    
    

