package Controlador;

import Vista.VentanaInicio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JTextField;

public class DuoLink {

 /**
  * @author Johan Stiven Martinez Palau
  *         Alejandro Mendivelso Acosta
  *         Jessica Natalia Leaño Triviño
  *         Jhon Fredi Avila
  */
 
 // It starts by reading the .txt file   
 public static ArrayList listadoIngles = new ArrayList();
 public static ArrayList listadoSignificado = new ArrayList();
 public static void leerArchivo(String Archivo) throws FileNotFoundException, IOException {
  String cadena;
  FileReader file = new FileReader(Archivo);
  BufferedReader BRead = new BufferedReader(file);
  while ((cadena = BRead.readLine()) != null) {
      //    Split is given to separate the txt file into its different parts
   String[] Ingles = cadena.split(";");
   for (int i = 0; i < Ingles.length; i++) {
       if(i % 2 == 0){
           /*   If the list is even in the previously saved BufferedReader, 
           *    place it in a new ArrayList called: "Listado Ingles"
           */
           listadoIngles.add(Ingles[i]);
       } else {
           //   If the BufferedReader is not even, it is added in an ArrayList called: "ListadoSignificado"
           listadoSignificado.add(Ingles[i]);
       }
    

   }
  }
  System.out.println(listadoIngles);
     System.out.println(listadoSignificado);
 }
 
 public static void escribirArchivo(String Archivo, ArrayList listadoIngles, ArrayList listadoSignificado) throws FileNotFoundException, IOException{
     String cadena;
     FileReader file = new FileReader(Archivo);
     BufferedReader Bread = new BufferedReader(file);
     FileWriter escribir = new FileWriter(Archivo);
     BufferedWriter bw = new BufferedWriter(escribir);
     for (int i = 0; i < listadoIngles.size(); i++) {
        escribir.write(listadoIngles.get(i)+";"+listadoSignificado.get(i)+"\r\n");
     }
     escribir.close();
 }

 public static void main(String[] args) throws IOException {
  VentanaInicio vi = new VentanaInicio();
  vi.setVisible(true);
  vi.setTitle("DuoLink");
  vi.setResizable(false);
  String Archivo;

  try {
      // In this space, the "File" String places the location of the txt on your computer.
   Archivo = "C:\\Users\\User\\Desktop\\Universidad\\Quinto Semestre\\Estructura de Datos\\Frases.txt";
   leerArchivo(Archivo);
  } catch (FileNotFoundException e) {
   System.out.println("No se encuentra el archivo. Revisa el String Archivo para la ubicacion del txt.");
  }
 }

}
