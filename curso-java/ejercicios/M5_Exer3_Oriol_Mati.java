package ejercicios;

import java.util.Scanner;

public class M5_Exer3_Oriol_Mati {
    public static void main(String[] args) {
        int numUser= 0;
        int numAleatorioMaquina =(int) Math.ceil((Math.random() * 10));

        System.out.println(" juguemos! intente advinar el numero que la maquina ha pensado");
        Scanner entrada = new Scanner(System.in);
        System.out.println(" la maquina ya ha pensado, ahora dime tu el tuyo");
        numUser = entrada.nextInt();

        while (numUser != numAleatorioMaquina){
            System.out.println(" numero no está correcto, intentalo otra vez " );
            numUser = entrada.nextInt();
        }
        
        if (numUser == numAleatorioMaquina) {
           System.out.println("enhorabuena! el numero de la maquina era " + numAleatorioMaquina);
           
        }
        entrada.close();
    }
}
