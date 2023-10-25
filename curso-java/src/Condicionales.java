import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        String dia;
        int edad;
        DayOfWeek fechaDeHoy;
        Scanner entrada = new Scanner(System.in);


        System.out.println(" Hola! bienvenido al baile virtual. Dime tu edad");
        edad = entrada.nextInt();
        fechaDeHoy = DayOfWeek.of(3);
        if (edad > 18) {
            System.out.println("pasa");
        }else if( edad <= 17 && fechaDeHoy.getValue() != 3) {
            System.out.println("pasa pero solo por hoy");
            
        }else{
            System.out.println("no pasa solo el " + fechaDeHoy);
        }
    

        
    }
}
