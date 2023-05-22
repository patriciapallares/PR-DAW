package ADO;

public class VideoJuego extends Articulo {
    // atributo de clase
    private static float suplemento = 5f;
    private static int numCod = 1;

    // atributos miembro
    private int edadRecomendada;
    private String plataforma; // PS2, PS3, PS4, XBOX, PC,...
    private String categoria;  //Acción, Deportivo, Estrategia, Simulación,...
    private boolean formatoFisico;

    public VideoJuego(int edadRecomendada, String plataforma, String categoria,
            boolean formatoFisico, String nombre, String fecha,
            int anyo, String resumen, Autor autor, boolean deteriorado) {
        super("VID"+ numCod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.edadRecomendada = edadRecomendada;
        this.plataforma = plataforma;
        this.categoria = categoria;
        this.formatoFisico = formatoFisico;
        numCod++;
    }

    public static float getSuplemento() {
        return suplemento;
    }

    public static void setSuplemento(float suplemento) {
        VideoJuego.suplemento = suplemento;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isFormatoFisico() {
        return formatoFisico;
    }

    public void setFormatoFisico(boolean formatoFisico) {
        this.formatoFisico = formatoFisico;
    }

    @Override
    public String info() {
        String resp = null;
        resp = "Codigo Articulo Musical:" + this.getCodArt() + "\n"
                + "Nombre=" + getNombre() + "\n"
                + "Año Publicación:" + getAnyo() + "\n"
                + "Resumen: " + getResumen() + "\n"
                + "Autor: " + getAutor().info() + "\n"
                + "¿Esta Deteriorado? : " + isDeteriorado() + "\n"
                + "Edad Recomendada : +" + getEdadRecomendada() + "\n"
                + "Plataforma: " + getPlataforma() + ", Categoria :" + getCategoria() + "\n"
                + "¿FormatoFisico? " + isFormatoFisico();

        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio = getSuplemento() + getPreciobase() * dias;
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp = false;
        if (!c.isEmpty()) {
            getComentarios().add(c);
            resp = true;
        }
        return resp;
    }
}
