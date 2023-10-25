package ejercicios;

import java.util.Scanner;

public class M5_Extra1 {
    public static void main(String[] args) {
        int numeroAleatorioUser = 0;
        int numeroMaquina = (int) (Math.random() * 500) + 1;
        int diferencia = numeroMaquina - numeroAleatorioUser ;
        int intentos = 3;
        Scanner entrada = new Scanner(System.in);

        
        while (numeroAleatorioUser != numeroMaquina && intentos > 0) {
            System.out.println("Dime un numero de 1 a 500 ");
            numeroAleatorioUser = entrada.nextInt();
            System.out.println(numeroMaquina + "numero do usuairo ");
            
            if (diferencia > 50) {
                System.out.println(" Fred, fred: el teu número és més petit ");
            } else if (diferencia >= 15 && diferencia <= 50)  {
                System.out.println(" Tebi, Tebi: el teu número és més petit");
            } else if(diferencia < 15) {
                System.out.println(" Calent, calent: el teu número és més petit ");
            }
            --intentos;
        }
        System.out.println("Enhorabuena has ganado ");
        entrada.close();
    }
}
