package ejercicios9.VEHÍCULOS;

public class Coche extends Terrestre {

    private boolean aireAcondicionado;

    public Coche(boolean aireAcondicionado, int numRuedas, String modelo, String matricula) {
        super(numRuedas, modelo, matricula);
        this.aireAcondicionado = aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    @Override
    public void imprimir() {

    }

}
