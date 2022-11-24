package tema5_1ev;

public class EJ11 {
    
    public static void main(String[] args){
        
        int pares = 0, impares = 0;
        
        for(int i=100;i<=200;i++){
            
            if(i%2==0){
                pares = pares + i; 
            }else{
                impares = impares + i;
            }

        }
        
        System.out.println("La suma de los pares es: "+pares);
        System.out.println("La suma de los impares es: "+impares);
    }
}
