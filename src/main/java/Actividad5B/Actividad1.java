package Actividad5B;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = sc.next();
        for (int i = 0; i < palabra.length()/2; i++) {
            System.out.println(palabra);
        }
    }
}
