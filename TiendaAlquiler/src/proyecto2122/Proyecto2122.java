package proyecto2122;

import ADO.*;
import java.util.Scanner;

public class Proyecto2122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner reader = new Scanner(System.in);
        Articulo art;
        int opc, opc2 = 0, opc3, carga, anyo, resolucion;
        String borrar;

        String cod, nombre, fecha, resumen, autor, deter;
        boolean deteriorado;
        do {
            System.out.println("");
            System.out.println("---------------------------------Menú------------------------------------");
            System.out.println("");
            System.out.println("1. Añadir un artículo.");
            System.out.println("2. Obtener precio alquiler.");
            System.out.println("3. Mostrar todos los precios.");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Opción seleccionada: ");
            opc = reader.nextInt();
            borrar = reader.nextLine();
            if (opc < 1 || opc > 4) {
                System.out.println("¡Selecciona una opción válida!");
            }
        } while (opc < 1 || opc > 4);

        switch (opc) {
            case 1:

                // (String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado)
                System.out.println("Introduce el nombre del artículo:");
                nombre = reader.nextLine();

                System.out.println("Introduce la fecha de alta:");
                fecha = reader.nextLine();

                System.out.println("Introduce el año de creación:");
                anyo = reader.nextInt();
                borrar = reader.nextLine();

                System.out.println("Introduce un resumen del artículo:");
                resumen = reader.nextLine();

                System.out.println("Introduce el autor:");
                autor = reader.nextLine();

                do {
                    System.out.println("¿Está deteriorado? Introduce S / N");
                    deter = reader.nextLine();
                } while (!checkSiNo(deter));

                deteriorado = checkBool(deter);
                System.out.println(deteriorado);

                do {
                    System.out.println("");
                    System.out.println("-----------------------------Añadir artículo----------------------------");
                    System.out.println("");
                    System.out.println("Selecciona el artículo vas a añadir:");
                    System.out.println("");
                    System.out.println("1. Libro");
                    System.out.println("2. Música");
                    System.out.println("3. Videojuego");
                    System.out.println("");
                    System.out.print("Opción seleccionada: ");
                    opc2 = reader.nextInt();
                    borrar = reader.nextLine();
                    if (opc2 < 1 || opc2 > 3) {
                        System.out.println("¡Selecciona una opción válida!");
                    }
                } while (opc2 < 1 || opc2 > 3);
        }
        System.out.println("");

        do {
            switch (opc2) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("-----------------------------Añadir libro----------------------------");
                        System.out.println("");
                        System.out.println("¿Es impreso o audiolibro?:");
                        System.out.println("");
                        System.out.println("1. Libro impreso");
                        System.out.println("2. Audiolibro");
                        System.out.println("");
                        System.out.print("Opción seleccionada: ");
                        opc3 = reader.nextInt();
                        borrar = reader.nextLine();
                        if (opc3 < 1 || opc3 > 2) {
                            System.out.println("¡Selecciona una opción válida!");
                        }
                    } while (opc3 < 1 || opc3 > 2);
                    switch (opc3) {
                        case 1:

                    }

            }

            // Añadir un artículo.
            // Obtener precio alquiler.
            // Mostrar todos los precios.
        } while (opc2 < 0 || opc2 > 3);
    }

    public static boolean checkSiNo(String resp) {
        boolean ok = true;
        if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
            System.err.println("Solo respuestas de 'S' o 'N'");
            ok = false;
        }
        return ok;
    }

    public static boolean checkBool(String resp) {
        boolean ok = false;
        if (resp.equalsIgnoreCase("S")) {
            ok = true;
        }
        return ok;
    }
}
