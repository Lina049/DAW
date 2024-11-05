package UD4;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        System.out.println("Introduce valor: ");
        Scanner scanner = new Scanner(System.in);
        int lado = scanner.nextInt();
        System.out.println("El area de cuadrado es: " + (lado * lado));
    }
}
