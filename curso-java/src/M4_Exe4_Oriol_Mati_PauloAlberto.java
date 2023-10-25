import java.util.Scanner;

public class M4_Exe4_Oriol_Mati_PauloAlberto {
    /*
     * Crea un programa que sol·liciti a l'usuari/ària que introdueixi un número de l'1 al 10 i mostri per pantalla el seu equivalent en lletres (per exemple, 1 es mostraria com "u", 2 com "dos", etc.).
     */
    public static void main(String[] args) {
        int numUser = 0;
        Scanner input = new Scanner(System.in);
        System.out.println( " dime un numero de 1 al 10 ");
        numUser = input.nextInt();
        switch (numUser) {
            case 1:
                System.out.println(" uno");
                break;
        
                case 2:
                System.out.println(" dos");
                break;
                case 3:
                System.out.println(" tres");
                break;
                case 4:
                System.out.println(" cuatro");
                break;
                case 5:
                System.out.println(" cinco");
                break;
                case 6:
                System.out.println(" sies");
                break;
                case 7:
                System.out.println(" siete");
                break;
                case 8:
                System.out.println(" ocho");
                break;
                case 9:
                System.out.println(" nueve ");
                break;
                case 10:
                System.out.println(" diez");
                break;
        
            default:
            System.out.println(" numero fuera de rango ");
                break;
        }
        input.close();
    }
}
