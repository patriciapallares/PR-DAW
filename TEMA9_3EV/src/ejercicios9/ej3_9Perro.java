package ejercicios9;

public class ej3_9Perro extends ej3_9Mascotas {

    private String raza;
    private boolean pulgas;

    public ej3_9Perro(String raza, boolean pulgas, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }
    
    
    // aquí los métodos YA no son abstractos
    public void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNacimiento());
        System.out.println("Raza   : " + this.getRaza());
        System.out.println("Pulgas : " + this.isPulgas());
    }

    public void habla(){
        System.out.println("guau guau");
    };

}
