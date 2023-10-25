/*
 * Fer un programa on l’usuari/ària introdueix per pantalla un caràcter i un número. El programa imprimeix per pantalla un quadrat amb la mida i el caràcter introduïts per l’usuari/ària.

Exemple:

% % % % %

% % % % %

% % % % %

% % % % %

% % % % %
 */

import java.util.Scanner;

public class M7_1_Exe7_Oriol_Mati_Paulo_Alberto {
    public static void main(String[] args) {
        String charUser = "";
        int numUser = 0;

        Scanner input = new Scanner(System.in);
        System.out.println(" chosse one char ");
        charUser = input.next();
        System.out.println(" type the nunmber ");
        numUser = input.nextInt();

        for (int i = 0; i < numUser; i++) {
            
            for (int j = 0; j < numUser; j++) {
                
                System.out.print(charUser + " ");
            }               
            System.out.println();
        }
        input.close();
    }
}
