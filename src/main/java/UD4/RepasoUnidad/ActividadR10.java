package DAW.src.main.java.UD4.RepasoUnidad;

import java.util.Scanner;

public class ActividadR10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();
        System.out.println("Introduce otro numero: ");
        int numD = scanner.nextInt();

        System.out.println("La suma de "+ num + " y " + numD + " es: " + (num + numD));
        System.out.println("La resta de "+ num + " y " + numD + " es: " + (num - numD));
        System.out.println("La multiplicación de "+ num + " y " + numD + " es: " + (num * numD));
        System.out.println("La division de "+ num + " y " + numD + " es: " + (num / numD));
    }
}
