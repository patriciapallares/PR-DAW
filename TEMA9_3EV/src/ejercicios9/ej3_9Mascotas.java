package ejercicios9;

/**
 *
 * @author patgon
 */
public abstract class ej3_9Mascotas {

    private String nombre;
    private int edad;
    private String estado;
    private String fechaNacimiento;

    public ej3_9Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // métodos abs
    public abstract void muestra();

    public abstract void habla();
    
    // métodos

    public void morir(){
        this.estado = "Muerto";
    };

    public void cumpleaños() {
        this.edad = edad + 1;
    }
}
