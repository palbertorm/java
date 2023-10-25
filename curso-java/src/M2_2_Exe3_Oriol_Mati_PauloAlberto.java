import java.util.Scanner;
/*
 * Fes un programa que mostri el següent per pantalla:

*

* *

* * *

* * * *

* * * * *

* * * * * *

* * * * *

* * * *

* * *

* *

*

La línia amb més “*” vindrà donada per un número que l’usuari/ària introduirà per consola.
 */
public class M2_2_Exe3_Oriol_Mati_PauloAlberto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int numUser = 0;
    System.out.println(" type the number of lines ");
    numUser = input.nextInt();
    for (int i = 0; i <= numUser; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
    for (int i = numUser; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
    input.close();
    }
}
