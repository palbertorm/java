import java.util.Scanner;

public class M7_1_Exe6_Oriol_Mati_Paulo_Alberto {
    /*
     * Taula de multiplicar.

L’usuari/ària introduirà un número (de l'1 al 10) per pantalla, i utilitzant un bucle, el programa li mostrarà la taula de multiplicar d’aquell número.

Exemple:

2 x 1 = 2

2 x 2 = 4

2 x 3 = 6

...

2 x 10 = 20

     */
    //static int numUser = 0;

static public int multiplicador(int numeroUsuario){
    int producto= 0;
    int i = 0;

        for ( i = 0; i <= 10; i++) {
           producto = numeroUsuario * i;
           System.out.println(" tabla "+ numeroUsuario + " x " + i + " = " + producto);
        }
        return producto;
        
}
    public static void main(String[] args) {
       int numUser = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" dime un numero para aplicar a una tabla de multiplicar ");
        numUser = input.nextInt();
        multiplicador(numUser);
        input.close();
    }
}
