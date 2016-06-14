/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER2;

/**
 *
 * @author Oscar Torres
 */
public abstract class Archivos implements IArchivos {
    
   public String nombreArchivo;
   public boolean lectura;
   public boolean escritura;

    public Archivos(String nombreArchivo, boolean lectura, boolean escritura) {
        this.nombreArchivo = nombreArchivo;
        this.lectura = lectura;
        this.escritura = escritura;
    }
   

    
    
    
    public void abrirArchivos(String nombreArchivo,boolean lectura,boolean escritura){
        
       
    
}
    public  void cerrarArchivos(){
        
    }
    public  void desplegarArchivos(){
        System.out.println("No Se Puede Abrir");
    
}
}
