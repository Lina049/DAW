package UD5part2;

import java.util.Scanner;

import static java.lang.System.*;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Introduce el primero numero: ");
        int N = scanner.nextInt();
        System.out.println("Los numeros 1 hasta 10 son: ");
        for (int i = 1; i < N; i++) {
            out.println(i);
        }
    }
}
