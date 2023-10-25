public class Manipula_cadenas {
    
    public static void main(String[] args) {
        
        String nombre = "Paulo Alberto";

        System.out.println("mi nombre " + nombre);
        System.out.println(" tiene " + nombre.length() + " letras ");
        System.out.println(" la primera letra de " + nombre + " es " + nombre.charAt(0));

        int ultima_letra ;

        ultima_letra = nombre.length();
         System.out.println(ultima_letra);

        System.out.println(" la ultima letra es la " + nombre.charAt(ultima_letra-1));

        System.out.println(nombre.substring(0, 5));
        
    }
    
    
}
