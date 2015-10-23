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
public class Direccion implements Serializable {
    private String calle;
    private String cp;
    private String colonia;
    private String municipio;

   public Direccion(String calle, String colonia,String cp, String municipio) {
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
        this.municipio = municipio;
    }

    Direccion() {
        
    }

   

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
