/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author Oscar Torres
 */
public class Cesar {
     
     
     public String cifrar(String m, int c)
     {
         String resultado = "";
         for(int i = 0; i < m.length(); i++)
         {
              if((int)m.charAt(i) == 10)
             {
               resultado = resultado + (m.charAt(i));  
             }
              else
              {
                resultado = resultado + (char)(m.charAt(i) + c);   
              }
           
         }
         return resultado; 
        
     }
     
     public String descifrar(String m, int c)
     {
         String resultado = "";
         for(int i = 0; i < m.length(); i++)
         {
             
                resultado = resultado + (char)(m.charAt(i) + c - (c+c)); 
                  
         }
         
         return resultado;
     }
     public static void main(String[] args) {
        Cesar cc = new Cesar();
         
        String s = cc.cifrar("hola", 2);
        String d = cc.descifrar("jqnc",2);
        
         System.out.println(s);
         System.out.println(d);
   }
}
