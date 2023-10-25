import java.util.Scanner;

public class M7_1_Exe4_Oriol_Mati_Paulo_Alberto {
  
    static int longitudA = 0;
    static int longitudB = 0;
    static int longitudC = 0;

    static public void calculoTriangulo(int longA, int longB, int longC) {
        if ((longA == longB) && (longB == longC)) {
            System.out.println(
                    " Un triángulo equilátero es un tipo de triángulo en el que todos sus lados son iguales en longitud. ");
        } else if ((longA != longB) && (longB == longC) || (longC == longA) && (longC != longB)) {
            System.out.println(
                    " Un triángulo isósceles es un tipo de triángulo en el que al menos dos de sus lados tienen la misma longitud. ");
        } else if ((longA != longC) && (longB != longA)) {
            System.out.println(
                    " Un triángulo escaleno es un tipo de triángulo en el que todos sus lados tienen longitudes diferentes. ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" para determinar necesito saber la longitud del lado A");
        longitudA = input.nextInt();
        System.out.println(" para determinar necesito saber la longitud del lado B");
        longitudB = input.nextInt();
        System.out.println(" para determinar necesito saber la longitud del lado C");
        longitudC = input.nextInt();
        input.close();

        calculoTriangulo(longitudC, longitudB, longitudA);
    }
}
