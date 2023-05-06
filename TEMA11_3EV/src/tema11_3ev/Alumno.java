package tema11_3ev;

/**
 *
 * @author patriciapallares
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private int numNotas;
    private int notas[];
    private float media;

    public Alumno(String nombre, String apellido, int numNotas, int[] notas, float media) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numNotas = numNotas;
        this.notas = notas;
        this.media = media;
    }

    // getters
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumNotas() {
        return numNotas;
    }

    public int[] getNotas() {
        return notas;
    }

    public float getMedia() {
        return media;
    }
    
    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumNotas(int numNotas) {
        this.numNotas = numNotas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Media: " + this.media);
    }
    
    
}
