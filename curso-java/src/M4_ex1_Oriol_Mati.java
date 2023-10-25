import java.util.Scanner;

public class M4_ex1_Oriol_Mati {
    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        String salida;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println(" tecla tu primero nombre"); 
            
            nombre1 = entrada.nextLine();
            
            System.out.println(" tecla tu segundo nombre");
            
            nombre2 = entrada.nextLine();
        }

        salida = nombre1.length() > nombre2.length() ? nombre1 : nombre2;

        System.out.println("el nombre mas largo es " + salida);
        


    }
}
