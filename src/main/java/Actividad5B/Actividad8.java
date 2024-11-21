package Actividad5B;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce N1: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce N2: ");
        int num2 = scanner.nextInt();
        while (true) {
            if (num1 < num2) {
                break;
            }
            System.out.print("N2 debe ser mayor que N1, vuelve a introducirlo: ");
            num2 = scanner.nextInt();
        }
        int contador = 0;
        String cadena = "";
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                contador++;
            }
            if (i == num2) {
                cadena += i;
            }else {
                cadena += i + " - ";
            }
        }
        System.out.println(cadena);
        System.out.println("La cantidad de pares es: " + contador);
    }
}
