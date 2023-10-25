package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_Exer1_Oriol_Mati {
    public static void main(String[] args) {
        int numeroNombres = 0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();

        System.out.println(" introduzca la cantidad de nombre que deseas  ");
        numeroNombres = entrada.nextInt();
        System.out.println(" introzducas un nombre por vez, tu tienes " + numeroNombres + " nombres a poner");
         for (int i = 0; i < numeroNombres;){
             System.out.println(" dime el nombre");
             String nomArr = entrada.next().toLowerCase();
             nomes.add(nomArr);
             
              i++;
            }
        for (String nome : nomes) {
            if (nome.startsWith("a")) {
                
                System.out.println(" nombres que empezan con la letra A " + nome);
            }else{
                System.out.println(" nada empieza con la letra A " + nome);
            }
        }


        entrada.close();
    }
}
