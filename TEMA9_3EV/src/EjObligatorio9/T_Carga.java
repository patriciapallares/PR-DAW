package EjObligatorio9;

/**
 *
 * @author patgon
 */
public abstract class T_Carga extends Vehiculo {

    protected double peso;
    final protected double plusPeso = 20;

    public T_Carga(double peso, int matricula) {
        super(matricula);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // métodos 
    public abstract double calcularPrecio(int dias);
}
