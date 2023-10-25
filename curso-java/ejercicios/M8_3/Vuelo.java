package ejercicios.M8_3;


public class Vuelo extends Cliente{
    // Atributos
    private int numFlight;
    private String company= "";
    private int distance;
    private double co2mes;

    // constructors
    public Vuelo(int numFlight, String company, int distance, double co2mes){
        super(company, distance, company);
        this.numFlight = numFlight;
        this.company = company;
        this.distance = distance;
        this.co2mes = co2mes;
    }
    public Vuelo(int numFlight, String company, String dni, int edad, String nacionalidad){
        super(dni, edad, nacionalidad);
        this.numFlight = numFlight;
        this.company = company;
        this.distance = distance;
        this.co2mes = co2mes;
    }

    public int getNumFlight() {
        return numFlight;
    }

    
    public String getCompany() {
        return company;
    }
    
    
    public int getDistance() {
        return distance;
    }


    public void setCompany(String company) {
        this.company = company;
    }
    
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setNumFlight(int numFlight) {
        this.numFlight = numFlight;
    }

    public double getCo2mes() {
        return co2mes;
    }

    public void setCo2mes(double co2mes) {
        this.co2mes = co2mes;
    }

    
    public String toString(){
        return " soy el vuelo " + this.numFlight + " de la company " + this.getCompany() + " con el pasajero del nie: " + super.getDni() + " con la edad "
        + super.getEdad() + " con la nacionalidadn " + super.getNacionalidad();
    }
    

    }
