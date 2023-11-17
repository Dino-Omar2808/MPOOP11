/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ActExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author dinos
 */
public class Proyecto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        try {
            System.out.println("##########FActividad extra########");
            System.out.println("########Escritura en el archivo######");
            FileWriter fw = new FileWriter("alumno.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos=new PrintWriter(bw);
            impresoraDeArchivos.println("Rogrigo, Snachez, Prez, 20, 123456,9.9,copilco 300 Coyoacan");
            impresoraDeArchivos.println("A, Snachez, Prez, 20, 123456,9.9,copilco 300 Coyoacan");
            impresoraDeArchivos.println("B, Snachez, Prez, 20, 123456,9.9,copilco 300 Coyoacan");
            impresoraDeArchivos.println("C, Snachez, Prez, 20, 123456,9.9,copilco 300 Coyoacan");
            impresoraDeArchivos.println("D, Snachez, Prez, 20, 123456,9.9,copilco 300 Coyoacan");
            
            impresoraDeArchivos.close();
            
            System.out.println("########Lectura en el archivo######");
            FileReader fr= new FileReader ("alumno.csv");
            BufferedReader br= new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea= br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea= br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }          
    }
}
