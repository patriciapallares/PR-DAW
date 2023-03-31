package EjObligatorio9;

/**
 *
 * @author patgon
 */
public abstract class Vehiculo {

    final protected double precioxdia = 50;
    protected int matricula;

    public Vehiculo(int matricula) {
        this.matricula = matricula;
    }

    public double getPrecioxdia() {
        return precioxdia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // métodos 
    public abstract double calcularPrecio(int dias);

}
