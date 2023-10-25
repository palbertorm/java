package ejercicios.M8_2.src;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * "Create un programa que permita dar de alta, modificar, ver y eliminar vuelos.

La clase 'Vuelo' tendrá los atributos: distancia (en km), número de vuelo, compañía, número de pasajeros, número de motores. También deberá contener un constructor completo y los getters y setters necesarios.
Finalmente, la clase 'Vuelo' tendrá un método 'calculaPetjadaCarboni()' que calculará el CO₂ emitido por el avión teniendo en cuenta que cada motor libera 0,1 toneladas de CO₂ cada 1000 km de distancia.

Las funcionalidades del programa serán las siguientes:

    El método 'crearVuelo()' deberá recibir los datos para crear un vuelo y agregarlo a un array de vuelos.

    El método 'darDeBajaVuelo()' deberá recibir el número de vuelo que se desea dar de baja. Si el vuelo está 
    dentro del array, lo eliminaremos y mostraremos un mensaje informativo en pantalla. Si no, informaremos que el vuelo no se encuentra en nuestra aplicación.

    El método 'verVuelo()' deberá recibir el número de vuelo que se desea mostrar. Si el vuelo está dentro del array,
     mostraremos todos sus atributos y también llamaremos al método 'calculaPetjadaCarboni()'. Si no, informaremos que el vuelo no se encuentra en nuestra aplicación.

    El método 'modificarVuelo()' deberá recibir el número de vuelo que se desea modificar. Si el vuelo está dentro del array, 
    preguntaremos qué atributo se desea modificar, realizaremos la modificación correspondiente y mostraremos un mensaje informativo 
    en pantalla. Si no, informaremos que el vuelo no se encuentra en nuestra aplicación."
 */
public class M8_Exe2_Oriol_Mati_PauloAlberto {

    static ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
    static Scanner input = new Scanner(System.in);
    // static ArrayList<Vuelo> imprimir;

    
    static String response = "";
    public static void main(String[] args) {
        int option;
        int numFlight;
        int numPax;
        String company;

        do {
            System.out.println(" chosse onde option : \n"
                    + "1. Create fligh \n"
                    + "2. Check Flight \n"
                    + "3. Change flight \n"
                    + "4. Remove Flight \n"
                    + "0. quit");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println(" to create a flight i need to know the number of flight");
                    numFlight = input.nextInt();
                    System.out.println(" to create a flight i need to knowt he capacity of pax");
                    numPax = input.nextInt();
                    System.out.println(" to create a flight i need to know the name of company");
                    company = input.next();

                    response = crearVuelo(numFlight, numPax, company);
                    break;

                case 2:
                    System.out.println(" type your flight number ");
                    numFlight = input.nextInt();
                    response = verVuelo(numFlight);
                    break;

                case 3:
                    System.out.println(" type your flight number ");
                    numFlight = input.nextInt();
                    response = modificarVuelo(numFlight);
                    break;

                case 4:
                    System.out.println(" type your flight number ");
                    numFlight = input.nextInt();
                    response = darDeBajaVuelo(numFlight);
                    break;
                case 0:
                    response = "hope i could help you! bye bye!!";
                    break;

                default:
                    response = "type a valid option";
            }
            System.out.println(response);

        } while (option != 0);
        // Vuelo imprimir = crearVuelo(4568,300,"vueling");
        // System.out.println(imprimir);
        // System.out.println(vuelos.get(0).getDistanceKm());
        // darDeBajaVuelo(45008);

    }

    static public String crearVuelo(int numFlight, int numPax, String company) {

        Vuelo vueloBilbaVuelo = new Vuelo(1000, numFlight, numPax, 4, company);
        vuelos.add(vueloBilbaVuelo);
        return " flight number" + numFlight + " from company " + company + " supports " + numPax + " numbers of pax ";
    }

    public static String darDeBajaVuelo(int numFlight) {
        // Vuelo removeFlight = null;
        int indice = -1;
        int size = vuelos.size();
        boolean found = false;
        int i = 0;
        while (i < size && !found) {
            if (vuelos.get(i).getNumFlight() == numFlight) {
                indice = i;
                found = true;
            }
            i++;
        }

        if (indice != -1) {
            vuelos.remove(indice);
            response = " Flight removed ";
        } else {
            response = " no flight found ";
        }
        return response;
        // for (Vuelo vuelo : vuelos) {
        // if (vuelo.getNumFlight() == numFlight) {
        // removeFlight = vuelo;
        // System.out.println(" flight removed");
        // }else{
        // System.out.println(" no flight to remove");
        // }
        // }
        // return removeFlight;
    }

    public static String verVuelo(int numFlight) {
        // Vuelo checkFlight = null;
        int indice = -1;
        int size = vuelos.size();
        boolean found = false;
        int i = 0;
        while (i < size && !found) {
            if (vuelos.get(i).getNumFlight() == numFlight) {
                indice = i;
                found = true;
            }
            i++;
        }
        return (indice != -1) ? vuelos.get(indice).toString() : " there's no flight";
        // for (Vuelo vuelo : vuelos) {
        // if (vuelo.getNumFlight() == numFlight) {
        // checkFlight = vuelo;
        // checkFlight.calculaPetjadaCarboni(numFlight, checkFlight.getNumEngines());
        // } else {
        // System.out.println(" flight not found");
        // }
        // }
        // return checkFlight;
    }

    public static String modificarVuelo(int numFlight) {
        int indice = -1;
        int size = vuelos.size();
        boolean found = false;
        int i = 0;
        // confirm if flight exists
        while (i < size && !found) {
            if (vuelos.get(i).getNumFlight() == numFlight) {

                indice = i;
                found = true;
            }
            i++;
        }
        if (indice != -1) {
            int option;
            int newNumFlight;
            int newNumPax;
            String newCompany;
            System.out.println(" what would you like to change : \n"
                    + "1. number Flight \n"
                    + "2. name company flight \n"
                    + "3. capacity pax \n");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println(" tipe a new number for your flight ");
                    newNumFlight = input.nextInt();
                    vuelos.get(indice).setNumFlight(newNumFlight);
                    break;

                case 2:
                    System.out.println(" type the new company name ");
                    newCompany = input.next();
                    vuelos.get(indice).setCompany(newCompany);
                    break;

                case 3:
                    System.out.println(" tipe a new capacity ");
                    newNumPax = input.nextInt();
                    vuelos.get(indice).setNumFlight(newNumPax);
                    break;

            }
            response = " flight changed with succesfull";
        } else {
            response = " flight not found";
        }
        return response;
    }

}
