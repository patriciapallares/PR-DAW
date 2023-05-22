package Archivos;

import ADO.*;
import MisListas.*;
import java.io.*;
import java.util.Scanner;

public class Ficheros {

    public static boolean guardarArticulos(ListaArticulos listaA) {
        /*
        Otra manera de trabajar con ficheros es con FileOutputStream y ObjectOutStream, de esta manera podremos trabajar con ficheros binarios y almacenar objetos.
        Solo tendríais que descomentar lo comentado, y comnetar las líneas con FileWriter, Scanner, etc
        */
        //FileOutputStream fs;
        //ObjectOutputStream oos;
        Articulo a;
        boolean guardado = false;
        //escritura del fichero
        try {
            //fs = new FileOutputStream("./src/Archivos/Articulos.txt");
            //oos = new ObjectOutputStream(fss);
            File fss = new File ("./src/Archivos/Articulos.txt");
            FileWriter writer = new FileWriter(fss);
            for (int i = 0; i < listaA.numArticulos(); i++) {
                a = (Articulo) listaA.getArticulo(i);
                //oos.writeObject(a); //escribe el objeto en el flujo salida
                writer.write(a.getCodArt() + "\n");
                writer.write(a.getNombre() + "\n");
                System.out.println(a.getCodArt());
            }
            System.out.println("Array Almacenado");
            // Cerramos los flujos abiertos una vez utilizados
            //oos.close();
            //fss.close();
            writer.close();
            guardado = true;
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            guardado = false;
        }
        return guardado;
    }

    public static boolean cargarArticulos(ListaArticulos listaA) {
        FileInputStream fe;
        DataInputStream d;
        ObjectInputStream ois;
        File f;
        Articulo v;
        boolean cargado = false;
        // lectura del fichero (de manera análoga a la escritura)
        listaA.vaciarLista();
        try {
            f = null;
            fe = null;
            d = null;
            try {
                f = new File("./src/Archivos/Articulos.txt");
                if (f.exists()) {
                    // Asociamos el FileInputStream con el ObjectInputStream
                    //fe = new FileInputStream(f);
                    //ois = new ObjectInputStream(fe);
                    Scanner reader = new Scanner(f);
                    //while (fe.available() > 0) {
                    while (reader.hasNext()) {
                        //v = (Articulo) ois.readObject();
                        //cargado = listaA.anadirArticulo(v);
                        //System.out.println(v.info());
                        
                        //codart
                        System.out.println(reader.nextLine());
                        //nomArt
                        System.out.println(reader.nextLine());
                        
                    }
                    System.out.println("Array cargado");
                }
            
            } catch (FileNotFoundException fnf) {
                System.err.println("Fichero no encontrado " + fnf);
            } catch (IOException e) {
                System.err.println("Se ha producido una IOException" + e.toString());
            } finally {
                if (d != null) {
                    d.close();
                    fe.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cargado;
    }

}
