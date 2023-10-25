import java.util.Scanner;

public class entrada_ejemplo {
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, introduzca su nombre");

        String nombre_user = entrada.nextLine();

        System.out.println("introduzca su edad");

        int edad = entrada.nextInt();

        System.out.println(" Hola " + nombre_user + " el proximo año terndrás " + (edad+1));
    }
}
