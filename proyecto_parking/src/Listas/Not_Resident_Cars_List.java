package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import proyecto_parking.Not_Resident_Car;

public class Not_Resident_Cars_List {

    private final ArrayList<Not_Resident_Car> notResidentCarsList;

    public Not_Resident_Cars_List() {
        this.notResidentCarsList = new ArrayList();
    }

    ///
    
    public boolean plateExists(String plate) {
        Not_Resident_Car notResident;
        boolean exists = false;
        Iterator<Not_Resident_Car> iterator = notResidentCarsList.iterator();

        while (exists == false && iterator.hasNext()) {
            notResident = iterator.next();
            if (notResident.getPlate().equalsIgnoreCase(plate)) {
                exists = true;
            }
        }
        return exists;
    }

    public void addCar(Not_Resident_Car notResident) {
        if (notResident != null) {
            notResidentCarsList.add(notResident);
        }
        
    }

    public Not_Resident_Car getCar(String plate) {
        Not_Resident_Car notResident = null;
        for (Not_Resident_Car element : notResidentCarsList) {
            if (element.getPlate().equals(plate)) {
                notResident = element;
                break; 
            }
        }
        return notResident;
    }
    
    public boolean borrarVehiculo(Not_Resident_Car vnr){
        return notResidentCarsList.remove(vnr);
    }
}
