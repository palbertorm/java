import java.util.Scanner;

public class M4_Exe5_Oriol_mati_PauloAlberto {
    /*
     * Fer un programa que demani dos números i un operador(+,-,*,/).

Al final, el programa ha d'imprimir per pantalla 
el resultat de fer l’operació que contingui la variable operador.
     */
    public static void main(String[] args) {
        int numUser = 0;
        int numUser2 = 0;
        int resultado =0;
        char operadorUser;
        Scanner input = new Scanner(System.in);
        System.out.println( " dime un numero  ");
        numUser = input.nextInt();
        System.out.println( " dime un otro numero  ");
        numUser2 = input.nextInt();
        System.out.println( " dime un operador ");
        operadorUser = input.next().charAt(0);

        switch (operadorUser) {
            case '+':
               resultado= numUser + numUser2;
                break;
            case '-':
               resultado= numUser - numUser2;
                break;
            case '*':
               resultado= numUser * numUser2;
                break;
            case '/':
            if (numUser2 != 0) {
                resultado= numUser / numUser2;
                
            } else {
                System.out.println(" no se puede dividir por 0");
            }
                break;
            default:
            System.out.println(" operador no es valido ");
                break;
            }
            System.out.println(" el resultado es " + resultado);
            input.close();
    }
}
