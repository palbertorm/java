import java.util.Scanner;

public class M7_2_Exe2_Oriol_Mati_PauloAlberto {
    /*
     * Fes un programa que mostri el següent per pantalla:

* * * * * *

* * * * *

* * * *

* * *

* *

*

El nombre de línies formades per “*” vindrà donat per un número que l’usuari/ària introduirà per consola.
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    int numUser = 0;
    System.out.println(" type the number of lines ");
    numUser = input.nextInt();
    for (int i = numUser; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
    input.close();
    }
}
