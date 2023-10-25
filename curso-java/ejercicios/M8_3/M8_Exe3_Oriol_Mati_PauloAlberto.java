package ejercicios.M8_3;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_Exe3_Oriol_Mati_PauloAlberto {
    /*
     * Modifica las clases Cliente y Vuelo para que se ajusten al diagrama de clases de la imagen.
    
    Crea un programa que tenga programadas todas las opciones del siguiente menú:
    
    java
    
    Salir de la aplicación.
    Crear un cliente.
    Eliminar un cliente.
    Crear un vuelo para un cliente.
    Compensar el CO₂ de un vuelo de un cliente (por cada 100 €, se compensan 0,1 toneladas de CO₂ emitidas por ese vuelo).
    Calcular la huella de carbono de un cliente (es la suma del CO₂ de todos sus vuelos).
    Calcular la huella de carbono promedio de todos los clientes.
    
    Considera:
    
        Las emisiones iniciales de CO₂ para todos los vuelos deben ser de 1 tonelada.
        Al crear un cliente, este no debe tener ningún vuelo "asociado".
        La aplicación solo debe tener un arreglo de clientes, no de vuelos. Los vuelos deben ser almacenados dentro de los clientes.
        El diagrama UML muestra las propiedades y métodos mínimos que deben tener las clases, pero puedes crear más si es necesario
     */
    static Scanner input = new Scanner(System.in);
    static ArrayList <Cliente> clientes= new ArrayList <Cliente>();
    static String response;
    static String dni;
    static int edad;
    static String nacionalidad;
    static int numFlight;
    static String company;

    
    public static void main(String[] args) {
        int option;

        do {
            
            System.out.println(" chosse onde option : \n"
                    + "1. Create Customer \n"
                    + "2. Remove Customer \n"
                    + "3. Create a Flight \n"
                    + "4. Change Flight \n"
                    + "5. Compensar Co2 de un vuelo de un cliente \n"
                    + "6. Calcular la huella de carbono promedio de todos los clientes. \n"
                    + "0. quit");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println(" to create a new customer tell me the ID ");
                    dni = input.next();
                    System.out.println(" is origin from? ");
                    nacionalidad = input.next();
                    response = createCustomer(dni, nacionalidad);
    
                    break;
                case 2:
                    System.out.println(" i need to know the ID to remove a customer ");
                    dni = input.next();
                    response = removeCustomer(dni);
                    break;
                case 3:
                    System.out.println(" type the number of flight ");
                    numFlight = input.nextInt();
                    System.out.println(" type the company of flight ");
                    company = input.next();
                    response= createFlight(numFlight, dni, company);
                    break;
                case 4:
                    System.out.println(" what the number of flight?");
                    numFlight = input.nextInt();
                    response = changeFlight(dni,numFlight, company);
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 0:
                    
                    break;
            
                default:
                    break;
            }
            System.out.println(response);
        } while (option != 0);
    }
    // create customer
    public static String createCustomer(String dni,  String nacionalidad) {
        //String response;
        Cliente  newCustomer = new Cliente(dni,nacionalidad);
        if (newCustomer.getDni() != "") {
            response = " Customer "+ newCustomer.getDni() + " created ";
            clientes.add(newCustomer);
        }else{
            response = " invalid creat";
        }
        return response;
    }

    //remove customer
    public static String removeCustomer(String dni) {
        //String response;
        int indice = -1;
        boolean found = false;
        int size = clientes.size();
        int i = 0;
        while (i < size && !found) {
            if (clientes.get(i).getDni().equals(dni)) {
                indice = i;
                found = true;
            }
            i++;
        }
        if (indice != -1) {
            clientes.remove(indice);
            response = " Customer removed ";
        }else{
            response = " invalid to remove";
        }
        return response;
    }

    // create flight for one client
    public static String createFlight(int numFlight,String dni, String company) {
        int indice = -1;
        boolean found = false;
        int size = clientes.size();
        int i = 0;
        Vuelo newFlight;
        while (i < size && !found) {
            if (clientes.get(i).getDni().equals(dni)) {
                indice = i;
                found = true;
            }
            i++;
        }
        if (indice != -1) {
            newFlight = new Vuelo(numFlight, company, dni, edad, nacionalidad);
            clientes.get(indice).setVuelos(newFlight);
            response = " flight creat " + clientes.get(indice).toString();
        } else {
            response = " flight creation denied ";
        }
        return response;
    }

    //Change flight
    public static String changeFlight(String dni, int numFlight, String company){
        int indice = -1;
        boolean found = false;
        int size = clientes.size();
        int i = 0;
        int newNumFlight;
        String newCompany;
        int option;
        
        while (i < size && !found) {
            if (clientes.get(i).getDni().equals(dni)) {
                indice = i;
                found = true;
            }
            i++;
        }if (indice != -1) {
            for (Vuelo vuelo : clientes.get(indice).getVuelos()) {
                if (vuelo.getNumFlight() == numFlight) {
                    System.out.println(" what do you want to change? " + "1. Flight Number \n"
                    + "2. Company Name \n");
                    option = input.nextInt();
                    switch (option) {
                        case 1:
                        System.out.println(" type the new number");
                        newNumFlight = input.nextInt();
                        vuelo.setNumFlight(newNumFlight);
                        response = " flight changed";
                        break;
                        
                        case 2:
                        System.out.println(" type the new company name");
                        newCompany = input.next();
                        vuelo.setCompany(newCompany);
                        response = " company changed";
                            break;
                    
                    }
                    
                }
            }
            

        }
        return response;
    }
}
