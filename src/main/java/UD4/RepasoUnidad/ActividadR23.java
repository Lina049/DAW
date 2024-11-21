package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

public class ActividadR23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        int nota = scanner.nextInt();
        System.out.println("Introduce una segunda nota: ");
        int notaD = scanner.nextInt();
        System.out.println("Introduce una tercera nota: ");
        int notaT = scanner.nextInt();

        System.out.println("El resultado de las tres notas son: " + ((nota + notaD + notaT) /3));
    }
}
