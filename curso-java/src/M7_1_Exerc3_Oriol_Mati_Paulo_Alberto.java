import java.util.Scanner;

public class M7_1_Exerc3_Oriol_Mati_Paulo_Alberto {
    /*
     * L’usuari/ària ha d'introduir un número i el programa ha de mostrar per pantalla si el número és parell o imparell.
     */
    public static void main(String[] args) {
        int numUser = 0;
        int comprobaParImpar = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" introduzca un numero entero ");
        numUser = input.nextInt();
        comprobaParImpar = numUser % 2;
        if (comprobaParImpar != 0) {
            System.out.println(" el numero elgido es impar");
        }else{
            System.out.println(" el numero elgido es par");
        }
        input.close();
    }
}
