import java.util.Scanner;

public class M3_ex2_Oriol_Mati {
    public static void main(String[] args) {
        int suma,resta, multiplica, dividir = 0;
        
        Scanner entrance = new Scanner(System.in);

        System.out.println("type one number");

        int number1 = entrance.nextInt();
        
        System.out.println("i need another number");

        int number2 = entrance.nextInt();

        suma = number1 + number2;
        System.out.println("El resultat de la suma és:" + suma);

        resta = number1 - number2;
        
        System.out.println(" El resultat de la resta és :" + resta);
        multiplica = number1 * number2;
        
        System.out.println(" El resultat de la multiplicación és :" + multiplica);
        dividir = number1 / number2;
        float resultDividir = dividir;
        
        System.out.println(" El resultat de la división és :" +  resultDividir);

        
        
    }
}
