package ejerciciosB;

import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ej3 {
    
    // CAPTURA CORRECCIÓN
    
    // Crea un programa que pida por teclado tres cadenas de texto: nombre y 
    // dos apellidos. Luego mostrará un código de usuario (en mayúsculas) 
    // formado por la concatenación de las tres primeras letras de cada uno de 
    // ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y “Alcocer” 
    // mostrará “LIOTARALC”.
    
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in); 
        String nombre = "", apellido1 = "", apellido2 = "", usuario="";
        
        
        System.out.println("Introduce nombre: ");
        nombre = reader.nextLine();
        
        System.out.println("Introduce primer apellido: ");
        apellido1 = reader.nextLine();
        
        System.out.println("Introduce segundo apellido: ");
        apellido2 = reader.nextLine();
        
        /*
        
        char[] arrayNombre, arrayApellido1, arrayApellido2, arrayUser, arrayUserUpper;
        arrayNombre = nombre.toCharArray();
        arrayApellido1 = apellido1.toCharArray();
        arrayApellido2 = apellido2.toCharArray();
        
        arrayUser = new char [9];
        
        for (int i = 0; i < arrayUser.length; i++){
            if(i<=2){
                arrayUser[i] = arrayNombre[i];
            }else if(i<=5){
                arrayUser[i] = arrayApellido1[i-3];
            }else if(i<=8){
                arrayUser[i] = arrayApellido2[i-6];
            }
            usuario+=arrayUser[i];
        }
        */
        
        usuario = nombre.substring(0,3)+apellido1.substring(0,3)+apellido2.substring(0,3);

        System.out.println(usuario.toUpperCase());
    }
}
