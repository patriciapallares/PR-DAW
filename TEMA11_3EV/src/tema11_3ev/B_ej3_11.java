package tema11_3ev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B_ej3_11 {

    public static void main(String[] args) throws IOException {

        try {
            File usa_personas = new File("/home/patgon/Descargas/Documentos/usa_personas.txt");
            // File usa_personas_sorted = new File("/Users/patriciapallares/Downloads/Documentos/usa_personas_sorted.txt");
            Scanner reader = new Scanner(System.in);

            File prueba = new File("/home/patgon/Descargas/Documentos");

            System.out.println(prueba.exists());

            String lectura = "", escritura = "";
            int acum = 0;
            // programa que 

            // pide nombre del archivo por teclado
            // A para lectura y B para escritura
            // Lee el contenido de A y lo escribe ordenado alfabéticamente en B
            System.out.println("Introduce el nombre del archivo para lectura: ");
            lectura = reader.nextLine();

            System.out.println("Introduce el nombre del archivo para escritura: ");
            escritura = reader.nextLine();
            String rutaPadre = "/home/patgon/Descargas/Documentos/";
            String rutaDestino = rutaPadre.concat(escritura).concat(".txt");

            System.out.println("Ruta Destino = " + rutaDestino);

            Scanner lector = new Scanner(usa_personas);
            while (lector.hasNextLine()) {
                lector.nextLine();
                acum++;
            }

            String[] listaOrdenada = new String[acum];

            System.out.println("Líneas " + acum);
            lector.close();

            Scanner lector2 = new Scanner(usa_personas);
            for (int i = 0; i < acum; i++) {
                String linea = lector2.nextLine();
                listaOrdenada[i] = linea;
            }
            lector2.close();

            Arrays.sort(listaOrdenada);

            File f = new File(rutaDestino);
            FileWriter fw = new FileWriter(f);

            for (int i = 0; i < acum; i++) {
                fw.write("" + listaOrdenada[i]); // escribimos valor
                fw.write(" "); // escribimos espacio en blanco 
                fw.write("\n"); // escribimos nueva línea 

            }

            fw.close(); // cerramos el FileWriter 
            System.out.println("Fichero escrito correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
