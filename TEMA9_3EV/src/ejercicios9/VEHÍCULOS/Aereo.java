package ejercicios9.VEHÍCULOS;

public class Aereo extends Vehiculo{
    
    private final int asientos;

    public Aereo(int asientos, String modelo, String matricula) {
        super(modelo, matricula);
        this.asientos = asientos;
    }

    public int getAsientos() {
        return asientos;
    }
   
    @Override
    public void imprimir(){
        
    };
}
