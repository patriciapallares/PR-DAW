package EjObligatorio9;

/**
 *
 * @author patgon
 */
public abstract class T_Personas extends Vehiculo {

    protected int plazas;
    final protected double plusDiario = 1.50;

    public T_Personas(int plazas, int matricula) {
        super(matricula);
        this.plazas = plazas;
    }

    public int getPlaza() {
        return plazas;
    }

    public void setPlaza(int plaza) {
        this.plazas = plazas;
    }
    // métodos 

    public abstract double calcularPrecio(int dias);
}
