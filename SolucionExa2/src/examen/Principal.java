package examen;

import java.util.Scanner;
/*
   En el programa principal: Menú para hacer las siguientes acciones:
     1.Añadir un electrodoméstico.
     2.Mostrar todos los electrodomésticos con su precio final.
     3.Borrar un electrodoméstico dado su nombre (no tener en cuenta repetidos,
       se suponen únicos)
     4.Mostrar las lavadoras de más de 30 kg de carga.
*/
public class Principal {

    public static void main(String[] args) {
        // declaración de variables
        Electrodomestico electro;
        ListaElectrodomesticos listaElectro = new ListaElectrodomesticos();
        char consumo = ' ';
        String nombre, color, wifi, borrar;
        int opc, opc2, carga, resolucion;
        float peso, precio;
        boolean ok, wifiBool;
        Scanner entrada = new Scanner(System.in);

        do {
            do {
                System.out.println("");
                System.out.println("---------------------------------Menú------------------------------------");
                System.out.println("");
                System.out.println("1. Añadir electrodoméstico.");
                System.out.println("2. Mostrar todos los electrodomésticos con precio final.");
                System.out.println("3. Borrar un electrodoméstico dado su nombre.");
                System.out.println("4. Mostrar lavadoras de mas de 8kg de carga");
                System.out.println("5. Salir.");
                System.out.println("");
                System.out.print("Opción seleccionada: ");
                opc = entrada.nextInt();
                borrar = entrada.nextLine();
                if (opc < 1 || opc > 5) {
                    System.out.println("¡Selecciona una opción válida!");
                }
            } while (opc < 1 || opc > 5);
            switch (opc) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("-----------------------------Añadir electrodoméstico----------------------------");
                        System.out.println("");
                        System.out.println("Selecciona el electrodoméstico vas a añadir:");
                        System.out.println("");
                        System.out.println("1. Lavadora");
                        System.out.println("2. Televisión");
                        System.out.println("");
                        System.out.print("Opción seleccionada: ");
                        opc2 = entrada.nextInt();
                        borrar = entrada.nextLine();
                        if (opc2 < 1 || opc2 > 2) {
                            System.out.println("¡Selecciona una opción válida!");
                        }
                    } while (opc2 < 1 || opc2 > 2);
                    System.out.println("");
                    do {
                        // pedimos y validamos valores
                        do {
                            System.out.print("Nombre: ");
                            nombre = entrada.nextLine();
                            ok = MiLibreria.campoVacio(nombre);
                            if (!ok)
                                System.out.println("Este campo no puede estar vacio");
                        } while (!ok);
                        do {
                            System.out.print("Peso :");
                            peso = entrada.nextFloat();
                            borrar = entrada.nextLine();
                            if (peso < 0) {
                                System.out.println("Introduce un numero > 0");
                            }
                        } while (peso < 0);
                        do {
                            System.out.print("Color: ");
                            color = entrada.nextLine();
                            ok = MiLibreria.campoVacio(color);
                            if (!ok)
                                System.out.println("Este campo no puede estar vacio");
                        } while (!ok);
                        do {
                            System.out.print("Consumo: ");
                            consumo = entrada.nextLine().charAt(0);
                            if (consumo != ' ') {
                                ok = true;
                            }
                            else
                                System.out.println("Debe escribir una letra !");
                        } while (!ok);
                        do {
                            System.out.print("Precio :");
                            precio = entrada.nextFloat();
                            borrar = entrada.nextLine();
                            if (precio < 0) {
                                System.out.println("Introduce un numero > 0");
                            }
                        } while (precio < 0);
                        switch (opc2) {
                            case 1:
                                do {
                                    System.out.print("Carga: ");
                                    carga = entrada.nextInt();
                                    borrar = entrada.nextLine();
                                    if (carga < 0) {
                                        System.out.println("Introduce un numero > 0");
                                    }
                                } while (carga < 0);
                                electro = new Lavadora(nombre, color, consumo, peso, precio, carga);
                                if (listaElectro.addElectro(electro)) {
                                    System.out.println("Electrodoméstico LAVADORA añadido");
                                }
                                break;
                            case 2:
                                do {
                                    System.out.print("Resolucion: ");
                                    resolucion = entrada.nextInt();
                                    if (resolucion < 0) {
                                        System.out.println("Introduce un numero > 0");
                                    }
                                } while (resolucion < 0);
                                do {
                                    System.out.print("Tiene wifi?(SI/NO): ");
                                    wifi = entrada.nextLine();
                                } while (!MiLibreria.checkSiNo(wifi));
                                wifiBool = MiLibreria.checkBool(wifi);
                                electro = new Television(nombre, color, consumo, peso, precio, resolucion, wifiBool);
                                if (listaElectro.addElectro(electro)) {
                                    System.out.println("Electrodoméstico TELEVISIÓN añadido");
                                }
                                break;
                        }
                    } while (opc2 < 0 || opc2 > 2);
                case 2:
                    System.out.println("Mostrar todos los electrodomésticos");
                    listaElectro.listarElectro();
                    break;
                case 3:
                    System.out.println("Eliminar electrodomésticos");
                    System.out.println("Introduce el nombre del electrodoméstico");
                    nombre = entrada.nextLine();
                    if (listaElectro.borrarElectro(nombre)) {
                        System.out.println("Artículo borrado");
                    } else {
                        System.out.println("No se ha borrado el artículo");
                    }
                    break;
                case 4:
                    System.out.println("Mostrar todas las lavadoras de carga 8: ");
                    listaElectro.listarLavadoras();
                    break;

            }
        } while (opc != 5);
    }

}
