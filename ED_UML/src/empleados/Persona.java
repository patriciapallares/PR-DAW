package empleados;

public abstract class Persona {
    
    private String nombre;
    private int edad;

    // constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // to-do: setters y getters 
    
    public abstract void mostrar();
    
}
