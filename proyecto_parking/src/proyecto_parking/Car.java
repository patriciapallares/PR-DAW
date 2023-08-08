package proyecto_parking;

public abstract class Car {

    protected String plate;
    protected Stay stay;

    public Car(String plate, Stay stay) {
        this.plate = plate;
        this.stay = stay;
    }

    public Car(String plate) {
        this.plate = plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setStay(Stay stay) {
        this.stay = stay;
    }

    public String getPlate() {
        return plate;
    }

    public Stay getStay() {
        return stay;
    }
    
    ///
    
    public void registerEntry(int[] hourIn, String carType){
        if(stay.getHourIn() != null){
            System.out.println("No se puede procesar la entrada. "
                                    + "El vehículo "+ carType + " ya se encuentra en el aparcamiento.");
        }else{
            stay = new Stay(hourIn);
           // stay.setHourIn(dateArray);
            setStay(stay);
            System.out.println("Se ha registrado la entrada - Vehículo "+ carType+".");
        }
    }
    
    public abstract void registerExit(int[] dateArray, String carType);
}
