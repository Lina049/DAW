package UD5part2;

import java.util.Scanner;
public class Actividad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean neg = false;
        for (int i = 0; i < 100; i++) {
            System.out.println("Introduce un numero: ");
            int num = scanner.nextInt();
            if (num < 0) {
                neg = true;
            }
        }
        if (neg == true) {
            System.out.println("Se ha leido un numero negativo");
        }else {
            System.out.println("No se ha leido ningún numero negativo");
        }
    }
}
