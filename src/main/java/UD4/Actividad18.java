package UD4;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double precioPanF = 1.20;
        final double precioPanNoF = 0.6;
        System.out.print("Introduce el número de barras frescas vendidas: ");
        double panF = scanner.nextDouble();
        System.out.print("Introduce el número de barras que no son del día: ");
        double panNoF = scanner.nextDouble();
        double totalPanF = precioPanF * panF;
        double totalPanNoF = precioPanNoF * panNoF;
        System.out.println("El total de ingresos del día es " + (totalPanNoF + totalPanF));
    }
}
