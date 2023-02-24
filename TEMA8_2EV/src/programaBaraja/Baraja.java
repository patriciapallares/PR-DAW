package programaBaraja;

/**
 *
 * @author patriciapallares
 */
public class Baraja {

    private Carta[] cartas;

    public Baraja() {
        this.cartas = new Carta[40];
    }

    public void crearBaraja() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String palos[] = {"espadas", "bastos", "oros", "copas"};
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {
                Carta c;
                c = new Carta((nums[j]), (palos[i]));
                cartas[j + 10 * i] = c;
                /*
                cartas[j+10*i].setNumero(nums[j]);
                cartas[j].setPalo(palos[i]);
                 */
            }
        }

    }

    public void listarBaraja() {
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] != null) {
                System.out.println("Carta número " + cartas[i].getNumero() + " de palo " + cartas[i].getPalo());
            }
        }
    }

    // métodos
    /*

    • barajar: cambia de posición todas las cartas aleatoriamente
    • siguienteCarta: devuelve la siguiente carta que está en la baraja, cuando no 
        haya más o se haya llegado al final, se indica al usuario que no hay más 
        cartas.
    • cartasDisponibles: indica el número de cartas que aún puede repartir
    • darCartas: dado un número de cartas que nos pidan, le devolveremos ese número 
        de cartas (piensa que puedes devolver). En caso de que haya menos cartas que
        las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
    • cartasMonton: mostramos aquellas cartas que ya han salido, si no ha salido 
        ninguna indicárselo al usuario
    • mostrarBaraja: muestra todas las cartas hasta el final. Es decir, si se saca 
        una carta y luego se llama al método, este no mostrara esa primera carta.

     */
}
