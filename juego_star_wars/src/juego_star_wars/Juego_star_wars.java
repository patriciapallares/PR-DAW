package juego_star_wars;

/**
 *
 * @author patgon
 */

import java.util.Scanner;

public class Juego_star_wars {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        int respNivel1 = 0, resultadoNivel1 = 0;
        int respNivel2 = 0, resultadoNivel2 = 1;
        int respNivel3, resultadoNivel3;
        int respNivel4, resultadoNivel4;
        
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n" +
                            "Hace mucho tiempo, en una galaxia muy, muy lejana\n" +
                            "... La Princesa Leia, Luke\n" +
                            "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
                            "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
                            "está construyendo para destruirla. (Presiona Intro para continuar");
        
        String enterkey = reader.nextLine();
        
        if (enterkey.isEmpty()) {
            // Nivel 1
            
            // int aleatorio entre 0 y 10
            int S1 = (int) (Math.random() * (10+1)); 
            
            // int aleatorio entre 20 y 30
            int S2 = (int) (20 + Math.random() * (30-20+1));
                        
            
            System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
                                "sistema "+S1+" en el sector "+S2+", pero el sistema de navegación está estropeado y el\n" +
                                "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
                                "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
                                "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
                                "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
                                "¿Qué debe introducir?");
            
            for(int i = S1; i <= S2; i++){
                resultadoNivel1 += i;
            }
            
            System.out.println("Resultado nivel 1: "+ resultadoNivel1);
            
            System.out.println("Introduce la respuesta: ");
            respNivel1 = reader.nextInt();
            
            if(respNivel1 == resultadoNivel1){
                // Nivel 2
                
                // int aleatorio entre 1 y 7
                int P1 = (int) (1 + Math.random() * (7+1)); 
            
                // int aleatorio entre 20 y 30
                int P2 = (int) (8 + Math.random() * (12-8+1));
                
                System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                                    "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                                    "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
                                    "agente de espaciopuerto "+P1+" contactando con nave imperial "+P2+". No están destinados\n" +
                                    "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n" +
                                    "“Eh...\n" +
                                    "tenemos un fallo en el...\n" +
                                    "eh...\n" +
                                    "condensador de flujo... Solicitamos permiso\n" +
                                    "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
                                    "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
                                    "manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
                                    "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                                    "¿Cuál es el código?");
            
                //int respNivel2 = 0, resultadoNivel2 = 0;
                for(int i = P1; i <= P2; i++){
                    resultadoNivel2 = resultadoNivel2 * i;
                }
                
                System.out.println("Resultado nivel 2: " + resultadoNivel2);
            
                System.out.println("Introduce la respuesta: ");
                respNivel2 = reader.nextInt();
            
                if(resultadoNivel2 == respNivel2){
                    //Nivel 3
                    
                    //N: Número entero aleatorio entre 50 y 100
                    int N = (int) (50 + Math.random() * (100-50+1));
                    int Nredondeado = (int) Math.floor(N/10), factorial=1;
                                       
                    System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
                                        "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
                                        "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los "+N+" existentes se\n" +
                                        "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
                                        "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
                                        "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
                                        "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de "+N+"/10\n" +
                                        "(redondeando "+N+" hacia abajo), donde "+N+" es el nº de niveles”.\n" +
                                        "¿Cual es el nivel correcto?");
                    
                    for(int i=1;i<=Nredondeado;i++){
                        factorial = factorial * i;
                    }
                    
                    resultadoNivel3 = factorial;
                    System.out.println("Resultado nivel 3: " + resultadoNivel3);
                    
                    System.out.println("Introduce la respuesta: ");
                    respNivel3 = reader.nextInt();
                    
                    if(respNivel3 == resultadoNivel3){
                        // Nivel 4
                        
                        // P: Número entero aleatorio entre 10 y 100
                        int P = (int) (10 + Math.random() * (100-10+1)), accNums = 0;
                        int isPrimo = 1;
                        
                        System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
                                            "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
                                            "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
                                            "verificar si el número "+P+" es primo o no. Si es primo introduce un 1, si no lo es\n" +
                                            "introduce un 0.");
                        
                        if(P == 0 || P == 1 || P == 4){
                            isPrimo = 0;
                        }
                        
                        for(int i=2; i<(P/2); i++) {
                            if(P%i == 0){
                                accNums++;
                            }
                        }
        
                        if(accNums != 0){
                            isPrimo = 0;
                        }
                        
                    resultadoNivel4 = isPrimo;
                    System.out.println("Resultado nivel 4: " + resultadoNivel4);
                    
                    System.out.println("Introduce la respuesta: ");
                    respNivel4 = reader.nextInt();   
                    
                    if(resultadoNivel4 == respNivel4){
                        
                    }else{
                         // Perder
                    }
                        
                        
                    }else{
                        // Perder
                    }
                    
                }else{
                    // Perder
                }
                
            }else{
                // Perder
            }
            
        }
    }
    
}
