import java.util.Scanner;

public class M7_2_Exe5_Oriol_mati_PauloAlberto {
    /*
     * L’usuari/ària introdueix un nombre per teclat i el programa crida a un mètode
     * que indiqui si el número és primer o no.
     * int numPrimo = num > 1 && divisible por 1 y por si mismo
     */
    public static void main(String[] args) {
        int num;
        String impress;
        Scanner input = new Scanner(System.in);
        System.out.println(" confirma si el numero es primo ");
        num = input.nextInt();
        impress = esPrimo(num) ? " es primo " : " este no es primo ";
        System.out.println(impress);
        if (esPrimo(num)) {
            System.out.println("Exacto el " + num + " es primo ");
        }
        input.close();
    }

    public static boolean esPrimo(int num) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != num)) {
            if (num % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;

    }
}
