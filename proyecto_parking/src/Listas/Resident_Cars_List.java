package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import proyecto_parking.Resident_Car;

public class Resident_Cars_List {

    private final ArrayList<Resident_Car> residentCarsList;

    public Resident_Cars_List() {
        this.residentCarsList = new ArrayList();
    }
    
    ///

    public boolean plateExists(String plate) {
        Resident_Car resident = null;
        boolean exists = false;
        Iterator<Resident_Car> iterator = residentCarsList.iterator();

        while (exists == false && iterator.hasNext()) {
            resident = iterator.next();
            if (resident.getPlate().equalsIgnoreCase(plate)) {
                exists = true;
            }
        }
        return exists;
    }

    public void addCar(Resident_Car resident) {
        if (resident != null) {
            residentCarsList.add(resident);
            System.out.println("Se ha dado de alta el vehiculo residente con matrícula " + resident.getPlate() + " correctamente.");
        }
    }

    public Resident_Car getCar(String plate) {
        Resident_Car resident = null;
        for (Resident_Car element : residentCarsList) {
            if (element.getPlate().equals(plate)) {
                resident = element;
                break; 
            }
        }
        return resident;
    }

    public void emptySumOfMinutes() {
        if (!residentCarsList.isEmpty()) {
            for (Resident_Car element : residentCarsList) {
                element.emptySumOfMinutes();
            }
            System.out.println("Se han reseteado los minutos acumulados de los vehículos residentes.");
        } else {
            System.out.println("No hay vehículos residentes pero se resetea el mes.");
        }
    }

    public void printChargeInfo() {
        for (Resident_Car element : residentCarsList) {
            System.out.println(element.printChargeInfo());
        }

    }
}
