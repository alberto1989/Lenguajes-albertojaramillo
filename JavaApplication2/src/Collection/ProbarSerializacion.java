/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.io.*;

public class ProbarSerializacion {
    public static void main(String[] args) {
        Direccion d1=new Direccion();
                 d1.setCalle("Isla groelandia");
                 d1.setColonia("Jardines de Morelos");
                 d1.setCp(55070);
                 d1.setMunicipio("Ecateoec");
                 Usuario u=new Usuario();
                 u.setDireccion(d1);
                 u.setLogin("heroe89");
                u.setPassword("losdela10");
           //Ahora fijense bien como usamos la clase Persistencia
            PersistenciaUsuarios2 p2=new PersistenciaUsuarios2();
            try{
              p2.guardar(u);
                 System.out.println("Este usuario se guardo con exito!");
             
             }catch(Exception e){
                  System.out.println(e.getMessage()); 
           }
                 
                
    }
    
}
