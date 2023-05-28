package primitiva;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author patriciapallares
 */
public class BoletoLoteria {

    // atributos
    private String DNIP;
    private String nombreP;
    private String fechaBoleto;
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;

    // constructor
    public BoletoLoteria(String DNIP, String nombreP, String fechaBoleto,
            int num1, int num2, int num3, int num4, int num5, int num6) {
        this.DNIP = DNIP;
        this.nombreP = nombreP;
        this.fechaBoleto = fechaBoleto;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }

    // constructor ganador
    public BoletoLoteria(String fechaBoleto,
            int num1, int num2, int num3, int num4, int num5, int num6) {

        this.fechaBoleto = fechaBoleto;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }

    // constructor sin ser cliente
    public BoletoLoteria(int num1, int num2, int num3, int num4, int num5, int num6) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }

    // setters
    public void setDNIP(String DNIP) {
        this.DNIP = DNIP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setFechaBoleto(String fechaBoleto) {
        this.fechaBoleto = fechaBoleto;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    // getters
    public String getDNIP() {
        return DNIP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getFechaBoleto() {
        return fechaBoleto;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public int getNum4() {
        return num4;
    }

    public int getNum5() {
        return num5;
    }

    public int getNum6() {
        return num6;
    }

    // métodos
    public String mostrar() {
        return "BoletoLoteria {" + "DNIP=" + DNIP + ", nombreP=" + nombreP
                + ", fechaBoleto=" + fechaBoleto + ", num1=" + num1 + ", num2="
                + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5
                + ", num6=" + num6 + '}';
    }

    // los números del boleto no pueden repetirse
    // dada una combinación ganadora (vector de 6 números premiados) 
    // nos * devuelva * el número de aciertos
    // cuatro premios (en euros), para los acertantes de 3, 4, 5 y 6.
    public int comprobarPremios(int arrayGanador[], BoletoLoteria toCheck) {

        int accAciertos = 0;

        int ganador[] = arrayGanador;

        System.out.println(Arrays.toString(ganador));

        for (int i = 0; i < ganador.length; i++) {
            if (toCheck.getNum1() == ganador[i]) {
                accAciertos += 1;
            } else if (toCheck.getNum2() == ganador[i]) {
                accAciertos += 1;
            } else if (toCheck.getNum3() == ganador[i]) {
                accAciertos += 1;
            } else if (toCheck.getNum4() == ganador[i]) {
                accAciertos += 1;
            } else if (toCheck.getNum5() == ganador[i]) {
                accAciertos += 1;
            } else if (toCheck.getNum6() == ganador[i]) {
                accAciertos += 1;
            }
        }

        System.out.println("Acertados = " + accAciertos);
        return accAciertos;
    }
}
