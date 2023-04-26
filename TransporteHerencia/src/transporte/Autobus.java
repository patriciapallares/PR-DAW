package transporte;

abstract class Autobus {
    
    //Atributos miembros (solo accesibles desde dentro de la clase)
    protected int id;
    protected Conductor conductor;
    protected float precioBaseViaje;
    
//Constructores
    
    //Constructor con todos los valores iniciales por defecto
    public Autobus() {
        id = 0;
        conductor = null;
        precioBaseViaje = 0;
    }

    //Constructor con todos los valores recibidos como parámetros
    public Autobus(int id, Conductor conductor, float precioBaseViaje) {
        this.id = id;
        this.conductor = conductor;
        this.precioBaseViaje = precioBaseViaje;
    }
    
//Métodos de encapsulamiento

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public float getPrecioBaseViaje() {
        return precioBaseViaje;
    }

    public void setPrecioBaseViaje(float precioBaseViaje) {
        this.precioBaseViaje = precioBaseViaje;
    }
    
//Método abstracto para calcular el precio total del viaje
    
    abstract float calcularPrecioViaje();

//Método para mostrar el nombre del conductor
    
    public void mostrarNombreConductor() {
        System.out.println(conductor.getNombre());
    }
}