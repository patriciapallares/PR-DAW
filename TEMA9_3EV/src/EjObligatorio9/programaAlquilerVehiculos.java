package EjObligatorio9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class programaAlquilerVehiculos {

    public static void main(String[] args) {

        // TODO hacer un método que 
        int opcion = 0, tipoVehiculo = 0, matricula, plazas, dias, indice, numVehiculos;
        boolean encontrado;
        double peso, precioFinal;
        Scanner reader = new Scanner(System.in);
        Coche co;
        Microbus mi;
        Furgo fu;
        Camion ca;

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        do {
            System.out.println(" - - - - - "
                    + "\n 1. Añadir vehículo"
                    + "\n 2. Obtener precio de alquiler"
                    + "\n 3. Mostrar todos los precios"
                    + "\n 0. Salir"
                    + "\n - - - - - ");
            System.out.println("Introduzca una opción:");

            opcion = reader.nextInt();

            if (opcion == 1) {

                do {
                    System.out.println("\n");
                    System.out.println("- Añadir vehículo -");
                    System.out.println(" 1. Coche"
                            + "\n 2. Microbús"
                            + "\n 3. Furgoneta"
                            + "\n 4. Camión");
                    System.out.println("¿Qué tipo de vehículo quieres añadir? Introduce el número.");
                    tipoVehiculo = reader.nextInt();
                } while (tipoVehiculo < 1 || tipoVehiculo > 4);

                switch (tipoVehiculo) {

                    case 1 -> {

                        do {
                            System.out.println("Introduce la matrícula:");
                            matricula = reader.nextInt();
                        } while (matricula <= 0);

                        indice = 0;
                        encontrado = false;
                        while (indice < listaVehiculos.size() && !encontrado) {

                            if (listaVehiculos.get(indice).getMatricula() == matricula) {

                                encontrado = true;

                            } else {
                                indice++;
                            }
                        }

                        if (encontrado) {
                            System.out.println("Ya existe un vehículo con esta matrícula. Comience de nuevo.");
                        } else {
                            do {
                                System.out.println("Introduce el número de plazas:");
                                plazas = reader.nextInt();
                            } while (plazas <= 0);

                            co = new Coche(plazas, matricula);
                            listaVehiculos.add(co);
                            System.out.println("Se ha añadido el coche.");
                            System.out.println("\n");
                        }

                    }

                    case 2 -> {

                        do {
                            System.out.println("Introduce la matrícula:");
                            matricula = reader.nextInt();
                        } while (matricula <= 0);

                        indice = 0;
                        encontrado = false;
                        while (indice < listaVehiculos.size() && !encontrado) {

                            if (listaVehiculos.get(indice).getMatricula() == matricula) {

                                encontrado = true;

                            } else {
                                indice++;
                            }
                        }

                        if (encontrado) {
                            System.out.println("Ya existe un vehículo con esta matrícula. Comience de nuevo.");
                        } else {
                            System.out.println("Introduce el número de plazas:");
                            plazas = reader.nextInt();

                            mi = new Microbus(plazas, matricula);
                            listaVehiculos.add(mi);
                            System.out.println("Se ha añadido el microbús.");
                            System.out.println("\n");
                        }
                    }
                    case 3 -> {
                        do {
                            System.out.println("Introduce la matrícula:");
                            matricula = reader.nextInt();
                        } while (matricula <= 0);

                        indice = 0;
                        encontrado = false;
                        while (indice < listaVehiculos.size() && !encontrado) {

                            if (listaVehiculos.get(indice).getMatricula() == matricula) {

                                encontrado = true;

                            } else {
                                indice++;
                            }
                        }

                        if (encontrado) {
                            System.out.println("Ya existe un vehículo con esta matrícula. Comience de nuevo.");
                        } else {
                            System.out.println("Introduce el peso:");
                            peso = reader.nextDouble();
                            fu = new Furgo(peso, matricula);
                            listaVehiculos.add(fu);
                            System.out.println("Se ha añadido la furgoneta.");
                            System.out.println("\n");
                        }
                    }
                    case 4 -> {
                        do {
                            System.out.println("Introduce la matrícula:");
                            matricula = reader.nextInt();
                        } while (matricula <= 0);

                        indice = 0;
                        encontrado = false;
                        while (indice < listaVehiculos.size() && !encontrado) {

                            if (listaVehiculos.get(indice).getMatricula() == matricula) {

                                encontrado = true;

                            } else {
                                indice++;
                            }
                        }

                        if (encontrado) {
                            System.out.println("Ya existe un vehículo con esta matrícula. Comience de nuevo.");
                        } else {
                            System.out.println("Introduce el peso:");
                            peso = reader.nextDouble();
                            ca = new Camion(peso, matricula);
                            listaVehiculos.add(ca);
                            System.out.println("Se ha añadido el camión.");
                            System.out.println("\n");
                        }
                    }
                    default -> {
                    }
                }
            } else if (opcion == 2) {
                indice = 0;
                encontrado = false;

                System.out.println("\n");
                System.out.println("- Obtener precio de alquiler -");

                System.out.println("Introduce la matrícula:");
                matricula = reader.nextInt();

                do {
                    System.out.println("Introduce el número de días:");
                    dias = reader.nextInt();
                } while (dias <= 0);

                // imprimir billete
                while (indice < listaVehiculos.size() && !encontrado) {

                    if (listaVehiculos.get(indice).getMatricula() == matricula) {

                        precioFinal = listaVehiculos.get(indice).calcularPrecio(dias);

                        System.out.println("Precio total del alquiler: " + precioFinal);
                        System.out.println("\n");

                        encontrado = true;
                    } else {
                        indice++;
                    }
                }

                if (!encontrado) {
                    System.out.println("Vehículo no encontrado. Comience de nuevo.");
                    System.out.println("\n");
                }

            } else if (opcion == 3) {

                numVehiculos = listaVehiculos.size();
                do {
                    System.out.println("Introduce el número de días:");
                    dias = reader.nextInt();
                } while (dias <= 0);

                System.out.println("Hay un total de " + numVehiculos + " vehiculos.");

                for (int i = 0; i < listaVehiculos.size(); i++) {
                    matricula = listaVehiculos.get(i).getMatricula();
                    precioFinal = listaVehiculos.get(i).calcularPrecio(dias);
                    System.out.println("- Vehículo " + (i + 1) + " -");
                    System.out.println("Matrícula: " + matricula + ". Precio final: " + precioFinal);
                }

            }

        } while (opcion != 0);
    }

}
