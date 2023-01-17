package ejercicios;

import java.util.Scanner;

public class ej8 {
    
    // PENDIENTE
    
    /*
    Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
    desde 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. 
    Implementa y utiliza las funciones:
    int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
    int producto1aN(int n) // Devuelve el producto de enteros de 1 a n 
    double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        int N, resultado;
        
        System.out.println("Introduce el ancho: ");
        N = reader.nextInt();
        
    }
    
    public static double perimetroRectangulo(double ancho, double alto){
        double peri = ancho*2 + alto*2;
        return peri;
    }
    
    public static double areaRectangulo(double ancho, double alto){
        double area = alto * ancho;
        return area;
    }
}
