package examen1ev;


import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class Ejercicio2 {
   public static void main(String[] args){
        // Repetir hasta que el user decida terminar
        
        Scanner reader = new Scanner(System.in);
        
        int hh=00, mm=00;
        String pais="", dia="", eleccionUser="";
        
        System.out.println("Diferencia horaria entre Japón y España");
            
        do {
            System.out.println("Ejecutar pulsando e. Salir pulsando cualquier otra tecla");
            eleccionUser = reader.nextLine();
            
            
            do {
            System.out.println("Introduce el país. (España - Japón): ");
            pais = reader.nextLine();
            } while(!"Japón".equals(pais) && !"España".equals(pais));


            do { 
            System.out.println("Introduce las horas (formato 00-23): ");
            hh = reader.nextInt();
            } while(hh<00 || hh>23);

            do {
            System.out.println("Introduce los minutos (formato 00-59): ");
            mm = reader.nextInt();
            } while(mm<00 || mm>59);

            do{System.out.println("Introduce el día de la semana (en minúsculas): ");
            dia = reader.nextLine();
            dia = reader.nextLine();
            }while(!"lunes".equals(dia) && !"martes".equals(dia) && !"miércoles".equals(dia) && !"jueves".equals(dia) && !"viernes".equals(dia) && !"sábado".equals(dia) && !"domingo".equals(dia));

            System.out.println("Su consulta: " + pais + " " + hh + ":" + mm + " " + dia);

            if("España".equals(pais)){
                // actualizamos el país
                // actualizamos las horas
                    // actualizamos el día si corresponde

                pais = "Japón";
                hh += 8;

                if(hh>24){
                    hh -= 24;

                    switch (dia) {
                        case "lunes" -> dia = "martes";
                        case "martes" -> dia = "miércoles";
                        case "miércoles" -> dia = "jueves";
                        case "jueves" -> dia = "viernes";
                        case "viernes" -> dia = "sábado";
                        case "sábado" -> dia = "domingo";
                        case "domingo" -> dia = "lunes";
                        default -> {
                        }
                    }
                }

                System.out.println("Respuesta: " + pais + " " + hh + ":" + mm + " " + dia);
            }else if("Japón".equals(pais)){
                pais = "España";
                hh -= 8;

                if(hh<24){
                    hh += 24;

                    if(hh>24){
                        hh -= 24;

                        switch (dia) {
                            case "lunes" -> dia = "martes";
                            case "martes" -> dia = "miércoles";
                            case "miércoles" -> dia = "jueves";
                            case "jueves" -> dia = "viernes";
                            case "viernes" -> dia = "sábado";
                            case "sábado" -> dia = "domingo";
                            case "domingo" -> dia = "lunes";
                            default -> {
                            }
                        }
                    }
                }
                System.out.println("Respuesta: " + pais + " " + hh + ":" + mm + " " + dia);                  
            }
            
            eleccionUser= "";
            
        }while("e".equals(eleccionUser));
            
        }
    }
