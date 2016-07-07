/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExaFinal;

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
public class Archivo  extends AbstractTableModel{
      private String matr[][];
    private String names[];
    private String nombreArchivo;
    double amex=0.0, cash=0.0, chec=0.0, mast = 0.0,othe = 0.0,visa = 0.0;

    public Archivo( String nombre) {
         names = new String[]{"id", "metodo de pago", "total(suma de cada metodo de pago"};
        nombreArchivo = nombre;
        
        leerArchivo();
        
        matr = new String[6][3];
        matr[0][0] = "1";
        matr[1][0] = "2";
        matr[2][0] = "3";
        matr[3][0] = "4";
        matr[4][0] = "5";
        matr[5][0] = "6";
        
        matr[0][1] = "AMEX";
        matr[1][1] = "CASH";
        matr[2][1] = "CHEC";
        matr[3][1] = "MAST";
        matr[4][1] = "OTHE";
        matr[5][1] = "VISA";
        
        matr[0][2] = " "+amex;
        matr[1][2] = " "+cash;
        matr[2][2] = " "+ chec;
        matr[3][2] = " "+ mast;
        matr[4][2] = " "+ othe;
        matr[5][2] = " "+ visa;
        
        
        
        
        
    }

    @Override
    public String getColumnName(int column) {
       return names[column];
    }
    
    
     public void leerArchivo()
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo)))
        {
            String linea;
            linea = br.readLine();
            while(linea != null)
            {
                String row[];
                row = linea.split(";");
                System.out.println(row[3]);
                if(row[3].equals("\"AMEX\""))
                {
                    Double d = new Double(row[4]);
                    amex = amex + d.doubleValue();
                    
                    
                }
                if(row[3].equals("\"MAST\""))
                {
                    Double d = new Double(row[4]);
                    mast = mast + d.doubleValue();
                }
                if(row[3].equals("\"CHEC\""))
                {
                    Double d = new Double(row[4]);
                    chec = chec + d.doubleValue();
                }
                if(row[3].equals("\"VISA\""))
                {
                    Double d = new Double(row[4]);
                    visa = visa + d.doubleValue();
                }
                 if(row[3].equals("\"CASH\""))
                {
                    Double d = new Double(row[4]);
                    cash = cash + d.doubleValue();
                }
                  if(row[3].equals("\"OTHE\""))
                {
                    Double d = new Double(row[4]);
                    othe= othe + d.doubleValue();
                }
                linea = br.readLine();
            }                       
        } catch (IOException ex) {
            System.out.println("nada");
        }
    

   
    
   
        
        
   

   
    
}

    @Override
    public int getRowCount() {
       return 6;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return matr[rowIndex][columnIndex];
    }
    
}
