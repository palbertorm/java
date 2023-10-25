package ejercicios.src.M8;
/*
 * "Crear un programa que tenga una clase llamada Cliente, además de la clase que contiene el método main.

Esta clase Cliente tendrá como atributos el DNI, la edad, la nacionalidad y el número de vuelos tomados.

La aplicación debe ser capaz de generar Clientes de dos maneras:

• Solo a partir del DNI y la Nacionalidad (la edad por defecto será de 18 años y el número de vuelos tomados por defecto será de 10).

• Indicando todos los atributos.

La clase Cliente debe tener los siguientes métodos:

• Métodos que permitan consultar cada uno de los atributos.

• Métodos que permitan modificar la nacionalidad y la edad.

• Un método que calcule la huella de carbono (multiplicando los viajes por 0,5 toneladas de CO₂).

• Un método que devolverá una descripción completa del cliente (toString()).

En el main del proyecto, crea dos clientes de las 2 maneras posibles y comprueba que los métodos creados funcionen correctamente. Es decir, llama a todos los métodos con los dos clientes."

 */
public class Cliente {
    private String dni = "";
    private int edad = 18;
    private String nacionalidad = "";
    private int numerVuelos = 10;

    //Contructor
    public Cliente(String DNI, int edad, String nacionalidad, int numerVuelos){
        this.dni = DNI;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.numerVuelos = numerVuelos;
    }
    public Cliente( String DNI, String nacionalidad){
        this.dni = DNI;
        this.nacionalidad = nacionalidad;

    }


    //getters
     public String getDni(){
        return this.dni;
     }
     public int getEdad(){
        return this.edad;
     }
     public String getNacionalidad(){
        return this.nacionalidad;
     }
     public int getNumerVuelos(){
        return this.numerVuelos;
     }
    
    // setters

    public void setDni(String DNI){
        this.dni = DNI;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public void setNumeroVuelos(int numerVuelos){
        this.numerVuelos = numerVuelos;
    }
    //Metodos genrales
    public String calculoCarbono(){
        double toneladas = 0.5;
        double huelaCarbono = (double) this.numerVuelos * toneladas;
        return " la huela de carbono de este pasajero es " + huelaCarbono;
        
    }
    // metodos proprios
    public String toString(){
        return " el cliente  con DNI: " + this.dni + " tiene la edad de : " + this.edad + " años y  es natural de " + this.nacionalidad + " y ha podido volar " + this.numerVuelos + " veces";
    }
}


