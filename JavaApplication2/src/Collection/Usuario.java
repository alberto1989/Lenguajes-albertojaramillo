/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.io.Serializable;

/**
 *
 * @author T-107
 */
public class Usuario implements Serializable {
    private String nombre;

    public Usuario(String nombre, String password, Collection.Direccion direccion ) {
        this.nombre = nombre;
        this.password = password;
        this.direccion = direccion;
    }

    Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Usuario(String text, String text0, Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", password=" + password + ", direccion=" + direccion + '}';
    }
    private String login;
    private String password;
    private Direccion direccion;

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
