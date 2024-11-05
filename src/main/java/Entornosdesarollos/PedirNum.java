package Entornosdesarollos;

import java.util.InputMismatchException;

public class PedirNum {
    public static void funPedirNum() {
        while (true) {
            System.out.println("Introduce un numero: ");
            try {
                Main.num = Integer.parseInt(Main.scanner.next());
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Introduce una opción valida: ");
            }
        }
    }
}
