package examen;

import java.util.ArrayList;
import java.util.Iterator;
/*
Crea una clase ListaElectrodomesticos que tenga como único atributo 
un ArrayList para manejar los electrodomésticos de la tienda
*/
public class ListaElectrodomesticos {

    private ArrayList<Electrodomestico> listaElectro;

    public ListaElectrodomesticos() {
        this.listaElectro = new ArrayList();
    }

    public void setListaElectro(ArrayList<Electrodomestico> listaElectro) {
        this.listaElectro = listaElectro;
    }

    // añade un electrodoméstico a la lista
    // devuelve TRUE O FALSE si se ha conseguido
    public boolean addElectro(Electrodomestico electro) {
        boolean resp = false;
        if (electro!=null)
            resp = listaElectro.add(electro);
        return resp;
    }

    // Muestra nombres y precios
    public void listarElectro() {
        for (Electrodomestico electro : listaElectro) {
            System.out.println("El electrodoméstico " + electro.getNombre() +
                    " tiene el siguiente precio " + electro.precioFinal());;
            System.out.println("");
        }
    }

    // borra un electrodoméstido dado su nombre
    public boolean borrarElectro(String nombre) {
        boolean found = false;
        Electrodomestico electro;
        Iterator<Electrodomestico> it = listaElectro.iterator();
        while (found == false && it.hasNext()) {
            electro = it.next();
            if (electro.getNombre().equalsIgnoreCase(nombre)) {
                found = true;
                listaElectro.remove(electro);
            }
        }
        return found;
    }

    // Muestra todas las Lavadoras de más de 8 kg de carga
    public void listarLavadoras() {
        Lavadora lav;
        for (Electrodomestico electro : listaElectro) {
            if (electro instanceof Lavadora) {
                lav = (Lavadora) electro;
                if (lav.getCarga() > 8) {
                    System.out.println("Nombre lavadora: " + lav.getNombre() +
                            " y su carga es de " + lav.getCarga());
                }
            }
        }
    }
    
    // Muestra todas las Lavadoras de más de 8 kg de carga V.2
    public void listarLavadoras(int tope) {
        Lavadora lav;
        for (Electrodomestico electro : listaElectro) {
            if (electro instanceof Lavadora) {
                lav = (Lavadora) electro;
                if (lav.getCarga() > tope) {
                    System.out.println("Nombre lavadora: " + lav.getNombre() +
                            " y su carga es de " + lav.getCarga());
                }
            }
        }
    }
}
