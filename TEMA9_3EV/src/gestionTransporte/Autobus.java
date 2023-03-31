package gestionTransporte;

public abstract class Autobus {

    private int matricula;
    private double precioBase;
    private Conductor conductor;

    public Autobus(int matricula, double precioBase, Conductor conductor) {
        this.matricula = matricula;
        this.precioBase = precioBase;
        this.conductor = conductor;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    //método abstracto
    public abstract double calcularPrecio();

    //método para mostrar el nombre del conductor
    public void mostrarNombreConductor() {
        System.out.println(conductor.getNombre());
    }
}
