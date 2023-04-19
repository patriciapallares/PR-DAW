package tema10_3ev;

/**
 *
 * @author patgon
 */
public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        Exception exNombre = new Exception("NombreDemasiadoCortoInvalido");
        Exception exEdad = new Exception("EdadNegativaInvalido");

        if (nombre.length() < 3) {
            throw exNombre;
        } else {
            this.nombre = nombre;
        }

        if (edad < 0) {
            throw exEdad;
        } else {
            this.edad = edad;
        }
    }

    //
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //
    public void setNombre(String nombre) throws Exception {
        Exception exNombre = new Exception("NombreDemasiadoCortoInvalido");

        if (nombre.length() < 3) {
            throw exNombre;
        } else {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) throws Exception {
        Exception exEdad = new Exception("EdadNegativaInvalido");
        
        if (edad < 0) {
            throw exEdad;
        } else {
            this.edad = edad;
        }
    }

    public void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
    }
}
