package UD5part2;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Introduce a cuanto lo elevas: ");
        int b = sc.nextInt();

        int resultado = a;
        for(int i = 1; i < b; i++) {
            resultado *= a;
        }
        System.out.println("El valor de a es: " + resultado);
    }
}
