/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER3;

import EjerTablas.AbTabMod;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Torres
 */
public class TabInv extends AbstractTableModel{
      String arrent[];
    String matr [][];
    String archivo;
    String linea;
    String rows[];
    int f;
    int g;
    int p;
    int s;
    

    public TabInv(String namArch) {
        archivo = namArch;
        f = ContarFrame();
        g = ContarGlue();
        p = ContarPuzzle();
        s = ContarStorage();
         matr = new String[3][2];
         matr[0][0] = "1";
         matr[0][1] = "FRAME";
         matr[0][2] =  " " + f;
                 
         matr[1][0] = "2";
         matr[1][1] = "GLUE";
         matr[1][2] = " " + g;
                 
         matr[2][0] = "3";
         matr[2][1] = "PUZZLE";
         matr[2][2] = " " + p;
         
         matr[3][0] = "4";
         matr[3][1] = "STORAGE";
         matr[3][2] = " " + s ;
         
         arrent = new String[3];
         arrent[0] = "ID";
         arrent[1] = "Pruducto";
         arrent[2] = "TOtal del Inventario";
         
    }

    @Override
    public String getColumnName(int column) {
        return arrent[column];
    }
    
    
    public int ContarFrame()
    {
         BufferedReader br = null;
        int i = 0;
        
            try {
                 br = new BufferedReader(new FileReader(archivo));
                linea = br.readLine();
                rows = linea.split(";");
                while(linea !=null){
                  rows = linea.split(";");
                
                 
                            if (rows[4].equals("FRAME") ){
                               i = i +1;
                              
                                    }
                              linea = br.readLine();
                }
                
                
                        } catch (FileNotFoundException ex) {
                Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
    }
    
    
    public int ContarGlue(){
        BufferedReader br = null;
        int i = 0;
        try {
                br = new BufferedReader(new FileReader(archivo));
                linea = br.readLine();
                rows = linea.split(";");
                while(linea !=null){
                  rows = linea.split(";");
                
                 
                            if (rows[4].equals("GLUE") ){
                               i = i +1;
                              
                                    }
                              linea = br.readLine();
                }
                
                
                        } catch (FileNotFoundException ex) {
                Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
        
    }
    
    public int ContarPuzzle(){
        BufferedReader br = null;
        int i = 0;
        try {
               br = new BufferedReader(new FileReader(archivo));
                linea = br.readLine();
                rows = linea.split(";");
                while(linea !=null){
                  rows = linea.split(";");
                
                 
                            if (rows[4].equals("PUZZLE") ){
                               i = i +1;
                              
                                    }
                              linea = br.readLine();
                }
                
                
                        } catch (FileNotFoundException ex) {
                Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
    }
    
    public int ContarStorage(){
        BufferedReader br = null;
        int i = 0;
        
        try {
                br = new BufferedReader(new FileReader(archivo));
                linea = br.readLine();
                rows = linea.split(";");
                while(linea !=null){
                  rows = linea.split(";");
                
                 
                            if (rows[4].equals("STORAGE") ){
                               i = i +1;
                              
                                    }
                              linea = br.readLine();
                 }
                
                
                        } catch (FileNotFoundException ex) {
                Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(AbTabMod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
    }

    @Override
    public int getRowCount() {
       return 3;
    }

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      return matr[3][2];
    }
}
