package examen;

public class MiLibreria {

    public static boolean campoVacio(String texto) {
        boolean ok = true;
        if (texto.isEmpty()) {   
            ok = false;
        }
        return ok;
    }
    
     public static boolean checkBool(String resp) {
        boolean ok = false;
        if (resp.equalsIgnoreCase("SI")) {
            ok = true;
        }
        return ok;
    }
    
   
    public static boolean checkSiNo(String resp) {
        boolean ok = true;
        if (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no")) {
            System.err.println("Solo respuestas de 'SI' o 'NO'");
            ok = false;
        }
        return ok;
    }

   
  

}
