package programaBaraja;

/**
 *
 * @author patriciapallares
 */
public class Baraja {

    private Carta[] cartas;
    private int posicionSiguienteCarta;

    public static final int NUM_CARTAS = 40;

    public Baraja() {

        this.posicionSiguienteCarta = 0;
        this.cartas = new Carta[NUM_CARTAS];
        crearBaraja();
        barajar();
    }

    private void crearBaraja() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String palos[] = Carta.PALOS;

        // String palos[] = {"espadas", "bastos", "oros", "copas"};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                Carta c;
                c = new Carta((nums[j]), (palos[i]));
                cartas[j + 10 * i] = c;

            }
        }
    }

    /*
    public void listarBaraja() {
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] != null) {
                System.out.println("Carta número " + cartas[i].getNumero() + " de palo " + cartas[i].getPalo());
            }
        }
    }
     */
    public void barajar() {

        int posicionAleatoria = 0;
        Carta c;

        for (int i = 0; i < cartas.length; i++) {

            posicionAleatoria = Metodos.generaNumeroEnteroAleatorio(0, NUM_CARTAS - 1);

            c = cartas[i];
            cartas[i] = cartas[posicionAleatoria];
            cartas[posicionAleatoria] = c;

        }

    }

    public Carta siguienteCarta() {

        Carta c = null;

        if (posicionSiguienteCarta == NUM_CARTAS) {
            System.out.println("Ya no hay más cartas.");
        } else {
            c = cartas[posicionSiguienteCarta];
            posicionSiguienteCarta++;
        }
        return c;
    }

    public Carta[] darCartas(int numCartas) {

        if (numCartas > NUM_CARTAS) {
            System.out.println("No se pueden dar más cartas de las que hay.");
            return null;
        } else {

            if (cartasDisponibles() < numCartas) {
                System.out.println("No hay suficientes cartas para mostrar.");
            } else {
                Carta cartasDar[] = new Carta[numCartas];

                for (int i = 0; i < cartasDar.length; i++) {
                    cartasDar[i] = siguienteCarta();
                }

                return cartasDar;
            }
        }
        return null;
    }

    public int cartasDisponibles() {

        return NUM_CARTAS - posicionSiguienteCarta;
    }

    public void cartasMonton() {

        if (cartasDisponibles() == NUM_CARTAS) {
            System.out.println("No se ha sacado ninguna carta");
        } else {
            for (int i = 0; i < posicionSiguienteCarta; i++) {
                System.out.println(cartas[i].toString());
            }
        }
    }

    public void mostrarBaraja() {

        if (cartasDisponibles() == 0) {
            System.out.println("No hay cartas para mostrar.");
        } else {
            for (int i = posicionSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i].toString());
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
