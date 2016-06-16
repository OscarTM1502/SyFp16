/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Oscar Torres
 */
public class NoCircula implements INoCircula{
    String placa;
    String dia;
    String color;
    Map<String,String>lista;
    Map<String,String>lista2;
     Map<String,String>lista3;
    

    public NoCircula() {
        
        lista = new HashMap<>();
        lista.put("amarillo","lunes");
        lista.put("rosa","martes");
        lista.put("rojo","miercoles");
        lista.put("verde","jueves");
        lista.put("azul","viernes");
        lista2 = new HashMap<>();
        lista2.put("5","amarillo");
        lista2.put("6","amarillo");
        lista2.put("7","rosa");
        lista2.put("8","rosa");
        lista2.put("3","rojo");
        lista2.put("4","rojo");
        lista2.put("1","verde");
        lista2.put("2","verde");
        lista2.put("9","azul");
        lista2.put("0","azul");
         lista3 = new HashMap<>();
        lista3.put("5","lunes");
        lista3.put("6","lunes");
        lista3.put("7","martes");
        lista3.put("8","martes");
        lista3.put("3","miercoles");
        lista3.put("4","miercoles");
        lista3.put("1","jueves");
        lista3.put("2","jueves");
        lista3.put("9","viernes");
        lista3.put("0","viernes");
        
        
        
        
    }
    
    

    @Override
    public void getHoyNoCircula() {
        System.out.println("Hoy no circula los vehiculos con engomado color"+color+"y terminacion"+placa);
    }

    @Override
    public String getByPlaca(String dp ) {
        String di = lista3.get(dp);
        return di;
       
       
      
       
    }

    @Override
    public String getTerminacion(String t) {
       String r = lista2.get(t);
       return r;
       
        
    }

    @Override
    public String getColor(String col) {
        String day = lista.get(col);
        return day;
        
    }
    
    
    
}
