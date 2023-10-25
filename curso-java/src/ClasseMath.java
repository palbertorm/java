public class ClasseMath {
    public static void main(String[] args) {
        double raiz = Math.sqrt(49);
        System.out.println(raiz);

        double num = 5.85;
//refundiction
        int result = (int)Math.round(num);
        System.out.println(result);

        double base = 5;

        double expoente = 3;

        int resultado = (int)Math.pow(expoente, base);
         System.out.println("el resultado de " + base + " elevado " + expoente + " es "+ resultado);
    }
}
