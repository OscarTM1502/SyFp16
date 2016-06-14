/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar Torres
 */
public class Insertion implements IOrdenamiento{

    @Override
    public int[] Ordenar(int[] array) {
       int array1[];
        System.out.println("Estoy en la clase Insertion y en el metodo Orednar Arreglo de enteros");
        return array;
    }

    @Override
    public List<Integer> Ordenar(List<Integer> array) {
        List lista = new ArrayList<Integer>(); 
         Integer entero0 = new Integer(5);
         Integer entero1 = new Integer(6);
         Integer entero2 = new Integer(8);
         Integer entero3 = new Integer(1);
         Integer entero4 = new Integer(20);
         lista.add(entero0);
         lista.add(entero1);
         lista.add(entero2);
         lista.add(entero3);
         lista.add(entero4);
         return lista;
    }

   

   
}
