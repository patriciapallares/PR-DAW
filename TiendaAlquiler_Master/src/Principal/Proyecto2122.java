/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ADO.*;
import java.util.Scanner;
import MisListas.ListaArticulos;

public class Proyecto2122 {

    public static void main(String[] args) {
        // TODO code application logic here
        Articulo art;
        Scanner consola = new Scanner(System.in);
        ListaArticulos misArticulos = new ListaArticulos();
        int opcion, anyo, menuArticulos, nPaginas, horasDuracion, minutos,
                nPistas, edadRec, dias;
        String cod, nombre, fecha, resumen, autor, deterioro, format, tapa,
                sintetiza, tipo, categoria, formatf;
        float duracion;
        boolean ok, deteriorado, formato, sintetizador, formatoFisico;
        do {
            do {
                System.out.println();
                System.out.println("1. Alta de un Articulo ");
                System.out.println("2. Precio de Alquiler de un artículo");
                System.out.println("3. Mostrar todos los precios");
                System.out.println("4. Salir\n");
                System.out.println("");
                System.out.print("Elige una opcion del menu :");
                opcion = consola.nextInt();
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    do {
                        consola.nextLine();//elimina el buffer de Scanner
                        System.out.println("Codigo Artículo: COD+3 DIGITOS:");
                        cod = consola.nextLine();
                        ok = MiLibreria.validarCod(cod);
                    } while (!ok);
                    do {
                        System.out.println("Nombre :");
                        nombre = consola.nextLine();
                        ok = MiLibreria.campoVacio(nombre);
                    } while (!ok);
                    do {
                        System.out.println("Fecha Alta Formato dd-mm-aaaa:");
                        fecha = consola.nextLine();
                        ok = MiLibreria.validarFecha1(fecha);
                    } while (!ok);
                    do {
                        System.out.println("Año Publicación: ");
                        anyo = consola.nextInt();
                        ok = MiLibreria.validarPositivo(anyo);
                    } while (!ok);
                    do {
                        consola.nextLine();
                        System.out.println("Resumen : ");
                        resumen = consola.nextLine();
                        ok = MiLibreria.campoVacio(resumen);
                    } while (!ok);
                    do {
                        System.out.println("Autor :");
                        autor = consola.nextLine();
                        ok = MiLibreria.campoVacio(autor);
                    } while (!ok);
                    do {
                        System.out.println("¿Deteriorado? Responda SI o NO:");
                        deterioro = consola.nextLine();
                        ok = MiLibreria.validarSN(deterioro);
                    } while (!ok);
                    if (deterioro.equalsIgnoreCase("si")) {
                        deteriorado = true;
                    } else {
                        deteriorado = false;
                    }
                    do {
                        System.out.println("¿Que clase de Artículo es ?");
                        System.out.println("1.- LibroImpreso ");
                        System.out.println("2.- AudioLibro ");
                        System.out.println("3.- Musica ");
                        System.out.println("4.- Videojuego");
                        System.out.println("");
                        System.out.print("Teclee opcion:");
                        menuArticulos = consola.nextInt();
                    } while (menuArticulos < 1 || menuArticulos > 4);
                    switch (menuArticulos) {
                        case 1:
                            System.out.println("Alta un LibroImpreso");
                            do {
                                System.out.println("Número de páginas :");
                                nPaginas = consola.nextInt();
                                ok = MiLibreria.validarPositivo(nPaginas);
                            } while (!ok);

                            consola.nextLine();
                            do {
                                System.out.println("Tipo: Papel o Ebook ");
                                format = consola.nextLine();
                                ok = MiLibreria.validarFormatoLibro(format);
                            } while (!ok);
                            if (format.equalsIgnoreCase("ebook")) {
                                formato = true;
                            } else {
                                formato = false;
                            }
                            do {
                                System.out.println("Tipo de tapa :");
                                tapa = consola.nextLine();
                                ok = MiLibreria.validarTapa(tapa);
                            } while (!ok);

                            art = new LibroImpreso(formato, tapa, nPaginas, cod, nombre,
                                    fecha, anyo, resumen, autor, deteriorado);
                            ok = misArticulos.anadirArticulo(art);
                            if (ok) {
                                System.out.println("Artículo añadido !!!");
                            } else {
                                System.out.println("No se ha podido añadir el LibroImpreso");
                            }
                            break;

                        case 2:
                            System.out.println("Alta un AudioLibro");
                            do {
                                System.out.println("Número de páginas :");
                                nPaginas = consola.nextInt();
                                ok = MiLibreria.validarPositivo(nPaginas);
                            } while (!ok);
                            do {
                                System.out.println("¿Sintetizador? Responda SI o NO");
                                sintetiza = consola.nextLine();
                                ok = MiLibreria.validarSN(sintetiza);
                            } while (!ok);
                            if (sintetiza.equalsIgnoreCase("si")) {
                                sintetizador = true;
                            } else {
                                sintetizador = false;
                            }
                            do {
                                System.out.println("Horas de Duración :");
                                horasDuracion = consola.nextInt();
                                ok = MiLibreria.validarPositivo(horasDuracion);
                            } while (!ok);
                            do {
                                System.out.println("Digite los minutos de Duración:");
                                minutos = consola.nextInt();
                                ok = MiLibreria.validarMinutos(minutos);
                            } while (!ok);
                            art = new AudioLibro(sintetizador, horasDuracion, horasDuracion,
                                    nPaginas, cod, nombre, fecha, anyo, resumen, autor, deteriorado);
                            ok = misArticulos.anadirArticulo(art);
                            if (ok) {
                                System.out.println("AudioLibro añadido !!!");
                            } else {
                                System.out.println("No se ha podido añadir el AudioLibro");
                            }
                            break;

                        case 3:
                            System.out.println("Alta artículo musical");
                            do {
                                System.out.println("Número de Pistas :");
                                nPistas = consola.nextInt();
                                ok = MiLibreria.validarPositivo(nPistas);
                            } while (!ok);
                            do {
                                System.out.println("Duración :");
                                duracion = consola.nextFloat();
                                ok = MiLibreria.validarPositivo(duracion);
                            } while (!ok);
                            do {
                                System.out.println("Digite Tipo: CD o Vinilo: ");
                                consola.nextLine();//elimina el buffer de Scanner
                                tipo = consola.nextLine();
                                ok = MiLibreria.validarTipo(tipo);
                            } while (!ok);
                            //Constructor del articulo de Musica: 
                            art = new Musica(nPistas, duracion, tipo, cod, nombre,
                                    fecha, anyo, resumen, autor, deteriorado);

                            ok = misArticulos.anadirArticulo(art);
                            if (ok) {
                                System.out.println("Artículo de música añadido !!!");
                            } else {
                                System.out.println("No se ha podido añadir el artículo");
                            }
                            break;

                        case 4:
                            System.out.println("Vamos a dar de Alta un Videojuego");
                            do {
                                System.out.println("Edad Recomendada:");
                                edadRec = consola.nextInt();
                                ok = MiLibreria.validarEdadRecomendada(edadRec);
                            } while (!ok);
                            do {
                                System.out.println("Categoria: ");
                                consola.nextLine();
                                categoria = consola.nextLine();
                                ok = MiLibreria.campoVacio(categoria);
                            } while (!ok);
                            do {
                                System.out.println("¿Tiene formato físico s/n :");
                                formatf = consola.nextLine();
                                ok = MiLibreria.validarSN(deterioro);
                            } while (!ok);
                            if (formatf.equalsIgnoreCase("s")) {
                                formatoFisico = true;
                            } else {
                                formatoFisico = false;
                            }
                            art = new VideoJuego(edadRec, categoria, categoria,
                                    formatoFisico, cod, nombre, fecha, anyo,
                                    resumen, autor, deteriorado);
                            ok = misArticulos.anadirArticulo(art);
                            if (ok) {
                                System.out.println("VideoJuego añadido !!!");
                            } else {
                                System.out.println("No se ha podido añadir el VideoJuego");
                            }
                            break;
                    }
                    break;
                case 2:
                    consola.nextLine();
                    System.out.println("Código Artículo: ");
                    cod = consola.nextLine();
                    art = misArticulos.buscaArticulo(cod);
                    if (art != null) {
                        do {
                            System.out.println("Número de días de alquiler");
                            dias = consola.nextInt();
                            if (dias <= 0) {
                                System.out.println("Dato incorrecto");
                            }
                        } while (dias <= 0);
                        System.out.println("Precio: " + art.precioAlquilerArticulo(dias));
                    } else {
                        System.out.println("Artículo no encontrado");
                    }
                    break;

                case 3:
                    do {
                        System.out.println("Número de días de alquiler: ");
                        dias = consola.nextInt();
                        ok = MiLibreria.validarPositivo(dias);
                    } while (!ok);
                    System.out.println("Comprobamos que la lista de Articulos no esta vacía:");
                    if (misArticulos.numArticulos() > 0) {
                        misArticulos.mostrarPrecios(dias);
                    } else {
                        System.out.println("No hay Artículos !");
                    }
                    break;
                
                case 4:
                    System.out.println("Fin del programa:");
                    break;
                default:
                    System.out.println("Opción pulsada incorrecta !!!");
                    System.out.println("");

            }
        }while(opcion != 4);

        }
    
}
