/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Oscar Torres
 */
public class Convertidor {
   Map<String,Double>mapa;
   
   public Convertidor() {
        mapa = new HashMap <>();
        mapa.put("Centimetros", 0.01);
        mapa.put("Metros", 1.00);
        mapa.put("Kilometros",1000.00);
        mapa.put("Pulgadas",0.0254);
        mapa.put("Pies",0.305);
        mapa.put("Yardas",0.914);
        mapa.put("Millas", 1613.00);
        
           
   } 
        
    
    public double  convertir(String s1,double nd,String s2)
    {
        if(mapa.containsKey(s1))
        {
            double cm = mapa.get(s1);
            cm = cm * nd;
            double med = mapa.get(s2);
            return cm/med;
        }
        return 0.0;
    }
    
    public static void main(String[] args) {
        Convertidor convertido = new Convertidor();
        double resconver = convertido.convertir("Centimetros", 30, "Pies");
        System.out.println(resconver);
        
    }
    
    
}
