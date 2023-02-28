package programaBaraja;

/**
 *
 * @author patriciapallares
 */
public class programaBaraja {
    
    public static void main(String[] args) {
    
        Baraja barajaEsp = new Baraja();
        /*
        barajaEsp.mostrarBaraja();
        
        barajaEsp.siguienteCarta();
        
        System.out.println("Cartas disP = "+ barajaEsp.cartasDisponibles());
        
        barajaEsp.cartasMonton();
    
        */
        Carta[] c = barajaEsp.darCartas(5);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].toString());
        }
        
    }
    
    
}
