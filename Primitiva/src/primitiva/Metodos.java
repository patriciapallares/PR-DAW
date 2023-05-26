package primitiva;


/**
 *
 * @author patriciapallares
 */
public class Metodos {
    
        public static boolean validarFecha(String fecha) {
        boolean ok = true;
        String Sdia, Smes, Sanyo;
        String separador = "-";
        String s, s1;
        s = fecha.substring(2);
        s1 = fecha.substring(5);

        int dia, mes, anyo, diasFeb;
        Sdia = fecha.substring(0, 2);
        Smes = fecha.substring(3, 5);
        Sanyo = fecha.substring(6);
        dia = Integer.parseInt(Sdia);
        mes = Integer.parseInt(Smes);
        anyo = Integer.parseInt(Sanyo);

        if (fecha.length() != 10) {
            System.err.println("La fecha debe tener 10 caracteres de longitud");
        } else {
            if (s.equals(separador) && s1.equals(separador)) {
                if (anyo < 1900 || anyo > 2022) {
                    ok = false;
                    System.err.println("No has introducido un año correcto");
                }
                if (mes <= 0 || mes > 12) {
                    ok = false;
                    System.err.println("No Has introducido un mes correcto");
                } else {
                    switch (mes) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            if (dia <= 0 || dia > 31) {
                                System.err.println("No has introducido un año correcto");
                                ok = false;
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (dia <= 0 || dia > 30) {
                                System.err.println("No has introducido un año correcto");
                                ok = false;
                            }
                            break;
                        case 2:
                            if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
                                diasFeb = 29;
                                if (dia <= 0 || dia > diasFeb) {
                                    ok = false;
                                    System.err.println("El dia introducido no es correcto");
                                }
                            } else {
                                diasFeb = 28;
                                if (dia <= 0 || dia > 28) {
                                    ok = false;
                                    System.err.println("El dia introducido no es correcto");
                                }
                                break;
                            }
                    }
                }
            } else {
                System.out.println("Formato Incorrecto");
                ok = false;
            }
        }
        return ok;
    }
    
        

}
