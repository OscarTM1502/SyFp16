/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar Torres
 */
public class Traductor {
    List<String> palabras;
    List<String> traducciones;

    public Traductor() {
        
       palabras = new ArrayList<>();
       traducciones = new ArrayList<>();
    }
    
    
    public String traducir(String input)
    {
       int i = palabras.indexOf(input);
       if( i == -1)
       {
            return input;
       }
       else
       {
           return traducciones.get(i);
       }
       
    }
    
    public void agregar(String input, String output)
    {
        palabras.add(input);
        traducciones.add(output);
        
    }
     public String eliminar(String output)
     {
         return "-1";
     }
     
     public static void main(String[] args) {
      Traductor tradujo = new Traductor();
      tradujo.agregar("reprobar","Fail");
       List<Traductor> lista;
       lista = new ArrayList<>();
    }
}
