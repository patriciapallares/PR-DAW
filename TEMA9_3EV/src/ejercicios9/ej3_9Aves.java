package ejercicios9;

/**
 *
 * @author patgon
 */
public abstract class ej3_9Aves extends ej3_9Mascotas {
    
    private String pico;
    private boolean vuela;

    public ej3_9Aves(String pico, boolean vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public String getPico() {
        return pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
    
    
    public abstract void volar();

    @Override
    public abstract void muestra();    
    
    @Override
    public abstract void habla();    
}
