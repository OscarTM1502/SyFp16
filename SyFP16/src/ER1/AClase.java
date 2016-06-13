/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER1;

/**
 *
 * @author Oscar Torres
 */
public abstract class AClase implements Iclase {
    
    String Descripcion;

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public AClase(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    public void Metodos()
    {
        Print();
    }
    
}
