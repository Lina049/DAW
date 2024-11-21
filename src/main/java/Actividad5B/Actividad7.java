package Actividad5B;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas notas vas a introducir?: ");
        int numNota = scanner.nextInt();
        double acumulador = 0;
        for (int i = 1; i <= numNota; i++) {
                System.out.println("Dime numero " + i + ": ");
                double num = scanner.nextDouble();
                acumulador += num;
        }
        System.out.println("La media de todas las notas es: " + (acumulador/numNota));
    }
}
