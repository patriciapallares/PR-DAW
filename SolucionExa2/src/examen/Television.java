package examen;

public class Television extends Electrodomestico {

    private static int PULGADASD = 20;
    
    /*
    Sus atributos son resolución (en pulgadas) y wifi (booleano), 
    ademas de los atributos heredados. 
    Por defecto, la resolución será de 20 pulgadas y el wifi será false.
    */
    private int pulgadas;
    private boolean wifi;
 
    public Television(int pulgadas, boolean wifi, String nombre) {
        super(nombre);
        this.pulgadas = PULGADASD;
        this.wifi = wifi;
    }
    public Television(String nombre, float peso, float precio ) {
        super(nombre, peso, precio);
        this.pulgadas = PULGADASD;
        this.wifi = false;
    } 
    public Television(String nombre, String color, char consumoE, float peso, float precio, int pulgadas, boolean wifi) {
        super(nombre, color, consumoE, peso, precio);
        this.pulgadas = pulgadas;
        this.wifi = wifi;
    }

    public static int getPULGADASD() {
        return PULGADASD;
    }

    public static void setPULGADASD(int PULGADASD) {
        Television.PULGADASD = PULGADASD;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    /*
    Para calcular el precio debes tener en cuenta que si tiene una resolución 
    mayor de 40 pulgadas, se incrementara el precio un 30% 
    y si tiene wifi incorporado, aumentara 50 €.
    */
    @Override
    public float precioFinal() {
        float precioTotal;

        precioTotal = getPreciobase() + precioInicial();
        if (pulgadas > 40) {
            precioTotal = precioTotal * 1.3f;
        }
        if (wifi) {
            precioTotal = precioTotal + 50;
        }

        return precioTotal;
    }

}
