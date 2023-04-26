/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

// hereda de Autobus e implementa el método abstracto calcularPrecioViaje.
public class AutobusUrbano extends Autobus {
    
    //Atributo miembro nuevo (solo accesible desde dentro de la clase)
    private String ruta;
    
//Constructores

    //Constructor clase derivada
     AutobusUrbano(int id, Conductor conductor, float precioBaseViaje, String ruta) {
        super(id, conductor, precioBaseViaje); //Llamada constructor clase base
        this.ruta = ruta;
    }

//Métodos de encapsulamiento
     
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
//Método para calcular el precio del viaje en función del tipo de ruta
    
    @Override
    float calcularPrecioViaje() {
        
        float total;
        
        if(ruta.equalsIgnoreCase("a")) {
            total = precioBaseViaje + ((float) 0.10 * precioBaseViaje);
        }
        else {
            total = precioBaseViaje + ((float) 0.20 * precioBaseViaje);
        }
        
        return total;
    }
}