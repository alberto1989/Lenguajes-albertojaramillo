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
public class ValidarTraingulo {
    
    public static void validarCeros(int x, int y, int z)throws CeroException{
        if(x ==0|y==0|z==0)throw new CeroException();
    }
    public static void validarVacios(Integer x, Integer y, Integer z)throws VaciosExceptions{
         if(x ==null|y==null|z==0)throw new VaciosExceptions();
    }
    
}
