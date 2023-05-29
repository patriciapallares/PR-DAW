package examen2ev3;

/**
 *
 * @author patgon
 */
public class Metodos {
    
    public static boolean dniValido(String dni) {
        char[] letraDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        boolean ok = true;
        String num;
        char letra;
        int indice = 0, resto;
        if (dni.length() != 9) {
            ok = false;
            System.err.println("¡¡Formato DNI no válido!!. Error en Longitud");
        } else {
            if (dni.length() == 9) {
                num = dni.substring(0, 8);
                while (indice < num.length() && ok == true) {
                    if (!Character.isDigit(num.charAt(indice))) {
                        ok = false;
                        System.err.println("Las posiciones 1 a 8 tienen que ser dígitos");
                    }
                    indice++;
                }
                //verificacion de la letra:
                if (ok) {
                    letra = dni.charAt(8);
                    if (Character.isLetter(letra)) {
                        letra = Character.toUpperCase(letra);//la ponemos en mayuscula, en cualquier caso
                        resto = Integer.parseInt(num) % 23;
                        if (letra != letraDni[resto]) {
                            ok = false;
                            System.err.println("La letra de control no es correcta");
                        }
                    } else {
                        ok = false;
                        System.err.println("El caracter de control no es una letra");
                    }
                }

            }
        }
        return ok;
    }

    public static boolean campoLleno(String texto) {
        boolean ok = true;
        if (texto.isEmpty()) {
            System.err.println("Este campo no puede estar vacio");
            ok = false;
        }
        return ok;
    }

    public static boolean validarSN(String resp) {
        boolean ok = true;

        if (!(resp.equalsIgnoreCase("s")) && !(resp.equalsIgnoreCase("n"))) {
            System.err.println("Error. Responda S o N");
            ok = false;
        }
        return ok;
    }
}
