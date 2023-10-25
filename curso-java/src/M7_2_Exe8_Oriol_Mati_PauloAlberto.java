import java.util.ArrayList;
import java.util.Scanner;

import ejercicios.M8_2.src.integer;

/**
 * M7_2_Exe8_Oriol_Mati_PauloAlberto
 */
public class M7_2_Exe8_Oriol_Mati_PauloAlberto {

    public static void main(String[] args) {
        int numUser;
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> fibo = new ArrayList<Integer>();
        System.out.println(" type a number and i'll show you off the Fibonacci sucection");
        numUser = input.nextInt();
        for (int i = 0; i < numUser; i++) {
            int addIndex = fibonacci(i);
            fibo.add(addIndex);
            
        }
        System.out.print(fibo);
        input.close();
    }
    public static int  fibonacci(int num){
        if (num == 0) {
            return 0;
        } else if (num == 1){
            return 1;
        }else{
            return fibonacci(num -1) + fibonacci(num -2);
        }
    }
}