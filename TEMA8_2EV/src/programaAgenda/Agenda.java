package programaAgenda;

/**
 *
 * @author patriciapallares
 */
public class Agenda {

    // conjunto de contactos = ARRAY
    // no dar valor aquí, sino en el constructor
    private Contacto[] contactos;

    // por defecto
    public Agenda() {
        this.contactos = new Contacto[10];

    }

    // pasando una longitud
    public Agenda(int longitud) {
        this.contactos = new Contacto[longitud];

    }

    public void anyadirContacto(Contacto c) {

        // usamos un método dentro de este método
        if (existeContacto(c)) {
            System.out.println("Ya existe este contacto.");
        } else if (agendaLlena()) {
            System.out.println("La agenda está llena.");
        } else {
            boolean anyadido = false;
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    anyadido = true;
                    // Importantísimo para que no haga 10 veces lo mismo wtf
                    break;
                }

            }

            if (anyadido) {
                System.out.println("Contacto añadido.");
            } else {
                System.out.println("No se ha podido añadir.");
            }
        }
    }

    // devuelve true si existe un contacto en el array con el mismo nombre
    public boolean existeContacto(Contacto c) {
        for (int i = 0; i < contactos.length; i++) {
            // ojo, diferente al min 13
            if (contactos[i] != null && c.getNombre().equals(contactos[i].getNombre())) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null) {
                System.out.println("Contacto{ " + " Nombre= " + contactos[i].getNombre() + ", telf=" + contactos[i].getTelf() + "}");
            }
        }
    }

    public void buscarContacto(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Su teléfono es: " + contactos[i].getTelf());
                encontrado = true;
            }
        }

        // es bueno decirle algo al usuario
        if (!encontrado) {
            System.out.println("Ningún contacto coincide con el nombre.");
        }

    }

    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }

        return true;
    }

    // TODO Preguntar si borramos por nombre o por contacto D:
    public void eliminarContacto(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            System.out.println("¿SERÁ TRUE? " + contactos[i].getNombre().equals(nombre));
            //  // contactos[i].equals(c)
            if (contactos[i] != null && contactos[i].getNombre().equals(nombre)) {
                contactos[i] = null;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Se ha eliminado el contacto correctamente.");
        } else {
            System.out.println("No se ha podido eliminar el contacto.");
        }
    }

    public int huecosLibres() {

        int acHuecos = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                acHuecos++;
            }
        }
        return acHuecos;
    }
}
