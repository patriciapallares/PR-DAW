/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisListas;

import ADO.Autor;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaAutores {
    private ArrayList<Autor> listaAut;

    public ListaAutores() {
        this.listaAut = new ArrayList();
    }

    public ListaAutores(ArrayList<Autor> listaAut) {
        this.listaAut = listaAut;
    }

    // Anadir Articuloyadir Vehiculo
    public boolean anadirAutor(Autor autor) {
        boolean insertado = false;
        if (autor != null) {
            insertado = listaAut.add(autor);
        }
        return insertado;
    }
    
    public Autor buscaAutor(String nomApell) {
        Autor autor = null, enc = null;
        boolean encontrado = false;
        String cadena;
        Iterator<Autor> iterator = listaAut.iterator();
        while (iterator.hasNext() && encontrado == false) {
            autor = iterator.next();
            cadena = autor.getNom()+autor.getApell();
            if (cadena.equalsIgnoreCase(nomApell)) {
                enc = autor;
                encontrado = true;
            }
        }
        return enc;
    }
    
    public int numAutor() {
        int num = 0;
        num = listaAut.size();
        return num;
    }

    // Comprobar si la lista está vacía
    public boolean vaciaLista() {
        boolean vacia = false;
        if (listaAut == null) {
            vacia = true;
        }
        return vacia;
    }

    public boolean vaciarLista() {
        boolean vacia = false;
        if (listaAut == null) {
            vacia = true;
            listaAut.clear();
        }
        return vacia;
    }

    public Autor getAutor(int i) {
        Autor a = null;
        if (i >= 0 && i <= numAutor() - 1) {
            a = listaAut.get(i);
        }
        return a;
    }

    // mostrar todos los precios
    public void mostrarDatos() {

        for (Autor a : listaAut) {
            System.out.println(a.info());
            System.out.println("");
        }
        System.out.println();
    }
}
