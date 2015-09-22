/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author T-107
 */
public class Imc {
    float peso;
    float altura;
    
    
    public Imc(){
    
    peso=72f;
    altura=1.60f;
    
    
    
    }
    
    
    
    public Imc(float f){
    
    //este codigo no tiene nada que ver con los constructores  
        byte b=127;
        short s=2;
        int i=2;
        long l=2;
        
        // reasignamos 
        
        b=(byte)i;
        
    
    
    }
    
    
    public float calcular(){
    float resultadoImc=peso/(altura*altura);
    return resultadoImc;
    
    
    }
}
