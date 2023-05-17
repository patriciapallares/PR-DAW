
package MisListas;

import ADO.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaArticulos {

    private ArrayList<Articulo> listaArt;

    public ListaArticulos() {
        this.listaArt = new ArrayList();
    }

    public ListaArticulos(ArrayList<Articulo> listaArt) {
        this.listaArt = listaArt;
    }

    // Anadir Articuloyadir Vehiculo
    public boolean anadirArticulo(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = listaArt.add(art);
        }
        return insertado;

    }
    //Este metodo devuelve la referencia del Artículo, y le pasamos el codigo del Articulo
    public Articulo buscaArticulo(String codArt) {
        Articulo art = null, enc = null; //se declaran dos instancias de Articulo, una es art que será nulo si no lo hay o enc si lo ha encontrado .
        boolean encontrado = false;
        Iterator<Articulo> iterator = listaArt.iterator(); //Creamos el iterador especifico para la clase Articulo, dado que Iterator es de Object, sino lo tendriamos que castear
//recorremos la lista con Iterator, siempre que no lo hayamos encontrado, es decir que eonctrado==false
        while (iterator.hasNext()&& encontrado == false  ) {
            art = iterator.next(); //linea de codigo para ver el siguiente
            if (art.getCodArt().equalsIgnoreCase(codArt)) { //pedimos el codigo del Articulo, y si es igual que el que le hemos pasado por parametro, entonces encontrado=true
                encontrado = true;
                enc = art; // Este enc es el objeto encontrado, que lo definimos a null en el inicio del método y ahora al encontrarlo lo asignamos a art
            }
        }
        return enc;
    }
    
  

    

    // mostrar todos los precios
    public void mostrarPrecios(int dias) {

        System.out.println("Precio Alquiler: x" + dias + " dias");
        System.out.println("");
        //Lo vemos con un bucle for each, 
        for (Articulo art : listaArt) {
            System.out.println(art.info());
            System.out.println(" precio :" + art.precioAlquilerArticulo(dias) + " euros "); //cada articulo utilizara su propio método de obtener el precio, por el polimorfismo
            System.out.println("");
        }
        System.out.println();
    }

    // mostrar todos los precios
    public void mostrarDatos() {

        for (Articulo art : listaArt) {
            System.out.println(art.info());
            System.out.println("");
        }
        System.out.println();
    }

      public int numArticulos() {
        int num = 0;
        num = listaArt.size();
        return num;
    }

}
