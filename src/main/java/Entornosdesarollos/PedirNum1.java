package Entornosdesarollos;

import java.util.InputMismatchException;

public class PedirNum1 {
    public static void funPedirNum1(){
        while (true) {
            System.out.println("Introduce otro numero: ");
            try {
                Main.num1 = Integer.parseInt(Main.scanner.next());
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Introduce una opción valida: ");
            }
        }
    }
}
