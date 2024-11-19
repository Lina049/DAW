package Actividad5B;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        int acumulador = 0;
        for (int i = 1; i <= 5; i++) {
                acumulador += (int) Math.pow(i, 2);;

        }
        System.out.println("La suma de los cuadrados es: " + acumulador);
    }
}
