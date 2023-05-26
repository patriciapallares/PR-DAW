package primitiva;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */
public class Primitiva {

    public static void main(String[] args) {
        // Variables
        String borrar, fechaBoleto, DNIP, nombreP;

        int opcion, num1, num2, num3, num4, num5, num6;

        boolean ok;
        BoletoLoteria bol;
        Scanner reader = new Scanner(System.in);
        
        ListaBoletos misBoletos = new ListaBoletos();

        //La lotería dará solamente cuatro premios (en euros), para los acertantes de 3, 4, 5 y 6.
        // TODO: generar boletoGanador
        // Define una clase principal donde tengas un vector de n objetos de 
        // tipo BoletosLoteria, y un menú que nos permita realizar las siguientes acciones:
        do {
            do {
                opcion = -1;
                System.out.println();
                System.out.println("1. Introducir un boleto.");
                System.out.println("2. Introducir premios.");
                System.out.println("3. Comprobar boleto.");
                System.out.println("4. Mostrar el boleto de un cliente (por dni o nombre).");
                System.out.println("5. Modificar boleto de un cliente (dni).");
                System.out.println("6. Obtener listado de boletos premiados y cantidades obtenidas.");
                System.out.println("0. Salir\n");
                System.out.println("");
                try {
                    System.out.print("Elige una opción del menú:");
                    opcion = reader.nextInt();
                    if (opcion < 0 || opcion > 6) {
                        System.out.println("Error: Opción incorrecta! ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! no has introducido un número.");
                    borrar = reader.nextLine();
                    opcion = -1;
                }
            } while (opcion < 0 || opcion > 6);

            switch (opcion) {
                case 1: // Introducir un boleto
                    borrar = reader.nextLine();
                    System.out.println("Hola");
                    // TODO VALIDAR FECHA
                    System.out.println("Introduce una fecha");
                    fechaBoleto = reader.nextLine();

                    System.out.println("Introduce nombre del cliente:");
                    nombreP = reader.nextLine();

                    System.out.println("Introduce DNI del cliente: ");
                    DNIP = reader.nextLine();

                    System.out.println("Introduce el número en la posición 1");
                    num1 = reader.nextInt();

                    System.out.println("Introduce el número en la posición 2");
                    num2 = reader.nextInt();

                    System.out.println("Introduce el número en la posición 3");
                    num3 = reader.nextInt();

                    System.out.println("Introduce el número en la posición 4");
                    num4 = reader.nextInt();

                    System.out.println("Introduce el número en la posición 5");
                    num5 = reader.nextInt();

                    System.out.println("Introduce el número en la posición 6");
                    num6 = reader.nextInt();
                    
                    bol = new BoletoLoteria(DNIP, nombreP, fechaBoleto, num1, num2, num3, num4, num5, num6);
                    
                    ok = misBoletos.anadirArticulo(bol);

                    System.out.println("¿Insertado?: " + ok);
                case 2: // Introducir premios
                case 3: // Comprobar boleto
                case 4: // Mostrar boleto de un cliente
                case 5: // modificar boleto de un cliente
                case 6: // listar boletos premiedos y cantidades obtenidas
            }

        } while (opcion != 0);

    }

}
