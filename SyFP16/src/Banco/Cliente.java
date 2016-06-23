/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Oscar Torres
 */
public class Cliente {
    
   private String nombre;
   private int edad;
   private int numcuenta;
   private int idcliente;

    public Cliente(String nombre, int edad, int numcuenta, int idcliente) {
        this.nombre = nombre;
        this.edad = edad;
        this.numcuenta = numcuenta;
        this.idcliente = idcliente;
    }
   

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public int getIdcliente() {
        return idcliente;
    }
   
   
}
