package proyecto_parking;

import Listas.Stays_List;

public class Official_Car extends Car {

    private Stays_List staysList = new Stays_List();

    public Official_Car(String plate, Stay stay) {
        super(plate, stay);
    }

    public Stays_List getStaysList() {
        return staysList;
    }

    public void setStaysList(Stays_List staysList) {
        this.staysList = staysList;
    }

///

    public void emptyStays() {
        staysList.emptyStays();
    }

    public void addStay(Stay stay) {
        staysList.addStay(stay);
        System.out.println("Estancia añadida correctamente.");
        System.out.println("Num de estancias este mes: " + staysList.numOfStays());
    }

    @Override
    public void registerExit(int[] hourOut, String carType) {
        
        if (stay.getHourIn() == null) {
            System.out.println("No se puede procesar la salida. El vehículo " + carType + " no se encuentra en el aparcamiento.");
        } else {
            stay.setHourOut(hourOut);
            addStay(stay);
            stay.resetStay();

            System.out.println("Se ha procesado la salida - Vehículo " + carType + ".");
        }
    }
    

}
