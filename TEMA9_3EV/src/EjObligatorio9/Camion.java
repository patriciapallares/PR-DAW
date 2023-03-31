package EjObligatorio9;

/**
 *
 * @author patgon
 */
public class Camion extends T_Carga {

    final protected double plusCamion = 40;

    public Camion(double peso, int matricula) {
        super(peso, matricula);
    }
    
    //

    public double getPlusCamion() {
        return plusCamion;
    }

    public double getPeso() {
        return peso;
    }

    public double getPlusPeso() {
        return plusPeso;
    }

    public double getPrecioxdia() {
        return precioxdia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //métodos

    @Override
    public double calcularPrecio(int dias) {
        double precioFinal = 0;
        precioFinal = (precioxdia * dias) + (plusPeso * peso) + plusCamion;
        return precioFinal;
    }

}
