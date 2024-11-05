package UD4;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        final double PI = Math.PI;
        System.out.print("Introduce el radio: ");
        int radio = scanner.nextInt();
        System.out.println("La longitud de la circunferencia es: " + (radio * 2));
        System.out.println("El valor del area del circulo es: " + (PI * (Math.pow(radio, 2))));
        System.out.println("El volumen de la esfera es: " + ((4/3 * PI) * Math.pow(radio,3)));
    }
}
