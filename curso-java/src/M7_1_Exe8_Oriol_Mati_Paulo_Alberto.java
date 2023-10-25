import java.util.ArrayList;
import java.util.Scanner;

public class M7_1_Exe8_Oriol_Mati_Paulo_Alberto {
    /*
     * Crea un menú que permeti canviar d’unitats:
     * 
     * Passar de metres a peus. De peus a metres. De metres a iardes. De iardes a
     * metres
     */
    static ArrayList<String> unidades = new ArrayList<String>();
    // static String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    static Scanner input = new Scanner(System.in);
    static int optionUser = 0;
    static int valueUser = 0;
    static int unitToBeConvert = 0;

    public static void main(String[] args) {
        double valueConvert = 0.0d;
        double valueConvertReverse = 0.0d;
        System.out.println(" elijas una unidade de medida: \n 1. pies \n 2. iardes ");
        optionUser = input.nextInt();
        switch (optionUser) {
            case 1:
                System.out.println("ahora dime el valor que quieres convertir ");
                valueUser = input.nextInt();
                valueConvert = unidadPiesConvert(valueUser);
                valueConvertReverse = valueConvert / 3.28084;
                System.out.println(" el valor convertirdo a pies es: " + valueConvert + " y el reves seria "
                        + valueConvertReverse);
               
                break;

            case 2:
                System.out.println("ahora dime el valor que quieres convertir ");
                valueUser = input.nextInt();
                valueConvert = unidadJardesConvert(valueUser);
                valueConvertReverse = valueConvert * 3.28084;
                System.out.println(" el valor convertirdo a pies es: " + valueConvert + " y el reves seria "
                        + valueConvertReverse);
                break;

        }
        // System.out.println("ahora dime el valor que quieres convertir ");
        // valueUser = input.nextInt();

    }

    static public double unidadPiesConvert(int longitudMetros) {
        double pies = longitudMetros * 3.28084;

        return pies;
        // if (unitToBeConvert.equals("metros")) {

        // }
    }

    static public double unidadJardesConvert(int longitudMetros) {
        double jardas = longitudMetros / 1.0936;
        return jardas;
    }

}
