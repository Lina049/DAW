package UD4;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad a invertir: ");
        double inversion = scanner.nextInt();
        System.out.println("Interés procentual anual: ");
        double interesPorceAnual = scanner.nextInt();
        System.out.println("Duracion de la inversion en meses: ");
        double meses = scanner.nextDouble();
        double años = meses / 12;
        double rendimiento = inversion * Math.pow((interesPorceAnual / 100 + 1), años);
        System.out.println("Capital final: " + (rendimiento));
    }
}
