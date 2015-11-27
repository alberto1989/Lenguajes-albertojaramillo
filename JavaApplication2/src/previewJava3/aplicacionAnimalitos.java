/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package previewJava3;

/**
 *
 * @author T-107
 */
public class aplicacionAnimalitos {
    public static void main(String[] args) {
       ComportamientoRuido c=new perro();
        System.out.println(botonSonido(c)); 
        // Aqui el niño seleccionara de un listado animalito
    }
    public static String botonSonido(ComportamientoRuido c){
      
        
        
        return c.hacerRuido();
           
    }
    
}
