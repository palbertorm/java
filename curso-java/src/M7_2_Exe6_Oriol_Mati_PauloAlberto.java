import java.util.Scanner;

public class M7_2_Exe6_Oriol_Mati_PauloAlberto {
    public static void main(String[] args) {
         int num;
         String impress;
        Scanner input = new Scanner(System.in);
        System.out.println(" confirma si el numero es primo ");
        num = input.nextInt();
        impress = esPrimo(num) ? "Exacto el " + num + " es primo"  : " este no es primo ";
        System.out.println(impress);
        // if (esPrimo(num)) {
        //     System.out.println("Exacto el " + num + " es primo ");
        // }else{
        //     System.out.println(" el " + num + " no es primo");
        // }
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
