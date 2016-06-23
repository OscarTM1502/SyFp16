/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Oscar Torres
 */
public class Banco {
    
    protected List<Cliente> listacli;
    protected List<Cuenta> listacue;

    public Banco() {
        
        listacli = new ArrayList<Cliente>();
        listacue = new ArrayList<Cuenta>();
    
}
    
    void agregarCLiente(Cliente c)
    {
        listacli.add(c);
    }
    
    void agregarCuenta(Cuenta cu)
    {
        listacue.add(cu);
    }
    
    void guardarClientes() 
    {
          try( BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.txt",true)))
          {
              for (Cliente cl: listacli) 
              {
                bw.write(cl.getIdcliente()+" "+cl.getNombre()+" "+cl.getEdad()+" "+cl.getNumcuenta()+"\n");
                  
              }
              
          } catch (IOException ex) {
            
        }
          
    }
    
    void guardarCuentas()
    {
         try( BufferedWriter bw = new BufferedWriter(new FileWriter("cuentas.txt",true)))
          {
              for (Cuenta ct: listacue) {
                  bw.write(ct.getIdcliente()+" "+ct.getNumcuenta()+""+ct.getSaldo()+"\n");
                  
              }
          } catch (IOException ex) {
              System.out.println("Disculpe es un error");
            
        }
    }
    
    public static void main(String[] args) {
         Banco bn = new Banco();
         Cliente cli = new Cliente("Oscar",24,1001,1);
          Cliente cli1 = new Cliente("Arturo",22,1002,2);
           Cliente cli2 = new Cliente("Jos",21,1003,3);
            Cliente cli3 = new Cliente("Melisa",19,1004,4);
             Cliente cli4 = new Cliente("H",20,1005,5);
             
            bn.agregarCLiente(cli);
            bn.agregarCLiente(cli1);
            bn.agregarCLiente(cli2);
            bn.agregarCLiente(cli3);
            bn.agregarCLiente(cli4);
            bn.guardarClientes();
            
            Cuenta cu1 = new Cuenta(100.00,1001,1);
            Cuenta cu2 = new Cuenta(200.00,1002,2);
            Cuenta cu3 = new Cuenta(300.00,1003,3);
            Cuenta cu4 = new Cuenta(10.00,1004,4);
            Cuenta cu5 = new Cuenta(200.00,1005,5);
            
            bn.agregarCuenta(cu1);
            bn.agregarCuenta(cu2);
            bn.agregarCuenta(cu3);
            bn.agregarCuenta(cu4);
            bn.agregarCuenta(cu5);
            bn.guardarCuentas();
            
            
        
    }
         
    
    }
