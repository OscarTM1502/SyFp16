/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Oscar Torres
 */
public class Archivos {
    
    public void leer() throws IOException {
        BufferedReader br = null;
        
        try 
        {
            String linea;
            br = new BufferedReader(new FileReader("ejemplo.txt"));  //instancia para leer un archivo
            linea = br.readLine();
            while(linea !=null)
            {
                System.out.println(linea);
                linea = br.readLine();
            }
             
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo No Encontrado");
        } catch (IOException ex)
        {
            System.out.println("No Puedo leer el archivo");
        }finally
        {
            br.close();
        }
        
        
    }
    
    public void escribir() throws IOException
    {
               BufferedWriter bw;
               bw = new BufferedWriter(new FileWriter("ejemplo.txt",true));
               bw.write("van a reprobar");
               bw.close();
              
    }
    
    public static void main(String[] args) throws IOException {
        Archivos ar = new Archivos();
        ar.leer();
        ar.escribir();
    }
}

 