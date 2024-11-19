package Actividad5B;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intrduce N: ");
        int num = scanner.nextInt();
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                cont++;
            }
        }
        System.out.println("Cantidad de múltiplos: " + cont);
    }
}
