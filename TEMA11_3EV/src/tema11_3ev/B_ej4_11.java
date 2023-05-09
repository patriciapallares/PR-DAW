package tema11_3ev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class B_ej4_11 {

    public static void main(String[] args) throws FileNotFoundException {

        try {

            File nombres = new File("/home/patgon/Descargas/Documentos/usa_nombres.txt");

            File apellidos = new File("/home/patgon/Descargas/Documentos/usa_apellidos.txt");

            File destino = new File("/home/patgon/Descargas/Documentos/usa_personas.txt");

            int num, acumNombres = 0, acumApellidos = 0;
            Scanner reader = new Scanner(System.in);

            // cuántos nombres??
            System.out.println("Generador de nombres y apellidos");
            System.out.println("¿Cuántos nombres de perosna desea generar?");
            num = reader.nextInt();

            String[] listaNombresCreados = new String[num];

            Scanner lectorNombres = new Scanner(nombres);

            while (lectorNombres.hasNextLine()) {
                lectorNombres.nextLine();
                acumNombres++;
            }
            lectorNombres.close();

            String[] listaNombres = new String[acumNombres];

            Scanner lectorNombres2 = new Scanner(nombres);

            for (int i = 0; i < acumNombres; i++) {
                String linea = lectorNombres2.nextLine();
                listaNombres[i] = linea;
            }

            lectorNombres2.close();
            System.out.println("Hay " + acumNombres + " nombres.");

            Scanner lectorApellidos = new Scanner(apellidos);

            while (lectorApellidos.hasNextLine()) {
                lectorApellidos.nextLine();
                acumApellidos++;
            }
            lectorApellidos.close();

            String[] listaApellidos = new String[acumApellidos];

            Scanner lectorApellidos2 = new Scanner(apellidos);

            for (int i = 0; i < acumApellidos; i++) {
                String linea = lectorApellidos2.nextLine();
                listaApellidos[i] = linea;
            }

            lectorApellidos2.close();

            System.out.println("Hay " + acumApellidos + " apellidos.");
            // a qué archivo añadirlos. se le pregunta pero se usa  usa_personas.txt

            // int aleatorio entre 0 y 10


            for (int i = 0; i < num; i++) {
                int aleatNombre = (int) (0 + Math.random() * (acumNombres + 1));
                int aleatApellido = (int) (0 + Math.random() * (acumApellidos + 1));
                listaNombresCreados[i] = listaNombres[aleatNombre].concat(" ").concat(listaApellidos[aleatApellido]);
            }
            
            System.out.println(Arrays.toString(listaNombresCreados));

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
