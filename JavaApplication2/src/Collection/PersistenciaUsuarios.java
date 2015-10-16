/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.*;

/**
 *
 * @author T-107
 */
public class PersistenciaUsuarios {
    
    public ArrayList<Usuario> obtenerUsuario(){ 
        
        
    ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
    // Empezamos a llenar el arreglo (ArrayList) generico a la clase usuario
    
    
    
    Direccion d1=new Direccion();
    d1.setCalle("Av. Mexico");
    d1.setColonia("Ejidos Tulpetlac");
    d1.setCp(55130);
    d1.setMunicipio("Ecatepec");
    
    Usuario u1=new Usuario();
    u1.setDireccion(d1);
    u1.setLogin("alberto");
    u1.setPassword("algo");
   usuarios.add(u1);
    
   
    Direccion d2=new Direccion();
    d2.setCalle("Isla Groelandia");
    d2.setColonia("Jardines de Morelos");
    d2.setCp(55070);
    d2.setMunicipio("Ecatepec");
    
    Usuario u2=new Usuario();
    u2.setDireccion(d2);
    u2.setLogin("Fernanda");
    u2.setPassword("123456");
     usuarios.add(u2);
    
     
    Direccion d3=new Direccion();
    d3.setCalle("Sur 44");
    d3.setColonia("Vicente Villada");
    d3.setCp(55090);
    d3.setMunicipio("Nezahualcoyotl");
    
    Usuario u3=new Usuario();
    u3.setDireccion(d3);
    u3.setLogin("Victor");
    u3.setPassword("123456");
   usuarios.add(u3);
    
  
   
   
   return usuarios;
    }
    
}
