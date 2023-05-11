package ut6_ej3;

import java.util.ArrayList;

public class Cliente {

    private int idUser;
    private int datosBancarios;
    private String direccion;
    private int telf;
    Agencia agencia;
    
    Reserva reserva;
    
    String[] tipos = {"telefónica","online","presencial"};

    ArrayList<AtencionAlCliente> atencion = new ArrayList<AtencionAlCliente>();
    
    public void reservacion() {

    }

    public Cliente(int idUser, int datosBancarios, String direccion, int telf, Agencia agencia, Reserva reserva) {
        this.idUser = idUser;
        this.datosBancarios = datosBancarios;
        this.direccion = direccion;
        this.telf = telf;
        this.agencia = agencia;
        this.reserva = reserva;
        
        // o Reserva reserva = new Reserva(...)
    }
    
    
}
