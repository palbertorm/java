package ejercicios;

import java.util.Scanner;

public class M5_Exer2_Oriol_Mati {
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        String sumaDtallada = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println(" introduzca el primer numero ");
        num1 = entrada.nextInt();
        System.out.println(" introduzca el segundo numero ");
        num2 = entrada.nextInt();
        //valido que el num2 sea mas grande que el primero
        if (num1>num2) {  
            int newValue = num1;
            num1 = num2;
            num2 = newValue;
        }
        for (int i = num1; i <= num2; i++) {
            suma += i;
            if (i != num2) {
                sumaDtallada += i + " + ";
            } else {
                sumaDtallada += i;
            }
            
        }
        
       
        System.out.println(" el resutado de las interaciones " + sumaDtallada + " y la suma es " + suma);
        entrada.close();
    }
}
