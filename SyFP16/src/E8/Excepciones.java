/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

/**
 *
 * @author Oscar Torres
 */
public class Excepciones {

    public static void main(String[] args)
    {
        int []arr={1,2,3,4};
        for (int i = 0; i < 15; i++) 
        {
            try
            {
                System.out.println(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException e)  // aqui se pone que excepcion 
            {       
                System.out.println("Esta fuera de los limites");
                System.out.println(e.toString());
            }
        }
            
    }
    
    
}
