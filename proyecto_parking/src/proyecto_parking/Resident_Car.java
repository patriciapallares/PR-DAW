package proyecto_parking;

public class Resident_Car extends Car {

    private int sumOfMinutes;
    private final double PRICE_MIN = 0.002;

    public Resident_Car(String plate, Stay stay) {
        super(plate, stay);
        this.sumOfMinutes = 0;
    }

    public void setSumOfMinutes(int sumOfMinutes) {
        this.sumOfMinutes = sumOfMinutes;
    }

    public int getSumOfMinutes() {
        return sumOfMinutes;
    }

    ///
    
    public String printChargeInfo() {
        return "Matrícula: " + plate + " Tiempo estacionado (min.): "
                + getSumOfMinutes() + " Cantidad a pagar: " + calculatePrice() +"€.";
    }

    public void addMinutes(Stay stay) {
        sumOfMinutes += stay.stayInMinutes();
    }

    public void emptySumOfMinutes() {
        setSumOfMinutes(0);
    }

    public double calculatePrice() {
        double finalPrice = sumOfMinutes * PRICE_MIN;
        return finalPrice;
    }

    @Override
    public void registerExit(int[] hourOut, String carType) {
        if (stay.getHourIn() == null) {
            System.out.println("No se puede procesar la salida. El vehículo "+carType+" no se encuentra en el aparcamiento.");
        } else {
            stay.setHourOut(hourOut);
            addMinutes(stay);
            stay.resetStay();
            System.out.println("Tiempo este mes: " + getSumOfMinutes()+" minutos.");
            System.out.println("Se ha procesado la salida - Vehículo "+carType+"."); 
        }
    }
}
