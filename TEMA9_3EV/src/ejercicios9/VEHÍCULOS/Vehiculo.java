package ejercicios9.VEHÍCULOS;

public abstract class Vehiculo {
    
    private final String modelo;
    
    private final String matricula;

    public Vehiculo(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }
      
    public abstract void imprimir();
    
}
