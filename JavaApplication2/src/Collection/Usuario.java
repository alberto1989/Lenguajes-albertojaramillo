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
      private String login;
    private String password;
    private Direccion direccion;

 
    public Usuario(String login, String password, Collection.Direccion direccion ) {
        this.login = login;
        this.password = password;
        this.direccion = direccion;
    }

    Usuario() {

    }

    Usuario(String text, String text0, Usuario u) {

    }

    

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", password=" + password + ", direccion=" + direccion + '}';
    }
  
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
