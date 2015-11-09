/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenBimestral;


import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author becario
 */
public class PersistenciaNomina {
    
      ArrayList<Nomina> nominas=new ArrayList<Nomina>();  
   
   /// contructor del array
  public PersistenciaNomina(){
       
  nominas=new ArrayList<Nomina>();
   // se tiene que hacer igual que en persistenciaUsuarios solo que mandando  los valores del formulario ver en 
   // Ventana de Imc como se hace
   
   
   
   }
   
   /// metodo para guardar 
  public void guardar(Nomina n )throws Exception{
  
        
      File f=new File("C:\\nomina.sql");
      
     if(f.exists())nominas=buscartodos();
      FileOutputStream fos=new FileOutputStream(f);       
        ObjectOutputStream oos=new ObjectOutputStream(fos);
       nominas.add(n);
        oos.writeObject(nominas);
  }  
    
  /// metodo para Leer
  
  public ArrayList<Nomina> buscartodos() throws Exception{
  // Aqui va la logica
  
   File file=new File("C:\\nomina.sql");
  FileInputStream fis=new FileInputStream(file);
  ObjectInputStream ois=new ObjectInputStream(fis);
   nominas= (ArrayList<Nomina>) ois.readObject();
      
      
  return nominas;
  }
  
  
   public Nomina buscarUno(int id)throws Exception{
      Nomina n=new Nomina();
      nominas=buscartodos();
      n=nominas.get(id);
      return n;
      
      
    }
   
   
   
   
   
}

    

