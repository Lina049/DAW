package Entornosdesarollos;

import java.util.InputMismatchException;

public class PedirOpcion {
    public static void funPedirOpcion(){
        while (true) {
            System.out.println("¿Qué operación quieres realizar? \n1- Sumar \n2- Resta \n3- Multiplicar \n4- Dividir");
            try {
                Main.opciones = Integer.parseInt(Main.scanner.next());
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                final String s = "Introduce una opción valida";
                System.out.println(s + ": ");
            }
        }
    }
}
