package EjObligatorio9;

/**
 *
 * @author patgon
 */
public class Microbus extends T_Personas {

    final protected double plusxplaza = 2;

    public Microbus(int plazas, int matricula) {
        super(plazas, matricula);
    }

    // 

    public double getPlusxplaza() {
        return plusxplaza;
    }

    public int getPlazas() {
        return plazas;
    }

    public double getPlusDiario() {
        return plusDiario;
    }

    public double getPrecioxdia() {
        return precioxdia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    // métodos
    
    @Override
    public double calcularPrecio(int dias) {
        double precioFinal = 0;
        precioFinal = (precioxdia * dias) + (plusDiario * dias * plazas) + (plusxplaza * plazas);
        return precioFinal;
    }

}
