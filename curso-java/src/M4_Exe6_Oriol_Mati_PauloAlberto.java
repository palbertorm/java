import java.util.Scanner;

public class M4_Exe6_Oriol_Mati_PauloAlberto {
    /*
     * Crea un programa para un restaurante que ofrece tres platos (carne, pasta "con gluten" y risotto "con lactosa").

El programa debe solicitar al usuario su elección de plato 
y también debe preguntar si tiene alguna preferencia o intolerancia
 (vegetariano, intolerancia al gluten o intolerancia a la lactosa).

Si la persona solicita un plato "que puede comer", se mostrará el mensaje "Perfecto,
pedido correcto". Si no, se mostrará el mensaje "Usted no puede comer este plato*/
    public static void main(String[] args) {
        String plato;
        String preferencia;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al restaurante. Elija su plato (carne, pasta o risotto):");
        plato = input.nextLine();

        System.out.println("¿Tiene alguna preferencia o intolerancia? (vegetariano, gluten, lactosa, o ninguno):");
        preferencia = input.nextLine();

        // Comprobación de preferencias e intolerancias
        if (("carne".equalsIgnoreCase(plato) && !preferencia.equalsIgnoreCase("vegetariano"))
                || ("pasta".equalsIgnoreCase(plato) && !preferencia.equalsIgnoreCase("gluten"))
                || ("risotto".equalsIgnoreCase(plato) && !preferencia.equalsIgnoreCase("lactosa"))) {
            System.out.println("Perfecto, pedido correcto.");
        } else {
            System.out.println("Usted no puede comer este plato.");
        }
        input.close();
    }

}
