package examen1ev;

import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class Ejercicio1 {
   public static void main(String[] args){
       
       // el programa termina cuando el usuario pulsa c. Al terminar una app se 
       // muestra el menú de nuevo.
    
        Scanner reader = new Scanner(System.in);
        String eleccionUser;
        
        do{ System.out.println("""
                               Men\u00fa de aplicaciones. Introduce la letra que corresponda:
                                (a) Aprobados y suspendidos
                                (b) Billetes a Madrid
                                (c) Salir""");
        
            eleccionUser = reader.nextLine();

            if("a".equals(eleccionUser)){
                // Aprobados y suspendidos
                int n, sumAprobados=0, sumSuspensos=0;
                System.out.println("Aprobados y suspendidos.");
                do {
                System.out.println("¿Cuántas notas vas introducir? Introduce un número entero positivo.");
                n = reader.nextInt();
                } while(n<1);

                for(int i=0; i<n; i++){
                    float nota;
                    do{System.out.println((i+1)+". Introduce una nota entre 0 y 10: ");
                    nota = reader.nextFloat();
                    }while(nota<0 || nota>10);
                    if(nota>=5){
                        sumAprobados++;
                    }else{
                        sumSuspensos++;
                    }
                }

                if(sumAprobados > sumSuspensos){
                    System.out.println("Hay más aprobados que suspensos.");
                }else if(sumAprobados < sumSuspensos){
                    System.out.println("Hay más suspensos que aprobados.");
                }else{
                    System.out.println("Hay igual de suspensos que de aprobados");
                }
                
                System.out.println("Fin de la app. Volviendo al menú.");
                System.out.println("...\n...\n...\n");

            }else if("b".equals(eleccionUser)){
                // Billete de tren de Valencia a Madrid 
                // control de números de miembros de la familia => se pide al usuario el valor
                int m;
                double precioTotal=0,tarifa=32;

                System.out.println("Billete de tren Valencia - Madrid.");
                do {
                System.out.println("¿Cuántos pasajeros irán en el tren? Introduce un número entero positivo.");
                m = reader.nextInt();
                } while(m<1);

                for(int i=0; i<m; i++){
                    String nombre;
                    int edad;
                    double precioUnitario;

                    System.out.println("Pasajero número "+(i+1));
                    System.out.println("Introduce el nombre: ");
                    nombre = reader.nextLine();
                    nombre = reader.nextLine();

                    do{System.out.println("Introduce la edad: ");
                    edad = reader.nextInt();
                    }while(edad<=0);

                    if(edad < 4){
                        precioUnitario = tarifa * 0;
                        System.out.println("Coste: "+ precioUnitario);     
                        
                    }else if(edad >= 4 || edad <= 11){
                        precioUnitario = tarifa * 0.65;
                        System.out.println("Coste: "+ precioUnitario);

                    }else if(edad >= 12 || edad <= 15){
                        precioUnitario = tarifa * 0.92;
                        System.out.println("Coste: "+ precioUnitario);
                            
                    } else if(edad >= 65){
                        precioUnitario = tarifa * 0.9;
                        System.out.println("Coste: "+ precioUnitario); 
                    
                    }else{
                        precioUnitario = tarifa;
                        System.out.println("Coste: "+ precioUnitario);
                    }                           
            
                    precioTotal += precioUnitario;
                }            

                System.out.println("El coste total para " + m +" pasajeros es: " + precioTotal);
                System.out.println("Fin de la app. Volviendo al menú.");
                System.out.println("...\n...\n...\n");
            /*}else if(!"c".equals(eleccionUser)){
                // introduce una opción de las propuestas
            */
            
            }
            
            // eleccionUser="";
            
        }while(!"c".equals(eleccionUser));
        

    }
}
