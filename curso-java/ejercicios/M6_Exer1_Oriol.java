package ejercicios;

import java.util.Scanner;

public class M6_Exer1_Oriol {
    static int suma(int primerNum, int segundoNum) {
        return primerNum + segundoNum;
    }
    static int resta(int primerNum, int segundoNum) {
        return primerNum - segundoNum;
    }
    static int multiplicacio(int primerNum, int segundoNum) {
        return primerNum * segundoNum;
    }
    static int divisio(int primerNum, int segundoNum) {
        return primerNum / segundoNum;
    }
    static int modul(int primerNum, int segundoNum) {
        return primerNum % segundoNum;
    }

    public static void main(String[] args) {
        int primerNum = 0;
        int segundoNum = 0;
        int operUser = 0;
        int operacion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" dime el primer numero ");
        primerNum = entrada.nextInt();
        System.out.println(" dime el segundo numero ");
        segundoNum = entrada.nextInt();
        System.out.println(" indique la operacion: 1 - suma \n 2 - resta \n  3 - Multiplicacion \n 4 - division \n 5 - modul");
        operUser = entrada.nextInt();
        if (operUser == 1) {
            operacion = suma(primerNum, segundoNum);
        }
        if (operUser == 2) {
                operacion = resta(primerNum, segundoNum);
        }
        if (operUser == 3) {
            operacion = multiplicacio(primerNum, segundoNum);
        }
        if (operUser == 4) {
            operacion = divisio(primerNum, segundoNum);
        }
        if (operUser == 5) {
            operacion = modul(primerNum, segundoNum);
        }

        System.out.println("el resultado es " + operacion);
        entrada.close();

    }
}
