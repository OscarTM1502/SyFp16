/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerTablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Torres
 */
public class AbTabMod  extends AbstractTableModel{
    String matr [][];
    String archivo;
    String linea;
    public AbTabMod(String namArch) throws IOException {
        archivo = namArch;
        matr = new String[101][6];
        leer();
       
        
    }
    
    public void leer() throws FileNotFoundException, IOException{
       String row[];
       int i = 0;
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("employees.csv"));
        linea = br.readLine();
        
        while(linea !=null){
            row = linea.split(",");
            matr[i]=row;
            i=i+1;
            linea = br.readLine();
            
        }
        
           
    }

    @Override
    public int getRowCount() {
        return 101;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return matr[rowIndex][columnIndex];
    }
    
}
