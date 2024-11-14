package UD5part2;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        int suma= 0;
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
            product = product * i;
        }
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + product);
    }
}
