/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExaFinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar Torres
 */
public class Almacen implements IAlmacen {
   protected List<Farmacia> lista;

    public Almacen() {
        
        Jabones j = new Jabones("Manos");
        Jabones j1 = new Jabones("Cara");
        Jabones j2 = new Jabones("Piel Deli");
        Jabones j3 = new Jabones("Neutro");
        Shampo s1 = new Shampo("Caspa");
        Shampo s2 = new Shampo("Reseco");
        
        
        lista = new ArrayList<Farmacia>();
        
    }
    
   
   
    @Override
    public void Comprar(Farmacia f) {
       lista.add(f);
    }

    @Override
    public void Buscar(String nombre) {
        for(Farmacia f : lista)
        {
            if(f.getNombre().equals(nombre))
            {
                f.descripcion();
            }
        }
        
    }

    @Override
    public void Mostrar() {
        for (Farmacia f : lista){
            f.descripcion();
        }
    }

    @Override
    public void COntar() {
        
        lista.size();
            
        }
            
        

    @Override
    public void Contarxtip(String tipo) {
        int i = 0;
        for(Farmacia f : lista)
        {
            if(f.getTipo().equals(tipo))
            {
                i = i+1;
            }
        }
        
    }
   
}

   
    

