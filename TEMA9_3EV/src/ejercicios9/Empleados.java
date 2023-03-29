package ejercicios9;

public class Empleados {

    private final String dni;
    private final String nombre;
    private double sueldoBrutoMensual;
    private int edad, telf;
    private String direccion;

    public Empleados(String dni, String nombre, double sueldoBrutoMensual) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBrutoMensual = sueldoBrutoMensual;

        this.edad = 0;
        this.telf = 0;
        this.direccion = null;
    }

    public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBrutoMensual() {
        return sueldoBrutoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelf() {
        return telf;
    }

    public String getDireccion() {
        return direccion;
    }
    
    // métodos
    /*
    public void mostrar(){
        System.out.println("Empleados {" + "dni= " + dni + ", nombre= " + nombre + \", sueldoBrutoMensual=\" + sueldoBrutoMensual + \", edad=\" + edad + \", telf=\" + telf + \", direccion=\" + direccion + "}");
    }
*/
    public double sueldoNetoMensual(){
        
        double sueldo = this.sueldoBrutoMensual;
        
        sueldo = sueldo * 12;
        
        if(sueldo < 12000){
            sueldo = this.sueldoBrutoMensual*(1-0.2);
        }else if(sueldo >= 12000 && sueldo < 25000){
            sueldo = this.sueldoBrutoMensual*(1-0.3);
        }else if(sueldo >= 25000){
            sueldo = this.sueldoBrutoMensual*(1-0.4);
        }
        
        
        return sueldo;
        
    }

}
