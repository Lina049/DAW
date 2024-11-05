package UD4;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de emapanadillas a enviar: ");
        double pesoE = scanner.nextDouble();
        final double empanadilla = 112;
        System.out.print("Intrdouce el número de napolitanas a enviar: ");
        double pesoN = scanner.nextDouble();
        final double napolitana = 75;
        double totalE = pesoE * empanadilla / 1000;
        double totalN = pesoN *napolitana / 1000;
        System.out.print("Intrdouce total del paquete es: " + (totalE + totalN));
        }
}
