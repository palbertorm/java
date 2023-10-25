
import java.util.Scanner;

public class M7_1_Exe1_Oriol_Mati_Paulo_Alberto {
    /*
     * Crea un programa que sol·liciti a l'usuari/ària que introdueixi tres nombres
     * enters per teclat
     * i mostri per pantalla el major dels tres, el menor dels tres o si hi ha dos
     * números iguals.
     */
    static int numMayor = 0;
    static int numMenor = 0;
    static int numIgual = 0;
    public static void main(String[] args) {
        // int num1 = 0;
        // Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        int[] numeros = { 0, 0, 0 };
        int mayor= 0;
        int menor= 0;
        int igual= 0;
        System.out.println("Introduzca tres numeros enteros.");
        System.out.println("Introduzca el numero 1: ");
        num1 = input.nextInt();
        numeros[0] = num1;
        System.out.println("Introduzca el numero 2: ");
        num2 = input.nextInt();
        numeros[1] = num2;
        System.out.println("Introduzca el numero 3: ");
        num3 = input.nextInt();
        numeros[2] = num3;

        
        mayor = numMayor(numeros);
        menor = numMenor(numeros);
        igual = numIgual(numeros);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero maior es: " + mayor);
        System.out.println("El numero IGUAL es: " + igual);

        input.close();

    }

    public static int numMayor(int[] numeros) {
        int numInicial = numeros[0];

        for (int i = 1; i <= 2; i++) {

            if (numInicial > numeros[i]) {
                numMayor = numInicial;
            }else{
                numMayor = numeros[i];
            }
        }
        return numMayor;

    }

    public static int numMenor(int[] numeros) {
        int numInicial = numeros[0];

        for (int i = 1; i <= 2; i++) {

            if (numInicial < numeros[i]) {
                numMenor = numInicial;
            }else{
                numMenor = numeros[i];
            }
        }
        return numMenor;

    }
    public static int numIgual(int[] numeros) {
        int numInicial = numeros[0];

        for (int i = 1; i <= 2; i++) {

            if (numInicial == numeros[i]) {
                numIgual = numInicial;
            }else{
                System.out.println(" no hay numeros iguales");
            }
        }
        return numIgual;

    }

    // public static int maior(int[] numeros) {
    //     int numInicial = numeros[0];

    //     for (int i = 1; i >= 2; i++) {

    //         if (numInicial > numeros[i]) {
    //             numInicial = numeros[i];
    //         } else {
    //             numInicial = numeros[i];

    //         }
    //     }
    //     return numInicial;
    // }

}
