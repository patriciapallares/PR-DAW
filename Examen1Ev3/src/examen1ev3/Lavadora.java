/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1ev3;

/**
 *
 * @author patgon
 */
public class Lavadora extends Electrodomestico {

    private double carga;

    final double cargaDefecto = 5;

    public Lavadora(String nombre) {
        super(nombre);
        this.carga = cargaDefecto;
    }

    public Lavadora(String nombre, double precioBase, double peso) {
        super(nombre, precioBase, peso);
        this.carga = cargaDefecto;
    }

    public Lavadora(double carga, String nombre, double precioBase, String color, String consumoE, double peso) {
        super(nombre, precioBase, color, consumoE, peso);
        this.carga = carga;
    }

    // setter
    public void setCarga(double carga) {
        this.carga = carga;
    }

    // getter
    public double getCarga() {
        return carga;
    }

    // métodos
    public void mostrar() {

    }

    @Override
    public double precioFinal() {
        double precioInicial = precioInicial();
        double precioFinal = 0;

        if (this.carga > 8) {
            precioFinal = precioInicial + this.precioBase + 35;
        } else {
            precioFinal = precioInicial + this.precioBase;
        }

        return precioFinal;
    }

}
