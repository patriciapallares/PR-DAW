package ADO;

public class VideoJuego extends Articulo{
    private int edadRecomendada;
    private String plataforma; // PS2, PS3, PS4, XBOX, PC,...
    private String categoria;  //Acción, Deportivo, Estrategia, Simulación,...
    private boolean formatoFisico;
    
    public VideoJuego(int edadRecomendada, String plataforma, String categoria, 
            boolean formatoFisico, String cod, String nombre, String fecha, 
            int anyo, String resumen, String autor, boolean deteriorado) {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.edadRecomendada = edadRecomendada;
        this.plataforma = plataforma;
        this.categoria = categoria;
        this.formatoFisico = formatoFisico;
    }

     @Override
    public String info() {
        String resp = "Videojuego: " + this.getNombre() + ". Está para: " + this.plataforma;
        
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio = 0;
        precio = preciobase * dias + 2;
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp = false;
        
        comentarios.add(c);

        resp = true;

        return resp;
    }
}
