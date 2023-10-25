package ejercicios;

import java.util.Scanner;

public class M5_Exer4_Oriol_mati {
    public static void main(String[] args) {
        int numNinosNinas = 0;
        int edad = 0;
        int sumaEdades = 0;
        double mediaEdad = 0;
        int totalNino = 0;
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("indique la cuantidade de niños y niñas para la reserva ");
        numNinosNinas = entrada.nextInt();

        while (numNinosNinas > 0 && (edad < 5 || edad > 12 )) {
            System.out.print("Introduce la edad del " + (numNinosNinas) + " niño/niña ");
        //         // haz la interacion del contador  + 1, normalmente empieza por 0. lugo seria 0 +1, 1 +1, 2 +1 y etc.
        //         // desta manera podrá preguntar por la edad de cada  nino de acuerdo con la vuelta del contador.
                edad = entrada.nextInt();
                if (edad < 5 || edad > 12) {
                    System.out.println("La edad debe estar entre 5 y 12 años. Inténtalo de nuevo.");
                }else{
                    sumaEdades += edad;
                    numNinosNinas--;
                }
        }
        mediaEdad = (double) sumaEdades / totalNino;

        // for (int i = 0; i < numNinosNinas; i++) {
        //     do {
        //         System.out.print("Introduce la edad del " + (i + 1) + " niño/niña ");
        //         // haz la interacion del contador  + 1, normalmente empieza por 0. lugo seria 0 +1, 1 +1, 2 +1 y etc.
        //         // desta manera podrá preguntar por la edad de cada  nino de acuerdo con la vuelta del contador.
        //         edad = entrada.nextInt();
        //         if (edad < 5 || edad > 12) {
        //             System.out.println("La edad debe estar entre 5 y 12 años. Inténtalo de nuevo.");
        //         }
        //         sumaEdades += edad;
        //     } while (edad < 5 || edad > 12 );
        // }

        mediaEdad = sumaEdades / numNinosNinas;
        System.out.println("La media de edades de los niños y niñas es: " + mediaEdad);
        
        entrada.close();
    }
}
