package APARTADOE;

import APARTADOD.*;

/**
 *
 * @author patriciapallares
 */
public class Persona {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }    
    
    public int getEdad() {
        return edad;
    }    
    
    
    /*
    public void setDni(String dni) {
        this.dni = dni;
    }
    */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }    
    
    public void imprime(){
        System.out.println("DNI: "+ this.dni);
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Edad: "+ this.edad);
    }
    
    public boolean esMayorEdad(int edad){
        return this.edad>=18;
    }
    
    public boolean esJubilado(int edad){
        return this.edad>=65;
    }
    
    public int diferenciaEdad(Persona p){
        return this.edad - p.edad;
    }
}
