/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;


public class MiLibreria {

    public static boolean validarTapa(String texto) {
        boolean ok = true;
        if (!(texto.equalsIgnoreCase("blanda") || texto.equalsIgnoreCase("dura") || texto.equalsIgnoreCase("ebook"))) {
            System.err.println("La tapa tiene que ser blanda o dura o ebook");
            ok = false;
        }
        return ok;
    }

    public static boolean validarTipo(String texto) {
        boolean ok = true;
        if (!(texto.equalsIgnoreCase("CD") || texto.equalsIgnoreCase("vinilo"))) {
            System.err.println("El tipo debe ser CD o vinilo");
            ok = false;
        }
        return ok;
    }
    
    public static boolean validarFormatoLibro(String texto) {
        boolean ok = true;
        if (!(texto.equalsIgnoreCase("papel") || texto.equalsIgnoreCase("ebook"))) {
            System.err.println("La tapa tiene que ser blanda o dura o ebook");
            ok = false;
        }
        return ok;
    }

    public static boolean validarMinutos(int num) {
        boolean ok = true;
        if (!(num >= 0 && num <= 59)) {
            System.err.println("Digite un numero entre 0 y 59");
            ok = false;
        }
        return ok;
    }

    public static boolean validarPositivo(int num) {
        boolean ok = true;
        if (num < 0) {
            System.out.println("El numero debe ser positivo");
            ok = false;
        }
        return ok;
    }

    public static boolean validarPositivo(float num) {
        boolean ok = true;
        if (num < 0) {
            System.out.println("El numero debe ser positivo");
            ok = false;
        }
        return ok;
    }

    public static boolean validarEdadRecomendada(int num) {
        boolean ok = true;
        if (num < 3 ) {
            System.err.println("La edad recomendada no puede ser menor de 3 años");
            ok = false;
        }
        return ok;
    }

    public static boolean validarIsbn(String isbn, int anyo) {
        boolean ok = false;
        if (anyo >= 1970 && anyo <= 2006) {
            isbn.matches("\\d{10}");
            ok = true;
        } else if (anyo >= 2007) {
            isbn.matches("\\d{13}");
            ok = true;
        }
        return ok;
    }

    public static boolean validarFecha(String fecha) {
        boolean ok = true;
        String Sdia, Smes, Sanyo;
        String separador = "-";
        String s, s1;
        s = fecha.substring(2);
        s1 = fecha.substring(5);
        Scanner consola = new Scanner(System.in);
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

    public static boolean validarFecha1(String fecha) {
        boolean ok = true;
        Pattern patron = Pattern.compile("\\d{1,2}-\\d{1,2}-\\d{4}");
        Matcher mat = patron.matcher(fecha);
        if (!mat.matches()) {
            ok = false;
            System.err.println("Formato de Fecha no valido");
        }
        return ok;
    }

    public static boolean validarCod(String cod) {
        boolean ok = true;
        Pattern patron = Pattern.compile("^COD\\d{3}");
        Matcher mat = patron.matcher(cod);
        if (!mat.matches()) {
            ok = false;
            System.err.println("El formato debe ser COD y 3 digitos");
        }
        return ok;

    }

    //Método para validar DNI
     public static boolean validarDni(String dni) {
        char[] letraDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        boolean ok = true;
        String num;
        char letra;
        int indice = 0, resto;
        if (dni.length() != 9) {
            ok = false;
            System.err.println("¡¡Formato DNI no valido!!. Error en Longitud");
        } else {
            if (dni.length() == 9) {
                num = dni.substring(0, 8);
                while (indice < num.length() && ok == true) {
                    if (!Character.isDigit(num.charAt(indice))) {
                        ok = false;
                        System.err.println("Las posiciones 1 a 8 tienen que ser digitos");
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


    

    public static boolean validarSN(String resp) {
        boolean ok = true;

        if (!(resp.equalsIgnoreCase("si")) && !(resp.equalsIgnoreCase("no"))) {
            System.err.println("Error. Responda si o no");
            ok = false;
        }
        return ok;
    }

   


    public static boolean campoVacio(String texto) {
        boolean ok = true;
        if (texto.isEmpty()) {
            System.err.println("Este campo no puede estar vacio");
            ok = false;
        }
        return ok;
    }

    public static boolean validarTelf(int numero) {
        String num = String.valueOf(numero);
        boolean ok = true;
        if (num.length() != 9) {
            ok = false;
            System.err.println("El numero de telefono tiene que tener 9 digitos");
        } else {   
            int i = 0;
            while (i < num.length() && ok == true) {
                if (Character.isDigit(num.charAt(i)) == false) {
                    ok = false;
                }
                i++; // aumento el iterador
            }
        }
        return ok;
    }


    public static int generarNumeroAleatorio(int min, int max) {
        int aleatorio;
        aleatorio = (int) (Math.random() * (max - min + 1) + (min));
        System.out.println(aleatorio);
        return aleatorio;
    }
    

    public static boolean checkRango(int min, int max, int num){
        boolean val=false;
        if (num>=min && num<=max){
            val=true;
        }
        return val;
    }
    
    public static boolean valEmail(String email){//metodo para validar un e-mail
        boolean val=false;
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[AZa-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher mat = pat.matcher(email);
            if(mat.matches()){
                val=true;
            }
            else{
                System.out.println("E-mail no valido.");
            }
        return val;       
    }
    

}