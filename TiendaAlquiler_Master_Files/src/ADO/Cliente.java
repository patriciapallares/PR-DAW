/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class Cliente {
    /* Atributos de clase: un int que permita luego asignar un número 
       correlativo al código de socio, impidiendo que se repita.
     */
    private static int num;

    // Atributos miembro
    private final String codSocio; // final porque no va a variar una vez que se asigna a un socio ya no varía
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telf1;
    private String telf2; 
    private String telf3;
    private int puntos; // campo propuesto para poder hacer luego operaciones 
    // de fidelización de cliente, el cliente ganaría puntos según unas reglas 
    // por cada alquiler que realice o también podría ser una relación por 
    // cada euro pagado.
    
    public Cliente(String dni, String nombre, String apellidos, 
            String direccion, String telf1, String telf2, String telf3, int puntos) {
        codSocio = "cod_"+num;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telf1 = telf1;
        this.telf2 = telf2;
        this.telf3 = telf3;
        this.puntos = puntos;
    }

    public String getDni() {
        return dni;
    }

    public String info() {
        String resp = null;
        resp= "Código de socio: " +codSocio+"\n"+
              "Nombre= " +nombre +" "+ apellidos+"\n"+
              "Dirección :" +direccion+"\n"+
              "Teléfono 1: " +telf1+"\n"+
              "Teléfono 2: " +telf1+"\n"+
              "Teléfono 3: " +telf1+"\n"+
              "puntos : " +puntos+"\n";
        return resp;
    }
}
