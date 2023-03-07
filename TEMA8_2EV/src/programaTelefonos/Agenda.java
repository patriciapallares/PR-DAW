package programaTelefonos;

/**
 *
 * @author patgon
 */
public class Agenda {
    
    private Contacto[] contactos;
    
    public Agenda(Contacto[] contactos){
        this.contactos = new Contacto[10];
    }
    
    // Los métodos de la agenda serán los siguientes:
    
    public Contacto anadirContacto(Contacto c){
        
    }
    
    public boolean agendaLlena(){
        boolean llena = false;
        
        for (int i = 0; i < this.contactos.length; i++) {
            
            llena = (contactos[i]==null)? false : true;

        }
        
        return llena;
    }
    
    public int huecosLibres(){
        int acHuecos = 0;
        
        for (int i = 0; i < 10; i++) {
            if(contactos[i]!=null){
                acHuecos++;
            }
        }
        
        return acHuecos;
    }
}
