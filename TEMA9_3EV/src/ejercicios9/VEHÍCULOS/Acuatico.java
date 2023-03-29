
package ejercicios9.VEHÍCULOS;

public class Acuatico extends Vehiculo{
    
    private final double eslora;

    public Acuatico(double eslora, String modelo, String matricula) {
        super(modelo, matricula);
        this.eslora = eslora;
    }

    public double getEslora() {
        return eslora;
    }
   
    @Override
    public void imprimir(){
        
    };
}
