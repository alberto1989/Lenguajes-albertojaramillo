/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenBimestral;

import java.io.Serializable;

/**
 *
 * @author becario
 */
public class Empleado  implements Serializable{
    
    private String nombre;
    private String apaterno;
    private int segurosocial;
    private float sueldobase;
    private int horas_extras;

    public Empleado(String nombre, String apaterno, int segurosocial, float sueldobase, int horas_extras) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.segurosocial = segurosocial;
        this.sueldobase = sueldobase;
        this.horas_extras = horas_extras;
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public int getSegurosocial() {
        return segurosocial;
    }

    public void setSegurosocial(int segurosocial) {
        this.segurosocial = segurosocial;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }
    
    
}
