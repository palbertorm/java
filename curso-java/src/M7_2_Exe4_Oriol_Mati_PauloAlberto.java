import java.util.Scanner;

public class M7_2_Exe4_Oriol_Mati_PauloAlberto {
    /*
     * Realitzar un programa on l’usuari/ària introdueix un número i el programa crida a un mètode que retorna el factorial del número introduït.

El factorial d'un nombre n (enter, no negatiu) és el producte de tots els nombres enters positius inferiors o iguals a n. 
     */
    static int respuesta = 0;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int numUser = 0;
        long factorial = 0;
        System.out.println(" Introduce el numero que quieres en Factorial");
        numUser = input.nextInt();
        if (numUser < 0) {
            System.out.println(" el numero no puede ser negativo ");
        } else {
            
            factorial =calcularFactorial(numUser);
            System.out.println(" el factorial de " + numUser + " es " + factorial);
        }

input.close();
    }
    public static int calcularFactorial(int numUser){
        // if (numUser < 0 ) {
        //     //throw new IllegalArgumentException(" el numero nu puede ser negativo");
            
        // }
        if(numUser == 0 || numUser == 1){
            respuesta = 1;
            return respuesta;
        }else{
            respuesta = numUser;
            for (int i = 2; i < numUser; i++) {
                respuesta *= i;
            }
            //  return numUser * calcularFactorial(numUser - 1);
        }
        return respuesta;
    }
}
