package ADO;

import java.io.Serializable;

public class Autor implements Serializable {

    // atributos de Autor
    private String nom;
    private String apell;
    private int anyoNac;
    private int publicaciones;

    // Constructor simple
    public Autor(String nom, String apell) {
        this.nom = nom;
        this.apell = apell;
    }
    
    // Constructor completo
    public Autor(String nom, String apell, int anyoNac, int publicaciones) {
        this.nom = nom;
        this.apell = apell;
        this.anyoNac = anyoNac;
        this.publicaciones = publicaciones;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }
    
    public String info() {
        return nom +" "+ apell + ", año Nac: " + anyoNac + ", publicaciones=" + publicaciones;
    }
}
