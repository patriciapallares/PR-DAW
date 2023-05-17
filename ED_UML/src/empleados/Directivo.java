package empleados;

import java.util.ArrayList;

public class Directivo extends Empleado {

    private String categoria;
    private ArrayList<Empleado> listaSubordinados;

    public Directivo(String categoria, ArrayList<Empleado> listaSubordinados, float sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.listaSubordinados = listaSubordinados;
    }

    // to-do: setters y getters 
    
    @Override
    public void mostrar() {

    }

}
