/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExaFinal;

/**
 *
 * @author Oscar Torres
 */
public abstract class Farmacia {
     protected String tipo;
     protected String nombre;

    public Farmacia() {
    }

    public Farmacia(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public void descripcion(){
         System.out.println(getTipo() + getNombre());
   
}
}
