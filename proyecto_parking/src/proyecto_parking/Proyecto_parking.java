package proyecto_parking;

import Listas.Not_Resident_Cars_List;
import Listas.Official_Cars_List;
import Listas.Resident_Cars_List;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PatriciaPallarésGonz
 *
 *
 * ToDo: Comprobar que se introducen valores válidos en la matrícula
 */
public class Proyecto_parking {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String plate = "", delete;
        int option = 0;
        int[] dateArray;
        double finalPrice;

        Official_Car officialCar;
        Resident_Car residentCar;
        Not_Resident_Car notResidentCar;
        Stay stay = new Stay();

        Resident_Cars_List residentCarsList = new Resident_Cars_List();
        Official_Cars_List officialCarsList = new Official_Cars_List();
        Not_Resident_Cars_List notResidentCarsList = new Not_Resident_Cars_List();

        do {
            do {
                option = -1;
                System.out.println("---Menú parking---\n"
                        + "1. Registra entrada\n"
                        + "2. Registra salida\n"
                        + "3. Da de alta vehículo oficial\n"
                        + "4. Da de alta vehículo residente\n"
                        + "5. Comienza mes\n"
                        + "6. Pagos de residentes\n"
                        + "0. Salir\n");

                try {
                    System.out.print("Elige una opcion del menu: ");
                    option = reader.nextInt();
                    if (option < 0 || option > 6) {
                        System.out.println("Error: Opción incorrecta! ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error no has introducido un número:");
                    delete = reader.nextLine();
                    option = -1;
                }

            } while (option < 0 || option > 6);

            delete = reader.nextLine();

            switch (option) {
                case 1: // Registra entrada

                    plate = getPlate();
                    dateArray = generateDate();

                    if (residentCarsList.plateExists(plate)) {

                        residentCar = residentCarsList.getCar(plate);
                        residentCar.registerEntry(dateArray, "residente");

                    } else if (officialCarsList.plateExists(plate)) {

                        officialCar = officialCarsList.getCar(plate);
                        officialCar.registerEntry(dateArray, "oficial");

                    } else if (notResidentCarsList.plateExists(plate)) {

                        System.out.println("No se puede procesar la entrada. El vehículo no residente ya se encuentra en el aparcamiento.");

                    } else {

                        notResidentCar = new Not_Resident_Car(plate);
                        notResidentCar.registerEntry(dateArray, "no residente");
                        notResidentCarsList.addCar(notResidentCar);
                    }

                    break;

                case 2: // Registra salida

                    plate = getPlate();
                    dateArray = generateDate();

                    if (residentCarsList.plateExists(plate)) {

                        residentCar = residentCarsList.getCar(plate);
                        residentCar.registerExit(dateArray, "residente");

                    } else if (officialCarsList.plateExists(plate)) {

                        officialCar = officialCarsList.getCar(plate);
                        officialCar.registerExit(dateArray, "oficial");

                    } else if (notResidentCarsList.plateExists(plate)) {

                        notResidentCar = notResidentCarsList.getCar(plate);
                        notResidentCar.registerExit(dateArray, "no residente");
                        finalPrice = notResidentCar.calculatePrice();

                        notResidentCarsList.borrarVehiculo(notResidentCar);
                        System.out.println("El precio a pagar es: " + finalPrice + "€.");

                    } else {
                        System.out.println("No se puede procesar la salida. El vehículo no residente no se encuentra en el aparcamiento.");
                    }

                    break;

                case 3: // Alta vehículo oficial

                    plate = getPlate();

                    if (isPlateResidentOrOficial(plate, residentCarsList, officialCarsList)) {
                        System.out.println("Matrícula ya registrada en el sistema.");
                    } else {
                        stay = new Stay();
                        officialCar = new Official_Car(plate, stay);
                        officialCarsList.addCar(officialCar);
                    }

                    break;

                case 4: // Alta vehículo residente

                    plate = getPlate();

                    if (isPlateResidentOrOficial(plate, residentCarsList, officialCarsList)) {
                        System.out.println("Matrícula ya registrada en el sistema.");
                    } else {
                        stay = new Stay();
                        residentCar = new Resident_Car(plate, stay);
                        residentCarsList.addCar(residentCar);
                    }

                    break;

                case 5: // Comienza mes

                    officialCarsList.resetStaysList();

                    residentCarsList.emptySumOfMinutes();

                    break;

                case 6: // Pago de residentes

                    residentCarsList.printChargeInfo();

                    break;

                case 7:

                    break;

            }
        } while (option != 0);

    }

    public static int[] generateDate() {
        LocalDateTime date = LocalDateTime.now();
        int myDate[] = new int[6];
        int hour = date.getHour();
        int min = date.getMinute();
        int sec = date.getSecond();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        myDate[0] = hour;
        myDate[1] = min;
        myDate[2] = sec;
        myDate[3] = day;
        myDate[4] = month;
        myDate[5] = year;

        return myDate;
    }

    public static String getPlate() {
        Scanner reader = new Scanner(System.in);
        String plate;
        System.out.println("Inserta la matrícula: ");
        return plate = reader.nextLine();
    }

    public static boolean isPlateResidentOrOficial(String plate, Resident_Cars_List residents, Official_Cars_List officials) {
        return residents.plateExists(plate) || officials.plateExists(plate) ? true : false;
    }

}
