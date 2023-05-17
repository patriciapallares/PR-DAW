package examen;

public class Lavadora extends Electrodomestico {
    
    // atributo de clase, en este caso una CONSTANTE
    private  static int CARGAD = 5;

    /*
    Su atributo es  carga, ademas de los atributos heredados. 
    Por defecto, la carga es de 5 kg. Usa una constante para ello
    */
    private  int carga;
    
    public Lavadora(String nombre) {
        super(nombre);
        this.carga = CARGAD;
    }  
    
    public Lavadora(String nombre, float peso, float precio) {
        super(nombre, peso, precio);
        this.carga = CARGAD;
    }
    
    public Lavadora(String nombre, String color, char consumoE, float peso, float precio, int carga) {
        super(nombre, color, consumoE, peso, precio);
        this.carga = carga;
    }

    public static int getCARGAD() {
        return CARGAD;
    }

    public static void setCARGAD(int CARGAD) {
        Lavadora.CARGAD = CARGAD;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    /*
    Para calcular el precio debes tener en cuenta que si tiene una carga mayor
    de 8 kg, aumentará el precio en 35€, 
    sino es así no se incrementara el precio.
    */
    @Override
    public float precioFinal() {
        float precioTotal;
       
        precioTotal = getPreciobase() + precioInicial();
        if (carga > 8) {
            precioTotal = precioTotal + 35;
        }
        
        return precioTotal;
    }

}
