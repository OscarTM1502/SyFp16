/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Oscar Torres
 */
public class TryResources {
    
    public static void main(String[] args)  {
        
        try(BufferedReader br = new BufferedReader(new FileReader("ejemplo.txt")))
        {
            String li = br.readLine();
            System.out.println(li);
        }
        catch(FileNotFoundException ex)
        {
                    
        }
        catch (IOException ex)
        {
            
        }
    }
    
}
