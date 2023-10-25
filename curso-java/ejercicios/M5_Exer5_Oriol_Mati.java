package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
/*Debes solicitar palabras hasta que tengas tres bonitas. 
Debes ir guardando las palabras bonitas en un array
 y cuando tengas las tres, imprimirlas*/
public class M5_Exer5_Oriol_Mati {
    public static void main(String[] args) {
        String palabraBonita = "";
        int numDePalabras = 3;

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arrPalabrasBonitas = new ArrayList<String>();

        for (int i = 0; i < numDePalabras; i++) {
            System.out.println(" dime algunas palabras que para ti son bonitas ");
            palabraBonita = entrada.nextLine().toLowerCase();

            if ((palabraBonita.length() == 9 || palabraBonita.length() == 5)) {
                System.out.println(
                        "Els estudis lingüístics moderns diuen que les paraules més boniques de diccionari són aquelles que contenen 9 lletres i comencen per la lletra 'H'");
                if (palabraBonita.charAt(0) == 'a' || palabraBonita.charAt(0) == 'h') {

                    arrPalabrasBonitas.add(palabraBonita);
                }

            }

        }
        if (arrPalabrasBonitas.isEmpty()) {
            System.out.println(" tu palabras no coiciden con el estudio linguistico");
        }else{

            System.out.println(arrPalabrasBonitas);
        }
       
        
    }
}
