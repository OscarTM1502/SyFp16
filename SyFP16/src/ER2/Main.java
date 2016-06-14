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
public class Main {
    public static void main(String[] args) {
        ArchTexto a1 = new ArchTexto("archivotexto",true,false);
        ArchBinario a2 = new ArchBinario("archivobinario1",true,true);
        ArchImagen a3 = new ArchImagen("archivoimagen1",true,true);
        a1.abrirArchivos("archivotexto", true, false);
        a1.cerrarArchivos();
        a1.desplegarArchivos();
        
        a2.abrirArchivos();
        a2.cerrarArchivos();
        a2.desplegarArchivos();
        
        a3.abrirArchivos();
        a3.cerrarArchivos();
        a3.desplegarArchivos();
        
        
    }
    
}
