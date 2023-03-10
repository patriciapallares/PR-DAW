package ejercicioObligatorio8;

import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */
public class PruebaCuentas {

    public static void main(String[] args) {

        // crear array para meter personas y poder gestionarlo mejor
        // validar si existen personas antes de ejecutar el menú
        Scanner reader = new Scanner(System.in);
        int opcion, numCuenta;
        float saldoCuenta, abonos, pagos;
        String dni, basura;
        Cuenta c = null;
        Persona p = null;
        Cuenta cuentas[] = new Cuenta[3];
        // guardo mis clientes que son objetos Persona en un array
        Persona clientes[] = new Persona[10];

        do {

            System.out.println("Menú gestión de personas y cuentas:"
                    + "\n ------"
                    + "\n 1. Crear un nuev DNI / cliente "
                    + "\n 2. Crear una nueva cuenta y asociarlo a un DNI / cliente "
                    + "\n 3. Mostrar datos de un DNI / cliente (por DNI)"
                    + "\n 4. Recibir la nómina mensual (por DNI y núm cuenta)"
                    + "\n 5. Realizar un pago (por DNI y núm cuenta)"
                    + "\n 6. Realizar transferencia entre cuentas (por DNI x2 y núm cuenta x2)"
                    + "\n 7. Imprimir los DNIs / clientes morosos"
                    + "\n 8. Salir del programa"
                    + "\n ------");
            System.out.println("Introduzca una opción:");
            opcion = reader.nextInt();

            if (opcion == 1) {

                // 1. Crear una nueva persona
                System.out.println("Introduce el DNI:");
                basura = reader.nextLine();
                dni = reader.nextLine();

                // introduzco info en el array clientes
                if (existeCliente(dni, clientes)) {
                    System.out.println("Ya existe este DNI / cliente.");
                } else if (arrayLleno(clientes)) {
                    System.out.println("No hay capacidad para más clientes.");
                } else {
                    boolean anyadido = false;
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] == null) {
                            p = new Persona(dni, cuentas);
                            clientes[i] = p;
                            // clientes[i].setDni(dni);
                            anyadido = true;
                            // Importantísimo para que no haga 10 veces lo mismo wtf
                            break;
                        }
                    }

                    if (anyadido) {
                        System.out.println("DNI / Cliente añadido.");
                    } else {
                        System.out.println("No se ha podido añadir DNI / cliente.");
                    }
                }

            } else if (opcion == 2) {
                // 2. Crear una nueva cuenta y asociarlo a una persona"
                int opcionAsociacion;

                // compruebo que haya objetos en el array
                if (arrayVacio(clientes)) {
                    System.out.println("Crea un nuevo DNI / cliente primero.");
                } else {

                    System.out.println("Introduce el número de cuenta (XXXX):");
                    numCuenta = reader.nextInt();

                    System.out.println("Introduce el saldo de la cuenta:");
                    saldoCuenta = reader.nextFloat();

                    c = new Cuenta(numCuenta, saldoCuenta);

                    System.out.println("¿A qué DNI / cliente quieres asociarla?");
                    for (int i = 0; i < numClientes(clientes); i++) {
                        System.out.println((i + 1) + ". " + clientes[i].getDni());
                    }
                }

                System.out.println("Introduce una opción (1-10): ");
                opcionAsociacion = reader.nextInt();
                // guardo el valor en el primer espacio disponible del array 
                clientes[opcionAsociacion - 1].anyadirCuentas(c);

            } else if (opcion == 3) {
                // 3. Mostrar datos de un DNI / cliente (por DNI)
                if (arrayVacio(clientes)) {
                    System.out.println("Crea un nuevo DNI / cliente primero.");
                } else {
                    System.out.println("Introduce el DNI para realizar la consulta.");
                    basura = reader.nextLine();
                    dni = reader.nextLine();

                    for (int i = 0; i < numClientes(clientes); i++) {
                        if (dni.equals(clientes[i].getDni())) {
                            System.out.println("Las cuentas son");
                            clientes[i].mostrarCuentas();
                        }
                    }
                }
            } else if (opcion == 4) {

                // 4. Recibir la nómina mensual (por DNI y núm cuenta)
                System.out.println("¿Cuánto es la nómina?");
                abonos = reader.nextFloat();

                System.out.println("Introduzca el DNI / cliente");
                basura = reader.nextLine();
                dni = reader.nextLine();

                System.out.println("Introduzca el número de cuenta");
                numCuenta = reader.nextInt();

                for (int i = 0; i < numClientes(clientes); i++) {
                    if (clientes[i].getDni().equals(dni)) {
                        cuentas = clientes[i].getCuentas();
                        System.out.println("Cuenta identificada.");
                    }                   
                }
                
                for (int i = 0; i < numCuentas(cuentas); i++) {
                    if (cuentas[i].getNumCuenta()==numCuenta){
                        cuentas[i].recibirAbonos(abonos);
                        System.out.println("Nómina recibida correctamente.");
                    }
                }

            } else if(opcion == 5){
                
                // 5. Realizar un pago (por DNI y núm cuenta)
                
                System.out.println("¿Cuánto es el pago?");
                pagos = reader.nextFloat();

                System.out.println("Introduzca el DNI / cliente");
                basura = reader.nextLine();
                dni = reader.nextLine();

                System.out.println("Introduzca el número de cuenta");
                numCuenta = reader.nextInt();

                for (int i = 0; i < numClientes(clientes); i++) {
                    if (clientes[i].getDni().equals(dni)) {
                        cuentas = clientes[i].getCuentas();
                        System.out.println("Cuenta identificada.");
                    }                   
                }
                
                for (int i = 0; i < numCuentas(cuentas); i++) {
                    if (cuentas[i].getNumCuenta()==numCuenta){
                        cuentas[i].realizarPagos(pagos);
                        System.out.println("Pago realizado correctamente.");
                    }
                }
            } else if(opcion == 6){
                
                // 6. Realizar transferencia entre cuentas (por DNI x2 y núm cuenta x2)
                
                // PENDIENTE
                

            }else if(opcion == 7){
                
                // 7. Imprimir los DNIs / clientes morosos
                
                // PENDIENTE
                
                for (int i = 0; i < numClientes(clientes); i++) {
                    if(clientes[i].esMorosa()){
                        System.out.println("DNI:"+clientes[i].getDni());                     
                    }
                }               
            }
            
            

        } while (opcion != 8);

        System.out.println("Programa terminado.");

    }

    // comprobar si el array está lleno
    public static boolean arrayLleno(Persona clientes[]) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                return false;
            }
        }
        return true;
    }

    // comprobar si el array está lleno
    public static boolean arrayVacio(Persona clientes[]) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                return false;
            }
        }
        return true;
    }

    public static int numClientes(Persona clientes[]) {
        int totalClientes = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                totalClientes++;
            }
        }
        return totalClientes;
    }
    
    public static int numCuentas(Cuenta cuentas[]) {
        int totalClientes = 0;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                totalClientes++;
            }
        }
        return totalClientes;
    }

    // comprobar si existe 
    public static boolean existeCliente(String dni, Persona clientes[]) {
        for (int i = 0; i < clientes.length; i++) {
            // ojo, diferente al min 13
            if (clientes[i] != null && dni.equals(clientes[i].getDni())) {
                return true;
            }
        }
        return false;
    }

}
