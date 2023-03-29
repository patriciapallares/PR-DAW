package com.patricia.practicajunit;

public class TablaEnteros {

    private Integer[] tabla;

    TablaEnteros(Integer[] tabla) {
        if (tabla == null || tabla.length == 0) {
            throw new IllegalArgumentException("No hay elementos");
        }
        this.tabla = tabla;
    }

    public int sumaTabla() {
        int suma = 0;
        for (int i = 0; i < tabla.length; i++) {
            suma += tabla[i];
        }
        return suma;
    }

    public int mayorTabla() {
        int max = -999;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > max) {
                max = tabla[i];
            }
        }
        return max;
    }

    public int posicionTabla(int n) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == n) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException("No existe: " + n);
    }
}
