package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

public class ActividadR7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce base del triangulo: ");
    int trianguloB = scanner.nextInt();
    System.out.print("Introduce base la altura: ");
    int trianguloA = scanner.nextInt();
    int area = trianguloB * trianguloA / 2;
    System.out.println("El area del tringulo es: " + (area));
    }
}
