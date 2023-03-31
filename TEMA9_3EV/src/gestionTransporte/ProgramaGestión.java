package gestionTransporte;

/**
 *
 * @author patgon
 */
import java.util.ArrayList;
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
        int tipoBus, indice;
        double numKm;
        int matricula;
        double precioBase;
        BusUrbano busU1;
        BusInterurbano busI1;
        boolean encontrado;

        ArrayList<BusUrbano> listaBusesUrbanos = new ArrayList<BusUrbano>();
        ArrayList<BusInterurbano> listaBusesInterurbanos = new ArrayList<BusInterurbano>();
        ArrayList<Conductor> listaConductores = new ArrayList<Conductor>();

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
// alta de un conductor, validamos nombre y salario
// comprobamos que el nombre no está en blanco
                    do {
                        System.out.print("Introduce el nombre del conductor: ");
                        nombre = reader.nextLine();
                        if (nombre.equalsIgnoreCase("")) {
                            System.out.println("El nombre no puede estar vacío.");
                        }
                    } while (nombre.equalsIgnoreCase(""));

// comprobamos que el salario es > 0
                    do {
                        System.out.print("Introduce el salario: ");
                        salario = reader.nextDouble();;
                        if (salario <= 0) {
                            System.out.println("El salario tiene que ser mayor que 0.");
                        }
                    } while (salario <= 0);

// cuando todo correcto lo añadimos al Arraylist de conductores
                    listaConductores.add(new Conductor(nombre, salario));
                    break;

                case 2:

                    do {

                        do {
                            System.out.println("Introduzca una matrícula:");
                            matricula = reader.nextInt();
                            if (matricula <= 0) {
                                System.out.println("El número debe ser mayor que 0.");
                            }
                        } while (matricula <= 0);

                        if (matricula <= 0) {
                            System.out.println("El número debe ser mayor que 0.");
                        }
                    } while (matricula <= 0);

                    // debemos asignar un conductor al Autobús
// lo buscamos por su nombre
                    do {
                        encontrado = false;
                        System.out.print("Introduce el nombre del conductor: ");
                        nombre = reader.nextLine();
                        if (nombre.equalsIgnoreCase("")) {
                            System.out.println("El nombre no puede estar vacío.");
                        } else {
                            indice = 0;
                            while (indice < listaConductores.size() && !encontrado) {
                                if (listaConductores.get(indice).getNombre().equalsIgnoreCase(nombre)) {
                                    c = listaConductores.get(indice);
                                    encontrado = true;
                                } else {
                                    indice++;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("El conductor no existe.");
                            }
                        }
                    } while (!nombre.equalsIgnoreCase("") && !encontrado);

                    do {
                        System.out.print("Introduce el precio base del viaje: ");
                        precioBase = reader.nextDouble();
                        if (precioBase <= 0) {
                            System.out.println("El precio base tiene que ser mayor que 0.");
                        }
                    } while (precioBase <= 0);

                    System.out.println("Introduzca una ruta:");
                    basura = reader.nextLine();
                    tipoRuta = reader.nextLine();

                    do {
                        System.out.print("Introduce el tipo de ruta: ");
                        tipoRuta = reader.nextLine();
                        if (tipoRuta.equalsIgnoreCase("")) {
                            System.out.println("La ruta no puede estar vacía.");
                        }
                    } while (tipoRuta.equalsIgnoreCase(""));

                    // listaBuses.add(new AutobusUrbano(numId, nuevo, precio, ruta));
                    listaBusesUrbanos.add(new BusUrbano(tipoRuta, matricula, precioBase, c));
                    
                    break;

                case 3:

                    System.out.println("Introduzca el número de KM:");
                    numKm = reader.nextDouble();
                    System.out.println("Introduzca una matrícula:");
                    basura = reader.nextLine();
                    matricula = reader.nextInt();
                    System.out.println("Introduzca un precio base:");
                    precioBase = reader.nextDouble();
                    System.out.println("Introduzco yo el conductor.");
                    busI1 = new BusInterurbano(numKm, matricula, precioBase, c);
                    break;

                case 4:

                    System.out.println("Introduzca una matrícula:");
                    basura = reader.nextLine();
                    matricula = reader.nextInt();
                    System.out.println("Tipo de bus. Introduzca 0 para Urbano o 1 para InterUrbano: ");
                    tipoBus = reader.nextInt();
                    break;

                default:

                    break;
            }

        } while (opcion != 0);

    }

}
