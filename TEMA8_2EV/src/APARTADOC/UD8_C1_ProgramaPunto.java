package APARTADOC;

/**
 *
 * @author patriciapallares
 */
public class UD8_C1_ProgramaPunto {
    
    public static void main(String[] args){
        
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);        
        Punto p3 = new Punto(-3,7);  
        
        System.out.println("Coordenadas del punto p1 (" + p1.getX() + "," + p1.getY()+")");
        System.out.println("Coordenadas del punto p2 (" + p2.getX() + "," + p2.getY()+")");
        System.out.println("Coordenadas del punto p3 (" + p3.getX() + "," + p3.getY()+")");  

    }
    
}
