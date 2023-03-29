package ejercicios9.VEHÍCULOS;

public class Terrestre extends Vehiculo{
    
    private final int numRuedas;

    public Terrestre(int numRuedas, String modelo, String matricula) {
        super(modelo, matricula);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
      
    @Override
    public void imprimir(){
        
    };
}
