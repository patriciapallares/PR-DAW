package tema4_1ev;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args){
        float precio_venta,precio_original,descuento;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Escribe el precio de venta: ");
        precio_venta = reader.nextInt();
        
        System.out.println("Escribe el precio original: ");
        precio_original = reader.nextInt();
        
        descuento = (precio_original-precio_venta)*100/precio_original;
        
        System.out.println("El descuento es del " + descuento +"%.");
    }
}

