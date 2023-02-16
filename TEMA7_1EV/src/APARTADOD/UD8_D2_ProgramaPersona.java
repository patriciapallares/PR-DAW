package APARTADOD;

/**
 *
 * @author patriciapallares
 */
public class UD8_D2_ProgramaPersona {
    
    public static void main(String[] args){
        
        Persona pers1 = new Persona("20D", "José", "Muñoz Albert", 25);
        Persona pers2 = new Persona("21D", "María", "Muñoz Albert", 16);        
        
        String cadena1 = pers1.getNombre() + " " + pers1.getApellidos() + " " + " con DNI " + pers1.getDni();
        String cadena2 = pers2.getNombre() + " " + pers2.getApellidos() + " " + " con DNI " + pers2.getDni();
        
        if (pers1.getEdad() >= 18){
            cadena1 += " es mayor de edad.";
        }else{
            cadena1 += " no es mayor de edad.";
        }
        
        if (pers2.getEdad() >= 18){
            cadena2 += " es mayor de edad.";
        }else{
            cadena2 += " no es mayor de edad.";
        }
        
        System.out.println(cadena1);
        System.out.println(cadena2);
        
    }
    
}
