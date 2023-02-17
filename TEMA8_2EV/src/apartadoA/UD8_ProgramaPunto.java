package APARTADOA;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class UD8_ProgramaPunto {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        
        String basura;
        
        //Ejercicio A1 – Punto
        
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();
        
        p1.x=5;
        p1.y=0;
        
        p2.x=10;
        p2.y=10;
        
        p3.x=-3;
        p3.y=7;
        
        System.out.println("Coordenadas p1: (" + p1.x+","+p1.y+")");
        
        //Ejercicio A2 – Persona
        
        Persona pers1 = new Persona();
        Persona pers2 = new Persona();        
        
        System.out.println("Introduce el nombre de la primera persona:");
        pers1.nombre = reader.nextLine();
        
        System.out.println("Introduce el primer apellido de la primera persona:");
        pers1.apellido = reader.nextLine();
        
        System.out.println("Introduce el DNI de la primera persona:");
        pers1.dni = reader.nextLine();
        
        System.out.println("Introduce la edad de la primera persona:");
        pers1.edad = reader.nextInt();
        basura = reader.nextLine();
        
        System.out.println("Introduce el nombre de la segunda persona:");
        pers2.nombre = reader.nextLine();
        
        System.out.println("Introduce el primer apellido de la segunda persona:");
        pers2.apellido = reader.nextLine();

        System.out.println("Introduce el DNI de la segunda persona:");
        pers1.dni = reader.nextLine();
                
        System.out.println("Introduce la edad de la segunda persona:");
        pers2.edad = reader.nextInt();
        
        
        if(pers1.edad>=18){
            System.out.println(pers1.nombre+" "+pers1.apellido+" con DNI "+ pers1.dni+ " es mayor de edad.");
        }else{
            System.out.println(pers1.nombre+" "+pers1.apellido+" con DNI "+ pers1.dni+ " no es mayor de edad.");
        }
        
        if(pers2.edad>=18){
            System.out.println(pers2.nombre+" "+pers2.apellido+" con DNI "+ pers2.dni+ " es mayor de edad.");
        }else{
            System.out.println(pers2.nombre+" "+pers2.apellido+" con DNI "+ pers2.dni+ " no es mayor de edad.");
        }

    }
    
}
