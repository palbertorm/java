import java.util.ArrayList;
import java.util.Scanner;

public class M7_1_Exe2_Oriol_Mati_Paulo_Alberto {
    /*
     * "Un/a profesor/a desea calcular el promedio de las calificaciones de toda la
     * clase.
     * Crea una aplicación donde el usuario introducirá un número en pantalla
     * (el número corresponde a la cantidad de calificaciones que desea ingresar) y
     * el programa le pedirá que ingrese las calificaciones de todos los
     * estudiantes.
     * 
     * Una vez que las calificaciones hayan sido ingresadas, el programa mostrará lo
     * siguiente:
     * 
     * Si el promedio es menor que 5:
     * "El promedio de calificaciones de la clase está suspendido. Los estudiantes deberían hacer preguntas y trabajar más"
     * .
     * 
     * Si el promedio es menor que 7:
     * "El promedio de calificaciones de la clase es bueno, pero los estudiantes deberían mejorar su trabajo personal"
     * .
     * 
     * Para todos los demás casos, el mensaje será:
     * "¡Felicidades! El promedio de calificaciones de la clase se corresponde con el esfuerzo realizado"
     * .
     * 
     */
    public static void main(String[] args) {
        ArrayList<Integer> notaAlumnos = new ArrayList<Integer>();
        int totalDeNotas = 0;
        int notaIndividual = 0;
        int sumaNotas = 0;
        double promedio = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("cantidad de calificaciones que deseas ");
        totalDeNotas = input.nextInt();
        for (int i = 0; i < totalDeNotas; i++) {
            System.out.println(" introduzca la nota del alumno/a " + (i + 1) + " que le pertenence");
            notaIndividual = input.nextInt();
            notaAlumnos.add(notaIndividual);
        }
        for (Integer nota : notaAlumnos) {
            sumaNotas += nota;

        }
        promedio = sumaNotas / notaAlumnos.size();
        if (promedio < 5) {
            System.out.println(
                    "El promedio de calificaciones de la clase está suspendido. Los estudiantes deberían hacer preguntas y trabajar má");
        } else if (promedio < 7) {
            System.out.println(
                    "El promedio de calificaciones de la clase es bueno, pero los estudiantes deberían mejorar su trabajo personal");
        } else {
            System.out.println(
                    "¡Felicidades! El promedio de calificaciones de la clase se corresponde con el esfuerzo realizado");
        }
        input.close();
    }
}
