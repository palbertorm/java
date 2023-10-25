package ejercicios.M8_3;

import java.util.ArrayList;

public class Cliente {
    private String dni = "";
    private int edad;
    private String nacionalidad;
    private ArrayList<Vuelo> vuelos;
   
    //Contructor
    public Cliente(String dni, int edad, String nacionalidad){
        this.dni = dni;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        
    }
    public Cliente( String dni, String nacionalidad){
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.vuelos = new ArrayList<Vuelo>();

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
     public ArrayList<Vuelo> getVuelos() {
         return vuelos;
     }
    
    // setters

    public void setDni(String dni){
        this.dni = dni;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    public void setVuelos(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }
    //Metodos genrales
    // public String calculoCarbono(){
    //     double toneladas = 0.5;
    //     double huelaCarbono = (double) this.numerVuelos * toneladas;
    //     return " la huela de carbono de este pasajero es " + huelaCarbono;
        
    // }
    // metodos proprios
    public String toString(){
        return " el cliente  con dni: " + this.dni + " tiene la edad de : " + this.edad + " años y  es natural de " + this.nacionalidad + " vuelo " + this.vuelos ;
    }
}


