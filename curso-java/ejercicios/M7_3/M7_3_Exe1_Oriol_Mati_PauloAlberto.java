package ejercicios.M7_3;

import java.util.Scanner;

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
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = input.nextInt();

            switch (opcion) {
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
                    System.out.println("Adeu!");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
        } while (opcion != 0);
        
        input.close();
    }

    public static void mostrarMenu() {
        System.out.println(" chosse onde option : \n"
        + "1.- Quadrat \n"
        + "2.- Triangle \n"
        + "3.- Rectangle \n"
        + "4.- Cercle \n"
        + "0.- Sortir del programa \n");
    }

    public static void calcularAreaQuadrat() {
        System.out.print("Introduzca la longitud del lado del cuadrado: ");
        double lado = input.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);

    }

    public static void calcularAreaTriangle() {
        System.out.print("Introduzca la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Introduzca la altura del triángulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void calcularAreaRectangle() {
        System.out.print("Introduzca la longitud de la base del rectángulo: ");
        double base = input.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = input.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

    public static void calcularAreaCercle() {
        System.out.print("Introduzca el radio del círculo: ");
        double radio = input.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
    
}

