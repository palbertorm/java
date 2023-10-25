import javax.swing.JOptionPane;

public class entrada_ejemplo2 {
    public static void main(String[] args) {

        String nombre_user = JOptionPane.showInputDialog("introduzca seu numero");

        int my_num = Integer.parseInt(nombre_user);
        my_num++;

        System.out.printf("tu numero" + my_num + "elegido convertido a integer foi adicionado un numero extra");

    }
}
