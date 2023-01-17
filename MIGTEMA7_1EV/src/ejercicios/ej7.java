package ejercicios;

import java.util.Scanner;

public class ej7 {
    
    /*
    Escribe un programa que pida el ancho y alto de un rectángulo y muestre por 
    pantalla su área y su perímetro. Implementa y utiliza las funciones:
    double perimetroRectangulo(double ancho, double alto) // Devuelve el 
    perímetro double areaRectangulo(double ancho, double alto) // Devuelve el área
    */
    
    public static void main(String[] args){
                         
        Scanner reader = new Scanner(System.in);  
        double alto, ancho, resultadoPeri, resultadoArea;
        
        System.out.println("Introduce el ancho: ");
        ancho = reader.nextDouble();
        
        System.out.println("Introduce el alto: ");
        alto = reader.nextDouble();
        
        resultadoPeri = perimetroRectangulo(ancho, alto);
        resultadoArea = areaRectangulo(ancho, alto);
        
        System.out.println("El perímetro es " + resultadoPeri + " y el área es " + resultadoArea);
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
