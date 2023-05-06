package tema11_3ev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */
public class B_ej2_11 {
    // Notas de alumnos

    public static void main(String[] args) throws FileNotFoundException {

        File alumnos = new File("/Users/patriciapallares/Downloads/Documentos/alumnos_notas.txt");
        int acumAlumnos = 0;
        Scanner lector = new Scanner(alumnos);

        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

        Alumno A;

        while (lector.hasNextLine()) {

            String alumno = lector.nextLine();

            String[] words = alumno.split(" ");


            float notaMedia = 0;
            float notaAcum = 0;
            int notas[] = new int[words.length - 2];
            for (int i = 2; i < words.length; i++) {
                notas[i - 2] = Integer.parseInt(words[i]);
                notaAcum = notaAcum + Integer.parseInt(words[i]);

            }
            notaMedia = (notaAcum) / (words.length - 2);


            A = new Alumno(words[0], words[1], (words.length - 2), notas, notaMedia);
            listaAlumnos.add(A);
            A.mostrar();
            acumAlumnos++;
        }

    }
}
