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
import java.util.StringTokenizer;
/**
 *
 * @author dinos
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        try {
            System.out.println("##########FActividad extra########");
            System.out.println("########Escritura en el archivo######");
            FileWriter fw = new FileWriter("estudiantes.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos=new PrintWriter(bw);
            impresoraDeArchivos.println("Rogrigo, Snachez, Prez, 317546785,20");
            impresoraDeArchivos.println("Eleuterio, Suarez, Storm, 417776789,21");
            impresoraDeArchivos.println("Patricia, Lopez, Grey, 318886780,22");
            impresoraDeArchivos.println("Abraxas, Garcia, Minaj, 319346781,20");
            impresoraDeArchivos.println("Alice, Torres, Jener, 318346787,20");
            impresoraDeArchivos.println("Cheems, Salinas, Kardashian, 318946784,21");
            impresoraDeArchivos.println("Focalors, Trump, Aguilar, 318246783,21");
            impresoraDeArchivos.println("Lunox, Del Rio, Leon, 317146788,20");
            impresoraDeArchivos.println("Odette, Ikari, Puttin, 318546781,22");
            impresoraDeArchivos.println("Barbie, Maximoff, Lawrence, 319846782,20");
            
            
            impresoraDeArchivos.close();
            
            System.out.println("########Lectura en el archivo######");
            FileReader fr= new FileReader ("estudiantes.csv");
            BufferedReader br= new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea= br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea= br.readLine();
            }
            
            System.out.println("##########StringTokenaizer########");
            String estudiante =br.readLine();
                FileReader fxr= new FileReader ("estudiantes.csv"); 
                BufferedReader bxr= new BufferedReader(fxr);
                System.out.println("Cadena a tokenizar" + estudiante);
                String xlinea= bxr.readLine();
                StringTokenizer tokenizador = new StringTokenizer(estudiante,",");
                while(xlinea!=null){
                    while(tokenizador.hasMoreTokens()){
                        System.out.println(tokenizador.nextToken());
                    }
                    xlinea= bxr.readLine();   
            }
            
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }          
    }
}
    
    

