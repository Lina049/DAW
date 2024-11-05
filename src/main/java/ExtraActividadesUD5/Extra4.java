package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Pedir al usuario que introduzca un numero entero
Salida: mostrar cual la última cifra del número entero.
 */
public class Extra4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numE = scanner.nextInt();
        int cifra = numE % 10;
        System.out.println("La última cifra del numero es: " + cifra);
    }
}
