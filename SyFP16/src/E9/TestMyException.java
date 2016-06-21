/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar Torres
 */
public class TestMyException {
    
    public void test(String s) throws MyException
    {
        if(s == null)
        {
            throw new MyException("No Se Puede");
        }
        else
        {
    
                System.out.println(":D");
        }
    }
    
    public static void main(String[] args) {
        try {
            TestMyException tme = new TestMyException();
            
            tme.test(null);
        } catch (MyException ex) {
            System.out.println(ex.toString());
        }
        
        
    }
    
}
