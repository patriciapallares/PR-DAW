package tema4_1ev;

import java.util.Scanner;

/**
 *
 * @author patricia pallarés gonzález
 */
public class Ejercicio_Obligatorio {
    
    public static void main(String[] args){
        
        // variables
        Scanner reader = new Scanner(System.in);
        int d,m,a;
        
        // pedir años
        System.out.println("Introduce los años (ej. 2004): ");
        a = reader.nextInt(); 
        
        // pedir meses
        System.out.println("Introduce los meses (ej. 12): ");
        m = reader.nextInt();
        
        // comprobación valor mes es válido
        if (m>12){
            System.out.println("Error. El mes no puede ser mayor que 12. Introduce un valor válido: ");
            m = reader.nextInt();
        }
        
        // pedir días
        System.out.println("Escribe la fecha. Introduce los días (ej. 16): ");
        d = reader.nextInt();
        
        // comprobación valor días es válido
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d>31 ){
            System.out.println("Error. El valor días no puede ser mayor que 31. Introduce un valor válido: ");
            d = reader.nextInt();
        }else if((m == 4 || m == 6 || m == 9 || m == 11) && d>30){
            System.out.println("Error. El valor días no puede ser mayor que 30. Introduce un valor válido: ");
            d = reader.nextInt();
        }else if((m == 2) && d>28){
            System.out.println("Error. El valor días no puede ser mayor que 28. Introduce un valor válido: ");
            d = reader.nextInt();
        }
        
        // añadimos los 7 días
        d = d + 7;
        
        // comprobación "para pasar al mes siguiente" == (m = m + 1)       
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d>31){
            d = d - 31;
            m = m + 1;
        }else if((m == 4 || m == 6 || m == 9 || m == 11) && d>30){
            d = d - 30;
            m = m + 1;
        }else if((m == 2) && d>28){
            d = d - 28;
            m = m + 1;
        }

        // comprobación "para pasar al año siguiente" == (a = a + 1)
        if(m == 13){
            m = 1;
            a = a + 1;
        }
        
        // mostrar resultado
        System.out.println("En 7 días, la fecha será: "+d+"-"+m+"-"+a+".");
    }
}
