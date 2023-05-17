package ejercicios;

import java.util.Scanner;

public class ej19 {

public static void main(String[] args){

Scanner reader = new Scanner(System.in); 
int a,b,c;
boolean respuesta;

System.out.println("Introduce un número: ");
a = reader.nextInt();

System.out.println("Introduce otro número: ");
b = reader.nextInt();

System.out.println("Introduce otro número: ");
c = reader.nextInt();

respuesta = esPitagoras(a,b,c);

if(respuesta){
System.out.println("Se ajusta a la ecuación de Pitágoras");
}else{
System.out.println("No se ajusta.");
}
}

public static boolean esPitagoras(int a, int b, int c){ 
boolean seCumple = false;

if((a^2+b^2) == (c^2)){
seCumple = true;
}

return seCumple;
}
}
