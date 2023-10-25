import java.util.Scanner;

public class prueba_poo_Paulo_Alberto {
    /*Escribe un programa en Java que simule un cajero automático. El programa debe permitir a un usuario realizar las siguientes operaciones:

Consultar saldo.
Depositar dinero en la cuenta.
Retirar dinero de la cuenta.
El programa debe tener un saldo inicial de €1000 y permitir al usuario realizar estas operaciones de manera repetitiva hasta que decida salir del cajero automático.
Debe validar que el usuario no pueda retirar más dinero del que tiene en la cuenta. */
static int saldoEnCuenta = 1000;
static int actionUser = 0;
static int valueChoiceUser = 0;
static public int retirarDinero(int saldoEnCuenta, int valueChoiceUser){
     return saldoEnCuenta - valueChoiceUser;
    
}
static public int depositarDinero(int saldoEnCuenta, int valueChoiceUser){
    return saldoEnCuenta + valueChoiceUser;
}
    
public static void main(String[] args) {
    boolean quit = false;
    Scanner input = new Scanner(System.in);

    do {
        System.out.println("Wellcome to Fantasy Bank! Choose one option :\n 1. check my money\n 2. Withdraw ; \n 3. Deposit; \n 4. salir");
        actionUser = input.nextInt();
        switch (actionUser) {
            case 1:
            System.out.println(" Your current balance is: " + saldoEnCuenta);
            break;
            case 2:
            System.out.println(" How much woud you like to get");
            valueChoiceUser = input.nextInt();
            if (valueChoiceUser <= saldoEnCuenta) {
                saldoEnCuenta = retirarDinero(saldoEnCuenta, valueChoiceUser);
                
                System.out.println(" Your current balance is: " + saldoEnCuenta);
            }else{
                System.out.println(" Enouth money in your pocket, you have " + saldoEnCuenta);

            }
                break;
            case 3:
            System.out.println(" How much woud you like to deposit ");
            valueChoiceUser = input.nextInt();
            if (valueChoiceUser > 0) {
                saldoEnCuenta = depositarDinero(saldoEnCuenta, valueChoiceUser);
                System.out.println(" succesful deposit, Your current balance is: " + saldoEnCuenta);
            }else{ 
                System.out.println(" la cantidad debe ser superior a 0");
            }
                break;
            case 4:
            quit = true;
            default:
            if (!quit) {
                
                System.out.println(" opcion invalida, seleciona una opcion valida");
            }else{
                System.out.println(" hasta luego!");
            }
        }

    } while(!quit);

}
}
