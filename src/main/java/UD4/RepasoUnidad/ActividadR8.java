package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

public class ActividadR8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        double radioC = scanner.nextDouble();
        System.out.println("Introduce la altura del cono: ");
        Double alturaC = scanner.nextDouble();
        double volumen = (Math.PI / 3 * (radioC * radioC) * alturaC);
        System.out.println("El volumen cono es: " + volumen);
    }
}
