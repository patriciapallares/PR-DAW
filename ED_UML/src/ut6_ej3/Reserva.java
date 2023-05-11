package ut6_ej3;

import java.util.ArrayList;

public class Reserva {
    
    public String modeloAuto;
    public String marcaAuto;
    public String color;
    private String matricula;
    public boolean disponibilidad;
    
    private Cliente cliente;
    
    ArrayList<Pago> pagos = new ArrayList<Pago>();

    public Reserva(String modeloAuto, String marcaAuto, String color, String matricula, boolean disponibilidad, Cliente cliente) {
        this.modeloAuto = modeloAuto;
        this.marcaAuto = marcaAuto;
        this.color = color;
        this.matricula = matricula;
        this.disponibilidad = disponibilidad;
        this.cliente = cliente;
        
        Pago pago = new Pago(true);
    }

    
    
    
    public void alquilerHoras(int horas){
        
    }
    
    public void alquilerDias(int dias){
        
    }
    
    private void entrega(String fecha, int hora){
        
    }
}
