package transporte;

// hereda de Autobus e implementa el método abstracto calcularPrecioViaje.
public class AutobusInterurbano extends Autobus {
    
    //Atributo miembro nuevo (solo accesible desde dentro de la clase)
    private int km;
    
//Constructores

    //Constructor clase derivada
     AutobusInterurbano(int id, Conductor conductor, float precioBaseViaje, int km) {     
        super(id, conductor, precioBaseViaje); //Llamada constructor clase base
        this.km = km;
    }

//Métodos de encapsulamiento
     
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
//Método para calcular el precio del viaje en función del número de km
    
    @Override
    float calcularPrecioViaje() {
        float total;
        total = precioBaseViaje * km;
        return total;
    }
}