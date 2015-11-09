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
public class Departamento implements Serializable {
    
    private String departamentos;

    public Departamento(String departamentos) {
        this.departamentos = departamentos;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }
    
    
}
