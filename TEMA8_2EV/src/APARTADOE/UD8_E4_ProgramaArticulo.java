package APARTADOE;

import APARTADOD.*;

/**
 *
 * @author patriciapallares
 */
public class UD8_E4_ProgramaArticulo {
    
    public static void main(String[] args){
        
        Articulo a1 = new Articulo("Camisa de cuadros", 20, 21, 5);
        Articulo a2 = new Articulo("Pantalón pana", 100, 10, -5);
        
        
        System.out.println(a2.getNombre() + " - Precio: " + a2.getPrecio() + "€ - IVA: " + a2.getIva() + "% - PVP: "+ (a2.getPrecio() + (a2.getPrecio()*a2.getIva()/100))+"€.");

        
        if(a1.vender(2000)){
            System.out.println("He vendido dos mil uds.");
        }else{
            System.out.println("No he vendido dos mil uds. No hay suficiente stock.");
        }
        
        if(a1.vender(2)){
            System.out.println("He vendido dos uds.");
        }else{
            System.out.println("No he vendido dos uds. No hay suficiente stock.");
        }
    }
    
}
