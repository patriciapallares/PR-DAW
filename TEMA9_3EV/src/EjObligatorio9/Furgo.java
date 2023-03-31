package EjObligatorio9;

/**
 *
 * @author patgon
 */
public class Furgo extends T_Carga {

    public Furgo(double peso, int matricula) {
        super(peso, matricula);
    }
    
    //

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
    
    // métodos

    @Override
    public double calcularPrecio(int dias) {
        double precioFinal = 0;
        precioFinal = (precioxdia * dias) + (plusPeso * peso);
        return precioFinal;
    }

}
