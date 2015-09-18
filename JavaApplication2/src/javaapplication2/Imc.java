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
    public float calcular(){
    float resultadoImc=peso/(altura*altura);
    return resultadoImc;
    
    
    }
}
