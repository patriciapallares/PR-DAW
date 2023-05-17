package ADO;

public class Cliente {

    /* Atributos de clase: un int que permita luego asignar un número 
       correlativo al código de socio, impidiendo que se repita.
     */
    private static int num;

    // Atributos miembro
    private final String codSocio; // final porque no va a variar
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telf1;
    private int telf2;
    private int telf3;
    private int puntos; // campo propuesto para poder hacer luego operaciones 
    // de fidelización de cliente, el cliente ganaría puntos según unas reglas 
    // por cada alquiler que realice o también podría ser una relación por 
    // cada euro pagado.

    /* Constructores: (nunca piden el codSocio ya que se asigna automáticamente 
    y tampoco se piden los puntos ya que se da de alta al socio con 0 puntos 
    o con una cantidad de puntos asignados como regalo por el alta)
    
    Un constructor que como mínimo pida el DNI y un teléfono.
    
    Y otros constructores de combinación de datos, por ejemplo uno que pida 
    todos los datos, menos los telf 2 y 3.
     */
    // COnstructor con todos los campos.
    public Cliente(String dni, String nombre, String apellidos,
            String direccion, int telf1, int telf2, int telf3, int puntos) {
        codSocio = "cod_" + num;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telf1 = telf1;
        this.telf2 = telf2;
        this.telf3 = telf3;
        this.puntos = puntos;
    }

    public Cliente(String codSocio, String dni, String nombre, int telf1) {
        this.codSocio = codSocio;
        this.dni = dni;
        this.nombre = nombre;
        this.telf1 = telf1;
    }

    /*
    Setters y Getters
    Todos tienes setters y getters excepto:
    cosSocio : solo tiene getter

    Y dudo sobre si 'puntos' debería tener setter ya que para eso debería haber 
    un método que permita implementar una regla de asignación de puntos 
    ligada al alquiler.
     */
    public static void setNum(int num) {
        Cliente.num = num;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelf1(int telf1) {
        this.telf1 = telf1;
    }

    public void setTelf2(int telf2) {
        this.telf2 = telf2;
    }

    public void setTelf3(int telf3) {
        this.telf3 = telf3;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public static int getNum() {
        return num;
    }

    public String getCodSocio() {
        return codSocio;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelf1() {
        return telf1;
    }

    public int getTelf2() {
        return telf2;
    }

    public int getTelf3() {
        return telf3;
    }

    public int getPuntos() {
        return puntos;
    }


    // Métodos:

    
    // que de la información del Socio
    public String info() {
        String resp = null;
        return resp;
    }

    // que nos devuelva true si el Socio tiene pendiente devolver algún artículo
    public boolean deudor() {
        boolean si = true;
        return si;
    }

    
    // que añada puntos a un Socio a partir de unas reglas según algún alquiler realizado
    public int addpuntos() {
        int puntos = 0;
        return puntos;
    }  
    
    
}
