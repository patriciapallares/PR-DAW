package gestionTransporte;

public abstract class Autobus {
    
    private String matricula;
    private double precioBase;
    private Conductor conductor;

    public Autobus(String matricula, double precioBase, Conductor conductor) {
        this.matricula = matricula;
        this.precioBase = precioBase;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setMatricula(String matricula) {
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
    
}
