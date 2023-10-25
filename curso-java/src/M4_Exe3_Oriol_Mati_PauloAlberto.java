import java.util.Scanner;

public class M4_Exe3_Oriol_Mati_PauloAlberto {
/*
 * Els estudis lingüístics moderns diuen que les paraules més boniques de diccionari són aquelles que contenen 9 lletres 
 * i comencen per la lletra 'H', o bé , contenen 5 lletres i comencen per la lletra 'P'.

Fes un programa que demani una paraula i determini si és bonica o no (segons el patró explicat prèviament).


El mètode charAt() segur que et pot ajudar en aquest exercici.
 */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nomUser = "";
        System.out.println(" dime una palabra y compruebo si es bonita");
        nomUser = input.nextLine().toLowerCase();

        if (nomUser.length() == 9 && nomUser.charAt(0) == 'h') {
            System.out.println( " una palabra que tenga 9 letras y empieza por H es bonita");
        }
        else if(nomUser.length() == 5 && nomUser.charAt(0) == 'p'){
            System.out.println(nomUser + " es bonita! tiene 5 letras y empieza con P");
        }
        else {
            System.out.println(" de acordo con los estudios, no es bonita");
        }
        input.close();
    }
}