package empleados;

public class Empleado extends Persona {

    private float sueldo_bruto;

    public Empleado(float sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    // to-do: setters y getters 
    
    @Override
    public void mostrar() {

    }

    public void calcular_salario_neto() {

    }

}
