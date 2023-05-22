package MisListas;

import ADO.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Articulo art = null, enc = null;
        boolean encontrado = false;
        Iterator<Articulo> iterator = listaArt.iterator();
        while (iterator.hasNext() && encontrado == false) {
            art = iterator.next();
            if (art.getCodArt().equalsIgnoreCase(codArt)) {
                enc = art;
                encontrado = true;
            }
        }
        return enc;
    }

    // borrar Vehiculo
    public boolean borrarArticulo(Articulo art) {
        boolean insertado = false;
        if (art != null) {
            insertado = listaArt.remove(art);
        }
        return insertado;
    }

    // borrar Vehiculo
    public boolean borrarArticulo(String codArt) {
        boolean insertado = false;
        Articulo a;
        a = buscaArticulo(codArt);
        if (a != null) {
            insertado = listaArt.remove(a);
        }
        return insertado;
    }

    public boolean modifArticulo(String codArt, String nombre, String fecha, int anyo) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        boolean mod = false;
        Articulo a;
        a = buscaArticulo(codArt);
        if (a != null) {
            a.setNombre(nombre);
            a.setFecha(fecha);
            a.setAnyo(anyo);
            // podríamos poner más campos
            
            /*
            if (a instanceof Coche || v instanceof MicroBus) {
                // pedimos plazas
                do {
                    mod = false;
                    System.out.print("Plazas actuales : " + ((Coche) v).getPlazas() + " Nuevas plazas :");
                    try {
                        pla = Integer.parseInt(teclado.readLine());
                        Milibreria.rango(pla, 1, 6);
                        mod = true;
                    } catch (IOException ex) {
                        System.out.println("Error: introduca las plazas de nuevo ");
                    } catch (NumberFormatException ex) {
                        System.out.println("Error: Solo números !");
                    } catch (ExcepcionesPropias ex) {
                        System.out.println("Error:  rango incorrecto.");
                    }
                } while (!mod);
            }
            if (v instanceof Coche) {
                ((Coche) v).setPlazas(pla);
            }
            if (v instanceof MicroBus) {
                // para metros
                do {
                    mod = false;
                    System.out.print("Metros actuales : " + ((MicroBus) v).getMetros() + " Nuevos metros :");
                    try {
                        metros = Integer.parseInt(teclado.readLine());
                        Milibreria.rango(metros, 1, 30);
                        mod = true;
                    } catch (IOException ex) {
                        System.out.println("Error: Introduzca los metros de nuevo. ");
                    } catch (NumberFormatException ex) {
                        System.out.println("Error: Solo números !");
                    } catch (ExcepcionesPropias ex) {
                        System.out.println("Error: Rango incorrecto.");
                    }
                } while (!mod);
                ((MicroBus) v).setPlazas(pla);
                ((MicroBus) v).setMetros(metros);
            }
            if (v instanceof Camion) {
                // pedimos pma y ruedas
                do {
                    mod = false;
                    System.out.print("PMA actual : " + ((Camion) v).getPma() + " Nuevo PMA : ");
                    try {
                        pma = Integer.parseInt(teclado.readLine());
                        Milibreria.rango(pma, 1000, 30000);
                        mod = true;
                    } catch (IOException ex) {
                        System.out.println("Error: introduca los pma de nuevo. ");
                    } catch (NumberFormatException ex) {
                        System.out.println("Error: Solo números !");
                    } catch (ExcepcionesPropias ex) {
                        System.out.println("Error:  rango incorrecto.");
                    }
                } while (!mod);
                do {
                    mod = false;
                    System.out.print("Ruedas actual : " + ((Camion) v).getNumRuedas() + " Nuevas ruedas :");
                    try {
                        ruedas = Integer.parseInt(teclado.readLine());
                        Milibreria.rango(ruedas, 4, 12);
                        mod = true;
                    } catch (IOException ex) {
                        System.out.println("Error: introduca los ruedas de nuevo. ");
                    } catch (NumberFormatException ex) {
                        System.out.println("Error: Solo números !");
                    } catch (ExcepcionesPropias ex) {
                        System.out.println("Error:  rango incorrecto.");
                    }
                } while (!mod);
                ((Camion) v).setPma(pma);
                ((Camion) v).setNumRuedas(ruedas);
            }*/
        }
        return mod;

    }

    // mostrar todos los precios
    public void mostrarPrecios(int dias) {
        System.out.println("Precio Alquiler: x" + dias + " dias");
        System.out.println("");
        for (Articulo a : listaArt) {
            System.out.println(a.info());
            System.out.println("precio :" + a.precioAlquilerArticulo(dias) + " euros ");
            System.out.println("");
        }
        System.out.println();
    }

    // mostrar todos los precios
    public void mostrarVJAlq() {
        System.out.println("Listado de VideoJuegos ALQUILADOS.");
        if (listaArt != null) {
            for (Articulo a : listaArt) {
                if (a instanceof VideoJuego) {
                    System.out.println(a.info());
                    System.out.println("");
                }
            }
            System.out.println();
        } else {
            System.out.println("No hay video juegos alquilados.");
        }
    }

    //muestra un determinado tipo
    public void muestraTipo(String tipo) {
        Articulo a;
        int cont = 0;//por si no hay nada que mostrar
        Iterator it = listaArt.iterator();
        while (it.hasNext()) {
            a = (Articulo) it.next();
            try {
                if (Class.forName(tipo).isInstance(a)) {
                    a.info();
                    cont++;
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("EEROR de clase no encontrada");;
            }
        }
    }//fin metodo muestraTipo

    public boolean existeArticulo(String codArt) {
        Articulo a = null;
        boolean enc = false;
        Iterator<Articulo> iterator = listaArt.iterator();

        while (enc == false && iterator.hasNext()) {
            a = iterator.next();
            if (a.getCodArt().equalsIgnoreCase(codArt)) {
                enc = true;
            }
        }
        return enc;
    }

    public int numArticulos() {
        int num = 0;
        num = listaArt.size();
        return num;
    }

    // Comprobar si la lista está vacía
    public boolean vaciaLista() {
        boolean vacia = false;
        if (listaArt == null) {
            vacia = true;
        }
        return vacia;
    }

    public boolean vaciarLista() {
        boolean vacia = false;
        if (listaArt == null) {
            vacia = true;
            listaArt.clear();
        }
        return vacia;
    }

    public Articulo getArticulo(int i) {
        Articulo a = null;
        if (i >= 0 && i <= numArticulos() - 1) {
            a = listaArt.get(i);
        }
        return a;
    }

    // mostrar todos los precios
    public void mostrarDatos() {

        for (Articulo art : listaArt) {
            System.out.println(art.info());
            System.out.println("");
        }
        System.out.println();
    }

}
