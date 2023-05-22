/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ADO.*;
import Archivos.Ficheros;
import java.util.Scanner;
import MisListas.*;
import java.util.InputMismatchException;

public class Proyecto2122 {

    public static void main(String[] args) {
        // TODO code application logic here
        Articulo art;
        Scanner consola = new Scanner(System.in);
        ListaArticulos misArticulos = new ListaArticulos();
        ListaClientes misClientes = new ListaClientes();
        ListaAutores misAutores = new ListaAutores();
        Autor autorObj;
        Cliente cli;
        int opcion, opcionMant = 0, anyo = 0, menuArticulos, nPaginas = 0, horasDuracion = 0, minutos,
                nPistas = 0, edadRec = 0, dias = 0, anyoNac = 0, publi = 0;
        String cod, nombre, apellidos, nomAutor, apellAutor, fecha, resumen, deterioro, format, tapa,
                sintetiza, tipo, categoria, formatf, borrar = "", resp, dni, direcc, telef1, telef2, telef3;
        float duracion = 0;
        boolean ok, deteriorado, formato, sintetizador, formatoFisico;

        do {
            do {
                opcion = -1;
                System.out.println();
                System.out.println("1. Mantenimiento de un Articulo ");
                System.out.println("2. Precio alquiler de un artículo");
                System.out.println("3. Precio alquiler de todos los artículos");
                System.out.println("4. Alta de un cliente (socio)");
                System.out.println("5. Alta de un autor");
                System.out.println("6. Alquilar un artículo");
                System.out.println("7. Devolver un artículo");
                System.out.println("8. Cargar  ficheros (solo Artículos)");
                System.out.println("9. Guardar ficheros (solo Artículos)");
                System.out.println("0. Salir\n");
                System.out.println("");
                try {
                    System.out.print("Elige una opcion del menu :");
                    opcion = consola.nextInt();
                    if (opcion < 0 || opcion > 9) {
                        System.out.println("Error: Opción incorrecta! ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error no has introducido un numero");
                    borrar = consola.nextLine();
                    opcion = -1;
                }
            } while (opcion < 0 || opcion > 9);
            borrar = consola.nextLine();
            switch (opcion) {
                case 1: // 1. Mantenimiento de un Articulo 
                    do {
                        opcionMant = -1;
                        System.out.println();
                        System.out.println("1. Alta de un Artículo ");
                        System.out.println("2. Baja artículo");
                        System.out.println("0. Salir\n");
                        System.out.println("");
                        try {
                            System.out.print("Elige una opcion del menu :");
                            opcionMant = consola.nextInt();
                            if (opcionMant < 0 || opcionMant > 2) {
                                System.out.println("Error: Opción incorrecta! ");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error no has introducido un numero");
                            borrar = consola.nextLine();
                            opcionMant = -1;
                        }
                    } while (opcionMant < 0 || opcionMant > 2);
                    borrar = consola.nextLine();
                    switch (opcionMant) {
                        case 1: // 1. Alta de un Artículo 
                            do {
                                System.out.print("Nombre :");
                                nombre = consola.nextLine();
                                ok = MiLibreria.campoVacio(nombre);
                            } while (!ok);
                            do {
                                System.out.print("Fecha Alta Formato dd-mm-aaaa:");
                                fecha = consola.nextLine();
                                ok = MiLibreria.validarFecha(fecha);
                            } while (!ok);
                            do {
                                try {
                                    System.out.print("Año Publicación: ");
                                    anyo = consola.nextInt();
                                    ok = MiLibreria.validarPositivo(anyo);
                                } catch (InputMismatchException e) {
                                    System.out.println("Error no has introducido un número");
                                    borrar = consola.nextLine();
                                } catch (NumberFormatException e) {
                                    System.out.println("Error se ha introducido un caracter no numérico");
                                    borrar = consola.nextLine();
                                }
                            } while (!ok || anyo <= 0);
                            do {
                                consola.nextLine();
                                System.out.print("Resumen: ");
                                resumen = consola.nextLine();
                                ok = MiLibreria.campoVacio(resumen);
                            } while (!ok);

                            do {
                                System.out.print("Nombre autor :");
                                nomAutor = consola.nextLine();
                                ok = MiLibreria.campoVacio(nomAutor);
                            } while (!ok);
                            do {
                                System.out.print("Apellidos autor :");
                                apellAutor = consola.nextLine();
                                ok = MiLibreria.campoVacio(apellAutor);
                            } while (!ok);

                            // REVISAR MÉTODO PARA BUSCAR AUTOR
                            autorObj = misAutores.buscaAutor(nomAutor + apellAutor);
                            if (autorObj == null) {
                                System.out.println("Añadimos un nuevo autor a la lista");

                                autorObj = new Autor(nomAutor, apellAutor);
                                // MÉTODO PARA INSERTAR NUEVO AUTOR
                                misAutores.anadirAutor(autorObj);
                            } else {
                                System.out.println("El autor ya estaba dado de alta !");
                            }
                            do {
                                System.out.print("¿Deteriorado? Responda SI o NO :");
                                deterioro = consola.nextLine();
                                ok = MiLibreria.validarSN(deterioro);
                            } while (!ok);
                            if (deterioro.equalsIgnoreCase("si")) {
                                deteriorado = true;
                            } else {
                                deteriorado = false;
                            }
                            do {
                                try {
                                    System.out.println("¿Que clase de Artículo es ?");
                                    System.out.println("1.- LibroImpreso ");
                                    System.out.println("2.- AudioLibro ");
                                    System.out.println("3.- Musica ");
                                    System.out.println("4.- Videojuego");
                                    System.out.println("");
                                    System.out.print("Teclee opcion:");
                                    menuArticulos = consola.nextInt();

                                } catch (InputMismatchException e) {
                                    System.out.println("Error no has introducido un numero");
                                    borrar = consola.nextLine();
                                    menuArticulos = 0;
                                } catch (NumberFormatException e) {
                                    System.out.println("Error se ha introducido un caracter no numerico");
                                    borrar = consola.nextLine();
                                    menuArticulos = 0;
                                }
                            } while (menuArticulos < 1 || menuArticulos > 4);
                            switch (menuArticulos) {
                                case 1:
                                    System.out.println("Alta un LibroImpreso");
                                    nPaginas = 0;
                                    ok = false;
                                    do {
                                        try {
                                            System.out.print("Número de páginas :");
                                            nPaginas = consola.nextInt();
                                            ok = MiLibreria.validarPositivo(nPaginas);

                                        } catch (InputMismatchException e) {
                                            System.out.println("Error no has introducido un numero");
                                            borrar = consola.nextLine();
                                        } catch (NumberFormatException ex) {
                                            System.out.println("Error se ha introducido un caracter no numerico");
                                            borrar = consola.nextLine();
                                        }
                                    } while (!ok);

                                    consola.nextLine();
                                    ok = false;
                                    do {
                                        System.out.print("Tipo (Papel o Ebook) : ");
                                        format = consola.nextLine();
                                        ok = MiLibreria.validarFormatoLibro(format);
                                    } while (!ok);
                                    if (format.equalsIgnoreCase("ebook")) {
                                        formato = true;
                                    } else {
                                        formato = false;
                                    }
                                    ok = false;
                                    do {
                                        System.out.print("Tipo de tapa :");
                                        tapa = consola.nextLine();
                                        ok = MiLibreria.validarTapa(tapa);
                                    } while (!ok);

                                    // DECLARACIÓN DEL ARTÍCULO
                                    art = new LibroImpreso(formato, tapa, nPaginas, nombre,
                                            fecha, anyo, resumen, autorObj, deteriorado);
                                    
                                    // MÉTODO PARA INSERTAR EN LA LISTA DE ARTÍCULOS
                                    ok = misArticulos.anadirArticulo(art);
                                    if (ok) {
                                        System.out.println("Artículo añadido !!!");
                                        art.info();
                                    } else {
                                        System.out.println("No se ha podido añadir el LibroImpreso");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Alta un AudioLibro");
                                    ok = false;
                                    do {
                                        try {
                                            System.out.print("Número de páginas :");
                                            nPaginas = consola.nextInt();
                                            ok = MiLibreria.validarPositivo(nPaginas);

                                        } catch (InputMismatchException e) {
                                            System.out.println("Error no has introducido un numero");
                                            borrar = consola.nextLine();
                                        } catch (NumberFormatException ex) {
                                            System.out.println("Error se ha introducido un caracter no numerico");
                                            borrar = consola.nextLine();
                                        }
                                    } while (!ok);
                                    borrar = consola.nextLine();
                                    ok = false;
                                    do {
                                        System.out.print("¿Sintetizador? Responda SI o NO :");
                                        sintetiza = consola.nextLine();
                                        ok = MiLibreria.validarSN(sintetiza);
                                    } while (!ok);
                                    if (sintetiza.equalsIgnoreCase("si")) {
                                        sintetizador = true;
                                    } else {
                                        sintetizador = false;
                                    }
                                    ok = false;
                                    do {
                                        try {
                                            System.out.print("Horas de Duración :");
                                            horasDuracion = consola.nextInt();
                                            ok = MiLibreria.validarPositivo(horasDuracion);
                                        } catch (InputMismatchException e) {
                                            System.out.println("Error no has introducido un numero");
                                            borrar = consola.nextLine();
                                        } catch (NumberFormatException ex) {
                                            System.out.println("Error se ha introducido un caracter no numerico");
                                            borrar = consola.nextLine();
                                        }
                                    } while (!ok);
                                    ok = false;
                                    do {
                                        try {
                                            System.out.print("Minutos de Duración :");
                                            minutos = consola.nextInt();
                                            ok = MiLibreria.validarMinutos(minutos);
                                        } catch (InputMismatchException e) {
                                            System.out.println("Error no has introducido un numero");
                                            borrar = consola.nextLine();
                                        } catch (NumberFormatException ex) {
                                            System.out.println("Error se ha introducido un caracter no numerico");
                                            borrar = consola.nextLine();
                                        }
                                    } while (!ok);
                                    
                                    art = new AudioLibro(sintetizador, horasDuracion, horasDuracion,
                                            nPaginas, nombre, fecha, anyo, resumen, autorObj, deteriorado);
                                    ok = misArticulos.anadirArticulo(art);
                                    if (ok) {
                                        System.out.println("AudioLibro añadido !!!");
                                    } else {
                                        System.out.println("No se ha podido añadir el AudioLibro");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Alta artículo musical");
                                    ok = false;
                                    do {
                                        try {
                                            System.out.print("Número de Pistas :");
                                            nPistas = consola.nextInt();
                                            ok = MiLibreria.validarPositivo(nPistas);
                                        } catch (InputMismatchException e) {
                                            System.out.println("Error no has introducido un numero");
                                            borrar = consola.nextLine();
                                        } catch (NumberFormatException ex) {
                                            System.out.println("Error se ha introducido un caracter no numerico");
                                            borrar = consola.nextLine();
                                        }
                                    } while (!ok);
                                    ok = false;
                                    do {
                                        try {
                                            System.out.print("Duración :");
                                            duracion = consola.nextFloat();
                                            ok = MiLibreria.validarPositivo(duracion);
                                        } catch (InputMismatchException e) {
                                            System.out.println("Error no has introducido un numero");
                                            borrar = consola.nextLine();
                                        } catch (NumberFormatException ex) {
                                            System.out.println("Error se ha introducido un caracter no numerico");
                                            borrar = consola.nextLine();
                                        }
                                    } while (!ok);
                                    consola.nextLine();//elimina el buffer de Scanner
                                    ok = false;
                                    do {
                                        System.out.print("Tipo: CD o Vinilo : ");
                                        tipo = consola.nextLine();
                                        ok = MiLibreria.validarTipo(tipo);
                                    } while (!ok);
                                    //Constructor del articulo de Musica:
                                    art = new Musica(nPistas, duracion, tipo, nombre,
                                            fecha, anyo, resumen, autorObj, deteriorado);

                                    ok = misArticulos.anadirArticulo(art);
                                    if (ok) {
                                        System.out.println("Artículo de música añadido !!!");
                                    } else {
                                        System.out.println("No se ha podido añadir el artículo");
                                    }
                                    break;

                                case 4:
                                    System.out.println("Vamos a dar de Alta un Videojuego");
                                    ok = false;
                                    do {
                                        try {
                                            System.out.print("Edad Recomendada :");
                                            edadRec = consola.nextInt();
                                            ok = MiLibreria.validarEdadRecomendada(edadRec);
                                        } catch (InputMismatchException e) {
                                            System.out.println("Error no has introducido un numero");
                                            borrar = consola.nextLine();
                                        } catch (NumberFormatException ex) {
                                            System.out.println("Error se ha introducido un caracter no numerico");
                                            borrar = consola.nextLine();
                                        }
                                    } while (!ok);
                                    ok = false;
                                    borrar = consola.nextLine();
                                    do {
                                        System.out.print("Categoria: ");
                                        categoria = consola.nextLine();
                                        ok = MiLibreria.campoVacio(categoria);
                                    } while (!ok);
                                    ok = false;
                                    do {
                                        System.out.print("¿Tiene formato físico si/no :");
                                        formatf = consola.nextLine();
                                        ok = MiLibreria.validarSN(formatf);
                                    } while (!ok);
                                    if (formatf.equalsIgnoreCase("s")) {
                                        formatoFisico = true;
                                    } else {
                                        formatoFisico = false;
                                    }
                                    art = new VideoJuego(edadRec, categoria, categoria,
                                            formatoFisico, nombre, fecha, anyo,
                                            resumen, autorObj, deteriorado);
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
                            System.out.println("Baja de un Artículo.");
                            System.out.print("Código Artículo: ");
                            cod = consola.nextLine();
                            art = misArticulos.buscaArticulo(cod);
                            if (art != null) {
                                ok = false;
                                do {
                                    System.out.println("Confirmación de borrado si/no");
                                    resp = consola.nextLine();
                                    ok = MiLibreria.validarSN(resp);
                                } while (!ok);
                                if (resp.equalsIgnoreCase("si")) {
                                    misArticulos.borrarArticulo(art);
                                    System.out.println("Artículo borrado");
                                }
                            } else {
                                System.out.println("Artículo no encontrado");
                            }
                            break;
                    }
                    break;
                case 2: // 2. Precio alquiler de un artículo
                    consola.nextLine();
                    System.out.print("Código Artículo: ");
                    cod = consola.nextLine();
                    art = misArticulos.buscaArticulo(cod);
                    if (art != null) {
                        dias = 0;
                        do {
                            try {
                                System.out.println("Número de días de alquiler");
                                dias = consola.nextInt();
                                if (dias <= 0) {
                                    System.out.println("Dato incorrecto");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error no has introducido un numero");
                                borrar = consola.nextLine();
                            } catch (NumberFormatException ex) {
                                System.out.println("Error se ha introducido un caracter no numerico");
                                borrar = consola.nextLine();
                            }
                        } while (dias <= 0);
                        System.out.println("Precio: " + art.precioAlquilerArticulo(dias));
                    } else {
                        System.out.println("Artículo no encontrado");
                    }
                    break;

                case 3: // 3. Precio alquiler de todos los artículos
                    ok = false;
                    do {
                        try {
                            System.out.print("Número de días de alquiler: ");
                            dias = consola.nextInt();
                            ok = MiLibreria.validarPositivo(dias);
                        } catch (InputMismatchException e) {
                            System.out.println("Error no has introducido un numero");
                            borrar = consola.nextLine();
                        } catch (NumberFormatException ex) {
                            System.out.println("Error se ha introducido un caracter no numerico");
                            borrar = consola.nextLine();
                        }
                    } while (!ok);
                    System.out.println("Comprobamos que la lista de Articulos no esta vacía:");
                    if (misArticulos.numArticulos() > 0) {
                        misArticulos.mostrarPrecios(dias);
                    } else {
                        System.out.println("No hay Artículos !");
                    }
                    break;

                case 4: // Alta de un cliente
                    ok = false;
                    do {
                        System.out.print("DNI socio :");
                        dni = consola.nextLine();
                        ok = MiLibreria.validarDni(dni);
                    } while (!ok);
                    ok = false;
                    do {
                        System.out.print("Nombre socio :");
                        nombre = consola.nextLine();
                        ok = MiLibreria.campoVacio(nombre);
                    } while (!ok);
                    do {
                        System.out.print("Apellidos socio :");
                        apellidos = consola.nextLine();
                        ok = MiLibreria.campoVacio(apellidos);
                    } while (!ok);
                    do {
                        System.out.print("Dirección :");
                        direcc = consola.nextLine();
                        ok = MiLibreria.campoVacio(direcc);
                    } while (!ok);
                    do {
                        System.out.print("Teléfono 1 :");
                        telef1 = consola.nextLine();
                        ok = MiLibreria.campoVacio(telef1);
                    } while (!ok);
                    System.out.print("Teléfono 2 :");
                    telef2 = consola.nextLine();
                    System.out.print("Teléfono 3 :");
                    telef3 = consola.nextLine();

                    cli = new Cliente(dni, nombre, apellidos, direcc, telef1, telef2, telef3, 0);
                    
                    if (misClientes.buscaCliente(dni) == null) {
                        ok = misClientes.anadirCliente(cli);
                        if (ok) {
                            System.out.println("Cliente añadido !!!");
                        } else {
                            System.out.println("No se ha podido añadir el cliente ");
                        }
                    } else {
                        System.out.println("Ese cliente ya existe");
                    }
                    break;

                case 5:
                    ok = false;
                    do {
                        System.out.print("Nombre Autor :");
                        nombre = consola.nextLine();
                        ok = MiLibreria.campoVacio(nombre);
                    } while (!ok);
                    do {
                        System.out.print("Apellidos autor :");
                        apellidos = consola.nextLine();
                        ok = MiLibreria.campoVacio(apellidos);
                    } while (!ok);
                    do {
                        try {
                            System.out.print("Año nacimiento : ");
                            anyoNac = consola.nextInt();
                            ok = MiLibreria.validarPositivo(anyoNac);
                        } catch (InputMismatchException e) {
                            System.out.println("Error no has introducido un numero");
                            borrar = consola.nextLine();
                        } catch (NumberFormatException ex) {
                            System.out.println("Error se ha introducido un caracter no numerico");
                            borrar = consola.nextLine();
                        }
                    } while (!ok);
                    do {
                        try {
                            System.out.print("Publicaciones : ");
                            publi = consola.nextInt();
                            ok = MiLibreria.validarPositivo(publi);
                        } catch (InputMismatchException e) {
                            System.out.println("Error no has introducido un numero");
                            borrar = consola.nextLine();
                        } catch (NumberFormatException ex) {
                            System.out.println("Error se ha introducido un caracter no numerico");
                            borrar = consola.nextLine();
                        }
                    } while (!ok);
                    autorObj = new Autor(nombre, apellidos, anyoNac, publi);
                    if (misAutores.buscaAutor(nombre + apellidos) == null) {
                        ok = misAutores.anadirAutor(autorObj);
                        if (ok) {
                            System.out.println("Autor añadido !!!");
                        } else {
                            System.out.println("No se ha podido añadir al autor ");
                        }
                    } else {
                        System.out.println("Ese autor ya existe");
                    }
                    break;
                case 6, 7:
                    System.out.println("No realizado");
                    break;
                case 8:
                    System.out.println("Cargando Ficheros");
                    Ficheros.cargarArticulos(misArticulos);
                    break;
                case 9:
                    System.out.println("Guardando Ficheros");
                    Ficheros.guardarArticulos(misArticulos);
                    break;
                case 0:
                    System.out.println("Fin de programa");
                    break;
                default:
                    System.out.println("Opción pulsada incorrecta !!!");
                    System.out.println("");

            }

        } while (opcion
                != 0);

    }

}
