////// creando constructores
package javaapplication2;

////////// en esta parte se declaran las variables a ocupar dentro del contructor
public class Imc {
    float peso;
    float altura;
    
    /////// Se crea el otro constructor con el que se  van a pasar las variables que
    /////// el usuario ingresa en la ventana grafica y se le asignan a las variables 
    ///////que van a realizar la operacion del calculo.
    
    public Imc(float p,float a ){
    
    peso=p;
    altura=a;
    
    }
    
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
    
  /// Este metodo se ocupa para realizar el calculo del Imc en esta parte  
    public float calcular(){
    float resultadoImc=peso/(altura*altura);
    return resultadoImc;
    
    if(resultadoImc<20){
    
    
    }
   
    else {
        if(resultadoImc>=20&&resultadoImc<25) {
        
    }
        else {
            
            if(resultadoImc>=25&&resultadoImc<30){
    
     }
            else {
                if(resultadoImc>30){
     
     
     }
    
            
                }
}
