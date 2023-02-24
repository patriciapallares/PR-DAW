package programaAgenda;

import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */
public class programaAgenda {

    public static void main(String[] args) {
        // TODO 29:44
        Scanner reader = new Scanner(System.in);
        String nombre, basura;
        String telf;
        Agenda agendaTelefonica = new Agenda();
        
        boolean salir = false;

        int opcion; // guarda la opción del user

        do {
            System.out.println("1. Añadir contacto"
                    + "\n 2. Listar contactos"
                    + "\n 3. Buscar contacto"
                    + "\n 4. ¿Existe contacto?"
                    + "\n 5. Eliminar contacto"
                    + "\n 6. Espacios libres"
                    + "\n 7. Salir");
            System.out.println("Introduzca una opción:");
            opcion = reader.nextInt();
            
            if(opcion == 1){
                
                System.out.println("Escribe el nombre: ");
                basura = reader.nextLine();
                nombre = reader.nextLine();
                
                
                
            }

        } while (opcion!=7);

    }
}
