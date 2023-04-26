package transporte;

public class Conductor {
    
    //Atributos miembros (solo accesibles desde dentro de la clase)
    private String nombre;
    private float salario;
    
//Constructores
    
    //Constructor con todos los valores iniciales por defecto
    public Conductor() {
        nombre = null;
        salario = 0;
    }

    //Constructor con todos los valores recibidos como parámetros
    public Conductor(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
//Métodos de encapsulamiento

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}