package ejercicios9;

public class ej3_9Gato extends ej3_9Mascotas {
    
    private String color;
    private boolean peloLargo;

    public ej3_9Gato(String color, boolean peloLargo, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }
    
    // setters y getters

    public String getColor() {
        return color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    
        // aquí los métodos YA no son abstractos
    public void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNacimiento());
        System.out.println("Color   : " + this.getColor());
        System.out.println("Pelo largo : " + this.isPeloLargo());
    }

    public void habla(){
        System.out.println("guau guau");
    };
    
}
