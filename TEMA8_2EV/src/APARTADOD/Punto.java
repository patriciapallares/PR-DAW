package APARTADOD;

/**
 *
 * @author patriciapallares
 */
public class Punto {
     private int x, y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }    
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    } 
    
    public void imprime(){
        System.out.println("(" + x + "," + y +")");
    }
    
    public void setXY(int x, int y){
        this.x = x;  
        this.y = y;
    }
    
    public void desplaza(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    
}
