
package arreglos;


public class Arreglos1 {
    public static void main(String[] args) {
        
        //inicializacion Explicita
        int[]x={7,20,3};
    
        //inicializacion Implicita
        int[]y=new int[4];
        
        //Arreglos referenciados
        String mensajes[]={"Hola","como","estas"};
       /// System.out.println(x[2]);
        
        ///ciclo for para interacion de arreglos string
        
            for(int i=0;i<mensajes.length;i++){
                
                System.out.println(mensajes[i]);
        
               }/// termina for
            
            
            
            ////ciclo for mejorado
            for(String valor:mensajes){
            
                System.out.println(valor);
                
                
                // para paralo dentro una busqueda la forma de hacerlo es con un  if
                // de esta forma if(valor.equals("como"))break;
            }
            
            
    }
    
}
