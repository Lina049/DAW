package DAW.src.main.java.ExtraActividadesUD5;

import java.util.Scanner;

/*
Datos de entrada: Calcula el tiempo que tardará en caer un objeto desde
una altura h.
Salida: Mostrar el resultado por pantalla.
 */
public class Extra7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        double alturaH = scanner.nextDouble();
        double gravedad = 9.81;
        double t = Math.sqrt(2 * alturaH / gravedad);
        System.out.println("El tiempo de caida es: " + t + " segundos");
    }
}
