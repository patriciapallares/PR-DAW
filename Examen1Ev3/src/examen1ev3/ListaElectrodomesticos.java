package examen1ev3;

import java.util.ArrayList;

/**
 *
 * @author patgon
 */
public class ListaElectrodomesticos {

    private ArrayList<Electrodomestico> listaElectro;

    // constructor
    public ListaElectrodomesticos() {
        this.listaElectro = new ArrayList<Electrodomestico>();
    }

    // getter
    public ArrayList<Electrodomestico> getListaElectro() {
        return listaElectro;
    }

    // setter
    public void setListaElectro(ArrayList<Electrodomestico> listaElectro) {
        this.listaElectro = listaElectro;
    }

    // métodos
    public void afegirElectro(Electrodomestico electro) {
        listaElectro.add(electro);
    }

    public void mostrarElectros() {
        for (int i = 0; i < listaElectro.size(); i++) {
            System.out.println((i + 1) + ". Nombre: " + listaElectro.get(i).getNombre() + ". Precio: " + listaElectro.get(i).precioFinal());
            // listaVehiculos.get(i)
        }
    }

    public void borrarElectro(String nombre) {

        for (int i = 0; i < listaElectro.size(); i++) {
            if (listaElectro.get(i).getNombre().equals(nombre)) {
                listaElectro.remove(i);
            }
        }

    }
    /*
    public void mostrarLavadorasPesadas() {
        for (int i = 0; i < listaElectro.size(); i++) {
            if (listaElectro.get(i).carga > 8) {
                System.out.println((i + 1) + ". Nombre: " + listaElectro.get(i).getNombre());
            }
        }
     */
}
