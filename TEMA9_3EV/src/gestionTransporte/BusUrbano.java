package gestionTransporte;

public class BusUrbano extends Autobus {

    private String tipoRuta;

    public BusUrbano(String tipoRuta, int matricula, double precioBase, Conductor conductor) {
        super(matricula, precioBase, conductor);
        this.tipoRuta = tipoRuta;
    }

    public String getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(String tipoRuta) {
        this.tipoRuta = tipoRuta;
    }

    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        
        if ("A".equals(this.tipoRuta)) {
            precioFinal = this.getPrecioBase()+(this.getPrecioBase()*0.1);
        }else{
            precioFinal = this.getPrecioBase()+(this.getPrecioBase()*0.2);
        }

        return precioFinal;
    }

}
