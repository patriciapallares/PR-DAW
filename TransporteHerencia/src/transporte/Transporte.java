package transporte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// clase principal
public class Transporte {
    public static void main(String[] args) throws IOException {
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        //Declaración de variables
        ArrayList<Autobus> listaBuses; //ArrayList de objetos de tipo Autobus
        ArrayList<Conductor> listaConductores; //ArrayList de objetos de tipo Conductor
        int opcion, numId, indice, numBus, km;
        String nombre, tipoBus, ruta;
        float salario, precio, total;
        Conductor nuevo; //Objeto de tipo Conductor
        boolean encontrado;
        
        //Instanciación de un ArrayList tipo Autobus
        listaBuses = new ArrayList<Autobus>();
        //Instanciación de un ArrayList de tipo Conductor
        listaConductores = new ArrayList<Conductor>();
        
        do {
            // mostramos el menú y leemos la opción seleccionada
            do {
                System.out.println("-------------------------");
                System.out.println("  EMPRESA DE TRANSPORTE  ");
                System.out.println("-------------------------");
                System.out.println("1. Alta de conductores.");
                System.out.println("2. Alta de autobuses.");
                System.out.println("3. Imprimir billete.");
                System.out.println("4. Salir.");
                System.out.println("-------------------------");
                
                System.out.print("Opción: ");
                opcion = Integer.parseInt(teclado.readLine());
                
                if(opcion < 1 || opcion > 4) {
                    System.out.println("Opción incorrecta.");
                }
            }
            while(opcion < 1 || opcion > 4);
            
            switch(opcion) {
                case 1:  
                    // alta de un conductor, validamos nombre y salario
                    do {
                        System.out.print("Introduce el nombre del conductor: ");
                        nombre = teclado.readLine();
                        
                        if(nombre.equalsIgnoreCase("")) {
                            System.out.println("El nombre no puede estar vacío.");
                        }
                    }
                    while(nombre.equalsIgnoreCase(""));
                    
                    do {
                        System.out.print("Introduce el salario: ");
                        salario = Float.parseFloat(teclado.readLine());

                        if(salario <= 0) {
                            System.out.println("El salario tiene que ser mayor que 0.");
                        }
                    }
                    while(salario <= 0);
                    // lo ñadimos al Ayyalist de conductores
                    listaConductores.add(new Conductor(nombre, salario));
                    
                break;
                    
                case 2:
                    // alta de un nuevo autobus
                    nuevo = null;
                    do {
                        System.out.print("Inroduce el número de identificación: ");
                        numId = Integer.parseInt(teclado.readLine());
                        if(numId <= 0) {
                            System.out.println("El número debe ser mayor que 0.");
                        }
                    }
                    while(numId <= 0);
                    do {
                        encontrado = false;
                        System.out.print("Introduce el nombre del conductor: ");
                        nombre = teclado.readLine();
                        
                        if(nombre.equalsIgnoreCase("")) {
                            System.out.println("El nombre no puede estar vacío.");
                        }
                        else{
                           indice=0;
                           while (indice < listaConductores.size()&&!encontrado){
                                if (listaConductores.get(indice).getNombre().equalsIgnoreCase(nombre)){
                                    nuevo = listaConductores.get(indice);
                                    encontrado=true;
                                }
                                else
                                    indice++;
                           }
                           if (!encontrado)
                                System.out.println("El conductor no existe.");
                        }
                    }
                    while(!nombre.equalsIgnoreCase("")&&!encontrado);
                    
                    // pedimos resto de atributos del autobus                    
                    do {
                        System.out.print("Introduce el precio base del viaje: ");
                        precio = Float.parseFloat(teclado.readLine());
                        
                        if(precio <= 0) {
                            System.out.println("El precio base tiene que ser mayor que 0.");
                        }
                    }
                    while(precio <= 0);
                    
                    do {
                        System.out.print("Introduce el tipo de autobús (urbano 'u' o interurbano 'i'): ");
                        tipoBus = teclado.readLine();
                    }
                    while(!tipoBus.equalsIgnoreCase("u") && !tipoBus.equalsIgnoreCase("i"));
                    
                    if(tipoBus.equalsIgnoreCase("u")) {
                        
                        do {
                            System.out.print("Introduce el tipo de ruta: ");
                            ruta = teclado.readLine();

                            if(ruta.equalsIgnoreCase("")) {
                                System.out.println("La ruta no puede estar vacía.");
                            }
                        }
                        while(ruta.equalsIgnoreCase(""));
                        
                        listaBuses.add(new AutobusUrbano(numId, nuevo, precio, ruta));
                    }
                    else {
                        
                        do {
                            System.out.print("Introduce el número de km: ");
                            km = Integer.parseInt(teclado.readLine());

                            if(km <= 0) {
                                System.out.println("Los km tienen que ser mayor que 0.");
                            }
                        }
                        while(km <= 0);
                        
                        listaBuses.add(new AutobusInterurbano(numId, nuevo, precio, km));
                    }
                    
                break;
                    
                case 3:
                    // imprimir billete
                    encontrado = false;
               
                    System.out.print("Introduce el número de autobús: ");
                    numBus = Integer.parseInt(teclado.readLine());
                    
                    indice = 0;
                            
                    while(indice < listaBuses.size() &&  !encontrado) {
                        
                        if(listaBuses.get(indice).getId() == numBus) {

                            total = listaBuses.get(indice).calcularPrecioViaje();
                            
                            System.out.println("DATOS DEL BILLETE");
                            System.out.println("Número de identificación: " +listaBuses.get(indice).getId());
                            System.out.print("Nombre del conductor: ");
                            listaBuses.get(indice).mostrarNombreConductor();
                            System.out.println("Precio total del billete: " +total);
                            encontrado = true;
                        }
                        else 
                           indice++;
                    }
                    
                    if(!encontrado) {
                        System.out.println("Autobús no encontrado.");
                    }
                    
                break;
                    
                case 4:
                    
                    System.out.println("Fin del programa.");
                    
                break;
            }
        }
        while(opcion != 4);
    }
}