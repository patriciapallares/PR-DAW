package ejercicios9.VEHÍCULOS;

public class Moto extends Terrestre {

    
    private String color;

    public Moto(String color, int numRuedas, String modelo, String matricula) {
        super(numRuedas, modelo, matricula);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
        @Override
    public void imprimir() {

    }
    
}
