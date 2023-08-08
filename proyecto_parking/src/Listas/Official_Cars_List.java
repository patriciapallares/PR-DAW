package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import proyecto_parking.Official_Car;

public class Official_Cars_List {

    private final ArrayList<Official_Car> officialCarsList;

    public Official_Cars_List() {
        this.officialCarsList = new ArrayList();
    }
    
    ///
    
    public boolean plateExists(String plate) {
        Official_Car official;
        boolean exists = false;
        Iterator<Official_Car> iterator = officialCarsList.iterator();

        while (exists == false && iterator.hasNext()) {
            official = iterator.next();
            if (official.getPlate().equalsIgnoreCase(plate)) {
                exists = true;
            }
        }
        return exists;
    }

    
    public void addCar(Official_Car official) {
        if (official != null) {
            officialCarsList.add(official);
            System.out.println("Se ha dado de alta el vehiculo oficial con matricula " + official.getPlate());
        }

    }

    public Official_Car getCar(String plate) {
        Official_Car official = null;
        for (Official_Car element : officialCarsList) {
            if (element.getPlate().equals(plate)) {
                official = element;
                break;
            }
        }
        return official;
    }

    public void resetStaysList() {
        if (!officialCarsList.isEmpty()) {

            for (Official_Car element : officialCarsList) {
                Stays_List listaE = element.getStaysList();
                if (listaE.numOfStays() > 0) {
                    element.emptyStays();
                }
            }
            System.out.println("Se han reseteado las estancias de los vehículos oficiales.");

        } else {
            System.out.println("No hay vehículos oficiales pero se resetea el mes.");
        }
    }

}
