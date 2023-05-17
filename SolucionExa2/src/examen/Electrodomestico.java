package examen;

public abstract class Electrodomestico {

    // atributos de clase, en este caso CONSTANTES
    /*
    Por defecto, el color sera blanco, el consumo energético sera F, 
    el precioBase es de100 € y el peso de 5 kg
     */
    private float PRECIOBASE = 100f;
    private String COLORBASE = "BLANCO";
    private char CONSUMO = 'F';
    private float PESOBASE = 5;

    // atributos miembro  
    /* Sus atributos son nombre, precio base, color, 
       consumo energético (letras entre Ay F) y peso
     */
    private String nombre;
    private String color;
    private char consumoE;
    private float peso;
    private float preciobase;

    /*
    Los constructores que se implementaran serán:
       Un constructor por defecto. 
       Un constructor con el precio y peso. El resto por defecto. 
       Un constructor con todos los atributos. 
     */
    public Electrodomestico(String nombre) {
        this.nombre = nombre;
        color = comprobarColor2("");
        consumoE = comprobarConsumoEnergetico2(' ');
        peso = getPeso();
        preciobase = getPRECIOBASE();
    }

    public Electrodomestico(String nombre, float peso, float precio) {
        this.nombre = nombre;
        color = comprobarColor2("");
        consumoE = comprobarConsumoEnergetico2(' ');
        this.peso = peso;
        preciobase = precio;
    }

    public Electrodomestico(String nombre, String color, char consumoE, float peso, float precio) {
        this.nombre = nombre;
        color = comprobarColor2(color);
        consumoE = comprobarConsumoEnergetico2(consumoE);
        this.peso = peso;
        preciobase = precio;
    }

    public float getPRECIOBASE() {
        return PRECIOBASE;
    }

    public String getCOLORBASE() {
        return COLORBASE;
    }

    public char getCONSUMO() {
        return CONSUMO;
    }

    public float getPreciobase() {
        return preciobase;
    }

    public float getPESOBASE() {
        return PESOBASE;
    }

    public void setPreciobase(float preciobase) {
        this.preciobase = preciobase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    /*
          tenemos dos posibilidades para cada uno de estos estos métodos
          y cada se utilizará de forma distinta
          comprobarConsumoEnergetico(char   letra):   
          comprueba que la letra es correcta, sino es correcta usara la letra 
          por defecto. Se invocara al crear el objeto y no sera visible. 
     */
    private boolean comprobarConsumoEnergetico(char letra) {
        boolean ok = false;
        if (letra == 'a' || letra == 'A' || letra == 'b' || letra == 'B'
                || letra == 'c' || letra == 'C' || letra == 'd' || letra == 'D'
                || letra == 'f' || letra == 'F' || letra == 'g' || letra == 'G') {
            ok = true;
        } else {
            setConsumoE(getCONSUMO());
        }
        return ok;
    }

    private char comprobarConsumoEnergetico2(char letra) {
        char let = getCONSUMO();
        boolean ok = false;
        int i;
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        i = 0;
        while (i < letras.length && ok) {
            if (letras[i] == letra) {
                ok = true;
                let = letra;
            }
        }
        return let;
    }

    /*
          tenemos dos posibilidades para cada uno de estos estos métodos
          y cada se utilizará de forma distinta
          comprobarColor(String color): comprueba que el color es correcto, 
          sino lo es, usa el color por defecto. Se invocara al crear el objeto
          y no sera visible.
     */
    private boolean comprobarColor(String color) {
        boolean ok = true;
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro")
                && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul")
                && !color.equalsIgnoreCase("gris")) {
            ok = false;
        } else {
            setColor(getCOLORBASE());
        }
        return ok;
    }

    private String comprobarColor2(String color) {
        String col = "blanco";
        boolean ok = false;
        int i;
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "gris"};
        i = 0;
        while (i < colores.length && !ok) {
            if (colores[i].equalsIgnoreCase(color)) {
                ok = true;
                col = color;
            }
            i++;
        }
        return col;
    }

    // este método lo heredarán y podrán calcular el precio inicial
    public float precioInicial() {
        float precioPeso = 0, precioLetra = 0, precioInicial;
        if (getPeso() < 19 && getPeso() > 0) {
            precioPeso = 10;
        } else if (getPeso() < 49 && getPeso() > 20) {
            precioPeso = 50;
        } else if (getPeso() < 79 && getPeso() > 50) {
            precioPeso = 80;
        } else {
            precioPeso = 100;
        }
        if (getConsumoE() == 'A' || getConsumoE() == 'a') {
            precioLetra = 100;
        } else if (getConsumoE() == 'B' || getConsumoE() == 'b') {
            precioLetra = 80;
        } else if (getConsumoE() == 'C' || getConsumoE() == 'c') {
            precioLetra = 60;
        } else if (getConsumoE() == 'D' || getConsumoE() == 'd') {
            precioLetra = 50;
        } else if (getConsumoE() == 'E' || getConsumoE() == 'e') {
            precioLetra = 30;
        } else if (getConsumoE() == 'F' || getConsumoE() == 'f') {
            precioLetra = 30;
        }
        precioInicial = precioPeso + precioLetra;
        return precioInicial;
    }

    /*
    precioFinal():  Todas sus clases herederas estarán obligadas a 
    implementareste método, el precio dependerá  según el consumo energético 
    y según su tamaño.
    */
    abstract float precioFinal();

}
