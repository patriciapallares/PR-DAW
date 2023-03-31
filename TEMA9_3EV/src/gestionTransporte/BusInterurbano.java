package gestionTransporte;

public class BusInterurbano extends Autobus {

    private double numKm;

    public BusInterurbano(double numKm,  int matricula, double precioBase, Conductor conductor) {
        super(matricula, precioBase, conductor);
        this.numKm = numKm;
    }

    public double getNumKm() {
        return numKm;
    }

    public void setNumKm(double numKm) {
        this.numKm = numKm;
    }

    @Override
    public double calcularPrecio() {
        double precioFinal = 0;

        precioFinal = this.getPrecioBase() * this.numKm;

        return precioFinal;
    }

}
