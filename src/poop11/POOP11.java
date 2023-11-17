/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dinos
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("#######FILE###########");
        File archivo= new File("Archivo.txt");
        System.out.println("Archivo existe: "+archivo.exists());
        if(!archivo.exists()){
                boolean seCreo;
            try {
                seCreo = archivo.createNewFile();
                System.out.println("Se creo un archivo: "+seCreo);
                System.out.println("Archivo existe" +archivo.exists());   
            
            } catch (IOException ex) {
                System.out.println("ex.getMessage()");
            }
                
        }
        System.out.println("##########FILE WRITER########");
        try {
               System.out.println("#########Lectura desde Teclado########");
        //BufferedReader: es donde se guardan los datos que entran (
        //InputStreamReader: son los  flujos de caracteres que llegan desde el  teclado 
        //infraestructura
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" Escriba el texto para el archivo");
            String texto = br.readLine();
            System.out.println("El usuario escribio: "+texto);
            
            System.out.println("########Escritura en el archivo######");
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos=new PrintWriter(bw);
            //println= escrive y salto de linea
            //print = escribe sin salto de linea
            impresoraDeArchivos.println(texto);
            impresoraDeArchivos.close();
            
            System.out.println("########Lectura en el archivo######");
            FileReader fr= new FileReader ("archivo.txt");
            br= new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea= br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea= br.readLine();
            }
            br.close();
            
            System.out.println("##########StringTokenaizer########");
            String alumno="Hector Juan,Jimenez,Maya,311934523,20,8.3";
            System.out.println("Cadena a tokenizar" + alumno);
            StringTokenizer tokenizador = new StringTokenizer(alumno,",");
            while(tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
            }
   
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
}
    

