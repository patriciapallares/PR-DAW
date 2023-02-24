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
        Contacto c;
        
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
                
                System.out.println("Escribe el número: ");
                telf = reader.nextLine();
                
                // INSTANCIAMOS AQUÍ
                c = new Contacto(nombre, telf);
                
                agendaTelefonica.anyadirContacto(c);
                
            }else if(opcion == 2){
                
                agendaTelefonica.listarContactos();
                
            }else if(opcion == 3){
                System.out.println("Escribe el nombre: ");
                basura = reader.nextLine();
                nombre = reader.nextLine();
                
                agendaTelefonica.buscarContacto(nombre);
                
            }else if(opcion == 4){
                
                System.out.println("Escribe el nombre: ");
                basura = reader.nextLine();
                nombre = reader.nextLine();
                
                System.out.println("Escribe el número: ");
                telf = reader.nextLine();
                
                // INSTANCIAMOS AQUÍ
                c = new Contacto(nombre, telf);
                
                if(agendaTelefonica.existeContacto(c)){
                    System.out.println("El contacto existe en la agenda.");
                }else{
                    System.out.println("El contacto no existe en la agenda.");
                }
            }else if(opcion == 5){
                System.out.println("Escribe el nombre: ");
                basura = reader.nextLine();
                nombre = reader.nextLine();
                /*
                System.out.println("Escribe el número: ");
                telf = reader.nextLine();
                
                // INSTANCIAMOS AQUÍ
                c = new Contacto(nombre, telf);
                */
                agendaTelefonica.eliminarContacto(nombre);
            }else if(opcion == 6){
                int huecos = agendaTelefonica.huecosLibres();
                
                System.out.println("Quedan "+huecos+" espacios libres.");
                
            }

        } while (opcion!=7);

        System.out.println("Programa terminado.");
    }
}
