package UD4;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de radio: ");
        int radio = scanner.nextInt();
        System.out.println("Introduce el valor de la altura: ");
        int altura = scanner.nextInt();
        System.out.println("El volumen del cono es: "+((PI/3) * (radio*radio) * altura));
    }
}
