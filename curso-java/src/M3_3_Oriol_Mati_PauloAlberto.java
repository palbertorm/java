import java.util.Scanner;

public class M3_3_Oriol_Mati_PauloAlberto {
    public static void main(String[] args) {
        int notasUser1 = 0;
        int notasUser2 = 0;
        int notasUser3 = 0;
        int mediaNotas = 0;
        int sumNotas = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" introduzca la nota ");
        notasUser1 = input.nextInt();
        System.out.println(" introduzca la nota ");
        notasUser2 = input.nextInt();
        System.out.println(" introduzca la nota ");
        notasUser3 = input.nextInt();

        sumNotas = notasUser1 + notasUser2 + notasUser3;
        mediaNotas = sumNotas / 3 ;
        System.out.println("soma notas " + sumNotas);
        System.out.println("media notas " + mediaNotas);
        input.close();
    }
}
