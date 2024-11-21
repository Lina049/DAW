package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

public class ActividadR6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el lado de un cuadrado: ");
        int lado = scanner.nextInt();
        int cuadrado = lado * lado;
        System.out.println("El area del cuadrado es: " + (cuadrado));
    }
}
