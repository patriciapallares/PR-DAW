package tema11_3ev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B_ej3_11 {

    public static void main(String[] args) {

        try {
            File usa_personas = new File("/Users/patriciapallares/Downloads/Documentos/usa_personas.txt");
            
            Scanner reader = new Scanner(System.in);

            String lectura = "", escritura = "";
            // programa que 

            // pide nombre del archivo por teclado
            // A para lectura y B para escritura
            // Lee el contenido de A y lo escribe ordenado alfabéticamente en B
            System.out.println("Introduce el nombre del archivo para lectura: ");
            lectura = reader.nextLine();

            System.out.println("Introduce el nombre del archivo para escritura: ");
            escritura = reader.nextLine();
            String rutaPadre = "/Users/patriciapallares/Downloads/Documentos/";
            String rutaDestino = rutaPadre.concat(escritura).concat(".txt");

            System.out.println("Ruta Destino = " + rutaDestino);

            File usa_personas_sorted = new File(rutaDestino);
            

            FileWriter fw = new FileWriter(usa_personas_sorted);
            
            int valor = 1;
            for (int i = 1; i <= 20; i++) {
                fw.write("" + valor); // escribimos valor
                fw.write(" "); // escribimos espacio en blanco 
                valor = valor * 2; // calculamos próximo valor
            }
            fw.write("\n"); // escribimos nueva línea 
            fw.close(); // cerramos el FileWriter 
            System.out.println("Fichero escrito correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
             
        }
    }
