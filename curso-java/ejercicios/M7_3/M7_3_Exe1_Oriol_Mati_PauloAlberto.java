package ejercicios.M7_3;

public class M7_3_Exe1_Oriol_Mati_PauloAlberto {
    /*
     * Realitzar un programa que tingui un menú on se li mostraran 4 opcions a l’usuari/ària per pantalla:

1.- Quadrat

2.- Triangle

3.- Rectangle

4.- Cercle

0.- Sortir del programa

Segons l’opció escollida haurà d’introduir unes dades o altres perquè el programa mostri per pantalla l’àrea (el valor) del polígon escollit.
     */
    public static void main(String[] args) {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio;

        do {
            mostrarMenu();
            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    calcularAreaQuadrat();
                    break;
                case 2:
                    calcularAreaTriangle();
                    break;
                case 3:
                    calcularAreaRectangle();
                    break;
                case 4:
                    calcularAreaCercle();
                    break;
                case 0:
                    System.out.println("Gràcies per utilitzar la calculadora d'àrees. Adeu!");
                    break;
                default:
                    System.out.println("Opció no vàlida. Si us plau, tria una opció vàlida.");
                    break;
            }
        } while (opcio != 0);
        
        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("Calculadora d'Àrees");
        System.out.println("1.- Quadrat");
        System.out.println("2.- Triangle");
        System.out.println("3.- Rectangle");
        System.out.println("4.- Cercle");
        System.out.println("0.- Sortir del programa");
        System.out.print("Tria una opció: ");
    }

    public static void calcularAreaQuadrat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la longitud del costat del quadrat: ");
        double costat = sc.nextDouble();
        double area = costat * costat;
        System.out.println("L'àrea del quadrat és: " + area);
    }

    public static void calcularAreaTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la base del triangle: ");
        double base = sc.nextDouble();
        System.out.print("Introdueix l'altura del triangle: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("L'àrea del triangle és: " + area);
    }

    public static void calcularAreaRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la longitud de la base del rectangle: ");
        double base = sc.nextDouble();
        System.out.print("Introdueix la altura del rectangle: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("L'àrea del rectangle és: " + area);
    }

    public static void calcularAreaCercle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el radi del cercle: ");
        double radi = sc.nextDouble();
        double area = Math.PI * radi * radi;
        System.out.println("L'àrea del cercle és: " + area);
    }
    }
}
