package ejercicios.src.M8;
/*"Crear un programa que tenga una clase llamada Cliente, además de la clase que contiene el método main.

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

public class M8_Exe1_Oriol_Mati_PauloAlberto {
    static Cliente jorge = new Cliente("", "");
    static Cliente rocio = new Cliente("J898989 ", 40, "España ", 19);
    public static void main(String[] args) {
        String nacionalidad = "Colombia";
        String dni = "Y-778899";
        jorge.setNacionalidad(nacionalidad);
        jorge.setDni(dni);
        //System.out.println(jorge.getEdad());
        System.out.println(jorge.toString());
       // System.out.println(jorge.calculoCarbono());
        System.out.println(rocio.toString());
       // System.out.println(rocio.calculoCarbono());
       // System.out.println(rocio.getNacionalidad());
        //System.out.println(rocio.getEdad());
    }
}
