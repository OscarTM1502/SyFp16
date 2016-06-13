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
public class C1 extends AClase implements Iclase {

    
    public C1(String Descripcion) {
        super(Descripcion);
    }
    
    public void Print ()
     {
         System.out.println(Descripcion);
     }
   
}
