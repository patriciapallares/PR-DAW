package examen1ev3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class ProgramaExamen1Ev3 {

    public static void main(String[] args) {

        // El programa fa 3 de les 4 coses que se demanen a l'enunciat.
        // M'ha quedat pendent validar lo que introduix l'usuari i controlar
        // les excepcions.
        
        Scanner reader = new Scanner(System.in);

        int tipoElectro = 0, opcion = 0;

        Television te = null;
        Lavadora la;

        String nombre, basura, opcion1, color, consumoE;

        double precioBase, peso, carga, resolucion;
        boolean wifi;
        ListaElectrodomesticos listaElectro;
        listaElectro = new ListaElectrodomesticos();

        do {
            System.out.println(" - - - - - "
                    + "\n 1. Añadir electrodoméstico."
                    + "\n 2. Mostrar electrodomésticos con el precio final."
                    + "\n 3. Borrar electrodoméstico dado su nombre."
                    + "\n 4. Mostrtar lavadoras de más de 8kg de carga."
                    + "\n 0. Salir"
                    + "\n - - - - - ");
            System.out.println("Introduzca una opción:");

            opcion = reader.nextInt();

            if (opcion == 1) {
                do {
                    System.out.println("¿Qué vas a añadir?");
                    System.out.println("Introduce:"
                            + "\n 1. Lavadora"
                            + "\n 2. Televisión"
                            + "\n 0. Volver al menú");
                    tipoElectro = reader.nextInt();

                    if (tipoElectro == 1) {

                        System.out.println("¿Qué nombre tiene la lavadora?");
                        basura = reader.nextLine();
                        nombre = reader.nextLine();

                        System.out.println("¿Quieres el resto de valores por defecto? Introduce S si sí, N si no.");
                        opcion1 = reader.nextLine().toUpperCase();

                        if ("S".equals(opcion1)) {
                            la = new Lavadora(nombre);
                        } else {
                            // (String nombre, double precioBase, double peso) {
                            System.out.println("¿Cuál es el precio base?");
                            precioBase = reader.nextDouble();
                            System.out.println("¿Cuál es el peso de la lavadora?");
                            peso = reader.nextDouble();

                            System.out.println("¿Quieres el resto de valores por defecto? Introduce S si sí, N si no.");
                            basura = reader.nextLine();
                            opcion1 = reader.nextLine().toUpperCase();

                            if ("S".equals(opcion1)) {
                                la = new Lavadora(nombre, precioBase, peso);
                            } else {
                                // double carga, String nombre, double precioBase, String color, char consumoE, double peso)

                                System.out.println("¿Cuál es el color? (blanco, negro, rojo, azul o gris)");
                                color = reader.nextLine();

                                System.out.println("¿Cuál es el consumo? (A,B,C,D,E,F)");
                                consumoE = reader.nextLine();

                                System.out.println("¿Cuál es la carga?");
                                carga = reader.nextDouble();

                                la = new Lavadora(carga, nombre, precioBase, color, consumoE, peso);

                            }
                        }

                        listaElectro.afegirElectro(la);

                    } else if (tipoElectro == 2) {

                        System.out.println("¿Qué nombre tiene la televisión?");
                        basura = reader.nextLine();
                        nombre = reader.nextLine();

                        System.out.println("¿Quieres el resto de valores por defecto? Introduce S si sí, N si no.");
                        opcion1 = reader.nextLine().toUpperCase();

                        if ("S".equals(opcion1)) {
                            te = new Television(nombre);
                        } else {
                            // (String nombre, double precioBase, double peso) {
                            System.out.println("¿Cuál es el precio base?");
                            precioBase = reader.nextDouble();
                            System.out.println("¿Cuál es el peso del televisión?");
                            peso = reader.nextDouble();

                            System.out.println("¿Quieres el resto de valores por defecto? Introduce S si sí, N si no.");
                            basura = reader.nextLine();
                            opcion1 = reader.nextLine().toUpperCase();

                            if ("S".equals(opcion1)) {
                                te = new Television(nombre, precioBase, peso);
                            } else {
                                // (double resolucion, boolean wifi, String nombre, double precioBase, String color, String consumoE, double peso)

                                System.out.println("¿Cuál es el color? (blanco, negro, rojo, azul o gris)");
                                color = reader.nextLine();

                                System.out.println("¿Cuál es el consumo? (A,B,C,D,E,F)");
                                consumoE = reader.nextLine();

                                System.out.println("Tiene wifi. Introduce S si sí, N si no.");
                                opcion1 = reader.nextLine().toUpperCase();

                                if ("S".equals(opcion1)) {
                                    wifi = true;
                                } else {
                                    wifi = false;
                                }

                                System.out.println("¿Cuál es la resolucion?");
                                resolucion = reader.nextDouble();

                                te = new Television(resolucion, wifi, nombre, precioBase, color, consumoE, peso);

                            }
                        }

                        listaElectro.afegirElectro(te);

                    }

                } while (tipoElectro != 0);

            } else if (opcion == 2) {
                listaElectro.mostrarElectros();
            } else if (opcion == 3) {
                System.out.println("Introduce el nombre del electrodoméstico que quieres borrar");
                basura = reader.nextLine();
                nombre = reader.nextLine();
                
                listaElectro.borrarElectro(nombre);
                
                
            } else if ( opcion == 4 ){
                
            }

        } while (opcion != 0);
    }

}
