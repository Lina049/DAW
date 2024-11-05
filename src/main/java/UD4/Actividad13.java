package UD4;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un valor: ");
        int millas = scanner.nextInt();
        final int metros = 1852;
        System.out.println("La distancia de milla a metros es: "+ ((metros * millas)));
    }
}
