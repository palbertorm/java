import java.util.Scanner;

public class M4_Exe2_Oriol_Mati_PauloAlberto {
    /*
     * Crea un programa que sol·liciti a l'usuari que introdueixi el seu nom i el nombre d'anys que porta treballant
     *  en una empresa per teclat i mostri per pantalla el seu nivell salarial, segons la següent taula:

    Menys de 2 anys - 25.000 €
    Entre 2 i 4 anys 35.000 €
    Més de 4 i fins a 7 anys 50.000 €
    Més de 7 i fins a 10 anys 65.000 €
    Més de 10 anys 80.000 €

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomUser = "";
        int anysUser = 0;

        System.out.println(" introzduca el nombre ");
        nomUser = input.nextLine();
        System.out.println(" introzduca el tiempo de empresa ");
        anysUser = input.nextInt();
        if (anysUser < 2) {
            System.out.println("el funcionario " + nomUser + " 25.000€");
        }
        else if (anysUser > 1 && anysUser < 5) {
            System.out.println("el funcionario " + nomUser + " 35.000€");
        }
        else if (anysUser > 4 && anysUser <= 7) {
            System.out.println("el funcionario " + nomUser + "  50.000€");
        }
        else if (anysUser > 7 && anysUser <= 10) {
            System.out.println("el funcionario " + nomUser + " 65.000€");
        }
        else {
            System.out.println("el funcionario " + nomUser + " 80.000€");
            
        }
        input.close();
    }
}
