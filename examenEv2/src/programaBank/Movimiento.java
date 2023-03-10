package programaBank;

/**
 *
 * @author patgon
 */
public class Movimiento {
    
    private String concepto;
    private float cantidad;

    public Movimiento(String concepto, float cantidad) {
        this.concepto = concepto;
        this.cantidad = cantidad;
    }
    
    public void imprimirMovimientos(){
        System.out.println("Movimiento {" + "Concepto: " + concepto + ", Cantidad: " + cantidad + "}");
    }
    
    
}
