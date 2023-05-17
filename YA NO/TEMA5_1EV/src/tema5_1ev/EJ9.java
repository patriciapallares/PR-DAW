package tema5_1ev;

public class EJ9 {
    
    public static void main(String[] args){
        int suma = 0, producto = 1;
        
        for(int i=1; i<=10; i++){
            suma = suma + i;
            producto = producto * i;
        }
        
        System.out.println("La suma de los 10 primeros números naturales es " +suma+ " y el producto es " +producto );
        
    }    
}
    