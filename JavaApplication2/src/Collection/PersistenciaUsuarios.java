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
    
   return usuarios;
    }
    
}
