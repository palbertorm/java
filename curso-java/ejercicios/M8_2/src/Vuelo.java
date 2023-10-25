package ejercicios.M8_2.src;

/*
 * "Create un programa que permita dar de alta, modificar, ver y eliminar vuelos.

La clase 'Vuelo' tendrá los atributos: distancia (en km), número de vuelo, compañía, número de pasajeros, número de motores. También deberá contener un constructor completo y los getters y setters necesarios.
Finalmente, la clase 'Vuelo' tendrá un método 'calculaPetjadaCarboni()' que calculará el CO₂ emitido por el avión teniendo en cuenta que cada motor libera 0,1 toneladas de CO₂ cada 1000 km de distancia.

Las funcionalidades del programa serán las siguientes:

    El método 'crearVuelo()' deberá recibir los datos para crear un vuelo y agregarlo a un array de vuelos.

    El método 'darDeBajaVuelo()' deberá recibir el número de vuelo que se desea dar de baja. Si el vuelo está dentro del array, lo eliminaremos y mostraremos un mensaje informativo en pantalla. Si no, informaremos que el vuelo no se encuentra en nuestra aplicación.

    El método 'verVuelo()' deberá recibir el número de vuelo que se desea mostrar. Si el vuelo está dentro del array, mostraremos todos sus atributos y también llamaremos al método 'calculaPetjadaCarboni()'. Si no, informaremos que el vuelo no se encuentra en nuestra aplicación.

    El método 'modificarVuelo()' deberá recibir el número de vuelo que se desea modificar. Si el vuelo está dentro del array, preguntaremos qué atributo se desea modificar, realizaremos la modificación correspondiente y mostraremos un mensaje informativo en pantalla. Si no, informaremos que el vuelo no se encuentra en nuestra aplicación."
 */
public class Vuelo {
    //
    int distanceKm;
    int numFlight;
    int numPax;
    int numEngines;
    String company;

    // constructors
    public Vuelo(int distanceKm, int numFlight, int numPax, int numEngines, String company) {
        this.distanceKm = distanceKm;
        this.numFlight = numFlight;
        this.numPax = numPax;
        this.numEngines = numEngines;
        this.company = company;
    }
    public Vuelo( int numFlight, int numPax, String company) {
        //this.distanceKm = distanceKm;
        this.numFlight = numFlight;
        this.numPax = numPax;
       // this.numEngines = numEngines;
    }

    // Getters
    public int getDistanceKm() {
        return this.distanceKm;
    }

    public int getNumFlight() {
        return this.numFlight;
    }

    public int getNumPax() {
        return this.numPax;
    }

    public int getNumEngines() {
        return this.numEngines;
    }

    public String getCompany() {
        return this.company;
    }

    // Seters

    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }

    public void setNumFlight(int numFlight) {
        this.numFlight = numFlight;
    }

    public void setNumPax(int numPax) {
        this.numPax = numPax;
    }

    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // General Methods
    
    public double calculaPetjadaCarboni(int distanceKm, int numEngines) {
        double co2ByEngine = (double) numEngines * 0.1;
        double emisionCo2 = distanceKm / co2ByEngine;
        return emisionCo2;
    }
    // particular Methods
    public String toString() {
        return 
                " Number of flight " + this.numFlight +
                " quantity of pax " + this.numPax +
                " company " + this.company  + " the  total of Co2 throwed for this flight is " + calculaPetjadaCarboni(distanceKm, numEngines) + " toneladas";
    }
}
