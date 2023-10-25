import javax.swing.JOptionPane;

public class entrada_ejemplo3 {
    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("introduce un numero");

        double num2 = Double.parseDouble(num1);

        System.out.print("la raiz de " + num2 + " es ");

        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
