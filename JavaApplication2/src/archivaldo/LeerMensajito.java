/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 *
 * @author T-107
 */
public class LeerMensajito {
    public static void main(String[] args) throws Exception {
        /// ahora vamos a leer esta es otra clase
        
      File file=new File("C:\\sucio.xxx");
      
      /// el primer paso es obtener el archivo que se guardo
      /// el segundo paso es establecer la direccion de la informacion
      
        FileInputStream fis=new FileInputStream(file);
        
        //creamos el objeto que leera
        ObjectInputStream ois=new ObjectInputStream(fis);
        /// Ahora si leer el mensaje
        
        String MSN=(String) ois.readObject();
        
        System.out.println(MSN);
        
      
      
      
    }
    
}
