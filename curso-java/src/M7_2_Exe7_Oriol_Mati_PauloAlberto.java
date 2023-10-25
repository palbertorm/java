import java.util.Scanner;

public class M7_2_Exe7_Oriol_Mati_PauloAlberto {
    /*
     * confirmamos si el año es bisesto
     */
    public static void main(String[] args) {
        int numUser;
        String response;
        Scanner input = new Scanner(System.in);
        System.out.println(" confirmamos si el año es bisesto ");
        numUser = input.nextInt();
        response = ( esBisesto(numUser)) ? "es bisest ":" no es bisesto ";
        System.out.println(response);
        input.close();

    }

    public static boolean esBisesto ( int num){
        boolean bisesto = false;
        if ((num % 400 == 0) || (num % 4 == 0 && num %100 != 0)) {
            bisesto = true;
        }
        return bisesto;
    }
}
