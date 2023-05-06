package ejercicios9;
// patgon
public class PlanetasEj2_9 extends AstrosEj2_9 {
    
    private float distanciaSol;
    private float orbitaSol;
    private boolean tieneSatelites;

    public PlanetasEj2_9(float distanciaSol, float orbitaSol, boolean tieneSatelites, double radio, double rotacion, double masa, double temp, double gravedad) {
        super(radio, rotacion, masa, temp, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }

    public float getDistanciaSol() {
        return distanciaSol;
    }

    public float getOrbitaSol() {
        return orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setDistanciaSol(float distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public void setOrbitaSol(float orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }
    
    
    
}
