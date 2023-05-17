package ejercicioObligatorio7;

import java.util.Scanner;

/**
 *
 * @author patriciapallares
 */

public class ejercicioObligatorio7 {
    
        public static void main(String[] args){
        int opcion;
        String numeroContrato, potencia;
        double kWConsumidos, importe, kWacumulados=0;
        double incremento;
        Scanner reader = new Scanner(System.in);
        
        
        do{
            System.out.println("Menú");
            System.out.println("0-Termina el programa.");
            System.out.println("1-Informe de un nuevo cliente.");
            opcion = reader.nextInt();

            if(opcion == 1){
                
                numeroContrato = pideNumContrato();
        
                potencia = pidePotencia();

                kWConsumidos = pidekWConsumidos();

                kWacumulados += kWConsumidos;

                importe = calculaImporte(kWConsumidos, potencia);

                incremento = calculaIncremento(kWConsumidos, importe);

                    System.out.println("- - - - - -"+
                            "\nInforme:"+
                            "\nNum contrato: " + numeroContrato+
                            "\nTotal kW: "+ kWConsumidos+
                            "\nPotencia contratada: " + potencia+
                            "\nImporte a pagar: " + importe+
                            "\nIncremento según tramo: "+ incremento+
                            "\nTotal kW de todos los clientes facturado: "+ kWacumulados+
                            "\n- - - - - -");
                    }
                }
        while(opcion!=0);
    }
        
// Un método para pedir el número de contrato (validando posibles errores).
        
    public static String pideNumContrato(){
        String numero;
        Scanner reader = new Scanner(System.in);
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

    public static String pidePotencia(){
        Scanner reader = new Scanner(System.in);
        String potencia = "0";
        
        do{
        System.out.println("Introduce una potencia válida: ej: 4,60");
        potencia = reader.nextLine();
        }while(!"3,45".equals(potencia) && !"4,60".equals(potencia) && !"5,75".equals(potencia) && !"6,90".equals(potencia) && !"8,05".equals(potencia));
        
        return potencia;
    }
    
// Un método para pedir los kW consumidos FALTA / TODO (validando posibles errores).
    
    public static double pidekWConsumidos(){
        Scanner reader = new Scanner(System.in);
        double kWConsumidos;
        
        do{
        System.out.println("Introduce kw consumidos válidos:");
        kWConsumidos = reader.nextDouble();
        }while(kWConsumidos<0);
        
        return kWConsumidos;
    }
    
// Un método para calcular el importe según los kW consumidos y la potencia contratada.
    
    public static double calculaImporte(double kWConsumidos, String potencia){
        double importe;
        double kwh = (double) 0.1684;
        
        importe = kWConsumidos * kwh;
        
        if( null != potencia)switch (potencia) {
                case "3,45" -> importe += 10.23;
                case "4,60" -> importe += 14.45;
                case "5,75" -> importe += 18.69;
                case "6,90" -> importe += 21.34;
                case "8,05" -> importe += 25.99;
                default -> {
            }
            }
        
        return importe;
    }    

// Un método para calcular el incremento.
    
    public static double calculaIncremento(double kWConsumidos, double importe){
        double incremento = 0 ;
        double opcion1 =  (double) 0, opcion2 =  (double) 0.05, opcion3 =  (double) 0.08, opcion4 =  (double) 0.12;
        
        if(kWConsumidos>0 && kWConsumidos<150){
            incremento = importe*opcion1; 
        }else if(kWConsumidos>151 && kWConsumidos<300){
            incremento = importe*opcion2;            
        }else if(kWConsumidos>301 && kWConsumidos<400){
            incremento = importe*opcion3; 
        }else{
            incremento = importe*opcion4;             
        }
        
        return incremento;
    }  
}
