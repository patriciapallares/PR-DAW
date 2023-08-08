package proyecto_parking;

public class Not_Resident_Car extends Car {

    private final double PRICE_MIN = 0.02;

    public Not_Resident_Car(String plate) {
        super(plate);
    }

    ///
    
    public double calculatePrice() {
        double stayMins = stay.stayInMinutes();
        double finalPrice = stayMins * PRICE_MIN;
        return finalPrice;
    }

    @Override
    public void registerEntry(int[] hourIn, String carType) {
        Stay stay = new Stay(hourIn);
        setStay(stay);
        System.out.println("Se ha registrado la entrada - Vehículo " + carType + ".");
    }

    public void registerExit(int[] hourOut, String carType) {
        stay.setHourOut(hourOut);
        System.out.println("Se ha procesado la salida - Vehículo " + carType + ".");
    }
}
