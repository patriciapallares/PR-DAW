package gestionTransporte;

/**
 *
 * @author patgon
 */
import java.util.Scanner;

public class ProgramaGestión {

    public static void main(String[] args) {

        int opcion;
        Scanner reader = new Scanner(System.in);

        Conductor c = null;
        double salario;
        String nombre;

        String tipoRuta;
        String basura;
        int tipoBus;
        double numKm;
        String matricula;
        double precioBase;
        BusUrbano busU1;
        BusInterurbano busI1;

        // Crear ListaUrbanos, ListaInterUrbanos, ListaConductores
        do {
            System.out.println(" - - - - - "
                    + "\n 1. Alta conductores"
                    + "\n 2. Alta bus urbano"
                    + "\n 3. Alta bus interurbano"
                    + "\n 4. Imprimir billete"
                    + "\n 0. Salir"
                    + "\n - - - - - ");
            System.out.println("Introduzca una opción:");
            opcion = reader.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el nombre:");
                    nombre = reader.nextLine();
                    System.out.println("Introduzca el salario:");
                    salario = reader.nextDouble();
                    c = new Conductor(nombre, salario);
                    break;
                    
                case 2:

                    System.out.println("Introduzca una ruta:");
                    basura = reader.nextLine();
                    tipoRuta = reader.nextLine();
                    System.out.println("Introduzca una matrícula:");
                    matricula = reader.nextLine();
                    System.out.println("Introduzca un precio base:");
                    precioBase = reader.nextDouble();
                    System.out.println("Introduzco yo el conductor.");
                    busU1 = new BusUrbano(tipoRuta, matricula, precioBase, c);
                    break;
                    
                case 3:

                    System.out.println("Introduzca el número de KM:");
                    numKm = reader.nextDouble();
                    System.out.println("Introduzca una matrícula:");
                    basura = reader.nextLine();
                    matricula = reader.nextLine();
                    System.out.println("Introduzca un precio base:");
                    precioBase = reader.nextDouble();
                    System.out.println("Introduzco yo el conductor.");
                    busI1 = new BusInterurbano(numKm, matricula, precioBase, c);
                    break;
                    
                case 4:
                    
                    System.out.println("Introduzca una matrícula:");
                    basura = reader.nextLine();
                    matricula = reader.nextLine();
                    System.out.println("Tipo de bus. Introduzca 0 para Urbano o 1 para InterUrbano: ");
                    tipoBus = reader.nextInt();
                    break;
                    
                default:
                    
                    break;
            }

        } while (opcion != 0);

    }

}
