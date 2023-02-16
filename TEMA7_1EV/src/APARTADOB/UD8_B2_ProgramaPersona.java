package APARTADOB;

/**
 *
 * @author patriciapallares
 */
public class UD8_B2_ProgramaPersona {
    
    public static void main(String[] args){
        
        Persona pers1 = new Persona("20D", "José", "Muñoz Albert", 25);
        Persona pers2 = new Persona("21D", "María", "Muñoz Albert", 16);        
        
        String cadena1 = pers1.nombre + " " + pers1.apellidos + " " + " con DNI " + pers1.dni;
        String cadena2 = pers2.nombre + " " + pers2.apellidos + " " + " con DNI " + pers2.dni;
        
        if (pers1.edad >= 18){
            cadena1 += " es mayor de edad.";
        }else{
            cadena1 += " no es mayor de edad.";
        }
        
        if (pers2.edad >= 18){
            cadena2 += " es mayor de edad.";
        }else{
            cadena2 += " no es mayor de edad.";
        }
        
        System.out.println(cadena1);
        System.out.println(cadena2);
        
    }
    
}
