package proyecto_parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Stay {

    private int[] hourIn;
    private int[] hourOut;

    public Stay() {
        this.hourIn = null;
        this.hourOut = null;
    }

    public Stay(int[] hourIn) {
        this.hourIn = hourIn;
        this.hourOut = null;
    }

    public void setHourIn(int[] hourIn) {
        this.hourIn = hourIn;
    }

    public void setHourOut(int[] hourOut) {
        this.hourOut = hourOut;
    }

    public int[] getHourIn() {
        return hourIn;
    }

    public int[] getHourOut() {
        return hourOut;
    }
    
    ///

    public double stayInMinutes() {
        
        int hour_In = hourIn[0];
        int min_In = hourIn[1];
        int sec_In = hourIn[2];
        int day_In = hourIn[3];
        int month_In = hourIn[4];
        int year_In = hourIn[5];

        int hour_Out = hourOut[0];
        int min_Out = hourOut[1];
        int sec_Out = hourOut[2];
        int day_Out = hourOut[3];
        int month_Out = hourOut[4];
        int year_Out = hourOut[5];

        LocalDateTime start = LocalDateTime.of(year_In, month_In, day_In, hour_In, min_In, sec_In);
        LocalDateTime end = LocalDateTime.of(year_Out, month_Out, day_Out, hour_Out, min_Out, sec_Out);
        Duration duration = Duration.between(start, end);

        int hours = (int) duration.toHours();
        int minutes = (int) (duration.toMinutes() % 60);
        int seconds = (int) (duration.getSeconds() % 60);

        int total = (int) convertTimeToMinutes(hours, minutes, seconds);

        if(total == 0){
            total = 1;
        }
        System.out.println("Duración de la estancia: " + total + " minutos.");
        return total;
    }

    public static double convertTimeToMinutes(int hours, int minutes, int seconds) {
        // Convertir las horas y minutos a minutos
        int totalMinutes = hours * 60 + minutes;

        // Sumar los segundos convertidos a minutos
        totalMinutes += seconds / 60;

        return Math.ceil(totalMinutes);
    }

    public void showStay() {
        System.out.println("Entrada: " + this.hourIn);
        System.out.println("Salida: " + this.hourOut);
    }
    
    public boolean resetStay() {
        hourIn = null;
        hourOut = null;
        return true;
    }

}
