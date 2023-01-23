package ejercicioobligatorio6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author patgon
 */
public class EjercicioObligatorio6 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);  
        int N=0, alumnos=3;
        
        // vector con los nombres de los estudiante
        String arrayNombres[] = new String[alumnos];
        
        String posiblesResp[] = {"A","B","C","D","E"};
        
        String basura = "";
               
        System.out.println("Corrección de exámenes.");
       
        // rellenar los nombres de los alumnos
        for (int i = 0; i < arrayNombres.length; i++) {
            arrayNombres[i]=rellenarNombres((i+1));
        }
       
        // control de entrada nº de preguntas
        do{
            System.out.println("¿Cuántas preguntas tenía el examen?");
            N = reader.nextInt();
            basura = reader.nextLine();
        }while(N<=0);
        
        // vector con las respuestas correctas a las preguntas
        String arrayRespCorrectas[] = new String[N];

        // rellenar las respuestas correctas.       
        for (int i = 0; i < arrayRespCorrectas.length; i++) {
            arrayRespCorrectas[i] = rellenarRespCorrectas((i+1));
        }
        
        // System.out.println("El array generado es: " + Arrays.toString(arrayRespCorrectas));
        
        // matriz para guardar las respuestas a las preguntas del examen una 
        // fila por alumno y una columna por pregunta.
        String arrayRespuestasAlumnos[][] = new String[alumnos][N];
        
        // rellenar las respuestas de los alumnos.
        for (int x=0; x < arrayRespuestasAlumnos.length; x++) {
                
            for (int y=0; y < arrayRespuestasAlumnos[x].length; y++) {

                boolean condicion = true; 
                String resp = "";
                
                // control entrada respuestas de estudiantes válidas
                do {
                    System.out.println("Introduzca la "+(y+1)+"ª respuesta de " + arrayNombres[x] +" (valores entre A y E):");
                    resp = reader.nextLine().toUpperCase();

                    for (int i = 0; i < posiblesResp.length; i++) {
                        if(resp.equals(posiblesResp[i])){
                        condicion = false;
                        } 
                    }
                } while(condicion);
                
                arrayRespuestasAlumnos[x][y] = resp;
            }              
        }
        
        // VER RESP ALUMNOS
        for (int x=0; x < arrayRespuestasAlumnos.length; x++) {
                
                for (int y=0; y < arrayRespuestasAlumnos[x].length; y++) { 
                    // numeros[x].length es la longitud de la columna
                    System.out.print(arrayRespuestasAlumnos[x][y]+" ");
                    //System.out.println ("[" + x + "," + y + "] = " + numeros[x][y]);
                }
                System.out.println("");
                
            }
        
        //
        //
        //
        
        int opcion = 0, correctas=0;
        
        int arrayCorrectas[] = new int[alumnos];
        float nota = 0;
        
        System.out.println("Menú:");
        System.out.println("   • Opción 1 Notas: Muestra la nota obtenida de cada estudiante.\n" +
                            "   Esta nota corresponde al número de aciertos que tuvo el estudiante.\n" +
                            "   • Opción 2 Media: Muestra la media de aciertos de los 8 alumnos.\n" +
                            "   • Opción 3 Nota Alumno: dado un nombre de un alumno, muestra su nota.\n" +
                            "   • Opción 4 Pregunta: Muestra el número de la pregunta más acertada.\n");
        
        do {
            System.out.println("Introduce el número de la opción (valores entre 1 y 4):");
            opcion = reader.nextInt();
        }while(opcion<=0||opcion>4);

        if(opcion == 1){
            // Muestra la nota obtenida de cada estudiante. Esta nota 
            // corresponde al número de aciertos que tuvo el estudiante.
            
            for (int x=0; x < arrayRespuestasAlumnos.length; x++) {

                for (int y=0; y < arrayRespuestasAlumnos[x].length; y++) {
                    
                    if(arrayRespuestasAlumnos[x][y].equals(arrayRespCorrectas[x])){
                        System.out.println("resp alum "+arrayRespuestasAlumnos[x][y]);
                        System.out.println("resp correc "+arrayRespCorrectas[x]);
                        correctas++;
                        System.out.println("Correctas = "+ correctas );
                    }
                    
                arrayCorrectas[y] = correctas;
                }
                
                correctas=0;                    
                    
            }
            
            System.out.println("El array generado es: " + Arrays.toString(arrayCorrectas));
            /*
            for (int i = 0; i < arrayCorrectas.length; i++) {
                if(arrayCorrectas[i]==0){
                    System.out.println("Alumnx " + arrayNombres[i]);
                    nota = 0;
                    System.out.println("Nota: "+ nota);
                }else{
                    System.out.println("Alumnx " + arrayNombres[i]);
                    nota = arrayCorrectas[i]/N*10;
                    System.out.println("Nota: "+ nota);
                }
            }*/
        }else if(opcion == 2){
            // Muestra la media de aciertos de los 8 alumnos.
        }else if(opcion == 3){
            // Nota Alumno: dado un nombre de un alumno, muestra su nota.
        }else if(opcion == 4){
            // Pregunta: Muestra el número de la pregunta más acertada.
        }
    }
    
    // métodos
    
    // 1. Método para rellenar los nombres de los alumnos.
    
    public static String rellenarNombres(int a){
        System.out.println("Introduce el nombre del alumno "+a+":");
        Scanner reader = new Scanner(System.in);  
        
        return reader.nextLine();
    }
    
    // 2. Método para rellenar las respuestas correctas.
    public static String rellenarRespCorrectas(int a){
        String posiblesResp[] = {"A","B","C","D","E"};        
        boolean condicion = true; 
        String resp = "";
        
        do {
            System.out.println("Introduce la "+a+"ª respuesta correcta (valores entre A y E):");
            Scanner reader = new Scanner(System.in);
            resp = reader.nextLine().toUpperCase();
            
            // control entrada respuestas correctas válidas
            for (int i = 0; i < posiblesResp.length; i++) {
                  if(resp.equals(posiblesResp[i])){
                  condicion = false;
              }   
            }
            
        } while(condicion);
        System.out.println("Resp = " + resp);
        return resp;
    }
    

    
    
    /*

        4. Método que devuelve la nota de un alumno.
        5. Método que devuelve la media.
        6. Método que devuelve en número de pregunta más acertada.
        7. Método para leer la respuesta a una pregunta.
    
    */
    
    
    
}
