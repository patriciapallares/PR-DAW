package empleados;

public class Cliente extends Persona {

    private int telefono_de_contacto;

    public Cliente(int telefono_de_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    @Override
    public void mostrar() {

    }
}
