/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author T-107
 */
public class ProbarCollection {
     public static void main(String[] args) {
        PersistenciaUsuarios p=new PersistenciaUsuarios();
         System.out.println(p.obtenerUsuario().size());
         
         for(Usuario u: p.obtenerUsuario()){
             
             System.out.println("El login es :"+u.getLogin());
             
         }
         //// intentar que te imprima todos los arreglos con un ciclo for mejorado
         
    }
    
}
