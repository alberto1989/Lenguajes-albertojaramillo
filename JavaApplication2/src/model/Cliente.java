
package model;


public class Cliente {
    private String nombre;
    private String email;
    private Direccion direccion;

    public Cliente() {
    }
    /**
     * 
     * @param nombre
     * @param email
     * @param direccion 
     */

    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
  
    
    
    
}
