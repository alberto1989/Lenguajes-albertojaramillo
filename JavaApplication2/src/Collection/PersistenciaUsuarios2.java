/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author T-107
 */
public class PersistenciaUsuarios2 {
      ArrayList<Usuario> usuarios=new ArrayList<Usuario>();  
   
   /// contructor del array
   public PersistenciaUsuarios2(){
       
   usuarios=new ArrayList<Usuario>();
   // se tiene que hacer igual que en persistenciaUsuarios solo que mandando  los valores del formulario ver en 
   // Ventana de Imc como se hace
   
   
   
   }
   
   /// metodo para guardar 
  public void guardar(Usuario u )throws Exception{
  
  /// aqui va lo del packete Archivaldo interfazdeusuario de serializar un archivo tienes que serializar a lugar
      // del string el arreglo de usuarios
      // este metodo es el mas dificil por que primero se debe hacer el de abajo de buscar
      // hay que hacer un if con el metodo de buscar para verificar que no exista
      
      File f=new File("C:\\usuarios1.sql");
      
     if(f.exists())usuarios=buscartodos();
      FileOutputStream fos=new FileOutputStream(f);       
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
  }  
    
  /// metodo para Leer
  
  public ArrayList<Usuario> buscartodos() throws Exception{
  // Aqui va la logica
  // aqui va la parte del packete archivaldo de interfaz de usuario la parte de regresa el mensaje serializado
   File file=new File("C:\\usuarios1.sql");
  FileInputStream fis=new FileInputStream(file);
  ObjectInputStream ois=new ObjectInputStream(fis);
   usuarios= (ArrayList<Usuario>) ois.readObject();
      
      
  return usuarios;
  }
  
  
   public Usuario buscarUno(Usuario u)throws Exception{
      File f=new File("C:\\usuarios1.sql");
        //Aqui va tu otra tarea
        return u;
    }
}
