package ejercicioObligatorio7;

import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ejercicioObligatorio7 {
    
        public static void main(String[] args){
            
        String numeroContrato;
        float kWConsumidos, potencia;
        
        numeroContrato = pideNumContrato();
        
        potencia = pidePotencia();
         
        kWConsumidos = pidekWConsumidos();
        
                 System.out.println("Es = " + numeroContrato+" y "+potencia+" es "+kWConsumidos+" kw");
                 
                 
        // Se debe solicitar:    
            /*
            Su número de contrato, con siguiente formato (ddd-dddd) donde d es 
            un número, por ejemplo (234-5241).
            Potencia contratada.
            El total de kW consumidos en el mes.
            */
        
        // Se devuelve
        
            /*
            Informe con los siguientes datos por cliente:
            Núm contrato
            Total kW
            Potencia
            Incremento Precio a pagar
            Total kW (todos los clientes) Facturado.
            */
        
    }
        
// Un método para pedir el número de contrato (validando posibles errores).
        
    public static String pideNumContrato(){
        String numero;
        Scanner reader = new Scanner(System.in);
        // (ddd-dddd)
        boolean validacion = false;
        
        do{
        do{
        System.out.println("Introduce un número de contrato válido:");
        numero = reader.nextLine();
        
        }while(numero.length()<8 && numero.charAt(3)!='-');

        for (int i = 0; i < 8; i++) {
            validacion = false;
            if(i != 3){
                if(numero.charAt(i)!='1' && numero.charAt(i)!='2' && numero.charAt(i)!='3' && numero.charAt(i)!='4' && numero.charAt(i)!='5' && numero.charAt(i)!='6' && numero.charAt(i)!='7' && numero.charAt(i)!='8' && numero.charAt(i)!='9' && numero.charAt(i)!='0'){
                    validacion = true;
                }
            }
        }
        
        }while(validacion);

        return numero;
    } 
    
// Un método para pedir la potencia contratada  FALTA / TODO (validando posibles errores).

    public static float pidePotencia(){
        Scanner reader = new Scanner(System.in);
        float potencia;
        System.out.println("Introduce una potencia válida:");
        potencia = reader.nextFloat();
        
        return potencia;
    }
    
// Un método para pedir los kW consumidos FALTA / TODO (validando posibles errores).
    
    public static float pidekWConsumidos(){
        Scanner reader = new Scanner(System.in);
        float kWConsumidos;
        System.out.println("Introduce kw consumidos válidos:");
        kWConsumidos = reader.nextFloat();
        
        return kWConsumidos;
    }
    
// FALTA / TODO Un método para calcular el importe según los kW consumidos y la potencia contratada.
    
    public static float calculaImporte(){
        float kWConsumidos = 0;
        
        return kWConsumidos;
    }    


// FALTA / TODO Un método para calcular el incremento.
    
    public static float calculaIncremento(){
        float kWConsumidos = 0;
        
        return kWConsumidos;
    } 
        
        
}
