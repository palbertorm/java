package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class M6_Exer_Oriol_Mati {
    static int numeroNombres = 0;
    static String nameToArr= "";
    static ArrayList<String> nombres = new ArrayList<String>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void addNameToArr() {
        for (int i = 0; i < numeroNombres; i++) {
            System.out.println(" introzduca un nombre por vez, tu tienes "+ ( i + 1 )  +" nombres a poner");
            nameToArr = entrada.next().toLowerCase();
            nombres.add(nameToArr);
        }
    }
    public static ArrayList<String> filterName(ArrayList<String>nombres){
        for (String nombre : nombres) {
            if (nombre.startsWith("a")) {
                
                System.out.println(" nombres que empezan con la letra A " + nombre);
            }
        }
        return nombres;
    }
    
    public static void main(String[] args) {
        int cantidadNombreEntrada = 0;
        System.out.println(" introduzca la cantidad de nombre que deseas  ");
        cantidadNombreEntrada = entrada.nextInt();
        numeroNombres = cantidadNombreEntrada;
        addNameToArr();
        System.out.println(" los nombres que eligiste  son " + filterName(nombres));
        
    }
}
