package UD4;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int b = scanner.nextInt();
        System.out.print("Introduce la altura: ");
        int h = scanner.nextInt();
        System.out.println("El valor del área es: " + ((b * h)/2));
    }
}
